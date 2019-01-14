/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;

import java.util.ArrayList;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scotte
 */
public class InterfaceMongoDBTest {
    static InterfaceMongoDB I;
    
    public InterfaceMongoDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    	I=new InterfaceMongoDB();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = NumberFormatException.class)
    public void testAddGameYear(){
    	I.addGame("test1","test2","test3","test4","test5","test6");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddGameArgument(){
    	I.addGame("","","","","","");
    }
    @Test(expected = NumberFormatException.class)
    public void testAddSerieYear(){
    	I.addSerie("test1","test2","",new String[]{""});
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddSerieArgument(){
    	I.addSerie("","","",new String[]{""});
    }
    @Test
    public void testGetDescriptionGame(){
    	String result=I.getDescriptionGame("");
    	assertTrue(result.equals(""));
    }
    @Test(expected = NumberFormatException.class)
    public void testInsertRating1(){
    	I.insertRating("","nom","test","player","");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInsertRating2(){
    	I.insertRating("","","","","");
    }
    @Test
    public void testGetSerieGame(){
         ArrayList<JSONObject> list=I.getSerieGame("");
         assertTrue(list.isEmpty());
    }
    @Test
    public void testgetMeanRating(){
    	String result=I.getMeanRating("");
    	assertTrue(result.equals(""));
    }
    @Test
    public void testgetMeanUser(){
    	String result=I.getMeanUser("");
    	assertTrue(result.equals(""));
    }
    @Test
    public void testgetMeanSerie(){
    	String result=I.getMeanSerie("");
    	assertTrue(result.equals(""));
    }
    @Test
    public void testgetMaxMin(){
    	String result[]=I.getMaxMin("");
    	assertArrayEquals(result,new String[]{"","",""});
    }
    @Test
    public void testConnexion(){
    	String result=I.getMeanRating("");
    	assertTrue(result.equals(""));
    }
    
    
}
