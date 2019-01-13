/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;

import java.awt.Component;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import static org.mockito.Mockito.mock;
//import java.lang.NumberFormatException;


/**
 *
 * @author scotte
 */
public class AffichageTest {
    private static Affichage A;
    private Affichage aff1;
    private InterfaceMongoDB inter;
    private String str;
    private int i1, i2;
    
    public AffichageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        InterfaceMongoDB im= mock(InterfaceMongoDB.class);
        A=new Affichage("Admin",0,im);
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
    public void testAddSerieButtonActionPerformedNumberTest(){
        A.setCreationSerie("test");
        A.addSerie();
    }
    @Test
    public void testtToStringArray(){
        DefaultListModel testlistModel=new DefaultListModel();
        testlistModel.addElement("test1");
        testlistModel.addElement("test2");
        assertArrayEquals(Affichage.toStringArray(testlistModel),new String[]{"test1","test2"});
    }
    @Test(expected = NumberFormatException.class)
    public void testAddGameButtonActionPerformedNumberTest(){
        A.setYearGame("test");
        A.addGame();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddGameSerie1(){
        A.setGameSerie("");
        A.addGameSerie();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddGameSerie2(){
        A.setGameSerie("Jeu de la serie à ajouter à la liste");
        A.addGameSerie();
    }
    //_
    @Test
    public void testCreationGetListModel() {
        // TODO review the generated test code and remove the default call to fail.
        
        str = "abc";   // variable inutile donc les tests ne sont pas à faire
        i2 = 1;
        inter = mock(InterfaceMongoDB.class);
        
        aff1 = new Affichage(str,i1,inter);
        assertTrue(aff1.getListModel()!=null);
    }
    
    @Test
    public void testCreationAffichage() {
        // TODO review the generated test code and remove the default call to fail.
        
        str = "abc";   // variable inutile donc les tests ne sont pas à faire
        i1 = 0;
        inter = mock(InterfaceMongoDB.class);
        
        aff1 = new Affichage(str,i1,inter);
        assertTrue(aff1.getListModel()!=null);
    }
    
    @Test
    public void testCreationAffichageChangementsAdministrateur() {
        // TODO review the generated test code and remove the default call to fail.

        str = "abc";   // variable inutile donc les tests ne sont pas à faire
        i2 = 1;
        inter = mock(InterfaceMongoDB.class);
        aff1 = new Affichage(str,i2,inter);
        boolean err = false;
        
        Component[] components = aff1.getJTabbedPane2();
        JPanel panGame = aff1.getAddGame();
        JPanel panStats = aff1.getStats();
        JPanel panSerie = aff1.getAddSerie();
        for(int i=0; i< components.length; i++){
            if (components[i]==panGame || components[i]==panStats || components[i]==panSerie)
                err = true;
        }
        
        assertTrue(!err);
    }
}
