/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class Jeu {
    private String titre="";
    private int note;           //de 1 à 5, comme les étoiles
    
    public Jeu(){
        init("",0);
    }
    private void init(String Titre,int Note){
        titre=Titre;
        note=Note;
    }
    public void setNote(int Note){
        note=Note;
    }
    public int getNote(){
        return note;
    }
    public void setTitre(String Titre){
        titre=Titre;
    }
    public String getTitre(){
        return titre;
    }
}
