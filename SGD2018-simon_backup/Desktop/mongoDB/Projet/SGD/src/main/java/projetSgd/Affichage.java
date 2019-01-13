/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetSgd;
import com.placeholder.PlaceHolder;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.json.*;
/**
 *
 * @author sc364347
 */
public class Affichage extends javax.swing.JFrame {
    private InterfaceMongoDB inter;
    private DefaultListModel listModel;
    private String username;
    /**
     * Creates new form Affichage
     */
    public Affichage(String str,int type,InterfaceMongoDB i) {
        initComponents();
        inter=i;
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        ratingArea.setLineWrap(true);
        ratingArea.setWrapStyleWord(true);
        descriSearchSerie.setLineWrap(true);
        descriSearchSerie.setWrapStyleWord(true);
        ratingSerie.setLineWrap(true);
        ratingSerie.setWrapStyleWord(true);
        userStats.setLineWrap(true);
        userStats.setWrapStyleWord(true);
        username=str;
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
        
        PlaceHolder holder16 = new PlaceHolder( nameRating , "Nom du jeu ou de la serie");
        
        PlaceHolder holder17 = new PlaceHolder(nameSearchSerie, "Nom de la série");
        PlaceHolder holder18 = new PlaceHolder(yearSearchSerie, "Année de création de la serie");
        PlaceHolder holder19 = new PlaceHolder(gameSearchSerie, "Jeu appartenant à la série");
        PlaceHolder holder20 = new PlaceHolder(statnameSearch, "Nom de l'utilisateur");
        
        listModel = new DefaultListModel();
        listGameSerie.setModel(listModel);
    }
    
    // Accesseur de récupération de l'attribut listModel 
    public DefaultListModel getListModel(){
        return listModel;
    }
    // Accesseur de récupération de jTabbedPane2 
    public Component[] getJTabbedPane2(){
        Component[] components = jTabbedPane2.getComponents();
        return components;
    }
    // Accesseur de récupération de addGame 
    public JPanel getAddGame(){        
        return addGame;
    }
    // Accesseur de récupération de stats 
    public JPanel getStats(){
        return stats;
    }
    // Accesseur de récupération de addSerie 
    public JPanel getAddSerie(){
        return addSerie;
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
    
    
    //méthode de test
    public void setYearGame(String s){
        yearGame.setText(s);
        //listModel.addElement("");
    }
    public void addGame(){
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
            throw e;
        }
        if(okyear){
            inter.addGame(name, year, type, editor, serie, descri);
            deleteGameField();
            JOptionPane.showMessageDialog(null,"Jeu ajouté");
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        searchGamePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        typeSearch = new javax.swing.JTextField();
        nameSearch = new javax.swing.JTextField();
        serieSearch = new javax.swing.JTextField();
        yearSearch = new javax.swing.JTextField();
        searchGame = new javax.swing.JButton();
        editorSearch = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        ratingArea = new javax.swing.JTextArea();
        RatingPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        comboNote = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        nameRating = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        ratingDescri = new javax.swing.JTextArea();
        sendRating = new javax.swing.JButton();
        searchSerie = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nameSearchSerie = new javax.swing.JTextField();
        yearSearchSerie = new javax.swing.JTextField();
        gameSearchSerie = new javax.swing.JTextField();
        searchSerieButton = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        gameSerie = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        ratingSerie = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        descriSearchSerie = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stats = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        userStats = new javax.swing.JTextArea();
        statnameSearch = new javax.swing.JTextField();
        statSearch = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

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
        setMaximumSize(new java.awt.Dimension(921, 733));
        setMinimumSize(new java.awt.Dimension(921, 733));

        jTabbedPane2.setMaximumSize(new java.awt.Dimension(921, 733));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(921, 733));

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
                .addContainerGap(344, Short.MAX_VALUE))
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
                .addContainerGap(335, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ajouter une serie", addSerie);

        jLabel3.setText("Recherche de jeu");

        searchGame.setText("Rechercher");
        searchGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGameActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jLabel4.setText("Description du Jeu");

        jLabel5.setText("Avis laissés");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
            },
            new String [] {
                "Nom du jeu", "Serie", "Année", "Type" , "Editeur" ,"Disponible"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable3);

        ratingArea.setEditable(false);
        ratingArea.setColumns(20);
        ratingArea.setRows(5);
        jScrollPane9.setViewportView(ratingArea);

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
                .addGap(35, 35, 35)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serieSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(searchGamePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addGap(21, 21, 21))
            .addGroup(searchGamePanelLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel3)
                .addContainerGap(541, Short.MAX_VALUE))
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
                .addGap(4, 4, 4)
                .addGroup(searchGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rechercher des jeux", searchGamePanel);

        jLabel6.setText("Laisser un avis");

        buttonGroup1.add(radio1);
        radio1.setSelected(true);
        radio1.setText("Sur un jeu");

        buttonGroup1.add(radio2);
        radio2.setText("Sur une série");

        comboNote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4.5", "4", "3.5", "3", "2.5", "2", "1.5", "1", "0.5", "0" }));

        jLabel7.setText("Choix de la note");

        ratingDescri.setColumns(20);
        ratingDescri.setRows(5);
        jScrollPane5.setViewportView(ratingDescri);

        sendRating.setText("Enregistrer l'avis");
        sendRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RatingPanelLayout = new javax.swing.GroupLayout(RatingPanel);
        RatingPanel.setLayout(RatingPanelLayout);
        RatingPanelLayout.setHorizontalGroup(
            RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RatingPanelLayout.createSequentialGroup()
                .addGroup(RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RatingPanelLayout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel6))
                    .addGroup(RatingPanelLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RatingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(comboNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RatingPanelLayout.createSequentialGroup()
                                .addComponent(radio1)
                                .addGap(26, 26, 26)
                                .addComponent(radio2))))
                    .addGroup(RatingPanelLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(nameRating, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RatingPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RatingPanelLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(sendRating, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        RatingPanelLayout.setVerticalGroup(
            RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RatingPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio1)
                    .addComponent(radio2))
                .addGap(18, 18, 18)
                .addComponent(nameRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(RatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboNote, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendRating)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Laisser un avis sur jeu ou une serie", RatingPanel);

        jLabel8.setText("Rechercher une série");

        gameSearchSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameSearchSerieActionPerformed(evt);
            }
        });

        searchSerieButton.setText("Rechercher la série");
        searchSerieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSerieButtonActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {null,null},
            new String [] {
                "Nom", "Année de création"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable4);

        jScrollPane10.setViewportView(gameSerie);

        ratingSerie.setEditable(false);
        ratingSerie.setColumns(20);
        ratingSerie.setRows(5);
        jScrollPane11.setViewportView(ratingSerie);

        descriSearchSerie.setEditable(false);
        descriSearchSerie.setColumns(20);
        descriSearchSerie.setRows(5);
        jScrollPane12.setViewportView(descriSearchSerie);

        jLabel9.setText("Description");

        jLabel10.setText("Jeux de la série");

        jLabel11.setText("Avis sur la série");

        javax.swing.GroupLayout searchSerieLayout = new javax.swing.GroupLayout(searchSerie);
        searchSerie.setLayout(searchSerieLayout);
        searchSerieLayout.setHorizontalGroup(
            searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSerieLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(yearSearchSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(nameSearchSerie)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10)
                    .addComponent(gameSearchSerie)
                    .addComponent(searchSerieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchSerieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchSerieLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchSerieLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(225, 225, 225)
                        .addComponent(jLabel11)
                        .addGap(65, 65, 65))))
            .addGroup(searchSerieLayout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchSerieLayout.setVerticalGroup(
            searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSerieLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchSerieLayout.createSequentialGroup()
                        .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSearchSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameSearchSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearSearchSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchSerieButton)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rechercher une serie", searchSerie);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
            },
            new String [] {
                "Nom du membre", "Description"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable5);

        userStats.setEditable(false);
        userStats.setColumns(20);
        userStats.setRows(5);
        userStats.setFocusable(false);
        jScrollPane14.setViewportView(userStats);

        statSearch.setText("Rechercher");
        statSearch.setToolTipText("");
        statSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statSearchActionPerformed(evt);
            }
        });

        jLabel12.setText("Statistiques sur un utlisateur");

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats);
        stats.setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsLayout.createSequentialGroup()
                        .addComponent(statnameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(346, 346, 346))
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statnameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSearch))
                .addGap(24, 24, 24)
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Statistiques", stats);

        getContentPane().add(jTabbedPane2, java.awt.BorderLayout.PAGE_START);
        jTabbedPane2.getAccessibleContext().setAccessibleName("Ajouter ");
        jTabbedPane2.getAccessibleContext().setAccessibleDescription("Ajouter ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGameButtonActionPerformed
        addGame();
        
    }//GEN-LAST:event_addGameButtonActionPerformed
    
    public static String[] toStringArray(DefaultListModel l){
        String[] tab=new String[l.size()];
        for(int i=0;i<l.size();i++){
            tab[i]=(String)l.get(i);
        }
        return tab;
    }
    
    public void setGameSerie(String s){
        addGameSerie.setText(s);
    }
    
    public void addGameSerie(){
        String game=addGameSerie.getText();
        if(!game.equals("") && !game.equals("Jeu de la serie à ajouter à la liste")){
          listModel.addElement(game);
          addGameSerie.setText("");
        }
        else
            throw new IllegalArgumentException("GameSerie empty or forbidden GameSerie value");
    }
    
    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
        addGameSerie();
    }//GEN-LAST:event_addListActionPerformed

    public void removeFromGameList(){
        int pos=listGameSerie.getSelectedIndex();
        if(pos != -1){
            listModel.remove(pos);
        }
    }
    
    private void removeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeListActionPerformed
        // TODO add your handling code here:
        removeFromGameList();
    }//GEN-LAST:event_removeListActionPerformed

    //méthode de test
    public void setCreationSerie(String s){
        creationSerie.setText(s);
        listModel.addElement("");
    }
    public void addSerie(){
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
                throw e; 
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Liste de jeux associée vide");
        }
    }
    
    private void addSerieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSerieButtonActionPerformed
        // TODO add your handling code here:
        addSerie();
    }//GEN-LAST:event_addSerieButtonActionPerformed

    
    private void searchGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGameActionPerformed
        // TODO add your handling code here:
        String name=nameSearch.getText();
        String year=yearSearch.getText();
        String serie=serieSearch.getText();
        String editor=editorSearch.getText();
        String type=typeSearch.getText();
        jTextArea1.setText("");
        try{
            if(!year.equals("") && !year.equals("Année du jeu")){
                Integer.parseInt(year);
            }
            ArrayList<JSONObject> list=inter.searchGame(name, serie, year, type, editor);
            DefaultTableModel model =(DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            if (list.size()>0){
                for(JSONObject obj : list){
                   if(obj.has("Série")){
                      model.addRow(new Object[]{obj.get("Nomjeu"),obj.get("Série"),obj.get("annéedesortie"),obj.get("types"),obj.get("Editeur"),obj.get("dispo")});
                   }
                   else{
                       model.addRow(new Object[]{obj.get("Nomjeu"),"Sans série",obj.get("annéedesortie"),obj.get("types"),obj.get("Editeur"),obj.get("dispo")});
                   } 
                } 
            }
            else{
                JOptionPane.showMessageDialog(null,"Aucun résultat pour la recherche");
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Année incorrecte");
        }
        
        
        
    }//GEN-LAST:event_searchGameActionPerformed

    private void parseRatings(ArrayList<JSONObject> list,JTextArea ta){
        //ta.setText("");
        for(JSONObject obj : list){
            String str="Avis du joueur : "+obj.get("Playername")+"\n";
            str+="Note : "+obj.get("Note")+"\n";
            str+="Commentaire du joueur : "+obj.get("Descriptif")+"\n\n"; 
            ta.append(str);
        }
    }
    
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int i=jTable3.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel) jTable3.getModel();
        if(i!=-1){
            String name=(String)model.getValueAt(i, 0);
            jTextArea1.setText(inter.getDescriptionGame(name));
            ratingArea.setText("Note moyenne : "+inter.getMeanRating(name)+"\n\n");
            parseRatings(inter.getRating(name, "jeu"),ratingArea);
        }
        else{
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void sendRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRatingActionPerformed
        // TODO add your handling code here:
        String name=nameRating.getText();
        String descri=ratingDescri.getText();
        String note=(String)comboNote.getSelectedItem();
        
        if(!name.equals("") && !name.equals("Nom du jeu ou de la serie") && !descri.equals("")){
            if(radio1.isSelected()){
                inter.insertRating("game", name, note, username, descri);
            }
            else{
                inter.insertRating("serie", name, note, username, descri);
            }
        JOptionPane.showMessageDialog(null,"Avis ajouté");
        nameRating.setText("");
        ratingDescri.setText(""); 
        }else{
            JOptionPane.showMessageDialog(null,"Champ vide");
        }
        
    }//GEN-LAST:event_sendRatingActionPerformed

    private void gameSearchSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameSearchSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameSearchSerieActionPerformed

    private void searchSerieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSerieButtonActionPerformed
        // TODO add your handling code here:
        String name=nameSearchSerie.getText();
        String year=yearSearchSerie.getText();
        String game=gameSearchSerie.getText();
        try{
            if(!year.equals("") && !year.equals("Année de création de la serie")){
                Integer.parseInt(year);
            }
                ArrayList<JSONObject> list=inter.searchSerie(name, year, game);
                DefaultTableModel model =(DefaultTableModel) jTable4.getModel();
                model.setRowCount(0);
                if (list.size()>0){
                    for(JSONObject obj : list){
                        model.addRow(new Object[]{obj.get("Nom"),obj.get("Creation")}); 
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null,"Aucun résultat pour la recherche");
                }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Année de création incorrecte");
        }
    }//GEN-LAST:event_searchSerieButtonActionPerformed
    
    private void addToGameList(ArrayList<JSONObject> list){
        DefaultListModel dlm = new DefaultListModel();
        dlm.setSize(0);
        descriSearchSerie.setText((String)list.get(0).get("Description"));
        for (JSONObject obj : list){
            dlm.addElement(obj.get("Jeux"));
        }
        gameSerie.setModel(dlm);
    }
    
    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int i=jTable4.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel) jTable4.getModel();
        if(i!=-1){
            String name=(String)model.getValueAt(i, 0);
            addToGameList(inter.getSerieGame(name));
            ratingSerie.setText("Note moyenne de le serie : "+inter.getMeanSerie(name)+"\n");
            parseRatings(inter.getRating(name, "Serie"),ratingSerie);
        }
        else{
            descriSearchSerie.setText("");
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void statSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statSearchActionPerformed
        // TODO add your handling code here:
        String name=statnameSearch.getText();
        ArrayList<JSONObject> list=inter.searchUser(name);
        DefaultTableModel model =(DefaultTableModel) jTable5.getModel();
        model.setRowCount(0);
        if(list.size()!=0){
            for(JSONObject obj : list){
                model.addRow(new Object[]{obj.get("Pseudo"),obj.get("description")}); 
            }
        }
        else{
          JOptionPane.showMessageDialog(null,"Aucun résultat pour la recherche");  
        }
        
        
    }//GEN-LAST:event_statSearchActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        int i=jTable5.getSelectedRow();
        
        DefaultTableModel model =(DefaultTableModel) jTable4.getModel();
        if(i!=-1){
           String name=(String)jTable5.getValueAt(i,0);
           String minmax[]=inter.getMaxMin(name);
           userStats.setText("Note moyenne donnée par l'utlilsateur : " +inter.getMeanUser(name)+"\n");
           
           userStats.append("Nombre de notes données : "+minmax[2]+"\nNote minimale donnée : "+minmax[1]+"\nNote maximale donnée par l'utilisateur : "+minmax[0]+"\n");
        }
        else{
            userStats.setText("");
        }
    }//GEN-LAST:event_jTable5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RatingPanel;
    private javax.swing.JPanel addGame;
    private javax.swing.JButton addGameButton;
    private javax.swing.JTextField addGameSerie;
    private javax.swing.JButton addList;
    private javax.swing.JPanel addSerie;
    private javax.swing.JButton addSerieButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboNote;
    private javax.swing.JTextField creationSerie;
    private javax.swing.JTextField descriGame;
    private javax.swing.JTextArea descriSearchSerie;
    private javax.swing.JTextField descriSerie;
    private javax.swing.JTextField editorGame;
    private javax.swing.JTextField editorSearch;
    private javax.swing.JTextField gameSearchSerie;
    private javax.swing.JList<String> gameSerie;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> listGameSerie;
    private javax.swing.JTextField nameGame;
    private javax.swing.JTextField nameRating;
    private javax.swing.JTextField nameSearch;
    private javax.swing.JTextField nameSearchSerie;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JTextArea ratingArea;
    private javax.swing.JTextArea ratingDescri;
    private javax.swing.JTextArea ratingSerie;
    private javax.swing.JButton removeList;
    private javax.swing.JButton searchGame;
    private javax.swing.JPanel searchGamePanel;
    private javax.swing.JPanel searchSerie;
    private javax.swing.JButton searchSerieButton;
    private javax.swing.JButton sendRating;
    private javax.swing.JTextField serieGame;
    private javax.swing.JTextField serieName;
    private javax.swing.JTextField serieSearch;
    private javax.swing.JButton statSearch;
    private javax.swing.JTextField statnameSearch;
    private javax.swing.JPanel stats;
    private javax.swing.JTextField typeGame;
    private javax.swing.JTextField typeSearch;
    private javax.swing.JTextArea userStats;
    private javax.swing.JTextField yearGame;
    private javax.swing.JTextField yearSearch;
    private javax.swing.JTextField yearSearchSerie;
    // End of variables declaration//GEN-END:variables
}
