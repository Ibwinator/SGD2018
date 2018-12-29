/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Filters;
import com.mongodb.Block;
import static com.mongodb.client.model.Projections.*;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;


import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;
import org.json.*;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import com.mongodb.DBCursor;

/**
 *
 * @author sc364347
 */
public class InterfaceMongoDB {
    private MongoDatabase db;
    
    public InterfaceMongoDB(){
        char[] pwd=new char[10];
       String s="sc364347";
       pwd=s.toCharArray();
       MongoCredential cred = MongoCredential.createCredential("sc364347","sc364347",pwd);
       MongoClient client=new MongoClient(new ServerAddress("127.0.0.1",27017),Arrays.asList(cred));
       db = client.getDatabase("sc364347");
    }
    
    public void test(){
        MongoCollection<Document> collection = db.getCollection("jeux");
        MongoCursor<Document> cursor=collection.find().iterator();
        try{
            while((cursor.hasNext())){
                System.out.println(cursor.next().toJson());
            }
        }finally{
            cursor.close();
        }
    }
    
    public int connexion(String username,String mdp){
        MongoCollection<Document> collection = db.getCollection("joueurs");
        MongoCursor<Document> cursor=collection.find(and(eq("Pseudo",username),eq("mdp",mdp))).projection(fields(include("power"),excludeId())).iterator();
        try{
            while((cursor.hasNext())){
                JSONObject obj=new JSONObject(cursor.next().toJson());
                return (int)Double.parseDouble(obj.get("power").toString());
            }
        }finally{
            cursor.close();
        }
        return -1;
    }
    
    public static void main(String args[]){
        InterfaceMongoDB i1=new InterfaceMongoDB();
        System.out.println(i1.connexion("Cariefdss","azer"));
    }
    
}
