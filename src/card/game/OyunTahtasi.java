/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.game;

import static card.game.Oyuncu.oyuncuAdi;
import static card.game.futbolcu.kartKullanildiMi;
import static java.lang.Math.random;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static javax.xml.datatype.DatatypeConstants.TIME;

/**
 *
 * @author hasan
 */
public class OyunTahtasi extends javax.swing.JFrame {

    public static int control=0;
    int kart=0;
    boolean s1,s2,s3,s4,s5,s6,s7,s8;
    int a = 0;
    int i = 0;
    int j;
    int counter;
    ArrayList<futbolcu> kf = new ArrayList<>();
    ArrayList<basketbolcu> kb = new ArrayList<>();
    ArrayList<futbolcu> bf = new ArrayList<>();
    ArrayList<basketbolcu> bb = new ArrayList<>();

    /**
     * Creates new form OyunTahtasi
     *
     * @param kf
     * @param kb
     * @param bf
     * @param bb
     */
    public OyunTahtasi(ArrayList<futbolcu> kf, ArrayList<basketbolcu> kb, ArrayList<futbolcu> bf, ArrayList<basketbolcu> bb) {
        initComponents();

        Random rnd = new Random();
        this.kf = kf;
        this.kb = kb;
        this.bf = bf;
        this.bb = bb;
       
//        jButton1.setText(String.valueOf(bf.get(0).sporcuIsim));
//        jButton2.setText(String.valueOf(bf.get(1).sporcuIsim));
//        jButton3.setText(String.valueOf(bf.get(2).sporcuIsim));
//        jButton4.setText(String.valueOf(bf.get(3).sporcuIsim));
//        jButton5.setText(String.valueOf(bb.get(0).sporcuIsim));
//        jButton6.setText(String.valueOf(bb.get(1).sporcuIsim));
//        jButton7.setText(String.valueOf(bb.get(2).sporcuIsim));
//        jButton8.setText(String.valueOf(bb.get(3).sporcuIsim));

        jTextArea1.setText(String.valueOf("Takımı: " + String.valueOf(bf.get(0).sporcuTakim) + "\nPenaltı: " + String.valueOf(bf.get(0).penaltı) + "\nSerbest Vuruş :" + String.valueOf(bf.get(0).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(bf.get(0).kaleciKarsiKarsiya)));
        jTextArea2.setText(String.valueOf("Takımı: " + String.valueOf(bf.get(1).sporcuTakim) + "\nPenaltı: " + String.valueOf(bf.get(1).penaltı) + "\nSerbest Vuruş :" + String.valueOf(bf.get(1).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(bf.get(1).kaleciKarsiKarsiya)));
        jTextArea3.setText(String.valueOf("Takımı: " + String.valueOf(bf.get(2).sporcuTakim) + "\nPenaltı: " + String.valueOf(bf.get(2).penaltı) + "\nSerbest Vuruş :" + String.valueOf(bf.get(2).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(bf.get(2).kaleciKarsiKarsiya)));
        jTextArea4.setText(String.valueOf("Takımı: " + String.valueOf(bf.get(3).sporcuTakim) + "\nPenaltı: " + String.valueOf(bf.get(3).penaltı) + "\nSerbest Vuruş :" + String.valueOf(bf.get(3).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(bf.get(3).kaleciKarsiKarsiya)));
        jTextArea5.setText(String.valueOf("Takımı: " + String.valueOf(bb.get(0).sporcuTakim) + "\nÜçlük: " + String.valueOf(bb.get(0).ucluk) + "\nİkilik: " + String.valueOf(bb.get(0).ikilik) + "\nSerbest Atış:" + String.valueOf(bb.get(0).serbestAtis)));
        jTextArea6.setText(String.valueOf("Takımı: " + String.valueOf(bb.get(1).sporcuTakim) + "\nÜçlük: " + String.valueOf(bb.get(1).ucluk) + "\nİkilik: " + String.valueOf(bb.get(1).ikilik) + "\nSerbest Atış:" + String.valueOf(bb.get(1).serbestAtis)));
        jTextArea7.setText(String.valueOf("Takımı: " + String.valueOf(bb.get(2).sporcuTakim) + "\nÜçlük: " + String.valueOf(bb.get(2).ucluk) + "\nİkilik: " + String.valueOf(bb.get(2).ikilik) + "\nSerbest Atış:" + String.valueOf(bb.get(2).serbestAtis)));
        jTextArea8.setText(String.valueOf("Takımı: " + String.valueOf(bb.get(3).sporcuTakim) + "\nÜçlük: " + String.valueOf(bb.get(3).ucluk) + "\nİkilik: " + String.valueOf(bb.get(3).ikilik) + "\nSerbest Atış:" + String.valueOf(bb.get(3).serbestAtis)));

        jTextArea9.setText(String.valueOf("Takımı: " + String.valueOf(kf.get(0).sporcuTakim) + "\nPenaltı: " + String.valueOf(kf.get(0).penaltı) + "\nSerbest Vuruş :" + String.valueOf(kf.get(0).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(kf.get(0).kaleciKarsiKarsiya)));
        jTextArea10.setText(String.valueOf("Takımı: " + String.valueOf(kf.get(1).sporcuTakim) + "\nPenaltı: " + String.valueOf(kf.get(1).penaltı) + "\nSerbest Vuruş :" + String.valueOf(kf.get(1).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(kf.get(1).kaleciKarsiKarsiya)));
        jTextArea11.setText(String.valueOf("Takımı: " + String.valueOf(kf.get(2).sporcuTakim) + "\nPenaltı: " + String.valueOf(kf.get(2).penaltı) + "\nSerbest Vuruş :" + String.valueOf(kf.get(2).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(kf.get(2).kaleciKarsiKarsiya)));
        jTextArea12.setText(String.valueOf("Takımı: " + String.valueOf(kf.get(3).sporcuTakim) + "\nPenaltı: " + String.valueOf(kf.get(3).penaltı) + "\nSerbest Vuruş :" + String.valueOf(kf.get(3).serbestAtis) + "\nKarşı Karşıya:" + String.valueOf(kf.get(3).kaleciKarsiKarsiya)));
        jTextArea13.setText(String.valueOf("Takımı: " + String.valueOf(kb.get(0).sporcuTakim) + "\nÜçlük: " + String.valueOf(kb.get(0).ucluk) + "\nİkilik: " + String.valueOf(kb.get(0).ikilik) + "\nSerbest Atış:" + String.valueOf(kb.get(0).serbestAtis)));
        jTextArea14.setText(String.valueOf("Takımı: " + String.valueOf(kb.get(1).sporcuTakim) + "\nÜçlük: " + String.valueOf(kb.get(1).ucluk) + "\nİkilik: " + String.valueOf(kb.get(1).ikilik) + "\nSerbest Atış:" + String.valueOf(kb.get(1).serbestAtis)));
        jTextArea15.setText(String.valueOf("Takımı: " + String.valueOf(kb.get(2).sporcuTakim) + "\nÜçlük: " + String.valueOf(kb.get(2).ucluk) + "\nİkilik: " + String.valueOf(kb.get(2).ikilik) + "\nSerbest Atış:" + String.valueOf(kb.get(2).serbestAtis)));
        jTextArea16.setText(String.valueOf("Takımı: " + String.valueOf(kb.get(3).sporcuTakim) + "\nÜçlük: " + String.valueOf(kb.get(3).ucluk) + "\nİkilik: " + String.valueOf(kb.get(3).ikilik) + "\nSerbest Atış:" + String.valueOf(kb.get(3).serbestAtis)));

        jButton9.setText(String.valueOf(kf.get(0).sporcuIsim));
        jButton10.setText(String.valueOf(kf.get(1).sporcuIsim));
        jButton11.setText(String.valueOf(kf.get(2).sporcuIsim));
        jButton12.setText(String.valueOf(kf.get(3).sporcuIsim));
        jButton13.setText(String.valueOf(kb.get(0).sporcuIsim));
        jButton14.setText(String.valueOf(kb.get(1).sporcuIsim));
        jButton15.setText(String.valueOf(kb.get(2).sporcuIsim));
        jButton16.setText(String.valueOf(kb.get(3).sporcuIsim));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BilgisayarDeste = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Bilgisayar1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        skor = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        skor1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        BilgisayarKart1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        OyuncuKart1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        OyuncuKart = new javax.swing.JLabel();
        BilgisayarKart = new javax.swing.JLabel();
        Karsilastirma = new javax.swing.JLabel();
        Kazanan = new javax.swing.JLabel();
        Kazaniyor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BilgisayarDeste.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout BilgisayarDesteLayout = new javax.swing.GroupLayout(BilgisayarDeste);
        BilgisayarDeste.setLayout(BilgisayarDesteLayout);
        BilgisayarDesteLayout.setHorizontalGroup(
            BilgisayarDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BilgisayarDesteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BilgisayarDesteLayout.setVerticalGroup(
            BilgisayarDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BilgisayarDesteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BilgisayarDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(BilgisayarDeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 1070, -1));

        Bilgisayar1.setBackground(new java.awt.Color(51, 204, 255));

        jButton9.setText("jButton1");
        jButton9.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea9.setKeymap(null);
        jScrollPane1.setViewportView(jTextArea9);
        jTextArea9.getAccessibleContext().setAccessibleName("");
        jTextArea9.getAccessibleContext().setAccessibleDescription("");

        jButton10.setText("jButton2");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("jButton3");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("jButton4");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton13.setText("jButton5");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton14.setText("jButton6");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jButton15.setText("jButton7");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        jButton16.setText("jButton8");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea10.setKeymap(null);
        jScrollPane9.setViewportView(jTextArea10);

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea11.setKeymap(null);
        jScrollPane10.setViewportView(jTextArea11);

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea12.setKeymap(null);
        jScrollPane11.setViewportView(jTextArea12);

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea16.setEditable(false);
        jTextArea16.setColumns(20);
        jTextArea16.setRows(5);
        jTextArea16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea16.setKeymap(null);
        jScrollPane12.setViewportView(jTextArea16);

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea13.setKeymap(null);
        jScrollPane13.setViewportView(jTextArea13);

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea14.setEditable(false);
        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea14.setKeymap(null);
        jScrollPane14.setViewportView(jTextArea14);

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea15.setEditable(false);
        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jTextArea15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea15.setKeymap(null);
        jScrollPane15.setViewportView(jTextArea15);

        javax.swing.GroupLayout Bilgisayar1Layout = new javax.swing.GroupLayout(Bilgisayar1);
        Bilgisayar1.setLayout(Bilgisayar1Layout);
        Bilgisayar1Layout.setHorizontalGroup(
            Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bilgisayar1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap())
        );
        Bilgisayar1Layout.setVerticalGroup(
            Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bilgisayar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Bilgisayar1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Bilgisayar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(Bilgisayar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        skor.setEditable(false);
        skor.setColumns(20);
        skor.setRows(5);
        jScrollPane2.setViewportView(skor);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, 50));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        skor1.setEditable(false);
        skor1.setColumns(20);
        skor1.setRows(5);
        jScrollPane3.setViewportView(skor1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 170, 50));

        jLabel1.setText("            Bilgisayarın Skoru");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 170, -1));

        jLabel2.setText("                Sizin Skorunuz");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, -1));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        BilgisayarKart1.setEditable(false);
        BilgisayarKart1.setColumns(20);
        BilgisayarKart1.setRows(5);
        BilgisayarKart1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BilgisayarKart1.setKeymap(null);
        jScrollPane5.setViewportView(BilgisayarKart1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 130, 120));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        OyuncuKart1.setEditable(false);
        OyuncuKart1.setColumns(20);
        OyuncuKart1.setRows(5);
        OyuncuKart1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        OyuncuKart1.setKeymap(null);
        jScrollPane6.setViewportView(OyuncuKart1);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 130, 120));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane8.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane16.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane17.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane18.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane19.setViewportView(jTextArea6);

        getContentPane().add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane20.setViewportView(jTextArea7);

        getContentPane().add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));

        jScrollPane21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane21.setViewportView(jTextArea8);

        getContentPane().add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 0, 10));
        getContentPane().add(OyuncuKart, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, 50));
        getContentPane().add(BilgisayarKart, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 130, 50));
        getContentPane().add(Karsilastirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 170, 50));
        getContentPane().add(Kazanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 160, 70));
        getContentPane().add(Kazaniyor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 190, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked

       s1 =   kartKullanildiMi(kf.get(0).sporcuIsim);
        if (i<=7 && i%2==0 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton9.getText()));
            OyuncuKart1.setText(String.valueOf(jTextArea9.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea1.getText()));
            jButton9.setVisible(false);
            i++;
            kart++;
            BilgisayarKart.setText(bf.get(0).sporcuIsim);
            jButton1.setVisible(false);
            jTextArea9.setVisible(false);
            Random random = new Random();

            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                Karsilastirma.setText("Penaltı Geldi");
                if (kf.get(0).penaltı == bf.get(0).penaltı) {
                    jButton1.setVisible(true);
                    jButton9.setVisible(true);
                    jTextArea9.setVisible(true);
                    s1 = false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else if (kf.get(0).penaltı > bf.get(0).penaltı) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("Serbest Vuruş Geldi");
                if (kf.get(0).serbestAtis == bf.get(0).serbestAtis) {
                    jButton1.setVisible(true);
                    jButton9.setVisible(true);
                    jTextArea9.setVisible(true);
                    s1=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                }

              else  if (kf.get(0).serbestAtis > bf.get(0).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Kaleciyle Karşı Karşıya Geldi");
                if (kf.get(0).kaleciKarsiKarsiya == bf.get(0).kaleciKarsiKarsiya) {
                    jButton1.setVisible(true);
                    jTextArea9.setVisible(true);
                    jButton9.setVisible(true);
                    s1=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                }

               else if (kf.get(0).kaleciKarsiKarsiya > bf.get(0).kaleciKarsiKarsiya) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }

        }
        if(kart==7 && kf.get(0).penaltı == bf.get(0).penaltı && kf.get(0).serbestAtis == bf.get(0).serbestAtis && kf.get(0).kaleciKarsiKarsiya > bf.get(0).kaleciKarsiKarsiya)
            control =1;
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
        if(s1=true)
            counter++;
        System.out.println(i);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        if (i<=7 && i%2==1 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton13.getText()));
            jButton13.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea13.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea5.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bb.get(0).sporcuIsim);
            jButton5.setVisible(false);
            jTextArea13.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                
                Karsilastirma.setText("Üçlük Geldi");
                if (kb.get(0).ucluk == bb.get(0).ucluk) {
                    jButton13.setVisible(true);
                    jTextArea13.setVisible(true);
                    jButton5.setVisible(true);
                    s2=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else if (kb.get(0).ucluk > bb.get(0).ucluk) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                
                Karsilastirma.setText("İkilik Geldi");
                if (kb.get(0).ikilik == bb.get(0).ikilik) {
                    jButton13.setVisible(true);
                    jTextArea13.setVisible(true);
                    jButton5.setVisible(true);
                    s2=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                }
               else if (kb.get(0).ikilik > bb.get(0).ikilik) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                if (kb.get(0).serbestAtis == bb.get(0).serbestAtis) {
                    jButton13.setVisible(true);
                    jTextArea13.setVisible(true);
                    jButton5.setVisible(true);
                    s2=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    Karsilastirma.setText("Serbest Atış Geldi");
                }
                
                else if (kb.get(0).serbestAtis > bb.get(0).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }

        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
        if(s2=true)
            counter++;
        System.out.println(i);
        if(kart==7 && kb.get(0).ucluk == bb.get(0).ucluk && kb.get(0).ikilik == bb.get(0).ikilik && kb.get(0).serbestAtis == bb.get(0).serbestAtis)
            control =1;
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if (i<=7 && i%2==0 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton10.getText()));
            jButton10.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea10.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea2.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bf.get(1).sporcuIsim);
            jButton2.setVisible(false);
            jTextArea10.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                
                Karsilastirma.setText("Penaltı Geldi");
                if (kf.get(1).penaltı == bf.get(1).penaltı) {
                    jButton2.setVisible(true);
                    jButton10.setVisible(true);
                    jTextArea10.setVisible(true);
                    s3=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else if (kf.get(1).penaltı > bf.get(1).penaltı) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("Serbest Vuruş Geldi");
                if (kf.get(1).serbestAtis == bf.get(1).serbestAtis) {
                    jButton2.setVisible(true);
                    jButton10.setVisible(true);
                    jTextArea10.setVisible(true);
                    s3=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(1).serbestAtis > bf.get(1).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Kaleciyle Karşı Karşıya Geldi");
                if (kf.get(1).kaleciKarsiKarsiya == bf.get(1).kaleciKarsiKarsiya) {
                    jButton2.setVisible(true);
                    jButton10.setVisible(true);
                    jTextArea10.setVisible(true);
                    s3=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(1).kaleciKarsiKarsiya > bf.get(1).kaleciKarsiKarsiya) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }
        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
         if(kart==7 && kf.get(1).penaltı == bf.get(1).penaltı && kf.get(1).serbestAtis == bf.get(1).serbestAtis && kf.get(1).kaleciKarsiKarsiya > bf.get(1).kaleciKarsiKarsiya)
            control =1;
        if(s3=true)
            counter++;
        System.out.println(i);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        if (i<=7 && i%2==1 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton14.getText()));
            jButton14.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea14.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea6.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bb.get(1).sporcuIsim);
            jButton6.setVisible(false);
            jTextArea14.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                Karsilastirma.setText("Üçlük Geldi");
                if (kb.get(1).ucluk == bb.get(1).ucluk) {
                    jButton14.setVisible(true);
                    jTextArea14.setVisible(true);
                    jButton6.setVisible(true);
                    s4=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(1).ucluk > bb.get(1).ucluk) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("İkilik Geldi");
                if (kb.get(1).ikilik == bb.get(1).ikilik) {
                    jButton14.setVisible(true);
                    jTextArea14.setVisible(true);
                    jButton6.setVisible(true);
                    s4=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(1).ikilik > bb.get(1).ikilik) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Serbest Atış Geldi");
                if (kb.get(1).serbestAtis == bb.get(1).serbestAtis) {
                    jButton14.setVisible(true);
                    jTextArea14.setVisible(true);
                    jButton6.setVisible(true);
                    s4=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(1).serbestAtis > bb.get(1).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }
        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
        if(s4=true)
            counter++;
        System.out.println(i);
        if(kart==7 && kb.get(1).ucluk == bb.get(1).ucluk && kb.get(1).ikilik == bb.get(1).ikilik && kb.get(1).serbestAtis == bb.get(1).serbestAtis)
            control =1;
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        if (i<=7 && i%2==0 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton11.getText()));
            jButton11.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea11.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea3.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bf.get(2).sporcuIsim);
            jButton3.setVisible(false);
            jTextArea11.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                Karsilastirma.setText("Penaltı Geldi");
                if (kf.get(2).penaltı == bf.get(2).penaltı) {
                    jButton3.setVisible(true);
                    jButton11.setVisible(true);
                    jTextArea11.setVisible(true);
                    s5=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(2).penaltı > bf.get(2).penaltı) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("Serbest Vuruş Geldi");
                if (kf.get(2).serbestAtis == bf.get(2).serbestAtis) {
                    jButton3.setVisible(true);
                    jButton11.setVisible(true);
                    jTextArea11.setVisible(true);
                    s5=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(2).serbestAtis > bf.get(2).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Kaleciyle Karşı Karşıya Geldi");
                if (kf.get(2).kaleciKarsiKarsiya == bf.get(2).kaleciKarsiKarsiya) {
                    jButton3.setVisible(true);
                    jButton11.setVisible(true);
                    jTextArea11.setVisible(true);
                    s5=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(2).kaleciKarsiKarsiya > bf.get(2).kaleciKarsiKarsiya) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }
        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
        if(s5=true)
            counter++;
        System.out.println(i);
        if(kart==7 && kf.get(2).penaltı == bf.get(2).penaltı && kf.get(2).serbestAtis == bf.get(2).serbestAtis && kf.get(2).kaleciKarsiKarsiya > bf.get(2).kaleciKarsiKarsiya)
            control =1;
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        if (i<=7 && i%2==1 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton15.getText()));
            jButton15.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea15.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea7.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bb.get(2).sporcuIsim);
            jButton7.setVisible(false);
            jTextArea15.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                Karsilastirma.setText("Üçlük Geldi");
                if (kb.get(2).ucluk == bb.get(2).ucluk) {
                    jButton15.setVisible(true);
                    jTextArea15.setVisible(true);
                    jButton7.setVisible(true);
                    s6=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(2).ucluk > bb.get(2).ucluk) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("İkilik Geldi");
                if (kb.get(2).ikilik == bb.get(2).ikilik) {
                    jButton15.setVisible(true);
                    jTextArea15.setVisible(true);
                    jButton7.setVisible(true);
                     s6=false;
                     kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(2).ikilik > bb.get(2).ikilik) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Serbest Atış Geldi");
                if (kb.get(2).serbestAtis == bb.get(2).serbestAtis) {
                    jButton15.setVisible(true);
                    jTextArea15.setVisible(true);
                    jButton7.setVisible(true);
                     s6=false;
                     kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(2).serbestAtis > bb.get(2).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }
        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
        if(s6=true)
            counter++;
        System.out.println(i);
        if(kart==7 && kb.get(2).ucluk == bb.get(2).ucluk && kb.get(2).ikilik == bb.get(2).ikilik && kb.get(2).serbestAtis == bb.get(2).serbestAtis)
            control =1;
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        if (i<=7 && i%2==0 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton12.getText()));
            jButton12.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea12.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea4.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bf.get(3).sporcuIsim);
            jButton4.setVisible(false);
            jTextArea12.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                Karsilastirma.setText("Penaltı Geldi");
                if (kf.get(3).penaltı == bf.get(3).penaltı) {
                    jButton4.setVisible(true);
                    jButton12.setVisible(true);
                    jTextArea12.setVisible(true);
                     s7=false;
                     kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(3).penaltı > bf.get(3).penaltı) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("Serbest Vuruş Geldi");
                if (kf.get(3).serbestAtis == bf.get(3).serbestAtis) {
                    jButton4.setVisible(true);
                    jButton12.setVisible(true);
                    jTextArea12.setVisible(true);
                    s7=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(3).serbestAtis > bf.get(3).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Kaleciyle Karşı Karşıya Geldi");
                if (kf.get(3).kaleciKarsiKarsiya == bf.get(3).kaleciKarsiKarsiya) {
                    jButton4.setVisible(true);
                    jButton12.setVisible(true);
                    jTextArea12.setVisible(true);
                    s7=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kf.get(3).kaleciKarsiKarsiya > bf.get(3).kaleciKarsiKarsiya) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }
        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
         if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            
        }
        if(s7=true)
            counter++;
        System.out.println(i);
        if(kart==7 && kf.get(3).penaltı == bf.get(3).penaltı && kf.get(3).serbestAtis == bf.get(3).serbestAtis && kf.get(3).kaleciKarsiKarsiya > bf.get(3).kaleciKarsiKarsiya)
            control =1;
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        if (i<=7 && i%2==1 || i>7) {
            OyuncuKart.setText(String.valueOf(jButton16.getText()));
            jButton16.setVisible(false);
            OyuncuKart1.setText(String.valueOf(jTextArea16.getText()));
            BilgisayarKart1.setText(String.valueOf(jTextArea8.getText()));
            i++;
            kart++;
            BilgisayarKart.setText(bb.get(3).sporcuIsim);
            jButton8.setVisible(false);
            jTextArea16.setVisible(false);
            j = (int) ((random() * 99) % 3);
            if (j == 0) {
                Karsilastirma.setText("Üçlük Geldi");
                if (kb.get(3).ucluk == bb.get(3).ucluk) {
                    jButton16.setVisible(true);
                    jTextArea16.setVisible(true);
                    jButton8.setVisible(true);
                    s8=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(3).ucluk > bb.get(3).ucluk) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 1) {
                Karsilastirma.setText("İkilik Geldi");
                if (kb.get(3).ikilik == bb.get(3).ikilik) {
                    jButton16.setVisible(true);
                    jTextArea16.setVisible(true);
                    jButton8.setVisible(true);
                    s8=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(3).ikilik > bb.get(3).ikilik) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            } else if (j == 2) {
                Karsilastirma.setText("Serbest Atış Geldi");
                if (kb.get(3).serbestAtis == bb.get(3).serbestAtis) {
                    jButton16.setVisible(true);
                    jTextArea16.setVisible(true);
                    jButton8.setVisible(true);
                    s8=false;
                    kart--;
                    Kazanan.setText("Tur Berabere");
                    
                } else
                if (kb.get(3).serbestAtis > bb.get(3).serbestAtis) {
                    Kullanıcı.Skor = Kullanıcı.Skor + 10;
                    skor.setText(String.valueOf(Kullanıcı.Skor));
                    Kazanan.setText("Turu Kullanıcı Kazandı");

                } else {
                    Bilgisayar.Skor = Bilgisayar.Skor + 10;
                    skor1.setText(String.valueOf(Bilgisayar.Skor));
                    Kazanan.setText("Turu Bilgisayar Kazandı");

                }
            }
        }
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kazanıyorsunuz!");
        }else if (Kullanıcı.Skor < Bilgisayar.Skor) {
            Kazaniyor.setText("Siz kaybediyorsunuz!");
        }
        else Kazaniyor.setText("Berabere!");
        if(s8=true)
            counter++;
        System.out.println(i);
        if (Kullanıcı.Skor + Bilgisayar.Skor ==80) {
             control = 1;
            if(kart==7 && kb.get(3).ucluk == bb.get(3).ucluk && kb.get(3).ikilik == bb.get(3).ikilik && kb.get(3).serbestAtis == bb.get(3).serbestAtis)
            control =1;
        }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OyunTahtasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunTahtasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunTahtasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunTahtasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //   new OyunTahtasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bilgisayar1;
    private javax.swing.JPanel BilgisayarDeste;
    private javax.swing.JLabel BilgisayarKart;
    private javax.swing.JTextArea BilgisayarKart1;
    private javax.swing.JLabel Karsilastirma;
    private javax.swing.JLabel Kazanan;
    private javax.swing.JLabel Kazaniyor;
    private javax.swing.JLabel OyuncuKart;
    private javax.swing.JTextArea OyuncuKart1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextArea skor;
    private javax.swing.JTextArea skor1;
    // End of variables declaration//GEN-END:variables
}
