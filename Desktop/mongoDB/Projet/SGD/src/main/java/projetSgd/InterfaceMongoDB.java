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

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;


import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sc364347
 */
public class InterfaceMongoDB {
    private MongoDatabase db;
    
    public InterfaceMongoDB(){
        char[] pwd=new char[10];
       String s="bj852910";
       pwd=s.toCharArray();
       MongoCredential cred = MongoCredential.createCredential("bj852910","bj852910",pwd);
       MongoClient client=new MongoClient(new ServerAddress("mongo",27017),Arrays.asList(cred));
       db = client.getDatabase("bj852910");
    }
    
    public void test(){
        MongoCollection<Document> collection = db.getCollection("Jeux");
        Document doc=collection.find(eq("Nomjeu","bob")).first();
        System.out.println(doc.toJson());
    }
    
    public static void main(String args[]){
        InterfaceMongoDB i1=new InterfaceMongoDB();
        i1.test();
    }
    
}