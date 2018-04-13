package projekt_inzynierski;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {

        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        jFrame1.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        jList3.setModel(model3);
        jList2.setModel(model2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        jFrame1.setTitle("Projekt inżynierski");
        jFrame1.setMinimumSize(new java.awt.Dimension(407, 719));
        jFrame1.setResizable(false);
        jFrame1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jFrame1ComponentHidden(evt);
            }
        });
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame1WindowClosed(evt);
            }
        });

        jLayeredPane2.setMaximumSize(new java.awt.Dimension(401, 620));
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(401, 620));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Właściwości obiektowe:");

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox4.setMaximumSize(new java.awt.Dimension(43, 237));
        jComboBox4.setMinimumSize(new java.awt.Dimension(43, 237));
        jComboBox4.setPreferredSize(new java.awt.Dimension(43, 237));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Podsumowanie:");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Dodaj");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList3.setMaximumSize(null);
        jList3.setMinimumSize(null);
        jList3.setPreferredSize(null);
        jScrollPane1.setViewportView(jList3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Typ:");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox5.setMaximumSize(new java.awt.Dimension(43, 237));
        jComboBox5.setMinimumSize(new java.awt.Dimension(43, 237));
        jComboBox5.setPreferredSize(new java.awt.Dimension(43, 237));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox6.setMaximumSize(new java.awt.Dimension(43, 237));
        jComboBox6.setMinimumSize(new java.awt.Dimension(43, 237));
        jComboBox6.setPreferredSize(new java.awt.Dimension(43, 237));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Dodaj");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Usuń");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Dodaj");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Właściwości danych:");

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox7.setMaximumSize(new java.awt.Dimension(43, 237));
        jComboBox7.setMinimumSize(new java.awt.Dimension(43, 237));
        jComboBox7.setPreferredSize(new java.awt.Dimension(43, 237));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nazwa indywiduum:");

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("Zatwierdź");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Dodaj");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jComboBox4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jComboBox5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jComboBox6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jComboBox7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Wybierz opcję zapisu");
        jDialog1.setLocationByPlatform(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(283, 111));
        jDialog1.setResizable(false);
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog1WindowClosing(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("Nadpisz");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("Zapisz jako...");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projekt inżynierski");
        setMinimumSize(new java.awt.Dimension(537, 598));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(534, 598));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(534, 598));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Usuń");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("Dodaj");
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jList2.setBackground(new java.awt.Color(248, 248, 248));
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setAutoscrolls(false);
        jScrollPane4.setViewportView(jList2);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Wczytaj ontologię");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(248, 248, 248));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setAutoscrolls(false);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox2.setEnabled(false);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Zapisz ontologię");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Edytuj");
        jButton4.setToolTipText("");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Importuj indywidua");
        jButton2.setActionCommand("Wczytaj ontologię");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("Podgląd ontologii");
        jButton13.setActionCommand("Wczytaj ontologię");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    final private String path = System.getProperty("user.dir");
    int tryb = 0;
    String zmieniany = "";

    DefaultListModel<String> model1 = new DefaultListModel<>();
    DefaultListModel<String> model2 = new DefaultListModel<>();
    DefaultListModel<String> model3 = new DefaultListModel<>();

    String sciezka_wczytana = "";
    String nazwa_onto = "";

    List<String> objects_individuals = new ArrayList();
    List<String> subklasy_klasy2 = new ArrayList();
    List<String> individuals = new ArrayList();
    List<String> object_properties = new ArrayList();
    List<String> dataproperty_individuals = new ArrayList();
    List<String> objectpropertydomain_lista = new ArrayList();
    List<String> objectpropertyrange_lista = new ArrayList();
    List<String> datapropertydomain_lista = new ArrayList();
    List<String> datapropertyrange_lista = new ArrayList();
    List<String> indywidua_klasy_lista = new ArrayList();
    List<String> typy = new ArrayList();
    List<String> classes = new ArrayList();
    List<String> data_properties = new ArrayList();
    List<String> subclasses = new ArrayList();
    List<String> disjoint = new ArrayList();

    int act = 0;
    int check_01 = 0;
    int check_02 = 0;
    int licznik_nazw = 0;
    int licznik_klas = 0;
    String nl = "\n";

    public void blad(String message, String szczegolowy) {

        final JFrame frame1 = new JFrame();
        Object[] options = {"Szczegóły błędu",
            "OK"};

        int odp = JOptionPane.showOptionDialog(frame1,
                message,
                "Wystąpił błąd!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                options,
                options[0]);

        if (odp == JOptionPane.YES_OPTION) {

            blad(szczegolowy);

        }

    }

    public void import_individuals(String sciezka) {

        String line = null;
        String asert_klasa = "";
        String errorlist = "";
        String subp = "";
        int nad = 1;
        String cala_klasa = "";
        String nadp = "";
        List<String> mozliwe_op = new ArrayList();
        List<String> mozliwe_dp = new ArrayList();
        List<String> mozliwe_opind = new ArrayList();
        int declaration = 0;
        String nazwa_indywiduum = "";

        try {

            String dane = new String(Files.readAllBytes(Paths.get(sciezka)));

            BufferedReader bufReader = new BufferedReader(new StringReader(dane));

            while ((line = bufReader.readLine()) != null) {

                if (line.isEmpty()) {
                    continue;
                }

                if (declaration == 1 && !line.contains("</Indywiduum>")) {

                    line = line.trim();
                    int a = line.indexOf('>') + 1;
                    int b = line.lastIndexOf('<');
                    String test = line.substring(a, b);

                    if (line.contains("<Nazwa>")) {

                        licznik_nazw++;
                        if (licznik_nazw == 1) {

                            nazwa_indywiduum = test;
                            if (individuals.contains(nazwa_indywiduum)) {
                                //  errorlist += "Indywiduum o nazwie " + nazwa_indywiduum + " już istnieje" + nl;

                            } else {

                                individuals.add(nazwa_indywiduum);
                            }

                        }

                    }

                    if (line.contains("<Klasa>")) {

                        licznik_klas++;
                        if (licznik_klas == 1) {
                            asert_klasa = test;
                            cala_klasa = test;
                            if (test.contains(" -> ")) {

                                String[] parts = test.split(" -> ");
                                subp = parts[1];
                                nadp = parts[0];
                                asert_klasa = subp;
                                nad = 0;
                            }

                            String oi7 = nazwa_indywiduum + "||" + asert_klasa;

                            if (individuals.contains(nazwa_indywiduum)) {

                                if (classes.contains(asert_klasa)) {

                                    //well
                                    mozliwe_dp.clear();
                                    if (nad == 1) {

                                        for (String element : datapropertydomain_lista) {

                                            String[] parts = element.split("\\|\\|");
                                            String datapv = parts[1];
                                            String klasav = parts[0];

                                            if (klasav.equals(asert_klasa)) {
                                                mozliwe_dp.add(datapv);

                                            }

                                        }

                                    } else {

                                        for (String element : datapropertydomain_lista) {

                                            String[] parts = element.split("\\|\\|");
                                            String datapv = parts[1];
                                            String klasav = parts[0];

                                            if (klasav.equals(subp)) {
                                                mozliwe_dp.add(datapv);

                                            } else {

                                                for (String element3 : subklasy_klasy2) {

                                                    String[] parts3 = element3.split("\\|\\|");
                                                    String subk = parts3[0];
                                                    String nadk = parts3[1];

                                                    if (subk.equals(subp) && nadk.equals(klasav)) {

                                                        mozliwe_dp.add(datapv);

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    mozliwe_op.clear();

                                    for (String element : objectpropertydomain_lista) {

                                        String[] parts = element.split("\\|\\|");
                                        String objpro = parts[1];
                                        String klasa2 = parts[0];
                                        if (klasa2.equals(subp) || klasa2.equals(nadp) || klasa2.equals(asert_klasa)) {
                                            mozliwe_op.add(objpro);
                                        }
                                    }

                                    //well
                                    if (!indywidua_klasy_lista.contains(oi7)) {

                                        indywidua_klasy_lista.add(oi7);

                                    } else {
                                        //  errorlist += "Istnieje już ClassAssertion: " + nazwa_indywiduum + " typu " + asert_klasa + nl;
                                    }

                                } else {
                                    errorlist += "Klasa o nazwie " + asert_klasa + " nie istnieje" + nl;
                                }

                            } else {
                                errorlist += "Indywiduum o nazwie " + nazwa_indywiduum + " nie istnieje" + nl;
                            }

                        }

                    }

                    if (line.contains("<ObjectProperty>")) {

                        String[] parts = test.split(" -> ");
                        String op = parts[0];
                        String ind2 = parts[1];

                        String oi = nazwa_indywiduum + "||" + op + "||" + ind2;

                        if (mozliwe_op.contains(op)) {

                            String typ2 = op;

                            mozliwe_opind.clear();
                            for (String element : objectpropertyrange_lista) {

                                String[] partsh = element.split("\\|\\|");
                                String objproperty = partsh[0];
                                String range = partsh[1];

                                if (objproperty.equals(typ2)) {

                                    for (String element2 : indywidua_klasy_lista) {

                                        String[] parts2 = element2.split("\\|\\|");
                                        String indywiduo = parts2[0];
                                        String klasa = parts2[1];

                                        if (klasa.equals(range) && !klasa.equals(cala_klasa)) {

                                            if (!(cala_klasa.contains("Produkt ->") && klasa.equals("Zamowienie"))) {

                                                mozliwe_opind.add(indywiduo);
                                            }

                                        } else {

                                            for (String element3 : subklasy_klasy2) {

                                                String[] parts3 = element3.split("\\|\\|");
                                                String subk = parts3[0];
                                                String nadk = parts3[1];

                                                if (subk.equals(klasa) && nadk.equals(range)) {
                                                    if (!(cala_klasa.equals("Zamowienie") && nadk.equals("Produkt"))) {

                                                        mozliwe_opind.add(indywiduo);
                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                            if (mozliwe_opind.contains(ind2)) {

                                if (individuals.contains(nazwa_indywiduum)) {

                                    if (individuals.contains(ind2)) {

                                        if (!objects_individuals.contains(oi)) {

                                            objects_individuals.add(oi);

                                        } else {
                                            errorlist += "Istnieje już ObjectPropertyAssertion: " + nazwa_indywiduum + " " + op + " " + ind2 + nl;
                                        }

                                    } else {
                                        errorlist += "Indywiduuom o nazwie: " + ind2 + " nie istnieje" + nl;
                                    }

                                } else {
                                    errorlist += "Indywiduuom o nazwie: " + nazwa_indywiduum + " nie istnieje" + nl;
                                }

                            } else {
                                errorlist += "Indywiduum: " + ind2 + " nie może być przypisane do ObjectProperty " + op + nl;
                            }

                        } else {
                            System.out.println(mozliwe_dp);
                            errorlist += "ObjectProperty: " + op + " nie może być przypisane do indywiduum " + nazwa_indywiduum + nl;
                        }

                    }

                    if (line.contains("<DataProperty>")) {

                        String typ = "";
                        String[] parts2 = test.split(" -> ");
                        String datapr = parts2[0];
                        String wartosc = parts2[1];

                        for (String elementv : datapropertyrange_lista) {

                            String[] parts5 = elementv.split("\\|\\|");
                            String datapr2 = parts5[0];
                            String typx = parts5[1];
                            if (datapr2.toLowerCase().equals(datapr.toLowerCase())) {

                                String[] parts6 = typx.split(":");
                                typ = parts6[1];

                            }

                        }

                        String oi2 = nazwa_indywiduum + "||" + datapr + "||" + typ + "||" + wartosc;

                        if (individuals.contains(nazwa_indywiduum)) {

                            if (data_properties.contains(datapr)) {

                                if (mozliwe_dp.contains(datapr)) {

                                    if (typy.contains(typ)) {

                                        int cc = 0;

                                        // if (dp_3.equals("string")) {
                                        // }
                                        if (typ.equals("integer")) {

                                            try {
                                                Integer.parseInt(wartosc);
                                            } catch (NumberFormatException e) {
                                                cc = 1;
                                                errorlist += "Wartość " + wartosc + " nie odpowiada typowi " + typ + nl;
                                            }

                                        }

                                        if (typ.equals("long")) {

                                            try {
                                                Long.parseLong(wartosc);
                                            } catch (NumberFormatException e) {
                                                cc = 1;
                                                errorlist += "Wartość " + wartosc + " nie odpowiada typowi " + typ + nl;
                                            }

                                        }

                                        if (typ.equals("double")) {
                                            try {
                                                Double.parseDouble(wartosc);
                                            } catch (NumberFormatException e) {
                                                cc = 1;
                                                errorlist += "Wartość " + wartosc + " nie odpowiada typowi " + typ + nl;
                                            }
                                        }
                                        if (typ.equals("dateTime")) {

                                            if (wartosc.contains("T")) {

                                                String[] parts3 = wartosc.split("T");
                                                String l = parts3[0];
                                                String p = parts3[1];

                                                if (l.matches("\\d{4}-\\d{2}-\\d{2}")) {

                                                    if (p.matches("\\d\\d:\\d\\d:\\d\\d")) {

                                                    } else {
                                                        cc = 1;
                                                        errorlist += "Wartość " + wartosc + " nie odpowiada typowi " + typ + nl;

                                                    }

                                                } else {
                                                    cc = 1;
                                                    errorlist += "Wartość " + wartosc + " nie odpowiada typowi " + typ + nl;

                                                }

                                            } else {
                                                cc = 1;
                                                errorlist += "Wartość " + wartosc + " nie odpowiada typowi " + typ + nl;

                                            }

                                        }

                                        if (cc == 0) {

                                            if (!dataproperty_individuals.contains(oi2)) {

                                                dataproperty_individuals.add(oi2);

                                            } else {
                                                errorlist += "Istnieje już DataPropertyAssertion: " + nazwa_indywiduum + " -> " + datapr + " = " + wartosc + nl;
                                            }

                                        }

                                    } else {
                                        errorlist += "DataProperty o nazwie " + datapr + " nie jest prawidłowym typem danych" + nl;
                                    }

                                } else {
                                    errorlist += "DataProperty " + datapr + " nie może być przypisane do indywiduum " + nazwa_indywiduum + nl;
                                }

                            } else {
                                errorlist += "DataProperty o nazwie " + datapr + " nie istnieje" + nl;
                            }

                        } else {
                            errorlist += "Indywiduum o nazwie " + nazwa_indywiduum + " nie istnieje" + nl;
                        }

                    }

                }

                if (line.contains("<Indywiduum>")) {

                    declaration = 1;
                    licznik_nazw = 0;
                    licznik_klas = 0;
                    nad = 1;
                }

                if (line.contains("</Indywiduum>")) {

                    declaration = 0;
                }

            }

            if (errorlist.isEmpty()) {

                jComboBox1.setSelectedItem("Indywidua");
                String wynik = "Import danych przebiegł pomyślnie";

                final JFrame frame1 = new JFrame();
                JOptionPane.showMessageDialog(frame1,
                        wynik, "Importowanie danych", JOptionPane.INFORMATION_MESSAGE);

            } else {
                jComboBox1.setSelectedItem("Indywidua");
                String wynik = "Import danych został zakończony z błędami";

                String szczegolowy = errorlist;
                blad(wynik, szczegolowy);

            }

        } catch (Exception e) {
            jComboBox1.setSelectedItem("Indywidua");
            String wynik = "Wystąpił błąd podczas importu danych z pliku OWL";

            String szczegolowy = e.getMessage();
            blad(wynik, szczegolowy);
        }

    }

    public void load_ontology(String sciezka) {
        String line = null;
        String o_1 = "";
        String o_2 = "";
        String o_3 = "";

        String dp_1 = "";
        String dp_2 = "";
        String dp_3 = "";
        String dp_4 = "";

        String opd_1 = "";
        String opd_2 = "";

        String dpd_1 = "";
        String dpd_2 = "";

        String dpr_1 = "";
        String dpr_2 = "";

        String opr_1 = "";
        String opr_2 = "";
        String sub_sub = "";

        String sub_main = "";
        String asert_klasa = "";
        String asert_indywidua = "";
        int declaration = 0;
        int subclass = 0;
        int objectsindividuals = 0;
        int disjointy = 0;
        int aserty = 0;
        int dataproperty = 0;
        int objproperty = 0;
        int objrange = 0;
        int dataprop = 0;
        int datapropr = 0;
        int licznik_1 = 0;
        int licznik_2 = 0;

        try {
            String ontologia = new String(Files.readAllBytes(Paths.get(sciezka)));

            BufferedReader bufReader = new BufferedReader(new StringReader(ontologia));

            while ((line = bufReader.readLine()) != null) {

                //data_property_domain START
                if (datapropr == 1 && !line.contains("</DataPropertyRange")) {

                    line = line.trim();

                    if (line.contains("DataProperty IRI")) {

                        int a = line.indexOf('#') + 1;
                        int b = line.lastIndexOf('"');
                        String test = line.substring(a, b);

                        dpr_1 = test;

                    }

                    if (line.contains("Datatype abbreviatedIRI")) {

                        int a = line.indexOf('"') + 1;
                        int b = line.lastIndexOf('"');
                        String test = line.substring(a, b);

                        dpr_2 = test;

                        String oi6 = dpr_1 + "||" + dpr_2;
                        datapropertyrange_lista.add(oi6);

                        String[] parts = dpr_2.split(":");
                        String typ0 = parts[1];
                        typy.add(typ0);
                    }

                }

                if (line.contains("<DataPropertyRange")) {

                    datapropr = 1;
                }

                if (line.contains("</DataPropertyRange")) {

                    datapropr = 0;
                }

                //data_property_domain END
                //data_property_domain START
                if (dataprop == 1 && !line.contains("</DataPropertyDomain")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("DataProperty IRI")) {

                        dpd_1 = test;

                    }

                    if (line.contains("Class IRI")) {

                        dpd_2 = test;

                        String oi5 = dpd_2 + "||" + dpd_1;
                        datapropertydomain_lista.add(oi5);

                    }

                }

                if (line.contains("<DataPropertyDomain")) {

                    dataprop = 1;
                }

                if (line.contains("</DataPropertyDomain")) {

                    dataprop = 0;
                }

                //data_property_domain END
                //object_property_range START
                if (objrange == 1 && !line.contains("</ObjectPropertyRange")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("ObjectProperty IRI")) {

                        opr_1 = test;

                    }

                    if (line.contains("Class IRI")) {

                        opr_2 = test;

                        String oi4 = opr_1 + "||" + opr_2;
                        objectpropertyrange_lista.add(oi4);

                    }

                }

                if (line.contains("<ObjectPropertyRange")) {

                    objrange = 1;
                }

                if (line.contains("</ObjectPropertyRange")) {

                    objrange = 0;
                }

                //object_property_range START
                //object_property_domain START
                if (objproperty == 1 && !line.contains("</ObjectPropertyDomain")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("ObjectProperty IRI")) {

                        opd_1 = test;

                    }

                    if (line.contains("Class IRI")) {

                        opd_2 = test;

                        String oi3 = opd_2 + "||" + opd_1;
                        objectpropertydomain_lista.add(oi3);

                    }

                }

                if (line.contains("<ObjectPropertyDomain")) {

                    objproperty = 1;
                }

                if (line.contains("</ObjectPropertyDomain")) {

                    objproperty = 0;
                }

                //object_property_domain START
                //data_property start
                if (dataproperty == 1 && !line.contains("</DataPropertyAssertion")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("DataProperty IRI")) {

                        dp_2 = test;

                    }

                    if (line.contains("NamedIndividual IRI")) {

                        dp_1 = test;

                    }

                    if (line.contains("Literal datatypeIRI")) {

                        dp_3 = test;

                        int c = line.indexOf('>') + 1;
                        int d = line.lastIndexOf('<');
                        dp_4 = line.substring(c, d);
                        String oi2 = dp_1 + "||" + dp_2 + "||" + dp_3 + "||" + dp_4;
                        dataproperty_individuals.add(oi2);
                    }

                    // classes.add(test); 
                }

                if (line.contains("<DataPropertyAssertion")) {

                    dataproperty = 1;
                }

                if (line.contains("</DataPropertyAssertion")) {

                    dataproperty = 0;
                }

                //data_property KONIEC
                //object_start KONIEC
                if (objectsindividuals == 1 && !line.contains("</ObjectPropertyAssertion")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("ObjectProperty IRI")) {

                        o_1 = test;

                    }

                    if (line.contains("NamedIndividual IRI") && licznik_2 == 1) {

                        o_3 = test;
                        licznik_2 = 2;
                        String oi = o_2 + "||" + o_1 + "||" + o_3;
                        objects_individuals.add(oi);
                    }

                    if (line.contains("NamedIndividual IRI") && licznik_2 == 0) {
                        licznik_2 = 1;
                        o_2 = test;

                    }

                    if (licznik_2 == 2) {
                        licznik_2 = 0;

                    }

                    // classes.add(test); 
                }

                if (line.contains("<ObjectPropertyAssertion")) {

                    objectsindividuals = 1;
                }

                if (line.contains("</ObjectPropertyAssertion")) {
                    licznik_2 = 0;

                    objectsindividuals = 0;
                }

                //object_individuals KONIEC
                //INDYWIDUA_KLASY
                if (aserty == 1 && !line.contains("</ClassAssertion")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("Class IRI")) {

                        asert_klasa = test;
                        // classes.add(test); 
                    }

                    if (line.contains("NamedIndividual IRI")) {
                        asert_indywidua = test;

                        String oi7 = asert_indywidua + "||" + asert_klasa;
                        indywidua_klasy_lista.add(oi7);

                    }

                }

                if (line.contains("<ClassAssertion")) {

                    aserty = 1;
                }

                if (line.contains("</ClassAssertion")) {

                    aserty = 0;
                }

                //INDYWIDUA_KLASY KONIEC
//SUB
                if (subclass == 1 && !line.contains("</SubClassOf")) {
                    licznik_1++;

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("Class IRI")) {

                        if (licznik_1 == 1) {
                            sub_sub = test;

                        }

                        if (licznik_1 == 2) {
                            subclasses.add(sub_sub);
                            sub_main = test;

                            String oi8 = sub_sub + "||" + sub_main;
                            subklasy_klasy2.add(oi8);

                        }

                        // classes.add(test); 
                    }

                }

                if (line.contains("<SubClassOf")) {

                    subclass = 1;
                }

                if (line.contains("</SubClassOf")) {
                    licznik_1 = 0;
                    subclass = 0;
                }

                //SUB KONIEC
                // PARSOWANIE DISJOINT start
                if (disjointy == 1 && !line.contains("</DisjointClasses")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("Class IRI")) {
                        disjoint.add(test);
                    }

                }

                if (line.contains("<DisjointClasses")) {

                    disjointy = 1;
                }

                if (line.contains("</DisjointClasses")) {

                    disjointy = 0;
                }

                // PARSOWANIE DISJOINT koniec   
                // PARSOWANIE DEKLARACJI start
                if (declaration == 1 && !line.contains("</Declaration")) {

                    line = line.trim();
                    int a = line.indexOf('#') + 1;
                    int b = line.lastIndexOf('"');
                    String test = line.substring(a, b);

                    if (line.contains("Class IRI")) {
                        classes.add(test);
                    }
                    if (line.contains("NamedIndividual IRI")) {
                        individuals.add(test);
                    }
                    if (line.contains("ObjectProperty IRI")) {
                        object_properties.add(test);
                    }
                    if (line.contains("DataProperty IRI")) {
                        data_properties.add(test);
                    }

                }

                if (line.contains("<Declaration")) {

                    declaration = 1;
                }

                if (line.contains("</Declaration")) {

                    declaration = 0;
                }

                // PARSOWANIE DEKLARACJI koniec         
            }
// jTextArea1.append(Arrays.toString(disjoint.toArray()));
//jTextArea1.append(map.get("Pracownik"));

            // for(String modele : indywidua_klasy_lista) {
            //    jTextArea1.append(modele + "\n");
            //  }
            // PARSOWANIE SUBKLAS start  
            for (String element : classes) {

                int spr = 0;
                for (String str : subclasses) {
                    if (str.trim().contains(element)) {
                        spr = 1;
                    }
                }

                if (spr == 0) {
                    model1.addElement(element);

                }

            }

            for (String element2 : subklasy_klasy2) {

                String[] parts = element2.split("\\|\\|");
                String subklasa = parts[0];
                String nadklasa = parts[1];
                model1.addElement(nadklasa + " -> " + subklasa);
                model1.removeElement(nadklasa);
            }

            Collection list = Collections.list(model1.elements());

            int n = model1.getSize();
            String[] data = new String[n];

            for (int i = 0; i < n; i++) {
                data[i] = (String) model1.getElementAt(i);
            }

            Arrays.sort(data);

            jList1.setListData(data);

            jComboBox1.addItem("Klasy");
            jComboBox1.addItem("Indywidua");
            jComboBox1.addItem("Właściwości obiektowe");
            jComboBox1.addItem("Właściwości danych");

            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);

            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
            jButton13.setEnabled(true);
            jButton2.setEnabled(true);
        } catch (Exception e) {

            String wynik = "Wystąpił błąd podczas importu danych z pliku OWL";

            String szczegolowy = e.getMessage();
            blad(wynik, szczegolowy);
        }

    }

    public void blad(String message) {

        final JFrame frame1 = new JFrame();
        JOptionPane.showMessageDialog(frame1,
                message, "Wystąpił błąd!", JOptionPane.ERROR_MESSAGE);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Plik OWL", "owl");
        final JFileChooser fc = new JFileChooser();

        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Wczytanie ontologii");
        fc.setCurrentDirectory(new File(path));

//In response to a button click:
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            sciezka_wczytana = fc.getSelectedFile().getAbsolutePath();
            nazwa_onto = fc.getSelectedFile().getName();

            File xml = new File(sciezka_wczytana);
            if (!xml.exists()) {
                String tresc = "Nie odnaleziono pliku OWL";
                blad(tresc);

            } else {
                try {
                    load_ontology(sciezka_wczytana);
                } catch (Exception e) {

                    String wynik = "Wystąpił błąd podczas importu danych z pliku OWL";

                    String szczegolowy = e.getMessage();
                    blad(wynik, szczegolowy);

                }

            }

        } else {

        }

        // PARSOWANIE SUBKLAS koniec   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        if (!evt.getValueIsAdjusting()) {

            update_tabelek();

            if (jList1.isSelectionEmpty()) {
                jButton10.setEnabled(false);
                jButton4.setEnabled(false);
                model2.clear();
            } else {

                if (jComboBox1.getSelectedItem().toString().equals("Indywidua")) {
                    jButton10.setEnabled(true);
                    jButton4.setEnabled(true);
                }

            }
    }//GEN-LAST:event_jList1ValueChanged

    }
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jList1.clearSelection();


    }//GEN-LAST:event_formMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        act = 1;
        String wybor = jComboBox1.getSelectedItem().toString();

        model1.clear();
        model2.clear();

        if (wybor.equals("Klasy")) {

            jComboBox2.removeAllItems();
            jComboBox2.addItem("Instancje");

            for (String element : classes) {

                int spr = 0;
                for (String str : subclasses) {
                    if (str.trim().contains(element)) {
                        spr = 1;
                    }
                }

                if (spr == 0) {
                    model1.addElement(element);

                }

            }

            for (String element2 : subklasy_klasy2) {

                String[] parts = element2.split("\\|\\|");
                String subklasa = parts[0];
                String nadklasa = parts[1];
                model1.addElement(nadklasa + " -> " + subklasa);
                model1.removeElement(nadklasa);
            }

        }

        if (wybor.equals("Indywidua")) {

            jComboBox2.removeAllItems();
            jComboBox2.addItem("Typy");
            jComboBox2.addItem("Właściwości obiektowe");
            jComboBox2.addItem("Właściwości danych");
            for (String element : individuals) {
                model1.addElement(element);
            }
            jButton11.setEnabled(true);
        } else {

            jButton11.setEnabled(false);
        }

        if (wybor.equals("Właściwości obiektowe")) {

            jComboBox2.removeAllItems();
            jComboBox2.addItem("Domeny");
            jComboBox2.addItem("Zakresy");

            for (String element : object_properties) {
                model1.addElement(element);
            }

        }

        if (wybor.equals("Właściwości danych")) {

            jComboBox2.removeAllItems();
            jComboBox2.addItem("Domeny");
            jComboBox2.addItem("Zakresy");
            for (String element : data_properties) {
                model1.addElement(element);
            }

        }

        Collection list = Collections.list(model1.elements());

        int n = model1.getSize();
        String[] data = new String[n];

        for (int i = 0; i < n; i++) {
            data[i] = (String) model1.getElementAt(i);
        }

        Arrays.sort(data);

        jList1.setListData(data);

        act = 0;

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    public void update_tabelek() {

        if (jComboBox2.getSelectedItem().toString().equals("Instancje") && !jList1.isSelectionEmpty()) {
            String wybrana_klasa = jList1.getSelectedValue();

            if (wybrana_klasa.contains("->")) {
                String[] parts2 = wybrana_klasa.split("-> ");
                wybrana_klasa = parts2[1];
            }
            model2.clear();

            for (String element3 : indywidua_klasy_lista) {

                String[] parts = element3.split("\\|\\|");
                String ca_individual = parts[0];
                String ca_class = parts[1];

                if (ca_class.equals(wybrana_klasa)) {
                    model2.addElement(ca_individual);

                }
            }
        }

        if (jComboBox2.getSelectedItem().toString().equals("Typy") && !jList1.isSelectionEmpty()) {

            String wybrany_indivdual = jList1.getSelectedValue();
            model2.clear();
            for (String element3 : indywidua_klasy_lista) {

                String[] parts = element3.split("\\|\\|");
                String as_individual = parts[0];
                String as_class = parts[1];
                if (as_individual.equals(wybrany_indivdual)) {

                    model2.addElement(as_class);

                }
            }
        }

        if (jComboBox2.getSelectedItem().toString().equals("Właściwości obiektowe") && !jList1.isSelectionEmpty()) {

            String wybrany_indivdual = jList1.getSelectedValue();
            model2.clear();
            for (String element : objects_individuals) {

                String[] parts = element.split("\\|\\|");
                String op_individual = parts[0];
                String op_property = parts[1];
                String op_individual2 = parts[2];
                if (op_individual.equals(wybrany_indivdual)) {
                    model2.addElement(op_property + " -> " + op_individual2);

                }
            }

        }

        if (jComboBox2.getSelectedItem().toString().equals("Właściwości danych") && !jList1.isSelectionEmpty()) {

            String wybrany_indivdual = jList1.getSelectedValue();
            model2.clear();
            for (String element : dataproperty_individuals) {

                String[] parts = element.split("\\|\\|");
                String dp_individual = parts[0];
                String dp_property = parts[1];
                String dp_typ = parts[2];
                String dp_wartosc = parts[3];
                if (dp_individual.equals(wybrany_indivdual)) {
                    model2.addElement(dp_property + " = " + dp_wartosc + "\n");

                }
            }

        }

        if (jComboBox2.getSelectedItem().toString().equals("Domeny") && !jList1.isSelectionEmpty()) {

            if (jComboBox2.getSelectedItem().toString().equals("Domeny") && !jList1.isSelectionEmpty()) {
                String wybrany_dzial = jComboBox1.getSelectedItem().toString();
                if (wybrany_dzial.equals("Właściwości obiektowe")) {

                    String wybrany_op = jList1.getSelectedValue();

                    model2.clear();
                    for (String element : objectpropertydomain_lista) {

                        String[] parts = element.split("\\|\\|");
                        String opd_domain = parts[0];
                        String opd_object = parts[1];
                        if (opd_object.equals(wybrany_op)) {
                            model2.addElement(opd_domain);

                        }
                    }

                }

                if (wybrany_dzial.equals("Właściwości danych")) {

                    String wybrany_op = jList1.getSelectedValue();

                    model2.clear();
                    for (String element : datapropertydomain_lista) {

                        String[] parts = element.split("\\|\\|");
                        String dpd_domain = parts[0];
                        String dpd_object = parts[1];
                        if (dpd_object.equals(wybrany_op)) {
                            model2.addElement(dpd_domain);

                        }
                    }

                }
            }

        }

        if (jComboBox2.getSelectedItem().toString().equals("Zakresy") && !jList1.isSelectionEmpty()) {

            String wybrany_dzial = jComboBox1.getSelectedItem().toString();
            if (wybrany_dzial.equals("Właściwości obiektowe")) {

                String wybrany_op = jList1.getSelectedValue();

                model2.clear();
                for (String element : objectpropertyrange_lista) {

                    String[] parts = element.split("\\|\\|");
                    String opr_object = parts[0];
                    String opr_range = parts[1];
                    if (opr_object.equals(wybrany_op)) {
                        model2.addElement(opr_range);

                    }
                }

            }

            if (wybrany_dzial.equals("Właściwości danych")) {

                String wybrany_op = jList1.getSelectedValue();

                model2.clear();
                for (String element : datapropertyrange_lista) {

                    String[] parts = element.split("\\|\\|");
                    String dpr_object = parts[0];
                    String dpr_range = parts[1];
                    if (dpr_object.equals(wybrany_op)) {

                        model2.addElement(dpr_range);

                    }
                }

            }

        }

    }

    public String generowanie() {

        String g_poczatek = "<?xml version=\"1.0\"?>\n"
                + "<Ontology xmlns=\"http://www.w3.org/2002/07/owl#\"\n"
                + "     xml:base=\"http://www.digitalgamer.pl/ontologia/" + nazwa_onto + "\"\n"
                + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n"
                + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "     ontologyIRI=\"http://www.digitalgamer.pl/ontologia/" + nazwa_onto + "\">\n"
                + "    <Prefix name=\"\" IRI=\"http://www.digitalgamer.pl/ontologia/" + nazwa_onto + "#\"/>\n"
                + "    <Prefix name=\"owl\" IRI=\"http://www.w3.org/2002/07/owl#\"/>\n"
                + "    <Prefix name=\"rdf\" IRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/>\n"
                + "    <Prefix name=\"xml\" IRI=\"http://www.w3.org/XML/1998/namespace\"/>\n"
                + "    <Prefix name=\"xsd\" IRI=\"http://www.w3.org/2001/XMLSchema#\"/>\n"
                + "    <Prefix name=\"rdfs\" IRI=\"http://www.w3.org/2000/01/rdf-schema#\"/>";

        String g_koniec = "</Ontology>";

        //DEKLARACJE
        String p = "    <Declaration>";

        String k = "    </Declaration>";
        String deklaracje = "";

        for (String element : classes) {

            String a = "        <Class IRI=\"#";
            String b = "\"/>";

            String deklaracja = p + nl + a + element + b + nl + k;
            deklaracje += deklaracja + nl;

        }

        for (String element : individuals) {

            String a = "        <NamedIndividual IRI=\"#";
            String b = "\"/>";

            String deklaracja = p + nl + a + element + b + nl + k;
            deklaracje += deklaracja + nl;

        }

        for (String element : object_properties) {

            String a = "        <ObjectProperty IRI=\"#";
            String b = "\"/>";

            String deklaracja = p + nl + a + element + b + nl + k;
            deklaracje += deklaracja + nl;

        }

        for (String element : data_properties) {

            String a = "        <DataProperty IRI=\"#";
            String b = "\"/>";

            String deklaracja = p + nl + a + element + b + nl + k;
            deklaracje += deklaracja + nl;

        }

        //DEKLARACJE KONIEC
        //SUBKLASY
        p = "    <SubClassOf>";
        k = "    </SubClassOf>";

        String subklasy = "";

        for (String element : subklasy_klasy2) {

            String[] parts = element.split("\\|\\|");
            String subclass = parts[0];
            String nadclass = parts[1];

            String a = "        <Class IRI=\"#";
            String b = "\"/>";

            String subklasa = p + nl + a + subclass + b + nl + a + nadclass + b + nl + k;
            subklasy += subklasa + nl;

        }

        //SUBKLASY KONIEC
        //DISJOINT
        p = "    <DisjointClasses>";
        k = "    </DisjointClasses>";
        String disjointy = "";

        for (String element : disjoint) {

            String a = "        <Class IRI=\"#";
            String b = "\"/>";

            String disjoint1 = a + element + b;
            disjointy += disjoint1 + nl;

        }
        disjointy = p + nl + disjointy + k;

        //DISJOINT KONIEC
        //CLASSASSERTION
        p = "    <ClassAssertion>";
        k = "    </ClassAssertion>";

        String classassertions = "";

        for (String element : indywidua_klasy_lista) {

            String[] parts = element.split("\\|\\|");
            String classas = parts[1];
            String indivas = parts[0];

            String a = "        <Class IRI=\"#";
            String b = "\"/>";
            String c = "        <NamedIndividual IRI=\"#";

            String classassertion = p + nl + a + classas + b + nl + c + indivas + b + nl + k;
            classassertions += classassertion + nl;

        }

        //CLASSASSERTION KONIEC
        //OP ASSERTION
        p = "    <ObjectPropertyAssertion>";
        k = "    </ObjectPropertyAssertion>";

        String opassertions = "";

        for (String element : objects_individuals) {

            String[] parts = element.split("\\|\\|");
            String in1 = parts[0];
            String op = parts[1];
            String in2 = parts[2];

            String a = "        <NamedIndividual IRI=\"#";
            String b = "\"/>";
            String c = "        <ObjectProperty IRI=\"#";

            String opa = p + nl + c + op + b + nl + a + in1 + b + nl + a + in2 + b + nl + k;
            opassertions += opa + nl;

        }

        //OP ASSERTION KONIEC
        //DP ASSERTION
        p = "    <DataPropertyAssertion>";
        k = "    </DataPropertyAssertion>";

        String dpassertions = "";

        for (String element : dataproperty_individuals) {

            String[] parts = element.split("\\|\\|");
            String data_1 = parts[0];
            String data_2 = parts[1];
            String data_3 = parts[2];
            String data_4 = parts[3];

            String a = "        <DataProperty IRI=\"#";
            String b = "\"/>";
            String c = "        <NamedIndividual IRI=\"#";
            String d = "        <Literal datatypeIRI=\"";
            String e = "</Literal>";

            String dpi = p + nl + a + data_2 + b + nl + c + data_1 + b + nl + d + "http://www.w3.org/2001/XMLSchema#" + data_3 + "\">" + data_4 + e + nl + k;
            dpassertions += dpi + nl;

        }

        //DP ASSERTION KONIEC
        //OPD
        p = "    <ObjectPropertyDomain>";
        k = "    </ObjectPropertyDomain>";

        String opdomains = "";

        for (String element : objectpropertydomain_lista) {

            String[] parts = element.split("\\|\\|");
            String d_1 = parts[1];
            String d_2 = parts[0];

            String a = "        <ObjectProperty IRI=\"#";
            String b = "\"/>";
            String c = "        <Class IRI=\"#";

            String opdomain = p + nl + a + d_1 + b + nl + c + d_2 + b + nl + k;
            opdomains += opdomain + nl;

        }

        //OPD KONIEC
        //OPR
        p = "    <ObjectPropertyRange>";
        k = "    </ObjectPropertyRange>";

        String opdranges = "";

        for (String element : objectpropertyrange_lista) {

            String[] parts = element.split("\\|\\|");
            String d_1 = parts[0];
            String d_2 = parts[1];

            String a = "        <ObjectProperty IRI=\"#";
            String b = "\"/>";
            String c = "        <Class IRI=\"#";

            String oprange = p + nl + a + d_1 + b + nl + c + d_2 + b + nl + k;
            opdranges += oprange + nl;

        }

        //OPR KONIEC
        //DPD
        p = "    <DataPropertyDomain>";
        k = "    </DataPropertyDomain>";

        String dpddomains = "";

        for (String element : datapropertydomain_lista) {

            String[] parts = element.split("\\|\\|");
            String d_1 = parts[1];
            String d_2 = parts[0];

            String a = "        <DataProperty IRI=\"#";
            String b = "\"/>";
            String c = "        <Class IRI=\"#";

            String dpdd = p + nl + a + d_1 + b + nl + c + d_2 + b + nl + k;
            dpddomains += dpdd + nl;

        }

        //DPD KONIEC
        //DPR
        p = "    <DataPropertyRange>";
        k = "    </DataPropertyRange>";

        String dpranges = "";

        for (String element : datapropertyrange_lista) {

            String[] parts = element.split("\\|\\|");
            String d_1 = parts[0];
            String d_2 = parts[1];

            String a = "        <DataProperty IRI=\"#";
            String b = "\"/>";
            String c = "        <Datatype abbreviatedIRI=\"";

            String dpr = p + nl + a + d_1 + b + nl + c + d_2 + b + nl + k;
            dpranges += dpr + nl;

        }

        //DPR KONIEC
        String final2 = g_poczatek + nl + deklaracje + subklasy + disjointy + classassertions + opassertions + dpassertions + opdomains + opdranges + dpddomains + dpranges + g_koniec;

        return final2;
    }


    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (act == 0) {

            update_tabelek();

    }//GEN-LAST:event_jComboBox2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setEnabled(false);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        tryb = 1;
        check_01 = 1;
        check_02 = 1;
        String ind = jList1.getSelectedValue();

        zmieniany = ind;
        jTextField3.setText(null);

        model3.clear();
        jTextField2.setText(null);
        jButton7.setEnabled(false);
        jTextField3.setEnabled(false);
        jButton12.setEnabled(true);
        jButton5.setEnabled(false);
        jComboBox4.setEnabled(false);
        jComboBox4.removeAllItems();
        jComboBox5.removeAllItems();
        jComboBox6.removeAllItems();
        jComboBox7.removeAllItems();

        for (String element : classes) {

            int spr = 0;
            for (String str : subclasses) {
                if (str.trim().contains(element)) {
                    spr = 1;
                }
            }

            if (spr == 0) {
                jComboBox4.addItem(element);

            }

        }

        String klasa = "";
        String wybierz = "";
        for (String element3 : indywidua_klasy_lista) {

            String[] parts2 = element3.split("\\|\\|");

            String nazwa3 = parts2[0];

            if (nazwa3.equals(ind)) {
                klasa = parts2[1];
            }

        }

        for (String element2 : subklasy_klasy2) {

            String[] parts = element2.split("\\|\\|");
            String subklasa = parts[0];
            String nadklasa = parts[1];
            String polaczone = nadklasa + " -> " + subklasa;
            if (polaczone.contains(klasa)) {
                wybierz = polaczone;

            }

            jComboBox4.addItem(polaczone);
            jComboBox4.removeItem(nadklasa);

        }

        jComboBox4.setSelectedItem(wybierz);

////KLASY
//        for (String element : object_properties) {
//            jComboBox5.addItem(element);
//        }
//
//        for (String element : individuals) {
//            jComboBox6.addItem(element);
//        }
//
//        for (String element : data_properties) {
//            jComboBox7.addItem(element);
//        }
        //XX
        model3.addElement("Nazwa: " + ind);
        jTextField3.setText(ind);

        for (String element : objects_individuals) {

            String[] parts = element.split("\\|\\|");
            String nazwax = parts[0];
            String n1 = parts[1];
            String n2 = parts[2];
            if (nazwax.equals(ind)) {

                model3.addElement(n1 + " -> " + n2);

            }

        }

        for (String element : dataproperty_individuals) {

            String[] parts = element.split("\\|\\|");
            String nazwax = parts[0];
            String n1 = parts[1];
            String n2 = parts[2];
            String n3 = parts[3];
            n2 = n2.replace("xsd:", "");
            n2 = n2.replace("rdf:", "");
            n2 = n2.replace("rdfs:", "");
            n2 = n2.replace("owl:", "");

            if (nazwax.equals(ind)) {

                model3.addElement(n1 + " = " + n3);
            }

        }

        for (String element : indywidua_klasy_lista) {

            String[] parts = element.split("\\|\\|");
            String nazwax = parts[0];
            String n1 = parts[1];

            if (nazwax.equals(ind)) {

                model3.addElement("Typ: " + n1);

                jComboBox4.setSelectedItem(n1);
            }

        }

        //XX
        jFrame1.setLocationRelativeTo(null);
        this.dispose();
        jFrame1.setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setEnabled(false);
        jComboBox4.setEnabled(false);
        String typ1 = jComboBox4.getSelectedItem().toString();
        model3.addElement("Typ: " + typ1);

        check_02 = 1;

        if (check_01 == 1 && check_02 == 1) {

            jButton12.setEnabled(true);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed

        if (jComboBox5.getItemCount() > 0) {

            try {

                String typ2 = jComboBox5.getSelectedItem().toString();

                jComboBox6.removeAllItems();
                for (String element : objectpropertyrange_lista) {

                    String[] parts = element.split("\\|\\|");
                    String objproperty = parts[0];
                    String range = parts[1];

                    if (objproperty.equals(typ2)) {

                        for (String element2 : indywidua_klasy_lista) {

                            String[] parts2 = element2.split("\\|\\|");
                            String indywiduo = parts2[0];
                            String klasa = parts2[1];

                            if (klasa.equals(range) && !klasa.equals(jComboBox4.getSelectedItem().toString())) {

                                if (!(jComboBox4.getSelectedItem().toString().contains("Produkt ->") && klasa.equals("Zamowienie"))) {

                                    jComboBox6.addItem(indywiduo);
                                }

                            } else {

                                for (String element3 : subklasy_klasy2) {

                                    String[] parts3 = element3.split("\\|\\|");
                                    String subk = parts3[0];
                                    String nadk = parts3[1];

                                    if (subk.equals(klasa) && nadk.equals(range)) {
                                        if (!(jComboBox4.getSelectedItem().toString().equals("Zamowienie") && nadk.equals("Produkt"))) {

                                            jComboBox6.addItem(indywiduo);
                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed


    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String typ1 = jComboBox5.getSelectedItem().toString();
        String typ2 = jComboBox6.getSelectedItem().toString();
        if (model3.contains(typ1 + " -> " + typ2)) {

            blad("Istnieje już taka własność obiektowa");
        } else {
            model3.addElement(typ1 + " -> " + typ2);

        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed


    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String data = jComboBox7.getSelectedItem().toString();
        String typ3 = "";
        for (String element : datapropertyrange_lista) {
            String[] parts = element.split("\\|\\|");
            String datat = parts[0];

            if (datat.equals(data)) {
                typ3 = parts[1];
                break;
            }

        }

        String nazwa = jTextField2.getText().trim();
        int check = 0;
        if (!nazwa.isEmpty()) {

            ArrayList<String> filter = new ArrayList();
            filter.add("\\");
            filter.add("|");
            filter.add("\"");
            filter.add("->");
            filter.add("=");
            filter.add("^");
            filter.add("%");
            filter.add("#");
            filter.add("`");

            for (String element : filter) {

                if (nazwa.contains(element)) {
                    check = 1;
                    String tresc = "Wartość zawiera niedozwolone znaki";
                    blad(tresc);
                }

            }

            if (check == 0) {

                int sprxyz = 0;

                int sizee = model3.getSize();
                for (int i = 0; i < sizee; i++) {
                    String por = model3.getElementAt(i);
                    if (por.contains(data + " = ")) {
                        sprxyz = 1;

                    }
                }

                if (model3.contains(data + " = " + nazwa) || sprxyz == 1) {

                    blad("Istnieje już taka własność danych");
                } else {

                    if (typ3.contains("string")) {

                        //  if (nazwa.getClass().equals(String.class)) {
                        model3.addElement(data + " = " + nazwa);
                        jTextField2.setText(null);
                        // } else {
                        //    String tresc = "Wartość nie jest ciągiem znaków";
                        //    blad(tresc);
                        // }
                    }

                    if (typ3.contains("integer")) {

                        try {
                            Integer.parseInt(nazwa);
                            model3.addElement(data + " = " + nazwa);
                            jTextField2.setText(null);
                        } catch (NumberFormatException e) {
                            String tresc = "Wartość nie jest liczbą całkowitą";
                            blad(tresc);
                        }

                    }

                    if (typ3.contains("long")) {

                        try {
                            Long.parseLong(nazwa);
                            model3.addElement(data + " = " + nazwa);
                            jTextField2.setText(null);
                        } catch (NumberFormatException e) {
                            String tresc = "Wartość nie jest typu long";
                            blad(tresc);
                        }

                    }

                    if (typ3.contains("double")) {
                        try {
                            Double.parseDouble(nazwa);
                            model3.addElement(data + " = " + nazwa);
                            jTextField2.setText(null);
                        } catch (NumberFormatException e) {
                            String tresc = "Wartość nie jest liczbą zmiennoprzecinkową";
                            blad(tresc);
                        }

                    }
                    if (typ3.contains("dateTime")) {

                        if (nazwa.contains("T")) {

                            String[] parts = nazwa.split("T");
                            String l = parts[0];
                            String p = parts[1];

                            if (l.matches("\\d{4}-\\d{2}-\\d{2}")) {

                                if (p.matches("\\d\\d:\\d\\d:\\d\\d")) {

                                    model3.addElement(data + " = " + nazwa);
                                    jTextField2.setText(null);

                                } else {
                                    String tresc = "Prawidłowy format daty: YYYY-MM-DDTHH:MM:SS";
                                    blad(tresc);

                                }

                            } else {
                                String tresc = "Prawidłowy format daty: YYYY-MM-DDTHH:MM:SS";
                                blad(tresc);

                            }

                        } else {
                            String tresc = "Prawidłowy format daty: YYYY-MM-DDTHH:MM:SS";
                            blad(tresc);

                        }
                    }

                }

            }

        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

        if (jComboBox4.getItemCount() > 0) {
            int nad = 1;
            String typ1 = jComboBox4.getSelectedItem().toString();
            String typ2 = "vvv";

            if (typ1.contains("->")) {
                nad = 0;
                String[] parts = typ1.split(" -> ");
                typ1 = parts[1];
                typ2 = parts[0];
            }

            jComboBox5.removeAllItems();
            for (String element : objectpropertydomain_lista) {

                String[] parts = element.split("\\|\\|");
                String objpro = parts[1];
                String klasa2 = parts[0];
                if (klasa2.equals(typ1) || klasa2.equals(typ2)) {
                    jComboBox5.addItem(objpro);
                }
            }
            jComboBox7.removeAllItems();
            if (nad == 1) {

                for (String element : datapropertydomain_lista) {

                    String[] parts = element.split("\\|\\|");
                    String datapv = parts[1];
                    String klasav = parts[0];

                    if (klasav.equals(typ1)) {
                        jComboBox7.addItem(datapv);

                    }

                }

            } else {

                for (String element : datapropertydomain_lista) {

                    String[] parts = element.split("\\|\\|");
                    String datapv = parts[1];
                    String klasav = parts[0];

                    if (klasav.equals(typ1)) {
                        jComboBox7.addItem(datapv);

                    } else {

                        for (String element3 : subklasy_klasy2) {

                            String[] parts3 = element3.split("\\|\\|");
                            String subk = parts3[0];
                            String nadk = parts3[1];

                            if (subk.equals(typ1) && nadk.equals(klasav)) {

                                jComboBox7.addItem(datapv);

                            }

                        }

                    }

                }

            }

        }


    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String nazwa = jTextField3.getText().trim();
        int check = 0;
        if (!nazwa.isEmpty()) {

            ArrayList<String> filter = new ArrayList();
            filter.add("\\");
            filter.add("|");
            filter.add("\"");
            filter.add("->");
            filter.add("=");
            filter.add("^");
            filter.add("%");
            filter.add("#");
            filter.add("`");

            for (String element : filter) {

                if (nazwa.contains(element)) {
                    check = 1;
                    String tresc = "Nazwa zawiera niedozwolone znaki";
                    blad(tresc);
                }

            }

            for (String element2 : individuals) {

                if (nazwa.toLowerCase().equals(element2.toLowerCase()) && !nazwa.toLowerCase().equals(zmieniany.toLowerCase())) {
                    check = 1;
                    String tresc = "Nazwa jest już zajęta";
                    blad(tresc);
                }

            }

            if (check == 0) {

                model3.insertElementAt("Nazwa: " + nazwa, 0);

                jButton7.setEnabled(false);
                jTextField3.setEnabled(false);

                check_01 = 1;

                if (check_01 == 1 && check_02 == 1) {

                    jButton12.setEnabled(true);
                }

            }

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        if (!jList3.isSelectionEmpty()) {

            if (jList3.getSelectedIndex() == 0) {
                jButton7.setEnabled(true);
                jTextField3.setEnabled(true);
                jButton12.setEnabled(false);
                check_01 = 0;
            }
            if (jList3.getSelectedValue().contains("Typ: ")) {
                jButton5.setEnabled(true);
                jComboBox4.setEnabled(true);
                check_02 = 0;
                jButton12.setEnabled(false);

                int listsize = model3.getSize();
                List<String> usuwane = new ArrayList();

                for (int i = 0; i < listsize; i++) {

                    String linia = model3.getElementAt(i);

                    if (linia.contains(" -> ") || linia.contains(" = ")) {

                        usuwane.add(linia);

                    }

                }

                for (String usun : usuwane) {

                    model3.removeElement(usun);
                }

            }
            model3.removeElementAt(jList3.getSelectedIndex());

        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        String ind = jList1.getSelectedValue();
        individuals.remove(ind);

        for (Iterator<String> iterator = objects_individuals.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            String[] parts = string.split("\\|\\|");
            String nazwa = parts[0];
            if (nazwa.equals(ind)) {

                iterator.remove();
            }
        }

        for (Iterator<String> iterator = datapropertyrange_lista.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            String[] parts = string.split("\\|\\|");
            String nazwa = parts[0];
            if (nazwa.equals(ind)) {

                iterator.remove();
            }
        }

        for (Iterator<String> iterator = dataproperty_individuals.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            String[] parts = string.split("\\|\\|");
            String nazwa = parts[0];
            if (nazwa.equals(ind)) {

                iterator.remove();
            }
        }

        for (Iterator<String> iterator = indywidua_klasy_lista.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            String[] parts = string.split("\\|\\|");
            String nazwa = parts[0];
            if (nazwa.equals(ind)) {

                iterator.remove();
            }
        }

        model1.removeElement(ind);
        jList1.setModel(model1);

        String wynik = "Indywiduum zostało usunięte!";
        final JFrame frame1 = new JFrame();
        JOptionPane.showMessageDialog(frame1,
                wynik, "Informacja", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        check_01 = 0;
        check_02 = 0;
        tryb = 0;
        model3.clear();
        jTextField2.setText(null);
        jTextField3.setText(null);
        jButton7.setEnabled(true);
        jTextField3.setEnabled(true);
        jButton12.setEnabled(false);
        jButton5.setEnabled(true);
        jComboBox4.setEnabled(true);
        jComboBox4.removeAllItems();
        jComboBox5.removeAllItems();
        jComboBox6.removeAllItems();
        jComboBox7.removeAllItems();
        //KLASY

        for (String element : classes) {

            int spr = 0;
            for (String str : subclasses) {
                if (str.trim().contains(element)) {
                    spr = 1;
                }
            }

            if (spr == 0) {
                jComboBox4.addItem(element);

            }

        }

        for (String element2 : subklasy_klasy2) {

            String[] parts = element2.split("\\|\\|");
            String subklasa = parts[0];
            String nadklasa = parts[1];
            jComboBox4.addItem(nadklasa + " -> " + subklasa);
            jComboBox4.removeItem(nadklasa);

        }

//KLASY
        jFrame1.setLocationRelativeTo(null);
        this.dispose();
        jFrame1.setVisible(true);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        String linia2 = model3.getElementAt(0);

        if (tryb == 1) {

            individuals.remove(zmieniany);

            for (Iterator<String> iterator = objects_individuals.iterator(); iterator.hasNext();) {
                String string = iterator.next();
                String[] parts = string.split("\\|\\|");
                String nazwa = parts[0];
                if (nazwa.equals(zmieniany)) {

                    iterator.remove();
                }
            }

            for (Iterator<String> iterator = datapropertyrange_lista.iterator(); iterator.hasNext();) {
                String string = iterator.next();
                String[] parts = string.split("\\|\\|");
                String nazwa = parts[0];
                if (nazwa.equals(zmieniany)) {

                    iterator.remove();
                }
            }

            for (Iterator<String> iterator = dataproperty_individuals.iterator(); iterator.hasNext();) {
                String string = iterator.next();
                String[] parts = string.split("\\|\\|");
                String nazwa = parts[0];
                if (nazwa.equals(zmieniany)) {

                    iterator.remove();
                }
            }

            for (Iterator<String> iterator = indywidua_klasy_lista.iterator(); iterator.hasNext();) {
                String string = iterator.next();
                String[] parts = string.split("\\|\\|");
                String nazwa = parts[0];
                if (nazwa.equals(zmieniany)) {

                    iterator.remove();
                }
            }

            model1.removeElement(zmieniany);

        }

        int listsize = model3.getSize();

        String nazwa2 = linia2.substring(linia2.indexOf(" ") + 1);
        for (int i = 0; i < listsize; i++) {

            String linia = model3.getElementAt(i);

            if (linia.contains("Nazwa: ")) {

                individuals.add(nazwa2);

            }

            if (linia.contains(" -> ") && !linia.contains("Typ: ")) {

                String[] parts = linia.split(" -> ");
                String i1 = parts[0];
                String i2 = parts[1];
                objects_individuals.add(nazwa2 + "||" + i1 + "||" + i2);

            }

            if (linia.contains(" = ")) {

                String[] parts = linia.split(" = ");
                String i1 = parts[0];
                String i2 = parts[1];
                String typx = "";

                for (String elementx : datapropertyrange_lista) {

                    String[] partsx = elementx.split("\\|\\|");
                    String i11 = partsx[0];
                    String i22 = partsx[1];
                    if (i11.equals(i1)) {

                        typx = i22.replace("xsd:", "");
                        typx = typx.replace("rdf:", "");
                        typx = typx.replace("rdfs:", "");
                        typx = typx.replace("owl:", "");
                        break;
                    }

                }

                dataproperty_individuals.add(nazwa2 + "||" + i1 + "||" + typx + "||" + i2);

            }

            if (linia.contains("Typ: ")) {

                String typ = "";

                if (linia.contains(" -> ")) {

                    String[] partsx2 = linia.split(" -> ");

                    typ = partsx2[1];

                } else {

                    typ = linia.substring(linia.indexOf(" ") + 1);
                }

                indywidua_klasy_lista.add(nazwa2 + "||" + typ);

            }

    }//GEN-LAST:event_jButton12ActionPerformed

        model3.clear();
        jTextField2.setText(null);
        jTextField3.setText(null);
        jButton7.setEnabled(true);
        jTextField3.setEnabled(true);
        jButton12.setEnabled(false);

        model1.addElement(nazwa2);
        jList1.setModel(model1);
        check_01 = 0;
        check_02 = 0;
        jButton5.setEnabled(true);
        jComboBox4.setEnabled(true);
        if (tryb == 1) {
            this.setLocationRelativeTo(null);
            String wynik = "Zmiany zostały zapisane!";
            jFrame1.dispose();
            this.setVisible(true);

            final JFrame frame1 = new JFrame();
            JOptionPane.showMessageDialog(frame1,
                    wynik, "Informacja", JOptionPane.INFORMATION_MESSAGE);

        } else {

            String wynik = "Dodano nowe indywiduum!";
            final JFrame frame1 = new JFrame();
            JOptionPane.showMessageDialog(frame1,
                    wynik, "Informacja", JOptionPane.INFORMATION_MESSAGE);

        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Plik tekstowy", "txt");
        final JFileChooser fc = new JFileChooser();

        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Importowanie danych");
        fc.setCurrentDirectory(new File(path));

//In response to a button click:
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String sciezka = fc.getSelectedFile().getAbsolutePath();

            File xml = new File(sciezka);
            if (!xml.exists()) {
                String tresc = "Nie odnaleziono pliku z danymi";
                blad(tresc);

            } else {
                try {
                    import_individuals(sciezka);
                } catch (Exception e) {

                    String wynik = "Wystąpił błąd podczas importowania danych";

                    String szczegolowy = e.getMessage();
                    blad(wynik, szczegolowy);

                }

            }

        } else {

        }

        // PARSOWANIE SUBKLAS koniec   

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        File temp;
        try {
            temp = File.createTempFile("ontologia", ".owl");
            BufferedWriter out = new BufferedWriter(new FileWriter(temp));
            out.write(generowanie());
            out.close();

            Desktop.getDesktop().browse(temp.toURI());
        } catch (IOException e) {
            String wynik = "Wystąpił błąd podczas otwierania ontologii!";
            String szczegolowy = e.getMessage();
            blad(wynik, szczegolowy);
        }


    }//GEN-LAST:event_jButton13ActionPerformed

    private void jFrame1WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowClosed

    }//GEN-LAST:event_jFrame1WindowClosed

    private void jFrame1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame1ComponentHidden
        this.setLocationRelativeTo(null);
        jFrame1.dispose();
        this.setVisible(true);


    }//GEN-LAST:event_jFrame1ComponentHidden

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        jDialog1.dispose();
        try {

            String fin = generowanie();
            PrintWriter writer;

            writer = new PrintWriter(sciezka_wczytana, "UTF-8");
            writer.print(fin);
            writer.close();

            String wynik = "Ontologia została zapisana";
            final JFrame frame1 = new JFrame();
            JOptionPane.showMessageDialog(frame1,
                    wynik, "Zapisywanie danych do pliku XML", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            String wynik = "Wystąpił błąd podczas zapisywania ontologii";

            String szczegolowy = e.getMessage();
            blad(wynik, szczegolowy);

        }

        this.setEnabled(true);
        this.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        jDialog1.dispose();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Plik OWL", "owl");
        final JFileChooser fc = new JFileChooser();

        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Zapisywanie ontologii");
        fc.setCurrentDirectory(new File(path));

        int returnVal = fc.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            try {
                String path = fc.getSelectedFile().getAbsolutePath();

                String nnazwa = fc.getSelectedFile().getName();

                if (!nnazwa.contains(".owl")) {
                    nnazwa += ".owl";

                }
                nazwa_onto = nnazwa;
                if (!path.contains(".owl")) {
                    path += ".owl";

                }

                String fin = generowanie();
                PrintWriter writer;

                writer = new PrintWriter(path, "UTF-8");
                writer.print(fin);
                writer.close();

                String wynik = "Ontologia została zapisana";
                final JFrame frame1 = new JFrame();
                JOptionPane.showMessageDialog(frame1,
                        wynik, "Zapisywanie danych do pliku XML", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                String wynik = "Wystąpił błąd podczas zapisywania ontologii";

                String szczegolowy = e.getMessage();
                blad(wynik, szczegolowy);

            }
        }
        this.setEnabled(true);
        this.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jDialog1WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowClosing
        this.setEnabled(true);
        this.setVisible(true);
    }//GEN-LAST:event_jDialog1WindowClosing

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ontologia_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ontologia_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ontologia_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ontologia_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private static class Ontologia_final {

        public Ontologia_final() {
        }
    }
}
