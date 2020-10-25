package ejercicio_13;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame implements ActionListener{
       
    public Ventana() {
        initComponents();
        
        this.setTitle("Pasajero"); 
        //creando el array
        String [] paises = new String [5];
        //asignando los valores
        paises [0]= "EEUU";
        paises [1]= "Inglaterra";
        paises [2]= "Brasil";
        paises [3]= "Portugal";
        paises [4]= "Mexico";
        
        //recorriendo  el array y asignando valores a la lista desplegable del formulario
        for (int i = 0; i < 5; i++) {
            this.ListaPaises.addItem(paises[i]);
        }
        
        
        
        
//        String seleccion = " ";
//        
//        if (Seleccion1.isSelected() ){
//            seleccion += "Seleccion1 - ";
//        }
//        if (Seleccion2.isSelected() ){
//            seleccion += "Seleccion2 - " ;
//        }
//        if (Seleccion3.isSelected() ){
//            seleccion += "Seleccion3  - ";
//        }
//        JOptionPane.showMessageDialog(null, seleccion);
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        solterobtn = new javax.swing.JRadioButton();
        casadobtn = new javax.swing.JRadioButton();
        viudobtn = new javax.swing.JRadioButton();
        divorciadobtn = new javax.swing.JRadioButton();
        otrobtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ListaPaises = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Seleccion1 = new javax.swing.JCheckBox();
        Seleccion2 = new javax.swing.JCheckBox();
        Seleccion3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnAceptar.setBackground(new java.awt.Color(153, 153, 153));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        solterobtn.setBackground(new java.awt.Color(0, 204, 204));
        solterobtn.setText("Soltero");
        solterobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solterobtnActionPerformed(evt);
            }
        });

        casadobtn.setBackground(new java.awt.Color(0, 204, 204));
        casadobtn.setText("Casado");
        casadobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casadobtnActionPerformed(evt);
            }
        });

        viudobtn.setBackground(new java.awt.Color(0, 204, 204));
        viudobtn.setText("Viudo");
        viudobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viudobtnActionPerformed(evt);
            }
        });

        divorciadobtn.setBackground(new java.awt.Color(0, 204, 204));
        divorciadobtn.setText("Divorciado");
        divorciadobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divorciadobtnActionPerformed(evt);
            }
        });

        otrobtn.setBackground(new java.awt.Color(0, 204, 204));
        otrobtn.setText("Otro");
        otrobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrobtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estado Civil");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Destinos:");

        Seleccion1.setBackground(new java.awt.Color(0, 204, 204));
        Seleccion1.setText("Español");
        Seleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion1ActionPerformed(evt);
            }
        });

        Seleccion2.setBackground(new java.awt.Color(0, 204, 204));
        Seleccion2.setText("Ingles");

        Seleccion3.setBackground(new java.awt.Color(0, 204, 204));
        Seleccion3.setText("Portugues");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Idiomas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(77, 77, 77)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(solterobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(casadobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viudobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(divorciadobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(otrobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(Seleccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Seleccion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Seleccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ListaPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ListaPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seleccion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seleccion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seleccion3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(solterobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(casadobtn)
                        .addGap(3, 3, 3)
                        .addComponent(viudobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(divorciadobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(otrobtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String Nombre;
        String Apellido;
        
        Nombre = nombretxt.getText();
        Apellido = apellidotxt.getText();
        
               
        //////////
        
        String Pais;
        Pais = this.ListaPaises.getSelectedItem().toString();
        
//        System.out.println(Pais);
        
        ///////////
        
        String edoCivil;
        
//        if (casadobtn.isSelected()){
//            edoCivil = 
//        }
//            edoCivil = casado;
//        

        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
        //        this.btnSalir.setDefaultCapable(rootPaneCheckingEnabled);
        ////
        //        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void solterobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solterobtnActionPerformed
        // TODO add your handling code here:
        if (solterobtn.isSelected()){
            casadobtn.setSelected(false);
            viudobtn.setSelected(false);
            divorciadobtn.setSelected(false);
            otrobtn.setSelected(false);
        }
    }//GEN-LAST:event_solterobtnActionPerformed

    private void Seleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_Seleccion1ActionPerformed

    private void casadobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casadobtnActionPerformed
        // TODO add your handling code here:
        if (casadobtn.isSelected()){
            solterobtn.setSelected(false);
            viudobtn.setSelected(false);
            divorciadobtn.setSelected(false);
            otrobtn.setSelected(false);
        }
    }//GEN-LAST:event_casadobtnActionPerformed

    private void viudobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viudobtnActionPerformed
        // TODO add your handling code here:
        if (viudobtn.isSelected()){
            solterobtn.setSelected(false);
            casadobtn.setSelected(false);
            divorciadobtn.setSelected(false);
            otrobtn.setSelected(false);
        }
    }//GEN-LAST:event_viudobtnActionPerformed

    private void divorciadobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divorciadobtnActionPerformed
        // TODO add your handling code here:
        if (divorciadobtn.isSelected()){
            solterobtn.setSelected(false);
            casadobtn.setSelected(false);
            viudobtn.setSelected(false);
            otrobtn.setSelected(false);
        }
    }//GEN-LAST:event_divorciadobtnActionPerformed

    private void otrobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrobtnActionPerformed
        // TODO add your handling code here:
        if (otrobtn.isSelected()){
            solterobtn.setSelected(false);
            casadobtn.setSelected(false);
            viudobtn.setSelected(false);
            divorciadobtn.setSelected(false);
        }
    }//GEN-LAST:event_otrobtnActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ListaPaises;
    private javax.swing.JCheckBox Seleccion1;
    private javax.swing.JCheckBox Seleccion2;
    private javax.swing.JCheckBox Seleccion3;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton casadobtn;
    private javax.swing.JRadioButton divorciadobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JRadioButton otrobtn;
    private javax.swing.JRadioButton solterobtn;
    private javax.swing.JRadioButton viudobtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


