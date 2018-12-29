/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;

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
        if(type == 1 ){
            jTabbedPane2.remove(addGame);
            jTabbedPane2.remove(stats);
            jTabbedPane2.remove(addSerie);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        addGame = new javax.swing.JPanel();
        addSerie = new javax.swing.JPanel();
        stats = new javax.swing.JPanel();
        searchRating = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout addGameLayout = new javax.swing.GroupLayout(addGame);
        addGame.setLayout(addGameLayout);
        addGameLayout.setHorizontalGroup(
            addGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        addGameLayout.setVerticalGroup(
            addGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
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
            .addGap(0, 383, Short.MAX_VALUE)
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
            .addGap(0, 383, Short.MAX_VALUE)
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
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Rechercher un jeu / Laisser un avis", searchRating);

        getContentPane().add(jTabbedPane2, java.awt.BorderLayout.PAGE_START);
        jTabbedPane2.getAccessibleContext().setAccessibleName("Ajouter ");
        jTabbedPane2.getAccessibleContext().setAccessibleDescription("Ajouter ");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addGame;
    private javax.swing.JPanel addSerie;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel searchRating;
    private javax.swing.JPanel stats;
    // End of variables declaration//GEN-END:variables
}
