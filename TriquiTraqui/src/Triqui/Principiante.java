/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triqui;
import java.awt.Color;
import javax.swing.JLabel;

public class Principiante extends javax.swing.JFrame {
   Color estilo1; 
  Color estilo2;
  
  public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(() -> {
            new Principiante().setVisible(true);
        });
    }

    String turn = "x";
  JLabel[] text = new JLabel[9];
  int[][] ganador={
    {1, 2, 3},
{4, 5, 6},
{7, 8, 9},
{1, 4, 7},
{2, 5, 8},
{3, 6, 9},
{1, 5, 9},
{3, 5, 7},
};
 
    public Principiante() {
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
        Salir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        txto = new javax.swing.JLabel();
        txtx = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
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
        jPanel2.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 146, 146));

        campo3.setBackground(new java.awt.Color(255, 255, 255));
        campo3.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo3.setOpaque(true);
        campo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo3MousePressed(evt);
            }
        });
        jPanel2.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -20, 146, 146));

        campo2.setBackground(new java.awt.Color(255, 255, 255));
        campo2.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo2.setOpaque(true);
        campo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo2MousePressed(evt);
            }
        });
        jPanel2.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -20, 146, 146));

        campo4.setBackground(new java.awt.Color(255, 255, 255));
        campo4.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo4.setOpaque(true);
        campo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo4MousePressed(evt);
            }
        });
        jPanel2.add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 146, 146));

        campo6.setBackground(new java.awt.Color(255, 255, 255));
        campo6.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo6.setOpaque(true);
        campo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo6MousePressed(evt);
            }
        });
        jPanel2.add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 146, 146));

        campo5.setBackground(new java.awt.Color(255, 255, 255));
        campo5.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo5.setOpaque(true);
        campo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo5MousePressed(evt);
            }
        });
        jPanel2.add(campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 146, 146));

        campo7.setBackground(new java.awt.Color(255, 255, 255));
        campo7.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo7.setOpaque(true);
        campo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo7MousePressed(evt);
            }
        });
        jPanel2.add(campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 146, 150));

        campo8.setBackground(new java.awt.Color(255, 255, 255));
        campo8.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo8.setOpaque(true);
        campo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo8MousePressed(evt);
            }
        });
        jPanel2.add(campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 146, 150));

        campo9.setBackground(new java.awt.Color(255, 255, 255));
        campo9.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        campo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo9.setOpaque(true);
        campo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo9MousePressed(evt);
            }
        });
        jPanel2.add(campo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 146, 150));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel10.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel10.setText("Principiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtx)
                            .addComponent(txto))
                        .addGap(38, 38, 38)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(txto)
                        .addGap(126, 126, 126)
                        .addComponent(txtx))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    
    private void campo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo1MousePressed
        boton(1);
    }//GEN-LAST:event_campo1MousePressed

    private void campo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo2MousePressed
        boton(2);
    }//GEN-LAST:event_campo2MousePressed

    
    private void campo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo3MousePressed
         boton(3);
    }//GEN-LAST:event_campo3MousePressed

    private void campo4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo4MousePressed
          boton(4);
    }//GEN-LAST:event_campo4MousePressed

    private void campo5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo5MousePressed
          boton(5);
    }//GEN-LAST:event_campo5MousePressed

    private void campo6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo6MousePressed
          boton(6);
    }//GEN-LAST:event_campo6MousePressed

    private void campo7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo7MousePressed
          boton(7);
    }//GEN-LAST:event_campo7MousePressed

    private void campo8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo8MousePressed
        boton(8);
    }//GEN-LAST:event_campo8MousePressed

    private void campo9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo9MousePressed
          boton(9);
    }//GEN-LAST:event_campo9MousePressed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        resetGame();
    }//GEN-LAST:event_borrarActionPerformed
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

    private void Ganador(String ganador) {
        javax.swing.JOptionPane.showMessageDialog(this, "Bien hecho " + ganador );
    }
    private void resetGame() {
    for (JLabel label : text) {
        label.setText("");
    } 
    turn = "x";
   javax.swing.JOptionPane.showMessageDialog(this, "Vamos otra vez");
    }
}
