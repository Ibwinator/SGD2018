/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
/**
 *
 * @author sc364347
 */
public class Affichage extends javax.swing.JFrame {
    private InterfaceMongoDB inter;
    private DefaultListModel listModel;
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
        PlaceHolder holder = new PlaceHolder(nameGame, "Nom du jeu");
        PlaceHolder holder2 = new PlaceHolder(yearGame, "Année du jeu");
        PlaceHolder holder3 = new PlaceHolder(typeGame, "Type");
        PlaceHolder holder4 = new PlaceHolder(editorGame, "Editeur");
        PlaceHolder holder5 = new PlaceHolder(serieGame, "Serie de jeu associée");
        PlaceHolder holder6 = new PlaceHolder(descriGame, "Description");
        
        PlaceHolder holder7 = new PlaceHolder(serieName, "Nom de la serie");
        PlaceHolder holder8 = new PlaceHolder(creationSerie, "Année de création");
        PlaceHolder holder9 = new PlaceHolder(descriSerie, "Description");
        PlaceHolder holder10 = new PlaceHolder(addGameSerie, "Jeu de la serie à ajouter à la liste");
        
        PlaceHolder holder11 = new PlaceHolder(nameSearch, "Nom du jeu");
        PlaceHolder holder12 = new PlaceHolder(yearSearch, "Année du jeu");
        PlaceHolder holder13 = new PlaceHolder(typeSearch, "Type");
        PlaceHolder holder14 = new PlaceHolder(editorSearch, "Editeur");
        PlaceHolder holder15 = new PlaceHolder(serieSearch, "Serie de jeu associée");
        
        listModel = new DefaultListModel();
        listGameSerie.setModel(listModel);
    }
    
    private void deleteGameField(){
        nameGame.setText("");
        yearGame.setText("");
        typeGame.setText("");
        serieGame.setText("");
        editorGame.setText("");
        descriGame.setText("");
    }
     private void deleteSerieField(){
        addGameSerie.setText("");
        serieName.setText("");
        creationSerie.setText("");
        descriSerie.setText("");
        listModel = new DefaultListModel();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        serieName = new javax.swing.JTextField();
        creationSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        descriSerie = new javax.swing.JTextField();
        addGameSerie = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGameSerie = new javax.swing.JList<>();
        addList = new javax.swing.JButton();
        removeList = new javax.swing.JButton();
        addSerieButton = new javax.swing.JButton();
        stats = new javax.swing.JPanel();
        searchGamePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        typeSearch = new javax.swing.JTextField();
        nameSearch = new javax.swing.JTextField();
        serieSearch = new javax.swing.JTextField();
        yearSearch = new javax.swing.JTextField();
        searchGame = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        editorSearch = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        borrowButton = new javax.swing.JButton();
        RatingPanel = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médiathèque");

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
                .addContainerGap(453, Short.MAX_VALUE))
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
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ajouter un jeu", null, addGame, "dsds");

        jLabel2.setText("Ajout d'une serie de jeu");

        jScrollPane2.setViewportView(listGameSerie);

        addList.setText("Ajouter ");
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
            }
        });

        removeList.setText("Supprimer");
        removeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeListActionPerformed(evt);
            }
        });

        addSerieButton.setText("Ajouter la serie");
        addSerieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSerieButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addSerieLayout = new javax.swing.GroupLayout(addSerie);
        addSerie.setLayout(addSerieLayout);
        addSerieLayout.setHorizontalGroup(
            addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSerieLayout.createSequentialGroup()
                .addGroup(addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSerieLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2))
                    .addGroup(addSerieLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(creationSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serieName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGameSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addSerieLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addSerieLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addList, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(addSerieLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(addSerieButton)))))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        addSerieLayout.setVerticalGroup(
            addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSerieLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(serieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(creationSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descriSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGameSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addList)
                    .addComponent(removeList))
                .addGap(18, 18, 18)
                .addComponent(addSerieButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ajouter une serie", addSerie);

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats);
        stats.setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Statistiques", stats);

        jLabel3.setText("Recherche de jeu");

        searchGame.setText("Rechercher");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nom", "Serie associée", "Année de sortie","Type de jeu","Editeur","Disponible",
            }
        ));
        jTable3.setColumnSelectionAllowed(true);
        jScrollPane5.setViewportView(jTable3);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jLabel4.setText("Description du Jeu");

        jScrollPane7.setViewportView(jList1);

        jLabel5.setText("Avis laissé");

        borrowButton.setText("Emprunter");

        javax.swing.GroupLayout searchGamePanelLayout = new javax.swing.GroupLayout(searchGamePanel);
        searchGamePanel.setLayout(searchGamePanelLayout);
        searchGamePanelLayout.setHorizontalGroup(
            searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(114, 114, 114))))
            .addGroup(searchGamePanelLayout.createSequentialGroup()
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3))
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(borrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(searchGamePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serieSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        searchGamePanelLayout.setVerticalGroup(
            searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchGamePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serieSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchGame)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addComponent(borrowButton)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Rechercher/Emprunter un jeu ", searchGamePanel);

        javax.swing.GroupLayout RatingPanelLayout = new javax.swing.GroupLayout(RatingPanel);
        RatingPanel.setLayout(RatingPanelLayout);
        RatingPanelLayout.setHorizontalGroup(
            RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        RatingPanelLayout.setVerticalGroup(
            RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Laisser un avis sur jeu ou une serie", RatingPanel);

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
    
    private String[] toStringArray(DefaultListModel l){
        String[] tab=new String[l.size()];
        for(int i=0;i<l.size();i++){
            tab[i]=(String)l.get(i);
        }
        return tab;
    }
    
    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
        // TODO add your handling code here:
        String game=addGameSerie.getText();
        if(!game.equals("") && !game.equals("Jeu de la serie à ajouter à la liste")){
          listModel.addElement(game);
          addGameSerie.setText("");
        }
    }//GEN-LAST:event_addListActionPerformed

    private void removeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeListActionPerformed
        // TODO add your handling code here:
        int pos=listGameSerie.getSelectedIndex();
        if(pos != -1){
            listModel.remove(pos);
        }
    }//GEN-LAST:event_removeListActionPerformed

    private void addSerieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSerieButtonActionPerformed
        // TODO add your handling code here:
        int size=listModel.size();
        if(size>0){
            String name=serieName.getText();
            String year=creationSerie.getText();
            String descri=descriSerie.getText();
            try{
                Integer.parseInt(year);
                inter.addSerie(name, year, descri, toStringArray(listModel));
                JOptionPane.showMessageDialog(null,"Serie Ajoutée");
                deleteSerieField();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Année incorrecte");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Liste de jeux associée vide");
        }
    }//GEN-LAST:event_addSerieButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RatingPanel;
    private javax.swing.JPanel addGame;
    private javax.swing.JButton addGameButton;
    private javax.swing.JTextField addGameSerie;
    private javax.swing.JButton addList;
    private javax.swing.JPanel addSerie;
    private javax.swing.JButton addSerieButton;
    private javax.swing.JButton borrowButton;
    private javax.swing.JTextField creationSerie;
    private javax.swing.JTextField descriGame;
    private javax.swing.JTextField descriSerie;
    private javax.swing.JTextField editorGame;
    private javax.swing.JTextField editorSearch;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> listGameSerie;
    private javax.swing.JTextField nameGame;
    private javax.swing.JTextField nameSearch;
    private javax.swing.JButton removeList;
    private javax.swing.JButton searchGame;
    private javax.swing.JPanel searchGamePanel;
    private javax.swing.JTextField serieGame;
    private javax.swing.JTextField serieName;
    private javax.swing.JTextField serieSearch;
    private javax.swing.JPanel stats;
    private javax.swing.JTextField typeGame;
    private javax.swing.JTextField typeSearch;
    private javax.swing.JTextField yearGame;
    private javax.swing.JTextField yearSearch;
    // End of variables declaration//GEN-END:variables
}
