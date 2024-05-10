/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Triqui;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Menu extends javax.swing.JFrame {
 Color estilojugador1; 
 Color estilojugador2; 

 public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
 
    public Menu() {
        initComponents();
    }

    private Principiante principiante3x3; 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dificultad = new javax.swing.JLabel();
        tamañotablero = new javax.swing.JComboBox<>();
        listos = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        equis = new javax.swing.JLabel();
        jugador1 = new javax.swing.JTextField();
        jugador2 = new javax.swing.JTextField();
        circulo = new javax.swing.JLabel();
        colorjugador1 = new javax.swing.JButton();
        colorjugador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dificultad.setFont(new java.awt.Font("Niagara Solid", 0, 36)); // NOI18N
        dificultad.setText("Dificultad");

        tamañotablero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige", "Principiante 3x3", "Aficionado 4x4", "Legendario 5x5" }));
        tamañotablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañotableroActionPerformed(evt);
            }
        });

        listos.setText("Comenzar Rompe Amistades");
        listos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listosActionPerformed(evt);
            }
        });

        exit.setText("Salir");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("RompeAmistades");

        equis.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        equis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equis.setText("X");

        jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador1ActionPerformed(evt);
            }
        });

        jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador2ActionPerformed(evt);
            }
        });

        circulo.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        circulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        circulo.setText("0");

        colorjugador1.setBackground(new java.awt.Color(0, 255, 51));
        colorjugador1.setText("Color X");
        colorjugador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        colorjugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorjugador1ActionPerformed(evt);
            }
        });

        colorjugador2.setBackground(new java.awt.Color(255, 0, 0));
        colorjugador2.setForeground(new java.awt.Color(255, 255, 51));
        colorjugador2.setText("Color O");
        colorjugador2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        colorjugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorjugador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorjugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorjugador2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(dificultad)
                                                .addGap(31, 31, 31))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamañotablero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorjugador1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dificultad)
                                .addGap(18, 18, 18)
                                .addComponent(tamañotablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorjugador2)
                    .addComponent(listos))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listosActionPerformed
        
        if (jugador1.getText().isEmpty() || jugador2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Upss!, no olvides tu nombre");
            return;
        }

        
        if (estilojugador1 == null || estilojugador2 == null) {
            JOptionPane.showMessageDialog(this, "Upss!, acuerdate de elegir el color");
            return;
        }

        
        String seleccionTamaño = (String) tamañotablero.getSelectedItem();
        if (seleccionTamaño.equals("Elige")) {
            JOptionPane.showMessageDialog(this, "Upss!, acuerdate de elegir el tamaño");
            return;
        }

     
        String n1 = jugador1.getText();
        String n2 = jugador2.getText();

        
        switch (seleccionTamaño) {
            case "Principiante 3x3":
            Principiante principiante = new Principiante(); 
            principiante.settxtXText(n1); 
            principiante.settxtOText(n2); 
            principiante.setColor1(estilojugador1);
            principiante.setColor2(estilojugador2); 
            principiante.setVisible(true); 
            break;

            case "Aficionado 4x4":
            Aficionado aficionado = new Aficionado(); 
            aficionado.settxtXText(n1); 
            aficionado.settxtOText(n2); 
            aficionado.setColor1(estilojugador1);
            aficionado.setColor2(estilojugador2);
            aficionado.setVisible(true);
            break;
            case "Legendario 5x5":
            Legendario legendario = new Legendario();
            legendario.settxtXText(n1); 
            legendario.settxtOText(n2); 
            legendario.setColor1(estilojugador1);
            legendario.setColor2(estilojugador2);
            legendario.setVisible(true);
            break;
            default:
            JOptionPane.showMessageDialog(this, "elige dificultad");
            break;
        }

        
        this.dispose(); 

    }//GEN-LAST:event_listosActionPerformed

    private void colorjugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorjugador2ActionPerformed
        Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar Color para O ", estilojugador2);

        if (nuevoColor != null) { 
            estilojugador2 = nuevoColor; 
        } else {
            System.out.println("ey O!, acuerdate de tu color");
        }
    }//GEN-LAST:event_colorjugador2ActionPerformed

    private void colorjugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorjugador1ActionPerformed
        Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar Color para X ", estilojugador1);

        if (nuevoColor != null) { 
            estilojugador1 = nuevoColor; 
        } else {
            System.out.println("ey O!, acuerdate de tu color");
        }
    }//GEN-LAST:event_colorjugador1ActionPerformed

    private void jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador2ActionPerformed

        String nombreO = jugador2.getText(); 
    }//GEN-LAST:event_jugador2ActionPerformed

    private void jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador1ActionPerformed

        String nombreX = jugador1.getText(); 

    }//GEN-LAST:event_jugador1ActionPerformed

    private void tamañotableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañotableroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañotableroActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public Color getColorX() {
    return estilojugador1;
}

public Color getColorO() {
    return estilojugador2;
}
public void principiante3x3() {
        
        String nombre1 = jugador1.getText();
        String nombre2 = jugador2.getText();

       
        principiante3x3.settxtXText(nombre1);
        principiante3x3.settxtOText(nombre2);
    }
public void Aficionado4x4() {
        
        String nombre1 = jugador1.getText();
        String nombre2 = jugador2.getText();

       
        principiante3x3.settxtXText(nombre1);
        principiante3x3.settxtOText(nombre2);
    }
public void Legendario5x5() {
        
        String nombre1 = jugador1.getText();
        String nombre2 = jugador2.getText();

       
        principiante3x3.settxtXText(nombre1);
        principiante3x3.settxtOText(nombre2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel circulo;
    private javax.swing.JButton colorjugador1;
    private javax.swing.JButton colorjugador2;
    private javax.swing.JLabel dificultad;
    private javax.swing.JLabel equis;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jugador1;
    private javax.swing.JTextField jugador2;
    private javax.swing.JButton listos;
    private javax.swing.JComboBox<String> tamañotablero;
    // End of variables declaration//GEN-END:variables



}

