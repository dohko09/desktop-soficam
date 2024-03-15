package vista;

import controlador.trabajadorDAO;
import entidades.trabajador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static vista.viewTrabajadorMain.mostrar;

public class viewTrabajador extends javax.swing.JPanel {

    public static trabajadorDAO lista = new trabajadorDAO();
    public String op;
    public int id;

    public viewTrabajador(String operacion) {
        initComponents();
        op = operacion;
    }

    public void limpiar() {
        txtCedula.setText(null);
        txtNombre.setText(null);
        txtApellidoPaterno.setText(null);
        txtApellidoMaterno.setText(null);
        txtTelefono.setText(null);
        txtDireccion.setText(null);
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

    public trabajador obtenerObjeto() {
        if (op.equals("Insertar")) {
            return new trabajador(obtenerContenido(txtCedula), obtenerContenido(txtNombre), obtenerContenido(txtApellidoPaterno),
                    obtenerContenido(txtApellidoMaterno), obtenerContenido(txtTelefono), txtDireccion.getText().trim());
        } else {
            return new trabajador(id, obtenerContenido(txtCedula), obtenerContenido(txtNombre), obtenerContenido(txtApellidoPaterno),
                    obtenerContenido(txtApellidoMaterno), obtenerContenido(txtTelefono), txtDireccion.getText().trim());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        separadorContent = new javax.swing.JSeparator();
        btnLimpiar = new newscomponents.RSButtonFlat_new();
        btnSalir = new newscomponents.RSButtonFlat_new();
        btnGuardar = new newscomponents.RSButtonFlat_new();
        separadorFields = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setLayout(null);

        lblCedula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCedula.setText("Cedula:");
        panelPrincipal.add(lblCedula);
        lblCedula.setBounds(146, 166, 62, 22);

        txtCedula.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        panelPrincipal.add(txtCedula);
        txtCedula.setBounds(220, 148, 270, 40);

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelPrincipal.add(txtNombre);
        txtNombre.setBounds(220, 194, 270, 40);

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        panelPrincipal.add(lblNombre);
        lblNombre.setBounds(137, 212, 71, 22);

        txtApellidoPaterno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });
        panelPrincipal.add(txtApellidoPaterno);
        txtApellidoPaterno.setBounds(220, 240, 270, 40);

        lblApellidoPaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblApellidoPaterno.setText("Apellido Paterno:");
        panelPrincipal.add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(67, 258, 141, 22);

        txtApellidoMaterno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });
        panelPrincipal.add(txtApellidoMaterno);
        txtApellidoMaterno.setBounds(220, 287, 270, 40);

        lblApellidoMaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblApellidoMaterno.setText("Apellido Materno:");
        panelPrincipal.add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(63, 305, 145, 22);

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        panelPrincipal.add(txtTelefono);
        txtTelefono.setBounds(662, 148, 270, 40);

        lblTelefono.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTelefono.setText("Telefono:");
        panelPrincipal.add(lblTelefono);
        lblTelefono.setBounds(573, 166, 77, 22);

        lblDireccion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDireccion.setText("Direccion:");
        panelPrincipal.add(lblDireccion);
        lblDireccion.setBounds(568, 213, 82, 22);

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDireccion.setLineWrap(true);
        txtDireccion.setRows(5);
        scrollPanel.setViewportView(txtDireccion);

        panelPrincipal.add(scrollPanel);
        scrollPanel.setBounds(662, 213, 270, 141);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Información Trabajador");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(237, 6, 512, 57);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(64, 69, 868, 10);
        panelPrincipal.add(separadorContent);
        separadorContent.setBounds(64, 372, 868, 10);

        btnLimpiar.setBackground(new java.awt.Color(241, 96, 33));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnLimpiar);
        btnLimpiar.setBounds(403, 446, 200, 40);

        btnSalir.setBackground(new java.awt.Color(241, 96, 33));
        btnSalir.setText("Salir");
        btnSalir.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSalir);
        btnSalir.setBounds(635, 446, 200, 40);

        btnGuardar.setBackground(new java.awt.Color(241, 96, 33));
        btnGuardar.setText("Guardar");
        btnGuardar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnGuardar);
        btnGuardar.setBounds(169, 446, 200, 40);

        separadorFields.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPrincipal.add(separadorFields);
        separadorFields.setBounds(532, 148, 12, 206);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (comprobarContenido(txtCedula) && comprobarContenido(txtNombre) && comprobarContenido(txtApellidoPaterno) && comprobarContenido(txtApellidoMaterno) && comprobarContenido(txtTelefono) && !txtDireccion.getText().isEmpty()) {
            if (op.equals("Insertar")) {
                lista.insertar(obtenerObjeto());
            } else {
                lista.actualizar(obtenerObjeto());
            }
            limpiar();
            mostrar();
            main.ShowJPanel(new viewTrabajadorMain());
        } else {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        limpiar();
        main.ShowJPanel(new viewTrabajadorMain());
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtCedula.getText().length() >= 10 && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // consume el evento para que el carácter no se agregue al campo de texto
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtTelefono.getText().length() >= 10 && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // consume el evento para que el carácter no se agregue al campo de texto
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // consume el evento para que el carácter no se agregue al campo de texto
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // consume el evento para que el carácter no se agregue al campo de texto
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // consume el evento para que el carácter no se agregue al campo de texto
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnGuardar;
    private newscomponents.RSButtonFlat_new btnLimpiar;
    private newscomponents.RSButtonFlat_new btnSalir;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separadorContent;
    private javax.swing.JSeparator separadorFields;
    private javax.swing.JSeparator separadorTitle;
    public static javax.swing.JTextField txtApellidoMaterno;
    public static javax.swing.JTextField txtApellidoPaterno;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextArea txtDireccion;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
