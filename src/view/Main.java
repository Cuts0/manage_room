/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bangsapxep;
import model.KhachHang;
import model.Phong;

/**
 *
 * @author Administrator
 */
public class Main extends javax.swing.JFrame {
    DefaultTableModel tPhong,tKH,tBang;
    String fPhong,fKH,fBang;
    List<Phong> listPhong;
    List<KhachHang> listKH;
    List<Bangsapxep> listBang;
    public Main() {
        initComponents();
        fPhong="src/controller/PH.DAT";
        fKH="src/controller/KH.DAT";
        fBang="src/controller/BANGSX.DAT";
        String[] p={"ma phong","kieu phong","tien thue phong","tong so phong"};
        String[] k={"ma khach hang","ten khach hang","kieu phong","so phong can thue"};
        String[] b={"ma phong","ma khach hang","ten khach hang","kieu phong","so phong can thue","so ngay thue"};
        tPhong=new DefaultTableModel(p,0);
        tKH=new DefaultTableModel(k,0);
        tBang=new DefaultTableModel(b,0);
        jTable1.setModel(tPhong);
        jTable2.setModel(tKH);
        jTable3.setModel(tBang);
        loadPhong();
        loadKH();
        loadBang();
        load2box();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jmaphong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtienthue = new javax.swing.JTextField();
        tongphong = new javax.swing.JTextField();
        btthem = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btluu = new javax.swing.JButton();
        bthienthi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        maKH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        tenKH = new javax.swing.JTextField();
        sophongcanthue = new javax.swing.JTextField();
        btthem1 = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btluu1 = new javax.swing.JButton();
        bthienthi2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbmaKH = new javax.swing.JComboBox<>();
        songaythue = new javax.swing.JTextField();
        cbmaPhong = new javax.swing.JComboBox<>();
        btthem2 = new javax.swing.JButton();
        bthienthi3 = new javax.swing.JButton();
        btluu2 = new javax.swing.JButton();
        cbsapxep = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ma phong");

        jLabel2.setText("kieu phong");

        jLabel3.setText("tien thue");

        jLabel4.setText("tong so phong");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " phòng đơn", "phòng đôi", "phòng VIP" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmaphong, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tongphong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtienthue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jmaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtienthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tongphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        btthem.setText("them");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btxoa.setText("xoa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btluu.setText("luu");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });

        bthienthi.setText("Hien thi");
        bthienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btthem)
                        .addGap(113, 113, 113)
                        .addComponent(btxoa)
                        .addGap(108, 108, 108)
                        .addComponent(btluu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(bthienthi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthem)
                    .addComponent(btxoa)
                    .addComponent(btluu)
                    .addComponent(bthienthi))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Phong", jPanel1);

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("ma khach hang");

        jLabel6.setText("kieu phong thue");

        jLabel7.setText("ten khach hang");

        jLabel8.setText("so phong can thue");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " phòng đơn", "phòng đôi", "phòng VIP" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maKH, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(tenKH)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sophongcanthue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sophongcanthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        btthem1.setText("them");
        btthem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthem1ActionPerformed(evt);
            }
        });

        btsua.setText("sua");
        btsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsuaMouseClicked(evt);
            }
        });
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btluu1.setText("luu");
        btluu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluu1ActionPerformed(evt);
            }
        });

        bthienthi2.setText("Hien thi");
        bthienthi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthienthi2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btthem1)
                        .addGap(113, 113, 113)
                        .addComponent(btsua)
                        .addGap(108, 108, 108)
                        .addComponent(btluu1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(bthienthi2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthem1)
                    .addComponent(btsua)
                    .addComponent(btluu1)
                    .addComponent(bthienthi2))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khach Hang", jPanel3);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jLabel9.setText("ma phong");

        jLabel10.setText("ma khach hang");

        jLabel12.setText("so ngay thue");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbmaKH, 0, 106, Short.MAX_VALUE)
                    .addComponent(cbmaPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(songaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbmaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbmaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songaythue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btthem2.setText("them");
        btthem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthem2ActionPerformed(evt);
            }
        });

        bthienthi3.setText("hien thi");
        bthienthi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthienthi3ActionPerformed(evt);
            }
        });

        btluu2.setText("luu");
        btluu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluu2ActionPerformed(evt);
            }
        });

        cbsapxep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Sap xep--", "Theo Phong", "Theo so phong can thue" }));
        cbsapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsapxepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btthem2)
                        .addGap(113, 113, 113)
                        .addComponent(bthienthi3)
                        .addGap(108, 108, 108)
                        .addComponent(btluu2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(cbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthem2)
                    .addComponent(bthienthi3)
                    .addComponent(btluu2)
                    .addComponent(cbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bang sap xep", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthienthiActionPerformed
        tPhong.setRowCount(0);
        for(Phong i:listPhong){
            tPhong.addRow(i.toObject());
        }
    }//GEN-LAST:event_bthienthiActionPerformed

    private void bthienthi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthienthi2ActionPerformed
        tKH.setRowCount(0);
        for(KhachHang i:listKH){
            tKH.addRow(i.toObject());
        }
    }//GEN-LAST:event_bthienthi2ActionPerformed

    private void bthienthi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthienthi3ActionPerformed
        tBang.setRowCount(0);
        for(Bangsapxep i:listBang){
            tBang.addRow(i.toObject());
        }
    }//GEN-LAST:event_bthienthi3ActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        int n=listPhong.size();
        if(n>0)
            Phong.setSma(listPhong.get(n-1).getMa()+1);
        jmaphong.setText(Phong.getSma()+"");
        String kieuphong;
        try{
            kieuphong=jComboBox1.getSelectedItem().toString();
            double tienthue=Double.parseDouble(jtienthue.getText());
            int tongsophong=Integer.parseInt(tongphong.getText());
            Phong p=new Phong(tongsophong, kieuphong, tienthue);
            tPhong.addRow(p.toObject());
            listPhong.add(p);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Nhap vao so");
            return;
        }
    }//GEN-LAST:event_btthemActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        int r=jTable1.getSelectedRow();
        if(r>=0 && r<jTable1.getRowCount()){
            tPhong.removeRow(r);
            listPhong.remove(r);
        }else{
            JOptionPane.showMessageDialog(this, "chon o de xoa");
            return;
        }
    }//GEN-LAST:event_btxoaActionPerformed

    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
        IOFile.viet(fPhong, listPhong);
    }//GEN-LAST:event_btluuActionPerformed

    private void btthem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthem1ActionPerformed
        int n=listKH.size();
        if(n>0)
            KhachHang.setSma(listKH.get(n-1).getMa()+1);
        maKH.setText(KhachHang.getSma()+"");
        String ten,loaiphong;
        try{
            ten=tenKH.getText();
            loaiphong=jComboBox2.getSelectedItem().toString();
            int sophongcan=Integer.parseInt(sophongcanthue.getText());
            KhachHang kh=new KhachHang(sophongcan, ten, loaiphong);
            tKH.addRow(kh.toObject());
            listKH.add(kh);
        }catch(TrongException e){
            JOptionPane.showMessageDialog(this, "khong duoc de trong");
            return;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "nhap vao so");
            return;
        }
    }//GEN-LAST:event_btthem1ActionPerformed

    private void btsuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsuaMouseClicked

    }//GEN-LAST:event_btsuaMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r=jTable2.getSelectedRow();
        maKH.setText(tKH.getValueAt(r,0).toString());
        tenKH.setText(tKH.getValueAt(r,1).toString());
        sophongcanthue.setText(tKH.getValueAt(r,3).toString());
        String cbox=tKH.getValueAt(r, 2).toString();
        for(int i=0;i<jComboBox2.getItemCount();i++){
            if(jComboBox2.getItemAt(i).toString().equals(cbox)){
                jComboBox2.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        int r=jTable2.getSelectedRow();
        if(r>=0 && r<jTable2.getRowCount()){
            String ten=tenKH.getText();
            String cbox=jComboBox2.getSelectedItem().toString();
            int sophongcan=Integer.parseInt(sophongcanthue.getText());
            tKH.setValueAt(ten, r, 1);
            tKH.setValueAt(sophongcan, r, 3);
            tKH.setValueAt(cbox, r, 2);
            int ma=Integer.parseInt(tenKH.getText());
            KhachHang kh=new KhachHang(ma,sophongcan, ten, cbox);
            listKH.set(r, kh);
        }else{
            JOptionPane.showMessageDialog(this, "chon o de sua");
            return;
        }
    }//GEN-LAST:event_btsuaActionPerformed

    private void btluu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluu1ActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fKH, listKH);
    }//GEN-LAST:event_btluu1ActionPerformed

    private void btluu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluu2ActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fBang, listBang);
    }//GEN-LAST:event_btluu2ActionPerformed

    private void btthem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthem2ActionPerformed
        // TODO add your handling code here:
        int maphong=Integer.parseInt(cbmaPhong.getSelectedItem().toString());
        int makh=Integer.parseInt(cbmaKH.getSelectedItem().toString());
        if(trungnhau(maphong, makh)){
            JOptionPane.showMessageDialog(this, "trung nhau");
            cbmaPhong.requestFocus();
            return;
        }
        try{
            int songay=Integer.parseInt(songaythue.getText());
            Bangsapxep b=new Bangsapxep(getmaPhong(maphong), getmaKH(makh), songay);
            tBang.addRow(b.toObject());
            listBang.add(b);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "nhap so");
            return;
        }
    }//GEN-LAST:event_btthem2ActionPerformed

    private void cbsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsapxepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsapxepActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthienthi;
    private javax.swing.JButton bthienthi2;
    private javax.swing.JButton bthienthi3;
    private javax.swing.JButton btluu;
    private javax.swing.JButton btluu1;
    private javax.swing.JButton btluu2;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btthem1;
    private javax.swing.JButton btthem2;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbmaKH;
    private javax.swing.JComboBox<String> cbmaPhong;
    private javax.swing.JComboBox<String> cbsapxep;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jmaphong;
    private javax.swing.JTextField jtienthue;
    private javax.swing.JTextField maKH;
    private javax.swing.JTextField songaythue;
    private javax.swing.JTextField sophongcanthue;
    private javax.swing.JTextField tenKH;
    private javax.swing.JTextField tongphong;
    // End of variables declaration//GEN-END:variables

    private void loadPhong() {
        File f=new File(fPhong);
        if(f.exists()){
            listPhong=IOFile.doc(fPhong);
        }else{
            listPhong=new ArrayList<>();
        }
    }
    private void loadKH() {
        File f=new File(fKH);
        if(f.exists()){
            listKH=IOFile.doc(fKH);
        }else{
            listKH=new ArrayList<>();
        }
    }
    private void loadBang() {
        File f=new File(fBang);
        if(f.exists()){
            listBang=IOFile.doc(fBang);
        }else{
            listBang=new ArrayList<>();
        }
    }

    private void load2box() {
        cbmaPhong.removeAllItems();
        cbmaKH.removeAllItems();
        for(Phong i:listPhong){
            cbmaPhong.addItem(i.getMa()+"");
        }
        for(KhachHang i:listKH){
            cbmaKH.addItem(i.getMa()+"");
        }
    }
    public boolean trungnhau(int maphong,int makh){
        for(Bangsapxep i:listBang){
            if(i.getPhong().getMa()==maphong && i.getKh().getMa()==makh) 
                return true;
        }
        return false;
    }
    private Phong getmaPhong(int ma){
        List<Phong> p=IOFile.doc(fPhong);
        if(p!=null){
            for(Phong i:p){
                if(i.getMa()==ma)
                    return i;
            }
        }
        return null;
    }
    private KhachHang getmaKH(int ma){
        List<KhachHang> p=IOFile.doc(fKH);
        if(p!=null){
            for(KhachHang i:p){
                if(i.getMa()==ma)
                    return i;
            }
        }
        return null;
    }
}
