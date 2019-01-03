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

import org.bson.conversions.Bson;
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
import javax.swing.DefaultListModel;
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
    
    public void addGame(String name,String year,String type,String editor,String serie,String descri){
        MongoCollection<Document> collection = db.getCollection("jeux");
        int num=(int)collection.count()+1;
        Document doc = new Document("Numjeu", num)
                .append("Nomjeu", name);
        if(!serie.equals("Serie de jeu associée")&& !serie.equals("")){
            doc.append("serie", serie);
        }
        doc.append("annéedesortie", Integer.parseInt(year))
                .append("types", type)
                .append("Editeur", editor)
                .append("descriptif", descri)
                .append("dispo","true");
        collection.insertOne(doc);
    }
    
     public void addSerie(String name,String year,String descri,String[] gameList){
        MongoCollection<Document> collection = db.getCollection("series");
        Document doc = new Document("Nom", name)
                .append("Creation", Integer.parseInt(year))
                .append("Description", descri)
                .append("Jeux",Arrays.asList(gameList));
        collection.insertOne(doc);
    }
     
    public ArrayList<JSONObject> searchGame(String name,String serie,String year,String type,String editor){
        MongoCollection<Document> collection = db.getCollection("jeux");
        ArrayList<JSONObject> list=new ArrayList<JSONObject>();
        Bson b=and(gt("Numjeu",0));
        if(!name.equals("") && !name.equals("Nom du jeu")){
            b=and(b,eq("Nomjeu",name));
        }
        if(!serie.equals("") && !serie.equals("Serie de jeu associée")){
            b=and(b,eq("Série",serie));
        }
        if(!year.equals("") && !year.equals("Année du jeu")){
            b=and(b,eq("annéedesortie",Integer.parseInt(year)));
        }
        if(!type.equals("") && !type.equals("Type")){
            b=and(b,eq("types",type));
        }
        if(!editor.equals("") && !editor.equals("Editeur")){
            b=and(b,eq("Editeur",type));
        }
        MongoCursor<Document> cursor=collection.find(b).iterator();
        try{
            while((cursor.hasNext())){
                JSONObject obj=new JSONObject(cursor.next().toJson());
                list.add(obj);
            }
        }finally{
            cursor.close();
        }
        return list;
    }
    
    public String getDescriptionGame(String name){
        MongoCollection<Document> collection = db.getCollection("jeux");
        MongoCursor<Document> cursor=collection.find(eq("Nomjeu",name)).projection(fields(include("descriptif"),excludeId())).iterator();
        try{
            while((cursor.hasNext())){
                JSONObject obj=new JSONObject(cursor.next().toJson());
                return obj.get("descriptif").toString();
            }
        }finally{
            cursor.close();
        }
        return "";
    }
    
    public void insertRating(String type,String name,String note,String player,String descri){
        MongoCollection<Document> collection = db.getCollection("avis");
        Document doc = new Document("Playername",player);
        if(type.equals("serie")){
            doc.append("Nomserie", name);
        }
        else{
            doc.append("Nomjeu",name);
        }
        doc.append("Note", Double.parseDouble(note))
           .append("Descriptif", descri);
        collection.insertOne(doc);
        
    }
    
    public ArrayList<JSONObject> getRating(String name,String type){
         MongoCollection<Document> collection = db.getCollection("avis");
         ArrayList<JSONObject> list=new ArrayList<JSONObject>();
         Bson b=eq("","");
         if(type.equals("jeu")){
            b=eq("Nomjeu",name);
         }
         else{
             b=eq("Nomserie",name);
         }
         MongoCursor<Document> cursor = collection.find(b).iterator();
         try{
            while((cursor.hasNext())){
                JSONObject o=new JSONObject(cursor.next().toJson());
                list.add(o);
            }
        }finally{
            cursor.close();
        }
        return list;
        
    }
    
    public int connexion(String username,String mdp){
        MongoCollection<Document> collection = db.getCollection("joueurs");
        Bson b=and(eq("Pseudo",username));
        MongoCursor<Document> cursor=collection.find(and(b,eq("mdp",mdp))).projection(fields(include("power"),excludeId())).iterator();
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

    
}
