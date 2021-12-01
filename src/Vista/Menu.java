/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author sebas
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_agregar = new javax.swing.JMenuItem();
        jmi_actualizar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_calculadora = new javax.swing.JMenuItem();
        jmi_imc = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Seleccione");

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_eliminar);

        jmi_agregar.setText("Agregar");
        jmi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_agregar);

        jmi_actualizar.setText("Actualizar");
        jmi_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_actualizar);

        jMenuItem3.setText("Listar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Otros");

        jmi_calculadora.setText("Calculadora");
        jmi_calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_calculadoraActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_calculadora);

        jmi_imc.setText("Calculo Imc");
        jmi_imc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_imcActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_imc);
        jMenu2.add(jSeparator1);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_salir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_imcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_imcActionPerformed
       
        new Imc().setVisible(true);
    }//GEN-LAST:event_jmi_imcActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_calculadoraActionPerformed
        
         new Calculadora().setVisible(true);
    }//GEN-LAST:event_jmi_calculadoraActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        new Eliminar().setVisible(true);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarActionPerformed
        new Agregar().setVisible(true);
    }//GEN-LAST:event_jmi_agregarActionPerformed

    private void jmi_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarActionPerformed
        new Actualizar().setVisible(true);
    }//GEN-LAST:event_jmi_actualizarActionPerformed

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
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmi_actualizar;
    private javax.swing.JMenuItem jmi_agregar;
    private javax.swing.JMenuItem jmi_calculadora;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_imc;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
