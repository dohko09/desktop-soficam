package vista;

import controlador.trabajadorDAO;
import javax.swing.JOptionPane;
import static vista.viewTrabajador.txtApellidoMaterno;
import static vista.viewTrabajador.txtApellidoPaterno;
import static vista.viewTrabajador.txtCedula;
import static vista.viewTrabajador.txtDireccion;
import static vista.viewTrabajador.txtNombre;
import static vista.viewTrabajador.txtTelefono;

public class viewTrabajadorMain extends javax.swing.JPanel {

    public static trabajadorDAO lista = new trabajadorDAO();

    public viewTrabajadorMain() {
        initComponents();
        mostrar();

    }

    public static void mostrar() {
        trabajadorDAO var = new trabajadorDAO();
        tbTrabajador.setModel(var.mostrarTabla(lista.listar()));
        tbTrabajador.getColumnModel().getColumn(6).setPreferredWidth(250);
    }

    public static void filtrar(String cadena) {
        trabajadorDAO var = new trabajadorDAO();
        tbTrabajador.setModel(var.mostrarTabla(lista.filtrar(cadena)));
        tbTrabajador.getColumnModel().getColumn(6).setPreferredWidth(250);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        scrollPanel = new javax.swing.JScrollPane();
        tbTrabajador = new RSMaterialComponent.RSTableMetroCustom();
        btnCrear = new newscomponents.RSButtonFlat_new();
        btnEliminar = new newscomponents.RSButtonFlat_new();
        btnModificar = new newscomponents.RSButtonFlat_new();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();

        setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Listado de Trabajadores");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(246, 6, 525, 57);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(59, 69, 879, 10);

        tbTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTrabajador.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbTrabajador.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbTrabajador.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbTrabajador.setEffectHover(true);
        tbTrabajador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbTrabajador.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbTrabajador.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbTrabajador.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbTrabajador.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollPanel.setViewportView(tbTrabajador);

        panelPrincipal.add(scrollPanel);
        scrollPanel.setBounds(58, 143, 880, 402);

        btnCrear.setBackground(new java.awt.Color(241, 96, 33));
        btnCrear.setText("Crear nuevo");
        btnCrear.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCrear);
        btnCrear.setBounds(187, 584, 200, 40);

        btnEliminar.setBackground(new java.awt.Color(241, 96, 33));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnEliminar);
        btnEliminar.setBounds(623, 584, 200, 40);

        btnModificar.setBackground(new java.awt.Color(241, 96, 33));
        btnModificar.setText("Modificar");
        btnModificar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnModificar);
        btnModificar.setBounds(405, 584, 200, 40);

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setToolTipText("Ingrese número de cédula");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtBuscar);
        txtBuscar.setBounds(730, 90, 160, 40);

        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        lblBuscar.setToolTipText("Buscar trabajador");
        panelPrincipal.add(lblBuscar);
        lblBuscar.setBounds(900, 90, 32, 40);

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
        main.ShowJPanel(new viewTrabajador("Insertar"));
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String cedula = "", nombre = "", apellido_paterno = "", apellido_materno = "", telefono = "", direccion = "";
        int row = -1, id = -1;
        row = tbTrabajador.getSelectedRow();
        if (row >= 0) {
            id = Integer.parseInt(tbTrabajador.getValueAt(row, 0).toString());
            cedula = tbTrabajador.getValueAt(row, 1).toString();
            nombre = tbTrabajador.getValueAt(row, 2).toString();
            apellido_paterno = tbTrabajador.getValueAt(row, 3).toString();
            apellido_materno = tbTrabajador.getValueAt(row, 4).toString();
            telefono = tbTrabajador.getValueAt(row, 5).toString();
            direccion = tbTrabajador.getValueAt(row, 6).toString();
            viewTrabajador var = new viewTrabajador("Modificar");
            var.id = id;
            main.ShowJPanel(var);
            txtCedula.setText(cedula);
            txtNombre.setText(nombre);
            txtApellidoPaterno.setText(apellido_paterno);
            txtApellidoMaterno.setText(apellido_materno);
            txtTelefono.setText(telefono);
            txtDireccion.setText(direccion);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = -1, id = -1;
        row = tbTrabajador.getSelectedRow();
        if (row >= 0) {
            try {
                id = Integer.parseInt(tbTrabajador.getValueAt(row, 0).toString());
                lista.delete(id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Trabajador esta relacionado/a con uno o \nmas registros", "Información", JOptionPane.WARNING_MESSAGE);
            }
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String variable = txtBuscar.getText().trim();
        if (variable.length() == 0) {
            mostrar();
        } else {
            filtrar(variable);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnCrear;
    private newscomponents.RSButtonFlat_new btnEliminar;
    private newscomponents.RSButtonFlat_new btnModificar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separadorTitle;
    public static RSMaterialComponent.RSTableMetroCustom tbTrabajador;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
