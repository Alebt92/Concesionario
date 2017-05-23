/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import clases.Coche;
import clases.Furgoneta;
import clases.ListaCoches;
import clases.ListaFurgonetas;
import clases.ListaVehiculos;
import clases.Vehiculos;
import java.util.ArrayList;

/**
 *
 * @author dam120
 */
public class Gestion extends javax.swing.JFrame {

    ArrayList<Vehiculos> veh = ListaVehiculos.miListaCoches.getListaCoche();
    /**
     * Creates new form Gestion
     */
    public Gestion() {
        initComponents();
        jTextCapacidad.setVisible(false);
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextMarca = new javax.swing.JTextField();
        jTipoVeh = new javax.swing.JComboBox();
        jtextModelo = new javax.swing.JTextField();
        jTextColor = new javax.swing.JTextField();
        jTextMotor = new javax.swing.JTextField();
        jTextNPlazas = new javax.swing.JTextField();
        jBotonAnadir = new javax.swing.JButton();
        jTextCapacidad = new javax.swing.JTextField();
        jBotonVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaVeh = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gestión de vehículos en Stock");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jTextMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));
        jPanel1.add(jTextMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 141, -1));

        jTipoVeh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Turismo", "Furgoneta" }));
        jTipoVeh.setOpaque(false);
        jPanel1.add(jTipoVeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 30));

        jtextModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));
        jPanel1.add(jtextModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 141, -1));

        jTextColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));
        jPanel1.add(jTextColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 141, -1));

        jTextMotor.setBorder(javax.swing.BorderFactory.createTitledBorder("Motor"));
        jPanel1.add(jTextMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 141, -1));

        jTextNPlazas.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº Plazas"));
        jPanel1.add(jTextNPlazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 141, -1));

        jBotonAnadir.setText("Añadir vehículo");
        jBotonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(jBotonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 53, -1, 30));

        jTextCapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Capacidad"));
        jPanel1.add(jTextCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 100, 141, -1));

        jBotonVolver.setText("Volver atrás");
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jBotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 100, 30));

        jTablaVeh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Motor", "Color"
            }
        ));
        jTablaVeh.setName(""); // NOI18N
        jTablaVeh.setRowHeight(30);
        jScrollPane2.setViewportView(jTablaVeh);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       if(jTipoVeh.getSelectedItem().equals("Furgoneta")){
           jTextNPlazas.setVisible(false);
           jTextCapacidad.setVisible(true);
       }else{
           jTextNPlazas.setVisible(true);
           jTextCapacidad.setVisible(false);
       }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jBotonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAnadirActionPerformed
        
        if(jTipoVeh.getSelectedItem().equals("Furgoneta")){
            Furgoneta miFurgoneta = new Furgoneta(jTextMarca.getText(), jtextModelo.getText(),
            jTextColor.getText(), jTextMotor.getText(), jTextCapacidad.getText(), 2);
            veh.add(miFurgoneta);
            ListaFurgonetas.mLista.add_coche(miFurgoneta);
            mostrar();
        }else{
            Coche miCoche = new Coche(jTextMarca.getText(), jtextModelo.getText(),
            jTextColor.getText(), jTextMotor.getText(), jTextNPlazas.getText(), 1);
            veh.add(miCoche);
            ListaCoches.milista.add_coche(miCoche);
            mostrar();
        }
    }//GEN-LAST:event_jBotonAnadirActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        Ges vGes = new Ges();
        vGes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBotonVolverActionPerformed

    
    public void mostrar(){
        String matriz [][] = new String [veh.size()][4];
        
        for (int i = 0; i < veh.size(); i++) {
            matriz[i][0] = veh.get(i).getMarca();
            matriz[i][1] = veh.get(i).getModelo();
            matriz[i][2] = veh.get(i).getMotor();
            matriz[i][3] = veh.get(i).getColor();
            
        }
        
        jTablaVeh.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Marca", "Modelo", "Motor", "Color"
            }
        ));
        
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonAnadir;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaVeh;
    private javax.swing.JTextField jTextCapacidad;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextMotor;
    private javax.swing.JTextField jTextNPlazas;
    private javax.swing.JComboBox jTipoVeh;
    private javax.swing.JTextField jtextModelo;
    // End of variables declaration//GEN-END:variables
}