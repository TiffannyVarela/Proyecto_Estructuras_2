/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiffa
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_newarch = new javax.swing.JMenuItem();
        jmi_salvararch = new javax.swing.JMenuItem();
        jmi_closearch = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();
        jm_campos = new javax.swing.JMenu();
        jmi_newcampo = new javax.swing.JMenuItem();
        jmi_listarcampo = new javax.swing.JMenuItem();
        jmi_modcampo = new javax.swing.JMenuItem();
        jmi_borrarcampo = new javax.swing.JMenuItem();
        jm_registros = new javax.swing.JMenu();
        jmi_introregis = new javax.swing.JMenuItem();
        jmi_modregis = new javax.swing.JMenuItem();
        jmi_buscarregis = new javax.swing.JMenuItem();
        jmi_borrarregis = new javax.swing.JMenuItem();
        jmi_listarregis = new javax.swing.JMenuItem();
        jm_indices = new javax.swing.JMenu();
        jmi_crearind = new javax.swing.JMenuItem();
        jmi_reindex = new javax.swing.JMenuItem();
        jm_estandar = new javax.swing.JMenu();
        jmi_expexcel = new javax.swing.JMenuItem();
        jmi_expXML = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jm_archivo.setText("Archivo");

        jmi_newarch.setText("Nuevo Archivo");
        jm_archivo.add(jmi_newarch);

        jmi_salvararch.setText("Salvar Archivo");
        jm_archivo.add(jmi_salvararch);

        jmi_closearch.setText("Cerrar Archivo");
        jm_archivo.add(jmi_closearch);

        jmi_salir.setText("Salir");
        jm_archivo.add(jmi_salir);

        jMenuBar1.add(jm_archivo);

        jm_campos.setText("Campos");

        jmi_newcampo.setText("Crear  Campos");
        jm_campos.add(jmi_newcampo);

        jmi_listarcampo.setText("Listar Campos");
        jm_campos.add(jmi_listarcampo);

        jmi_modcampo.setText("Modificar Campos");
        jm_campos.add(jmi_modcampo);

        jmi_borrarcampo.setText("Borrar Campos");
        jm_campos.add(jmi_borrarcampo);

        jMenuBar1.add(jm_campos);

        jm_registros.setText("Registros");

        jmi_introregis.setText("Introducir Registros");
        jm_registros.add(jmi_introregis);

        jmi_modregis.setText("Modificar Registros");
        jm_registros.add(jmi_modregis);

        jmi_buscarregis.setText("Buscar Registros");
        jm_registros.add(jmi_buscarregis);

        jmi_borrarregis.setText("Borrar Registros");
        jm_registros.add(jmi_borrarregis);

        jmi_listarregis.setText("Listar Registros");
        jm_registros.add(jmi_listarregis);

        jMenuBar1.add(jm_registros);

        jm_indices.setText("Indices");

        jmi_crearind.setText("Crear Indices");
        jm_indices.add(jmi_crearind);

        jmi_reindex.setText("Re Indexar Archivos");
        jm_indices.add(jmi_reindex);

        jMenuBar1.add(jm_indices);

        jm_estandar.setText("Estandarizacion");

        jmi_expexcel.setText("Exportar Excel");
        jm_estandar.add(jmi_expexcel);

        jmi_expXML.setText("Exportar XML con Schema");
        jm_estandar.add(jmi_expXML);

        jMenuBar1.add(jm_estandar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1154, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_campos;
    private javax.swing.JMenu jm_estandar;
    private javax.swing.JMenu jm_indices;
    private javax.swing.JMenu jm_registros;
    private javax.swing.JMenuItem jmi_borrarcampo;
    private javax.swing.JMenuItem jmi_borrarregis;
    private javax.swing.JMenuItem jmi_buscarregis;
    private javax.swing.JMenuItem jmi_closearch;
    private javax.swing.JMenuItem jmi_crearind;
    private javax.swing.JMenuItem jmi_expXML;
    private javax.swing.JMenuItem jmi_expexcel;
    private javax.swing.JMenuItem jmi_introregis;
    private javax.swing.JMenuItem jmi_listarcampo;
    private javax.swing.JMenuItem jmi_listarregis;
    private javax.swing.JMenuItem jmi_modcampo;
    private javax.swing.JMenuItem jmi_modregis;
    private javax.swing.JMenuItem jmi_newarch;
    private javax.swing.JMenuItem jmi_newcampo;
    private javax.swing.JMenuItem jmi_reindex;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JMenuItem jmi_salvararch;
    // End of variables declaration//GEN-END:variables
}
