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
    
    public InterfaceMongoDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    //_
    /**
     * Test of test method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testTest() {
        System.out.println("test");
        InterfaceMongoDB instance = new InterfaceMongoDB();
        instance.test();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of addGame method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testAddGame() {
        System.out.println("addGame");
        String name = "";
        String year = "";
        String type = "";
        String editor = "";
        String serie = "";
        String descri = "";
        InterfaceMongoDB instance = new InterfaceMongoDB();
        instance.addGame(name, year, type, editor, serie, descri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of addSerie method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testAddSerie() {
        System.out.println("addSerie");
        String name = "";
        String year = "";
        String descri = "";
        String[] gameList = null;
        InterfaceMongoDB instance = new InterfaceMongoDB();
        instance.addSerie(name, year, descri, gameList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of searchGame method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testSearchGame() {
        System.out.println("searchGame");
        String name = "";
        String serie = "";
        String year = "";
        String type = "";
        String editor = "";
        InterfaceMongoDB instance = new InterfaceMongoDB();
        ArrayList<JSONObject> expResult = null;
        ArrayList<JSONObject> result = instance.searchGame(name, serie, year, type, editor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getDescriptionGame method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testGetDescriptionGame() {
        System.out.println("getDescriptionGame");
        String name = "";
        InterfaceMongoDB instance = new InterfaceMongoDB();
        String expResult = "";
        String result = instance.getDescriptionGame(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of insertRating method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testInsertRating() {
        System.out.println("insertRating");
        String type = "";
        String name = "";
        String note = "";
        String player = "";
        String descri = "";
        InterfaceMongoDB instance = new InterfaceMongoDB();
        instance.insertRating(type, name, note, player, descri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getRating method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testGetRating() {
        System.out.println("getRating");
        String name = "";
        String type = "";
        InterfaceMongoDB instance = new InterfaceMongoDB();
        ArrayList<JSONObject> expResult = null;
        ArrayList<JSONObject> result = instance.getRating(name, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of connexion method, of class InterfaceMongoDB.
     */
    /*@Test
    public void testConnexion() {
        System.out.println("connexion");
        String username = "";
        String mdp = "";
        InterfaceMongoDB instance = new InterfaceMongoDB();
        int expResult = 0;
        int result = instance.connexion(username, mdp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
