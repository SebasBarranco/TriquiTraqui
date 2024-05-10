/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Triqui;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Aficionado extends javax.swing.JFrame {
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
            java.util.logging.Logger.getLogger(Aficionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new Aficionado().setVisible(true);
        });
    }

    String turn = "x";
  JLabel[] text = new JLabel[16];
  int[][] ganador ={
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
{6, 11, 16},
{4, 7, 10},
{5, 10, 15},
{3, 6, 9},
{8, 11, 14},
{9, 10, 11},
{12, 13, 14},


};
    public Aficionado() {
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

    }
    public void setColor1(Color color) {
        this.estilo1 = color; 
    }

    public void setColor2(Color color) {
        this.estilo2 = color; 
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
            Ganador("X");
            break;
        }
        if (text[ganador[i][0] - 1].getText().equals("o") &&
            text[ganador[i][1] - 1].getText().equals("o") &&
            text[ganador[i][2] - 1].getText().equals("o")) {
            System.out.println("O, siempre confie en ti");
            Ganador("O");
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
        campo11 = new javax.swing.JLabel();
        campo12 = new javax.swing.JLabel();
        campo14 = new javax.swing.JLabel();
        campo15 = new javax.swing.JLabel();
        campo16 = new javax.swing.JLabel();
        campo10 = new javax.swing.JLabel();
        campo13 = new javax.swing.JLabel();
        txtx = new javax.swing.JLabel();
        txto = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel10.setText("Aficionado");

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
        jPanel2.add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 100));

        campo5.setBackground(new java.awt.Color(255, 255, 255));
        campo5.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo5.setOpaque(true);
        campo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo5MousePressed(evt);
            }
        });
        jPanel2.add(campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 100, 100));

        campo7.setBackground(new java.awt.Color(255, 255, 255));
        campo7.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo7.setOpaque(true);
        campo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo7MousePressed(evt);
            }
        });
        jPanel2.add(campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, 100));

        campo8.setBackground(new java.awt.Color(255, 255, 255));
        campo8.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo8.setOpaque(true);
        campo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo8MousePressed(evt);
            }
        });
        jPanel2.add(campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, 100));

        campo9.setBackground(new java.awt.Color(255, 255, 255));
        campo9.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo9.setOpaque(true);
        campo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo9MousePressed(evt);
            }
        });
        jPanel2.add(campo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 100));

        campo11.setBackground(new java.awt.Color(255, 255, 255));
        campo11.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo11.setOpaque(true);
        campo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo11MousePressed(evt);
            }
        });
        jPanel2.add(campo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 100, 100));

        campo12.setBackground(new java.awt.Color(255, 255, 255));
        campo12.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo12.setOpaque(true);
        campo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo12MousePressed(evt);
            }
        });
        jPanel2.add(campo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 100, 100));

        campo14.setBackground(new java.awt.Color(255, 255, 255));
        campo14.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo14.setOpaque(true);
        campo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo14MousePressed(evt);
            }
        });
        jPanel2.add(campo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, 100));

        campo15.setBackground(new java.awt.Color(255, 255, 255));
        campo15.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo15.setOpaque(true);
        campo15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo15MousePressed(evt);
            }
        });
        jPanel2.add(campo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 100, 100));

        campo16.setBackground(new java.awt.Color(255, 255, 255));
        campo16.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo16.setOpaque(true);
        campo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo16MousePressed(evt);
            }
        });
        jPanel2.add(campo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 100, 100));

        campo10.setBackground(new java.awt.Color(255, 255, 255));
        campo10.setFont(new java.awt.Font("OCR A Extended", 3, 60)); // NOI18N
        campo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo10.setOpaque(true);
        campo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo10MousePressed(evt);
            }
        });
        jPanel2.add(campo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 100, 100));

        campo13.setBackground(new java.awt.Color(255, 255, 255));
        campo13.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo13.setOpaque(true);
        campo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo13MousePressed(evt);
            }
        });
        jPanel2.add(campo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 100, 100));

        txtx.setText("Jugador 2");

        txto.setText("Jugador 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(txtx))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txto)
                .addGap(72, 72, 72)
                .addComponent(txtx)
                .addGap(218, 218, 218))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
    resetGame();
    }//GEN-LAST:event_borrarActionPerformed

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
    private javax.swing.JLabel campo2;
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

    

private void Ganador(String winner) {
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
