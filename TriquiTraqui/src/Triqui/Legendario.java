/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Triqui;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Legendario extends javax.swing.JFrame {
  Color estilo1; 
  Color estilo2;
  
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Legendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      //</editor-fold>
      //</editor-fold>
      
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Legendario().setVisible(true);
        });
    }
    String turn = "x";
  JLabel[] text = new JLabel[25];
  int[][] ganador={
 {1, 2, 3},
{2, 3, 4},
{5, 6, 7},
{6, 7, 8},
{9, 10, 11},
{10, 11, 12},
{13, 14, 15},
{14, 15, 16},
{1, 5, 9},
{2, 6, 10},
{3, 7, 11},
{4, 8, 12},
{5, 9, 13},
{6, 10, 14},
{7, 11, 15},
{8, 12, 16},
{1, 6, 11},
{2, 7, 12},
{5, 10, 15},
{6, 11, 16},
{1, 7, 13},
{2, 8, 14},
{3, 9, 15},
{4, 10, 16},
{9, 13, 17},
{10, 14, 18},
{11, 15, 19},
{12, 16, 20},
{13, 14, 15},
{14, 15, 16},
{17, 18, 19},
{18, 19, 20},
{5, 11, 17},
{6, 12, 18},
{7, 13, 19},
{8, 14, 20},
{5, 12, 19},
{4, 9, 14},
{3, 8, 13},
{2, 7, 12},
{9, 14, 19},
{10, 15, 20},
{11, 16, 21},
{12, 17, 22},
{13, 14, 15},
{14, 15, 16},
{15, 16, 17},
{16, 17, 18},
{17, 18, 19},
{18, 19, 20},
{19, 20, 21},
{20, 21, 22},
{21, 22, 23},
{22, 23, 24},
{23, 24, 25},
{5, 10, 15},
{6, 11, 16},
{10, 15, 20},
{11, 16, 21},
{15, 20, 25},
{4, 9, 14},
{9, 14, 19},
{14, 19, 24},
{3, 8, 13},
{8, 13, 18},
{13, 18, 23},
{2, 7, 12},
{7, 12, 17},
{12, 17, 22},
{1, 6, 11},
{6, 11, 16},
{11, 16, 21},
{5, 11, 17},
{11, 17, 23},
{10, 16, 22},
{16, 22, 18},
{15, 21, 17},
{21, 17, 13},
{20, 16, 12},
{16, 12, 8},
{25, 21, 17},
{21, 17, 13},
{24, 20, 16},
{20, 16, 12},
{23, 19, 15},
{19, 15, 11},
{22, 18, 14},
{18, 14, 10},
{21, 17, 13},
{17, 13, 9},
{16, 12, 8},
{12, 8, 4}

  };
  
    public Legendario() {
        initComponents();
        text[0] = campo1;
text[1] = campo2;
text[2] = campo3;
text[3] = campo4;
text[4] = campo5;
text[5] = campo6;
text[6] = campo7;
text[7] = campo8;
text[8] = campo9;
text[9] = campo10;
text[10] = campo11;
text[11] = campo12;
text[12] = campo13;
text[13] = campo14;
text[14] = campo15;
text[15] = campo16;
text[16] = campo17;
text[17] = campo18;
text[18] = campo19;
text[19] = campo20;
text[20] = campo21;
text[21] = campo22;
text[22] = campo23;
text[23] = campo24;
text[24] = campo25;

  
    }

    public void setColor1(Color color1) {
        this.estilo1 = color1; 
    }

    public void setColor2(Color color2) {
        this.estilo2 = color2; 
    }
    
    
    public void settxtXText(String text) {
        txtx.setText(text);
    }

    
    public void settxtOText(String text) {
        txto.setText(text);
        
    }
    public void ganadorverifi(){
   
    for (int i = 0; i < ganador.length; i++) {
         
        if (text[ganador[i][0] - 1].getText().equals("x") &&  
            text[ganador[i][1] - 1].getText().equals("x") &&  
            text[ganador[i][2] - 1].getText().equals("x")) {  
            System.out.println("X, siempre confie en ti");             
            ganadorr("X");
            break;
        }
        if (text[ganador[i][0] - 1].getText().equals("o") &&
            text[ganador[i][1] - 1].getText().equals("o") &&
            text[ganador[i][2] - 1].getText().equals("o")) {
            System.out.println("O, siempre confie en ti");
            ganadorr("O");
            break;
        }
    }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        campo1 = new javax.swing.JLabel();
        campo3 = new javax.swing.JLabel();
        campo2 = new javax.swing.JLabel();
        campo4 = new javax.swing.JLabel();
        campo6 = new javax.swing.JLabel();
        campo5 = new javax.swing.JLabel();
        campo7 = new javax.swing.JLabel();
        campo8 = new javax.swing.JLabel();
        campo9 = new javax.swing.JLabel();
        campo10 = new javax.swing.JLabel();
        campo11 = new javax.swing.JLabel();
        campo12 = new javax.swing.JLabel();
        campo13 = new javax.swing.JLabel();
        campo14 = new javax.swing.JLabel();
        campo17 = new javax.swing.JLabel();
        campo18 = new javax.swing.JLabel();
        campo19 = new javax.swing.JLabel();
        campo20 = new javax.swing.JLabel();
        campo21 = new javax.swing.JLabel();
        campo22 = new javax.swing.JLabel();
        campo23 = new javax.swing.JLabel();
        campo24 = new javax.swing.JLabel();
        campo25 = new javax.swing.JLabel();
        campo15 = new javax.swing.JLabel();
        campo16 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        txto = new javax.swing.JLabel();
        txtx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel10.setText("Legendario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo1.setBackground(new java.awt.Color(255, 255, 255));
        campo1.setFont(new java.awt.Font("OCR A Extended", 3, 60)); // NOI18N
        campo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo1.setOpaque(true);
        campo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo1MousePressed(evt);
            }
        });
        jPanel2.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        campo3.setBackground(new java.awt.Color(255, 255, 255));
        campo3.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo3.setOpaque(true);
        campo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo3MousePressed(evt);
            }
        });
        jPanel2.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, 100));

        campo2.setBackground(new java.awt.Color(255, 255, 255));
        campo2.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo2.setOpaque(true);
        campo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo2MousePressed(evt);
            }
        });
        jPanel2.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 100, 100));

        campo4.setBackground(new java.awt.Color(255, 255, 255));
        campo4.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo4.setOpaque(true);
        campo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo4MousePressed(evt);
            }
        });
        jPanel2.add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, 100));

        campo6.setBackground(new java.awt.Color(255, 255, 255));
        campo6.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo6.setOpaque(true);
        campo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo6MousePressed(evt);
            }
        });
        jPanel2.add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 100, 100));

        campo5.setBackground(new java.awt.Color(255, 255, 255));
        campo5.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo5.setOpaque(true);
        campo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo5MousePressed(evt);
            }
        });
        jPanel2.add(campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, 100));

        campo7.setBackground(new java.awt.Color(255, 255, 255));
        campo7.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo7.setOpaque(true);
        campo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo7MousePressed(evt);
            }
        });
        jPanel2.add(campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 100));

        campo8.setBackground(new java.awt.Color(255, 255, 255));
        campo8.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo8.setOpaque(true);
        campo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo8MousePressed(evt);
            }
        });
        jPanel2.add(campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, 100));

        campo9.setBackground(new java.awt.Color(255, 255, 255));
        campo9.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo9.setOpaque(true);
        campo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo9MousePressed(evt);
            }
        });
        jPanel2.add(campo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, 100));

        campo10.setBackground(new java.awt.Color(255, 255, 255));
        campo10.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo10.setOpaque(true);
        campo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo10MousePressed(evt);
            }
        });
        jPanel2.add(campo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 100, 100));

        campo11.setBackground(new java.awt.Color(255, 255, 255));
        campo11.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo11.setOpaque(true);
        campo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo11MousePressed(evt);
            }
        });
        jPanel2.add(campo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 100));

        campo12.setBackground(new java.awt.Color(255, 255, 255));
        campo12.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo12.setOpaque(true);
        campo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo12MousePressed(evt);
            }
        });
        jPanel2.add(campo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 100, 100));

        campo13.setBackground(new java.awt.Color(255, 255, 255));
        campo13.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo13.setOpaque(true);
        campo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo13MousePressed(evt);
            }
        });
        jPanel2.add(campo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 100, 100));

        campo14.setBackground(new java.awt.Color(255, 255, 255));
        campo14.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo14.setOpaque(true);
        campo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo14MousePressed(evt);
            }
        });
        jPanel2.add(campo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 100, 100));

        campo17.setBackground(new java.awt.Color(255, 255, 255));
        campo17.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo17.setOpaque(true);
        campo17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo17MousePressed(evt);
            }
        });
        jPanel2.add(campo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, 100));

        campo18.setBackground(new java.awt.Color(255, 255, 255));
        campo18.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo18.setOpaque(true);
        campo18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo18MousePressed(evt);
            }
        });
        jPanel2.add(campo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 100, 100));

        campo19.setBackground(new java.awt.Color(255, 255, 255));
        campo19.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo19.setOpaque(true);
        campo19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo19MousePressed(evt);
            }
        });
        jPanel2.add(campo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 100, 100));

        campo20.setBackground(new java.awt.Color(255, 255, 255));
        campo20.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo20.setOpaque(true);
        campo20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo20MousePressed(evt);
            }
        });
        jPanel2.add(campo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 100, 100));

        campo21.setBackground(new java.awt.Color(255, 255, 255));
        campo21.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo21.setOpaque(true);
        campo21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo21MousePressed(evt);
            }
        });
        jPanel2.add(campo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 100, 100));

        campo22.setBackground(new java.awt.Color(255, 255, 255));
        campo22.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo22.setOpaque(true);
        campo22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo22MousePressed(evt);
            }
        });
        jPanel2.add(campo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 100, 100));

        campo23.setBackground(new java.awt.Color(255, 255, 255));
        campo23.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo23.setOpaque(true);
        campo23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo23MousePressed(evt);
            }
        });
        jPanel2.add(campo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 100, 100));

        campo24.setBackground(new java.awt.Color(255, 255, 255));
        campo24.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo24.setOpaque(true);
        campo24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo24MousePressed(evt);
            }
        });
        jPanel2.add(campo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 100, 100));

        campo25.setBackground(new java.awt.Color(255, 255, 255));
        campo25.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo25.setOpaque(true);
        campo25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo25MousePressed(evt);
            }
        });
        jPanel2.add(campo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 100, 100));

        campo15.setBackground(new java.awt.Color(255, 255, 255));
        campo15.setFont(new java.awt.Font("OCR A Extended", 3, 60)); // NOI18N
        campo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo15.setOpaque(true);
        campo15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo15MousePressed(evt);
            }
        });
        jPanel2.add(campo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 100, 100));

        campo16.setBackground(new java.awt.Color(255, 255, 255));
        campo16.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo16.setOpaque(true);
        campo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo16MousePressed(evt);
            }
        });
        jPanel2.add(campo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Salir.setText("Terminar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        borrar.setText("Comenzar de nuevo");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        txto.setText("Jugador 1");

        txtx.setText("Jugador 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtx, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(txto)
                        .addGap(108, 108, 108)
                        .addComponent(txtx)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir)
                .addGap(116, 116, 116))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo1MousePressed
        boton(1);
    }//GEN-LAST:event_campo1MousePressed

    private void campo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo3MousePressed
        boton(3);
    }//GEN-LAST:event_campo3MousePressed

    private void campo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo2MousePressed
        boton(2);
    }//GEN-LAST:event_campo2MousePressed

    private void campo4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo4MousePressed
        boton(4);
    }//GEN-LAST:event_campo4MousePressed

    private void campo6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo6MousePressed
        boton(6);
    }//GEN-LAST:event_campo6MousePressed

    private void campo5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo5MousePressed
        boton(5);
    }//GEN-LAST:event_campo5MousePressed

    private void campo7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo7MousePressed
        boton(7);
    }//GEN-LAST:event_campo7MousePressed

    private void campo8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo8MousePressed
        boton(8);
    }//GEN-LAST:event_campo8MousePressed

    private void campo9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo9MousePressed
        boton(9);
    }//GEN-LAST:event_campo9MousePressed

    private void campo10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo10MousePressed
        // TODO add your handling code here:
        boton(10);
    }//GEN-LAST:event_campo10MousePressed

    private void campo11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo11MousePressed
        // TODO add your handling code here:
        boton(11);
    }//GEN-LAST:event_campo11MousePressed

    private void campo12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo12MousePressed
        // TODO add your handling code here:
        boton(12);
    }//GEN-LAST:event_campo12MousePressed

    private void campo13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo13MousePressed
        // TODO add your handling code here:
        boton(13);
    }//GEN-LAST:event_campo13MousePressed

    private void campo14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo14MousePressed
        // TODO add your handling code here:
        boton(14);
    }//GEN-LAST:event_campo14MousePressed

    private void campo15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo15MousePressed
        // TODO add your handling code here:
        boton(15);
    }//GEN-LAST:event_campo15MousePressed

    private void campo16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo16MousePressed
        // TODO add your handling code here:
        boton(16);
    }//GEN-LAST:event_campo16MousePressed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        resetGame();
    }//GEN-LAST:event_borrarActionPerformed

    private void campo17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo17MousePressed
        // TODO add your handling code here:
        boton(17);
    }//GEN-LAST:event_campo17MousePressed

    private void campo18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo18MousePressed
        // TODO add your handling code here:
        boton(18);
    }//GEN-LAST:event_campo18MousePressed

    private void campo19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo19MousePressed
        // TODO add your handling code here:
        boton(19);
    }//GEN-LAST:event_campo19MousePressed

    private void campo20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo20MousePressed
        // TODO add your handling code here:
        boton(20);
    }//GEN-LAST:event_campo20MousePressed

    private void campo21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo21MousePressed
        // TODO add your handling code here:
         boton(21);
    }//GEN-LAST:event_campo21MousePressed

    private void campo22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo22MousePressed
        // TODO add your handling code here:
         boton(22);
    }//GEN-LAST:event_campo22MousePressed

    private void campo23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo23MousePressed
        // TODO add your handling code here:
         boton(23);
    }//GEN-LAST:event_campo23MousePressed

    private void campo24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo24MousePressed
        // TODO add your handling code here:
         boton(24);
    }//GEN-LAST:event_campo24MousePressed

    private void campo25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo25MousePressed
        // TODO add your handling code here:
         boton(25);
    }//GEN-LAST:event_campo25MousePressed
public void boton (int lugar){
 if (text[lugar - 1].getText().isEmpty()) { 
            text[lugar - 1].setText(turn); 

           
            if (turn.equals("x")) {
                text[lugar - 1].setForeground(estilo1); 
            } else {
                text[lugar - 1].setForeground(estilo2); 
            }

            turno();
            ganadorverifi(); 
        }
    }

 public void turno (){
       if(turn.equals("x")){  
          turn = "o";
 
        }   else{
                turn ="x";
            }
 
 }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel campo1;
    private javax.swing.JLabel campo10;
    private javax.swing.JLabel campo11;
    private javax.swing.JLabel campo12;
    private javax.swing.JLabel campo13;
    private javax.swing.JLabel campo14;
    private javax.swing.JLabel campo15;
    private javax.swing.JLabel campo16;
    private javax.swing.JLabel campo17;
    private javax.swing.JLabel campo18;
    private javax.swing.JLabel campo19;
    private javax.swing.JLabel campo2;
    private javax.swing.JLabel campo20;
    private javax.swing.JLabel campo21;
    private javax.swing.JLabel campo22;
    private javax.swing.JLabel campo23;
    private javax.swing.JLabel campo24;
    private javax.swing.JLabel campo25;
    private javax.swing.JLabel campo3;
    private javax.swing.JLabel campo4;
    private javax.swing.JLabel campo5;
    private javax.swing.JLabel campo6;
    private javax.swing.JLabel campo7;
    private javax.swing.JLabel campo8;
    private javax.swing.JLabel campo9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txto;
    private javax.swing.JLabel txtx;
    // End of variables declaration//GEN-END:variables

    private void ganadorr(String winner) {
        javax.swing.JOptionPane.showMessageDialog(this, "Bien hecho " + winner );
    }
    private void resetGame() {
    for (JLabel label : text) {
        label.setText("");
    } 
    turn = "x";
   javax.swing.JOptionPane.showMessageDialog(this, "Vamos otra vez");
    }
        
}
