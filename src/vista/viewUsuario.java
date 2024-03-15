package vista;

import controlador.usuarioDAO;
import entidades.usuario;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static vista.viewUsuarioMain.mostrar;

public class viewUsuario extends javax.swing.JPanel {

    public static usuarioDAO lista = new usuarioDAO();
    public String op;
    public int id;

    public viewUsuario(String operacion) {
        initComponents();
        op = operacion;
    }

    public void limpiar() {
        txtUsuario.setText(null);
        txtContrasena.setText(null);
        cbRol.setSelectedIndex(-1);
    }

    public boolean comprobarContenido(JTextField caja) {
        if (!caja.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    public String obtenerContenido(JTextField caja) {
        return caja.getText().trim();
    }

    public usuario obtenerObjeto() {
        if (op.equals("Insertar")) {
            return new usuario(obtenerContenido(txtUsuario), obtenerContenido(txtContrasena), cbRol.getSelectedItem().toString());
        } else {
            return new usuario(id, obtenerContenido(txtUsuario), obtenerContenido(txtContrasena), cbRol.getSelectedItem().toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        separadorContent = new javax.swing.JSeparator();
        btnLimpiar = new newscomponents.RSButtonFlat_new();
        btnSalir = new newscomponents.RSButtonFlat_new();
        btnGuardar = new newscomponents.RSButtonFlat_new();
        separadorFields = new javax.swing.JSeparator();
        cbRol = new RSMaterialComponent.RSComboBoxMaterial();
        txtContrasena = new javax.swing.JPasswordField();
        lblVer = new necesario.LabelIcon();

        setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCedula.setText("Usuario:");
        panelPrincipal.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 154, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 136, 270, 40));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombre.setText("Contraseña:");
        panelPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 197, -1, -1));

        lblApellidoPaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblApellidoPaterno.setText("Rol:");
        panelPrincipal.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 149, -1, -1));

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Información Usuario");
        panelPrincipal.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));
        panelPrincipal.add(separadorTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 69, 868, 10));
        panelPrincipal.add(separadorContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 310, 868, 10));

        btnLimpiar.setBackground(new java.awt.Color(241, 96, 33));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 384, -1, -1));

        btnSalir.setBackground(new java.awt.Color(241, 96, 33));
        btnSalir.setText("Salir");
        btnSalir.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 384, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(241, 96, 33));
        btnGuardar.setText("Guardar");
        btnGuardar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 384, -1, -1));

        separadorFields.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPrincipal.add(separadorFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 119, 12, 133));

        cbRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "administrador", "secretario/a" }));
        cbRol.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 131, 270, -1));

        txtContrasena.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panelPrincipal.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 188, 270, 40));

        lblVer.setToolTipText("Ver/ocultar contraseña");
        lblVer.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE_CIRCLE_OUTLINE);
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerMouseClicked(evt);
            }
        });
        panelPrincipal.add(lblVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 188, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        limpiar();
        main.ShowJPanel(new viewUsuarioMain());
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (comprobarContenido(txtUsuario) && comprobarContenido(txtContrasena) && cbRol.getSelectedIndex() >= 0) {
            if (op.equals("Insertar")) {
                lista.insertar(obtenerObjeto());
            } else {
                lista.actualizar(obtenerObjeto());
            }
            limpiar();
            mostrar();
            main.ShowJPanel(new viewUsuarioMain());
        } else {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lblVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMouseClicked
        String password = txtContrasena.getText();
        JOptionPane.showMessageDialog(null, "Password: " + password, "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblVerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnGuardar;
    private newscomponents.RSButtonFlat_new btnLimpiar;
    private newscomponents.RSButtonFlat_new btnSalir;
    public static RSMaterialComponent.RSComboBoxMaterial cbRol;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitle;
    private necesario.LabelIcon lblVer;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator separadorContent;
    private javax.swing.JSeparator separadorFields;
    private javax.swing.JSeparator separadorTitle;
    public static javax.swing.JPasswordField txtContrasena;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
