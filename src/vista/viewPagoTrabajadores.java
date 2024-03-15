package vista;

import controlador.registroDAO;
import java.util.Date;
import javax.swing.JOptionPane;
import static vista.main.ShowJPanel;

public class viewPagoTrabajadores extends javax.swing.JPanel {

    public static registroDAO lista = new registroDAO();

    public viewPagoTrabajadores() {
        initComponents();
        ocultar();
    }

    public static void mostrar(int trabajador, Date fechaInicio, Date fechaFin) {
        tbDetalle.setModel(lista.mostrarTabla(lista.filtrar(trabajador, fechaInicio, fechaFin)));
        txtTotal.setText(String.valueOf(lista.obtenerPagoTrabajador(trabajador, fechaInicio, fechaFin)));
        ajustarColumnas();
    }

    public static void ajustarColumnas() {
        tbDetalle.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbDetalle.getColumnModel().getColumn(1).setPreferredWidth(140);
        tbDetalle.getColumnModel().getColumn(2).setPreferredWidth(160);
        tbDetalle.getColumnModel().getColumn(3).setPreferredWidth(160);
        tbDetalle.getColumnModel().getColumn(4).setPreferredWidth(60);
        tbDetalle.getColumnModel().getColumn(5).setPreferredWidth(90);
        tbDetalle.getColumnModel().getColumn(6).setPreferredWidth(30);
    }

    public static void ocultar() {
        scrollTablePagoTrabajadores.setVisible(false);
        tbDetalle.setVisible(false);
        lblTotal.setVisible(false);
        txtTotal.setVisible(false);
        btnRealizarPago.setVisible(false);
    }

    public void mostrarDetalle() {
        scrollTablePagoTrabajadores.setVisible(true);
        tbDetalle.setVisible(true);
        lblTotal.setVisible(true);
        txtTotal.setVisible(true);
        txtTotal.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblNombresyApellidos = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        scrollTablePagoTrabajadores = new javax.swing.JScrollPane();
        tbDetalle = new RSMaterialComponent.RSTableMetroCustom();
        btnRealizarPago = new newscomponents.RSButtonFlat_new();
        lblTitle = new javax.swing.JLabel();
        dpFechaInicio = new com.toedter.calendar.JDateChooser();
        dpFechaFin = new com.toedter.calendar.JDateChooser();
        lblBuscar = new RSMaterialComponent.RSLabelIcon();
        lblIntervalo2 = new javax.swing.JLabel();
        txtNombresyApellidos = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lblIntervalo1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        separadorTitle1 = new javax.swing.JSeparator();
        btnMostrarDetalle = new newscomponents.RSButtonFlat_new();
        lblCedula = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);

        lblNombresyApellidos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombresyApellidos.setText("Nombre y Apellidos:");
        panelPrincipal.add(lblNombresyApellidos);
        lblNombresyApellidos.setBounds(430, 180, 170, 22);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(60, 280, 868, 10);

        tbDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbDetalle.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbDetalle.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbDetalle.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbDetalle.setEffectHover(true);
        tbDetalle.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbDetalle.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbDetalle.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbDetalle.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbDetalle.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollTablePagoTrabajadores.setViewportView(tbDetalle);

        panelPrincipal.add(scrollTablePagoTrabajadores);
        scrollTablePagoTrabajadores.setBounds(60, 300, 868, 200);

        btnRealizarPago.setBackground(new java.awt.Color(241, 96, 33));
        btnRealizarPago.setText("Realizar pago");
        btnRealizarPago.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnRealizarPago);
        btnRealizarPago.setBounds(400, 590, 200, 40);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Pago de Trabajadores");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(260, 10, 490, 57);

        dpFechaInicio.setToolTipText("Fecha inicio");
        dpFechaInicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(dpFechaInicio);
        dpFechaInicio.setBounds(280, 100, 270, 40);

        dpFechaFin.setToolTipText("Fecha fin");
        dpFechaFin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(dpFechaFin);
        dpFechaFin.setBounds(600, 100, 270, 40);

        lblBuscar.setToolTipText("Filtrar trabajadores");
        lblBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        panelPrincipal.add(lblBuscar);
        lblBuscar.setBounds(880, 170, 50, 40);

        lblIntervalo2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblIntervalo2.setText("Seleccione un intervalo...");
        panelPrincipal.add(lblIntervalo2);
        lblIntervalo2.setBounds(60, 110, 220, 22);

        txtNombresyApellidos.setEditable(false);
        txtNombresyApellidos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombresyApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipal.add(txtNombresyApellidos);
        txtNombresyApellidos.setBounds(600, 170, 270, 40);

        txtTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipal.add(txtTotal);
        txtTotal.setBounds(820, 510, 110, 40);

        txtCedula.setEditable(false);
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipal.add(txtCedula);
        txtCedula.setBounds(230, 170, 190, 40);

        lblIntervalo1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblIntervalo1.setText("al");
        panelPrincipal.add(lblIntervalo1);
        lblIntervalo1.setBounds(570, 110, 20, 22);

        lblId.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblId.setText("Id:");
        panelPrincipal.add(lblId);
        lblId.setBounds(60, 180, 30, 22);

        lblTotal.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTotal.setText("Total:");
        panelPrincipal.add(lblTotal);
        lblTotal.setBounds(750, 520, 60, 22);
        panelPrincipal.add(separadorTitle1);
        separadorTitle1.setBounds(59, 76, 868, 10);

        btnMostrarDetalle.setBackground(new java.awt.Color(241, 96, 33));
        btnMostrarDetalle.setText("Mostrar detalle");
        btnMostrarDetalle.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnMostrarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDetalleActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnMostrarDetalle);
        btnMostrarDetalle.setBounds(390, 230, 200, 40);

        lblCedula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCedula.setText("Cedula:");
        panelPrincipal.add(lblCedula);
        lblCedula.setBounds(160, 180, 70, 22);

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipal.add(txtId);
        txtId.setBounds(90, 170, 60, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagoActionPerformed
        try {
            lista.cancelarTrabajador(Integer.parseInt(txtId.getText()), dpFechaInicio.getDate(), dpFechaFin.getDate(), Double.parseDouble(txtTotal.getText()));
            JOptionPane.showMessageDialog(null, "Pago generado exitosamente, codigo: " + lista.obtenerUltimoId(), "Información", JOptionPane.INFORMATION_MESSAGE);
            ShowJPanel(new viewPagoTrabajadores());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al generar el pago", "Información", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btnRealizarPagoActionPerformed

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        viewTrabajadoresCobrar var = new viewTrabajadoresCobrar();
        var.show();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnMostrarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDetalleActionPerformed
        if (dpFechaInicio.getDate() == null || dpFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione los intervalos deseados\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (metodos.funciones.compararFechas(dpFechaInicio.getDate(), dpFechaFin.getDate())) {
                if (txtId.getText().trim().length() > 0) {
                    mostrarDetalle();
                    mostrar(Integer.parseInt(txtId.getText()), dpFechaInicio.getDate(), dpFechaFin.getDate());
                    if (tbDetalle.getModel().getRowCount() > 0) {
                        btnRealizarPago.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un trabajador primero\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La fecha de Fin debe ser mayor o igual que la de Inicio\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnMostrarDetalleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnMostrarDetalle;
    public static newscomponents.RSButtonFlat_new btnRealizarPago;
    public static com.toedter.calendar.JDateChooser dpFechaFin;
    public static com.toedter.calendar.JDateChooser dpFechaInicio;
    private RSMaterialComponent.RSLabelIcon lblBuscar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIntervalo1;
    private javax.swing.JLabel lblIntervalo2;
    private javax.swing.JLabel lblNombresyApellidos;
    private javax.swing.JLabel lblTitle;
    public static javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelPrincipal;
    public static javax.swing.JScrollPane scrollTablePagoTrabajadores;
    private javax.swing.JSeparator separadorTitle;
    private javax.swing.JSeparator separadorTitle1;
    public static RSMaterialComponent.RSTableMetroCustom tbDetalle;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombresyApellidos;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
