package vista;

import controlador.usuarioDAO;
import javax.swing.JOptionPane;
import static vista.viewUsuario.cbRol;
import static vista.viewUsuario.txtContrasena;
import static vista.viewUsuario.txtUsuario;

public class viewUsuarioMain extends javax.swing.JPanel {

    public static usuarioDAO lista = new usuarioDAO();

    public viewUsuarioMain() {
        initComponents();
        mostrar();
    }

    public static void mostrar() {
        usuarioDAO var = new usuarioDAO();
        tbUsuarios.setModel(var.mostrarTabla(lista.listar()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        scrollPanel = new javax.swing.JScrollPane();
        tbUsuarios = new RSMaterialComponent.RSTableMetroCustom();
        btnCrear = new newscomponents.RSButtonFlat_new();
        btnEliminar = new newscomponents.RSButtonFlat_new();
        btnModificar = new newscomponents.RSButtonFlat_new();

        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Usuarios");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(413, 6, 193, 57);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(59, 69, 868, 10);

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbUsuarios.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbUsuarios.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbUsuarios.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbUsuarios.setEffectHover(true);
        tbUsuarios.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbUsuarios.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbUsuarios.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbUsuarios.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbUsuarios.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollPanel.setViewportView(tbUsuarios);

        panelPrincipal.add(scrollPanel);
        scrollPanel.setBounds(59, 85, 868, 402);

        btnCrear.setBackground(new java.awt.Color(241, 96, 33));
        btnCrear.setText("Crear nuevo");
        btnCrear.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCrear);
        btnCrear.setBounds(187, 526, 200, 40);

        btnEliminar.setBackground(new java.awt.Color(241, 96, 33));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnEliminar);
        btnEliminar.setBounds(623, 526, 200, 40);

        btnModificar.setBackground(new java.awt.Color(241, 96, 33));
        btnModificar.setText("Modificar");
        btnModificar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnModificar);
        btnModificar.setBounds(405, 526, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        main.ShowJPanel(new viewUsuario("Insertar"));
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = -1, id = -1;
        row = tbUsuarios.getSelectedRow();
        if (row >= 0) {
            try {
                id = Integer.parseInt(tbUsuarios.getValueAt(row, 0).toString());
                lista.delete(id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Usuario esta relacionado/a con uno o \nmas registros", "Información", JOptionPane.WARNING_MESSAGE);
            }
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String usuario = "", contrasena = "", rol = "";
        int row = -1, id = -1;
        row = tbUsuarios.getSelectedRow();
        if (row >= 0) {
            id = Integer.parseInt(tbUsuarios.getValueAt(row, 0).toString());
            usuario = tbUsuarios.getValueAt(row, 1).toString();
            contrasena = tbUsuarios.getValueAt(row, 2).toString();
            rol = tbUsuarios.getValueAt(row, 3).toString();
            viewUsuario var = new viewUsuario("Modificar");
            var.id = id;
            main.ShowJPanel(var);
            txtUsuario.setText(usuario);
            txtContrasena.setText(contrasena);
            cbRol.setSelectedItem(rol);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnCrear;
    private newscomponents.RSButtonFlat_new btnEliminar;
    private newscomponents.RSButtonFlat_new btnModificar;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separadorTitle;
    public static RSMaterialComponent.RSTableMetroCustom tbUsuarios;
    // End of variables declaration//GEN-END:variables
}
