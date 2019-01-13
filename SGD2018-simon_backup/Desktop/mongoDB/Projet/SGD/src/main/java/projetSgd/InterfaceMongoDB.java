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
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.DB;
import com.mongodb.DBObject;
import static com.mongodb.client.model.Projections.*;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.DBCollection;

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
    private DB db2;
    
    public InterfaceMongoDB(){
        char[] pwd=new char[10];
       String s="sc364347";
       pwd=s.toCharArray();
       MongoCredential cred = MongoCredential.createCredential("sc364347","sc364347",pwd);
       MongoClient client=new MongoClient(new ServerAddress("127.0.0.1",27017),Arrays.asList(cred));
       db = client.getDatabase("sc364347");
       db2 = client.getDB("sc364347");
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
    	if(!name.replace(" ","").equals("") && !type.replace(" ","").equals("") && !editor.replace(" ","").equals("")){
    		try{
    			// test Year 
    			Integer.parseInt(year);
    			// fin test
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
		    }catch(NumberFormatException e){
		    	throw e;
		    }
        }
        else
        	throw new IllegalArgumentException("missing field");
    }
    
     public void addSerie(String name,String year,String descri,String[] gameList){
     	if(!name.replace(" ","").equals("")){
     		try{
     			// test Year 
    			Integer.parseInt(year);
    			// fin test
				MongoCollection<Document> collection = db.getCollection("series");
				Document doc = new Document("Nom", name)
				        .append("Creation", Integer.parseInt(year))
				        .append("Description", descri)
				        .append("Jeux",Arrays.asList(gameList));
				collection.insertOne(doc);
        	}catch(NumberFormatException e){
        		throw e;
        	}
        }
        else
        	throw new IllegalArgumentException("missing field");
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
    	if(!name.replace(" ","").equals("") && !player.replace(" ","").equals(""))){
    		try{
    			// test note
    			Double.parseDouble(note);
    			// fin test
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
        	}catch(NumberFormatException e){
        		throw e;
        	}
        }
        else
        	throw new IllegalArgumentException("missing field")
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
    public ArrayList<JSONObject> getSerieGame(String name){
         MongoCollection<Document> collection = db.getCollection("series");
         ArrayList<JSONObject> list=new ArrayList<JSONObject>();
         MongoCursor<Document> cursor = collection.aggregate(
            Arrays.asList(
                  Aggregates.unwind("$Jeux"),
                  Aggregates.match(eq("Nom",name))
            )     
         ).iterator();
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
    
    public ArrayList<JSONObject> searchUser(String name){
        MongoCollection<Document> collection = db.getCollection("joueurs");
        ArrayList<JSONObject> list=new ArrayList<JSONObject>();
        Bson b=gt("idjoueur",0);
        if(!name.equals("") && !name.equals("Nom de l'utilisateur")){
            b=and(b,eq("Pseudo",name));
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
    
    public ArrayList<JSONObject> searchSerie(String name,String year,String game){
        MongoCollection<Document> collection = db.getCollection("series");
        ArrayList<JSONObject> list=new ArrayList<JSONObject>();
        Bson b=gt("Creation",0);
        if(!name.equals("") && !name.equals("Nom de la série")){
            b=and(b,eq("Nom",name));
        }
        if(!year.equals("") && !year.equals("Année de création de la serie")){
            b=and(b,eq("Creation",year));
        }
        if(!game.equals("") && !game.equals("Jeu appartenant à la série")){
            b=and(b,in("Jeux",game));
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
    
    public String getMeanRating(String gameName){
        DBCollection collection = db2.getCollection("avis");
        String map="function(){"
                +"if(this.Nomjeu ==  \""+gameName+"\"){" 
                + "var value = { note : this.Note , count : 1};"
                + "emit(this.collection,value);"
                + "}"
                + "}";
        String reduce="function(collection,val){"
                + "reduceValue = { note : 0 , count : 0 };"
                + "for(var i = 0 ; i< val.length ;  i++ ){"
                    + "reduceValue.note += val[i].note;"
                    + "reduceValue.count += 1;"
                + "}"
                + "reduceValue.arg = reduceValue.note / reduceValue.count;"
                + "return reduceValue.arg;"
                + "}";
        MapReduceCommand cmd = new MapReduceCommand(collection, map, reduce,
                     null, MapReduceCommand.OutputType.INLINE, null);
        MapReduceOutput out = collection.mapReduce(cmd);
        for (DBObject o : out.results()) {
	    return o.get("value").toString();
	   }
        return "";
    }
    
    public String getMeanUser(String Name){
        DBCollection collection = db2.getCollection("avis");
        String map="function(){"
                +"if(this.Playername ==  \""+Name+"\"){" 
                + "var value = { note : this.Note , count : 1};"
                + "emit(this.collection,value);"
                + "}"
                + "}";
        String reduce="function(collection,val){"
                + "reduceValue = { note : 0 , count : 0 };"
                + "for(var i = 0 ; i< val.length ;  i++ ){"
                    + "reduceValue.note += val[i].note;"
                    + "reduceValue.count += 1;"
                + "}"
                + "var moyenne = reduceValue.note / reduceValue.count;"
                + "return moyenne;"
                + "}";
        MapReduceCommand cmd = new MapReduceCommand(collection, map, reduce,
                     null, MapReduceCommand.OutputType.INLINE, null);
        MapReduceOutput out = collection.mapReduce(cmd);
        for (DBObject o : out.results()) {
	    return o.get("value").toString();
	   }
        return "";
    }
    

    
    public String getMeanSerie(String Name){
        DBCollection collection = db2.getCollection("avis");
        String map="function(){"
                +"if(this.Nomserie ==  \""+Name+"\"){" 
                + "var value = { note : this.Note , count : 1};"
                + "emit(this.collection,value);"
                + "}"
                + "}";
        String reduce="function(collection,val){"
                + "reduceValue = { note : 0 , count : 0 };"
                + "for(var i = 0 ; i< val.length ;  i++ ){"
                    + "reduceValue.note += val[i].note;"
                    + "reduceValue.count += 1;"
                + "}"
                + "var moyenne = reduceValue.note / reduceValue.count;"
                + "return moyenne;"
                + "}";
        MapReduceCommand cmd = new MapReduceCommand(collection, map, reduce,
                     null, MapReduceCommand.OutputType.INLINE, null);
        MapReduceOutput out = collection.mapReduce(cmd);
        for (DBObject o : out.results()) {
	    return o.get("value").toString();
	   }
        return "";
    }
    
    public String[] getMaxMin(String name){
        String[] tabres=new String[3];
        tabres[0]="";
        tabres[1]="";
        tabres[2]="";
        MongoCollection<Document> collection = db.getCollection("avis");
        MongoCursor<Document> cursor = collection.aggregate(
            Arrays.asList(
                  Aggregates.match(eq("Playername",name)),
                  Aggregates.group("$Playername", Accumulators.max("maxavis","$Note") ,Accumulators.min("minavis","$Note"),Accumulators.sum("count", 1) )
            )     
         ).iterator();
        try{
            while((cursor.hasNext())){
                JSONObject obj=new JSONObject(cursor.next().toJson());
                System.out.println(obj);
                tabres[0]=String.valueOf(obj.get("maxavis"));
                tabres[1]=String.valueOf(obj.get("minavis"));
                tabres[2]=String.valueOf(obj.get("count"));
            }
        }finally{
            cursor.close();
        }
        
        return tabres;
        
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
