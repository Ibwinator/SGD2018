/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;
/**
 *
 * @author sc364347
 */
public class Affichage extends javax.swing.JFrame {
    private InterfaceMongoDB inter;
    /**
     * Creates new form Affichage
     */
    public Affichage(int type,InterfaceMongoDB i) {
        initComponents();
        inter=i;
        serieGame.setVisible(false);
        if(type == 1 ){
            jTabbedPane2.remove(addGame);
            jTabbedPane2.remove(stats);
            jTabbedPane2.remove(addSerie);
        }
        PlaceHolder holder = new PlaceHolder(nameGame, "Nom du jeu");
        PlaceHolder holder2 = new PlaceHolder(yearGame, "Année du jeu");
        PlaceHolder holder3 = new PlaceHolder(typeGame, "Type");
        PlaceHolder holder4 = new PlaceHolder(editorGame, "Editeur");
        PlaceHolder holder5 = new PlaceHolder(serieGame, "Serie de jeu associée");
        PlaceHolder holder6 = new PlaceHolder(descriGame, "Description");
        
        
    }
    
    private void deleteGameField(){
        nameGame.setText("");
        yearGame.setText("");
        typeGame.setText("");
        serieGame.setText("");
        editorGame.setText("");
        descriGame.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        addGame = new javax.swing.JPanel();
        addGameButton = new javax.swing.JButton();
        yearGame = new javax.swing.JTextField();
        nameGame = new javax.swing.JTextField();
        editorGame = new javax.swing.JTextField();
        typeGame = new javax.swing.JTextField();
        descriGame = new javax.swing.JTextField();
        serieGame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addSerie = new javax.swing.JPanel();
        stats = new javax.swing.JPanel();
        searchRating = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addGameButton.setText("Ajouter");
        addGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGameButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Ajout d'un jeu");

        javax.swing.GroupLayout addGameLayout = new javax.swing.GroupLayout(addGame);
        addGame.setLayout(addGameLayout);
        addGameLayout.setHorizontalGroup(
            addGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGameLayout.createSequentialGroup()
                .addGroup(addGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addGameLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(descriGame, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addGameLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(addGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editorGame, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serieGame, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeGame, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearGame, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameGame, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addGameLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(addGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addGameLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        addGameLayout.setVerticalGroup(
            addGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGameLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editorGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(serieGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descriGame, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ajouter un jeu", null, addGame, "dsds");

        javax.swing.GroupLayout addSerieLayout = new javax.swing.GroupLayout(addSerie);
        addSerie.setLayout(addSerieLayout);
        addSerieLayout.setHorizontalGroup(
            addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        addSerieLayout.setVerticalGroup(
            addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Ajouter une serie", addSerie);

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats);
        stats.setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Statistique", stats);

        javax.swing.GroupLayout searchRatingLayout = new javax.swing.GroupLayout(searchRating);
        searchRating.setLayout(searchRatingLayout);
        searchRatingLayout.setHorizontalGroup(
            searchRatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        searchRatingLayout.setVerticalGroup(
            searchRatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Rechercher un jeu / Laisser un avis", searchRating);

        getContentPane().add(jTabbedPane2, java.awt.BorderLayout.PAGE_START);
        jTabbedPane2.getAccessibleContext().setAccessibleName("Ajouter ");
        jTabbedPane2.getAccessibleContext().setAccessibleDescription("Ajouter ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGameButtonActionPerformed
        // TODO add your handling code here:
        boolean okyear=false;
        String name=nameGame.getText();
        String year=yearGame.getText();
        String type=typeGame.getText();
        String editor=editorGame.getText();
        String serie=serieGame.getText();
        String descri=descriGame.getText();
        try{
            Integer.parseInt(year);
            okyear=true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Année incorrecte");
        }
        if(okyear){
            inter.addGame(name, year, type, editor, serie, descri);
            deleteGameField();
            JOptionPane.showMessageDialog(null,"Jeu ajouté");
        }
        
    }//GEN-LAST:event_addGameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addGame;
    private javax.swing.JButton addGameButton;
    private javax.swing.JPanel addSerie;
    private javax.swing.JTextField descriGame;
    private javax.swing.JTextField editorGame;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField nameGame;
    private javax.swing.JPanel searchRating;
    private javax.swing.JTextField serieGame;
    private javax.swing.JPanel stats;
    private javax.swing.JTextField typeGame;
    private javax.swing.JTextField yearGame;
    // End of variables declaration//GEN-END:variables
}
