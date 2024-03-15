package vista;

import controlador.trabajadorDAO;
import javax.swing.JOptionPane;
import static vista.viewPagoTrabajadores.ocultar;
import static vista.viewPagoTrabajadores.txtCedula;
import static vista.viewPagoTrabajadores.txtId;
import static vista.viewPagoTrabajadores.txtNombresyApellidos;

public class viewTrabajadoresCobrar extends javax.swing.JFrame {

    public static trabajadorDAO lista = new trabajadorDAO();

    public viewTrabajadoresCobrar() {
        initComponents();
        setLocationRelativeTo(null);
        mostrar();
        tbTrabajadoresCobrar.getColumnModel().getColumn(0).setPreferredWidth(20);
    }

    public static void mostrar() {
        tbTrabajadoresCobrar.setModel(lista.mostrarTablaTrabajadoresHabilitados(lista.listarTrabajadoresCobrar()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        scrollPanel = new javax.swing.JScrollPane();
        tbTrabajadoresCobrar = new RSMaterialComponent.RSTableMetroCustom();
        btnSeleccionar = new newscomponents.RSButtonFlat_new();
        btnCerrar = new newscomponents.RSButtonFlat_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(690, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(690, 600));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.setMaximumSize(new java.awt.Dimension(690, 600));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(690, 600));
        panelPrincipal.setName(""); // NOI18N
        panelPrincipal.setPreferredSize(new java.awt.Dimension(690, 600));
        panelPrincipal.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Lista de Trabajadores");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(112, 6, 480, 57);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(59, 69, 576, 10);

        tbTrabajadoresCobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTrabajadoresCobrar.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbTrabajadoresCobrar.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbTrabajadoresCobrar.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbTrabajadoresCobrar.setEffectHover(true);
        tbTrabajadoresCobrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbTrabajadoresCobrar.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbTrabajadoresCobrar.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbTrabajadoresCobrar.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbTrabajadoresCobrar.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollPanel.setViewportView(tbTrabajadoresCobrar);

        panelPrincipal.add(scrollPanel);
        scrollPanel.setBounds(59, 85, 576, 402);

        btnSeleccionar.setBackground(new java.awt.Color(241, 96, 33));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSeleccionar);
        btnSeleccionar.setBounds(142, 518, 200, 40);

        btnCerrar.setBackground(new java.awt.Color(241, 96, 33));
        btnCerrar.setText("Cerrar");
        btnCerrar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCerrar);
        btnCerrar.setBounds(360, 518, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        String id = "", cedula = "", nombre = "";
        int row = -1;
        row = tbTrabajadoresCobrar.getSelectedRow();
        if (row >= 0) {
            id = tbTrabajadoresCobrar.getValueAt(row, 0).toString();
            cedula = tbTrabajadoresCobrar.getValueAt(row, 1).toString();
            nombre = tbTrabajadoresCobrar.getValueAt(row, 2).toString();
            txtId.setText(id);
            txtCedula.setText(cedula);
            txtNombresyApellidos.setText(nombre);
            ocultar();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewTrabajadoresCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTrabajadoresCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTrabajadoresCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTrabajadoresCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new viewTrabajadoresCobrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnCerrar;
    private newscomponents.RSButtonFlat_new btnSeleccionar;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separadorTitle;
    public static RSMaterialComponent.RSTableMetroCustom tbTrabajadoresCobrar;
    // End of variables declaration//GEN-END:variables
}
