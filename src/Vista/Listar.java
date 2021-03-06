/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Registro;
import Modelo.Colaborador;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matiasossiocampos
 */
public class Listar extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     */
    public Listar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxt_buscarcodigotrabajador = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar");

        jLabel1.setText("Codigo trabajador");

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jtbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigotrabajador", "Nombre", "Apellido", "Sueldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_buscarcodigotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_buscar)
                .addContainerGap(109, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_buscarcodigotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
       
        String nombre,apellido;
        int codigotrabajador, sueldo;
       
        Registro reg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_datos.getModel(); //importar table model y castear
        
        try {
            
            codigotrabajador = Integer.parseInt(this.jtxt_buscarcodigotrabajador.getText());
            
        } catch (Exception e) {
            
            codigotrabajador = 0;
        }
        
        modelo.setRowCount(0);
        
        if (codigotrabajador == 0) { //listar todos los datos de la tabla o sea uso de select*
            List<Colaborador>lista = reg.buscarTodos();
            
            for (Colaborador colab : lista) {
                codigotrabajador = colab.getCodigoTrabajador();
                nombre = colab.getNombre();
                apellido = colab.getApellido();
                sueldo = colab.getSueldo();
                
                
                modelo.addRow(new Object [] {codigotrabajador,nombre,apellido,sueldo});
                
            }
            
        } else{ 
            
            Colaborador colaborador = reg.buscarPorCodigoTrabajador(codigotrabajador);
            codigotrabajador = colaborador.getCodigoTrabajador();
            nombre = colaborador.getNombre();
            apellido =colaborador.getApellido();
            sueldo = colaborador.getSueldo();
            
            
            modelo.addRow(new Object [] {codigotrabajador,nombre,apellido,sueldo});
            
            
            
    }//GEN-LAST:event_jbtn_buscarActionPerformed
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Listar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JTable jtbl_datos;
    private javax.swing.JTextField jtxt_buscarcodigotrabajador;
    // End of variables declaration//GEN-END:variables
}
