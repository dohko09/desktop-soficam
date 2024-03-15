package vista;

import controlador.registroDAO;
import entidades.registro;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static vista.viewRegistroDiarioMain.mostrar;

public class viewRegistroDiario extends javax.swing.JPanel {

    public static registroDAO lista = new registroDAO();
    public String op;
    public int id;

    public viewRegistroDiario(String operacion) {
        initComponents();
        op = operacion;
        if (op.equals("Modificar")) {
            btnLimpiar.setEnabled(false);
            lblBuscar.setEnabled(false);
            dpFechaSalida.setVisible(false);
            rbAutomaticoSalida.setVisible(false);
            rbManualSalida.setVisible(false);
            lblSalida.setVisible(false);
        }
        if (op.equals("Registrar")) {
            btnLimpiar.setEnabled(false);
            lblBuscar.setEnabled(false);
            dpFechaEntrada.setEnabled(false);
            rbManual.setEnabled(false);
            rbAutomatico.setEnabled(false);
            dpFechaSalida.setVisible(true);
            rbAutomaticoSalida.setVisible(true);
            rbManualSalida.setVisible(true);
            lblSalida.setVisible(true);
        }
        if (op.equals("Insertar")) {
            btnLimpiar.setEnabled(true);
            lblBuscar.setEnabled(true);
            dpFechaSalida.setVisible(false);
            rbAutomaticoSalida.setVisible(false);
            rbManualSalida.setVisible(false);
            lblSalida.setVisible(false);
        }

    }

    public void horaAutomatica() {
        dpFechaEntrada.setDate(new Date());
    }

    public void horaManual() {
        dpFechaEntrada.setDate(null);
    }

    public void horaAutomaticaSalida() {
        dpFechaSalida.setDate(new Date());
    }

    public void horaManualSalida() {
        dpFechaSalida.setDate(null);
    }

    public void limpiar() {
        txtId.setText(null);
        txtCedula.setText(null);
        txtTrabajador.setText(null);
        dpFechaEntrada.setDate(null);
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

    public registro obtenerObjeto() {
        if (op.equals("Insertar")) {
            return new registro(Integer.parseInt(obtenerContenido(txtId)), metodos.funciones.convertirDateAFechayHora(dpFechaEntrada.getDate()));
        }
        if (op.equals("Modificar")) {
            return new registro(id, Integer.parseInt(obtenerContenido(txtId)), metodos.funciones.convertirDateAFechayHora(dpFechaEntrada.getDate()));
        } else {
            return new registro(id, metodos.funciones.convertirDateAFechayHora(dpFechaSalida.getDate()), 0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblEntrada = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        separadorContent = new javax.swing.JSeparator();
        btnLimpiar = new newscomponents.RSButtonFlat_new();
        btnSalir = new newscomponents.RSButtonFlat_new();
        btnGuardar = new newscomponents.RSButtonFlat_new();
        separadorFields = new javax.swing.JSeparator();
        dpFechaEntrada = new com.toedter.calendar.JDateChooser();
        lblDescripcion1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        lblBuscar = new RSMaterialComponent.RSLabelIcon();
        txtCedula = new javax.swing.JTextField();
        lblDescripcion2 = new javax.swing.JLabel();
        rbAutomatico = new javax.swing.JRadioButton();
        rbManual = new javax.swing.JRadioButton();
        separadorFields1 = new javax.swing.JSeparator();
        lblSalida = new javax.swing.JLabel();
        dpFechaSalida = new com.toedter.calendar.JDateChooser();
        rbAutomaticoSalida = new javax.swing.JRadioButton();
        rbManualSalida = new javax.swing.JRadioButton();

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

        lblEntrada.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblEntrada.setText("Entrada:");
        panelPrincipal.add(lblEntrada);
        lblEntrada.setBounds(100, 120, 68, 22);

        lblDescripcion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDescripcion.setText("Id:");
        panelPrincipal.add(lblDescripcion);
        lblDescripcion.setBounds(600, 120, 20, 22);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Información de Registro Diario");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(150, 10, 680, 57);
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
        panelPrincipal.add(separadorFields);
        separadorFields.setBounds(70, 210, 390, 10);

        dpFechaEntrada.setToolTipText("Fecha y hora de entrada");
        dpFechaEntrada.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        dpFechaEntrada.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(dpFechaEntrada);
        dpFechaEntrada.setBounds(180, 110, 270, 40);

        lblDescripcion1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDescripcion1.setText("Trabajador:");
        panelPrincipal.add(lblDescripcion1);
        lblDescripcion1.setBounds(530, 220, 95, 22);

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(txtId);
        txtId.setBounds(640, 110, 270, 40);

        txtTrabajador.setEditable(false);
        txtTrabajador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(txtTrabajador);
        txtTrabajador.setBounds(640, 210, 270, 40);

        lblBuscar.setToolTipText("Buscar especialidad");
        lblBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        panelPrincipal.add(lblBuscar);
        lblBuscar.setBounds(910, 110, 50, 40);

        txtCedula.setEditable(false);
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(txtCedula);
        txtCedula.setBounds(640, 160, 270, 40);

        lblDescripcion2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDescripcion2.setText("Cedula:");
        panelPrincipal.add(lblDescripcion2);
        lblDescripcion2.setBounds(560, 170, 62, 22);

        rbAutomatico.setBackground(new java.awt.Color(255, 255, 255));
        rbAutomatico.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbAutomatico.setText("Automatico");
        rbAutomatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAutomaticoMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbAutomatico);
        rbAutomatico.setBounds(220, 160, 120, 21);

        rbManual.setBackground(new java.awt.Color(255, 255, 255));
        rbManual.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbManual.setText("Manual");
        rbManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbManualMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbManual);
        rbManual.setBounds(370, 160, 90, 20);

        separadorFields1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPrincipal.add(separadorFields1);
        separadorFields1.setBounds(490, 97, 12, 219);

        lblSalida.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblSalida.setText("Salida:");
        panelPrincipal.add(lblSalida);
        lblSalida.setBounds(110, 250, 56, 22);

        dpFechaSalida.setToolTipText("Fecha y hora de salida");
        dpFechaSalida.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        dpFechaSalida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(dpFechaSalida);
        dpFechaSalida.setBounds(180, 240, 270, 40);

        rbAutomaticoSalida.setBackground(new java.awt.Color(255, 255, 255));
        rbAutomaticoSalida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbAutomaticoSalida.setText("Automatico");
        rbAutomaticoSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAutomaticoSalidaMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbAutomaticoSalida);
        rbAutomaticoSalida.setBounds(220, 290, 120, 21);

        rbManualSalida.setBackground(new java.awt.Color(255, 255, 255));
        rbManualSalida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbManualSalida.setText("Manual");
        rbManualSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbManualSalidaMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbManualSalida);
        rbManualSalida.setBounds(370, 290, 90, 20);

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
        if (op.equals("Registrar")) {
            if (comprobarContenido(txtId) && !dpFechaEntrada.getDateFormatString().isEmpty() && !dpFechaSalida.getDateFormatString().isEmpty()) {
                if (op.equals("Registrar")) {
                    lista.actualizarSalida(obtenerObjeto());
                }
                limpiar();
                mostrar();
                main.ShowJPanel(new viewRegistroDiarioMain());
            } else {
                JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos primero\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {
            if (comprobarContenido(txtId) && !dpFechaEntrada.getDateFormatString().isEmpty()) {
                if (op.equals("Insertar")) {
                    lista.insertar(obtenerObjeto());
                }
                if (op.equals("Modificar")) {
                    lista.actualizar(obtenerObjeto());
                }
                limpiar();
                mostrar();
                main.ShowJPanel(new viewRegistroDiarioMain());
            } else {
                JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos primero\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        limpiar();
        main.ShowJPanel(new viewRegistroDiarioMain());
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        viewTrabajadorSeleccion var = new viewTrabajadorSeleccion();
        var.show();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void rbManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbManualMouseClicked
        horaManual();
        rbAutomatico.setSelected(false);
    }//GEN-LAST:event_rbManualMouseClicked

    private void rbAutomaticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAutomaticoMouseClicked
        horaAutomatica();
        rbManual.setSelected(false);
    }//GEN-LAST:event_rbAutomaticoMouseClicked

    private void rbAutomaticoSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAutomaticoSalidaMouseClicked
        horaAutomaticaSalida();
        rbManualSalida.setSelected(false);
    }//GEN-LAST:event_rbAutomaticoSalidaMouseClicked

    private void rbManualSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbManualSalidaMouseClicked
        horaManualSalida();
        rbAutomaticoSalida.setSelected(false);
    }//GEN-LAST:event_rbManualSalidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnGuardar;
    private newscomponents.RSButtonFlat_new btnLimpiar;
    private newscomponents.RSButtonFlat_new btnSalir;
    public static com.toedter.calendar.JDateChooser dpFechaEntrada;
    public static com.toedter.calendar.JDateChooser dpFechaSalida;
    private RSMaterialComponent.RSLabelIcon lblBuscar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rbAutomatico;
    private javax.swing.JRadioButton rbAutomaticoSalida;
    private javax.swing.JRadioButton rbManual;
    private javax.swing.JRadioButton rbManualSalida;
    private javax.swing.JSeparator separadorContent;
    private javax.swing.JSeparator separadorFields;
    private javax.swing.JSeparator separadorFields1;
    private javax.swing.JSeparator separadorTitle;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
}
