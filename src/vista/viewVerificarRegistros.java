package vista;

import controlador.registroDAO;
import java.util.Date;
import javax.swing.JOptionPane;

public class viewVerificarRegistros extends javax.swing.JPanel {

    public static registroDAO lista = new registroDAO();

    public viewVerificarRegistros() {
        initComponents();
        ocultar();
    }

    public static void mostrarPorId(Date fechaInicio, Date fechaFin) {
        tbRegistros.setModel(lista.mostrarTabla(lista.obtenerRegistrosPorId(fechaInicio, fechaFin)));
        ajustarColumnas();
    }

    public static void mostrarPorTrabajador(Date fechaInicio, Date fechaFin) {
        tbRegistros.setModel(lista.mostrarTabla(lista.obtenerRegistrosPorTrabajador(fechaInicio, fechaFin)));
        ajustarColumnas();
    }

    public static void ajustarColumnas() {
        tbRegistros.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbRegistros.getColumnModel().getColumn(1).setPreferredWidth(140);
        tbRegistros.getColumnModel().getColumn(2).setPreferredWidth(160);
        tbRegistros.getColumnModel().getColumn(3).setPreferredWidth(160);
        tbRegistros.getColumnModel().getColumn(4).setPreferredWidth(60);
        tbRegistros.getColumnModel().getColumn(5).setPreferredWidth(90);
        tbRegistros.getColumnModel().getColumn(6).setPreferredWidth(30);
    }

    public static void ocultar() {
        scrollTablePagoTrabajadores.setVisible(false);
        tbRegistros.setVisible(false);
        lblOrdenarPor.setVisible(false);
        rbId.setVisible(false);
        rbTrabajador.setVisible(false);
    }

    public void mostrarDetalle() {
        scrollTablePagoTrabajadores.setVisible(true);
        tbRegistros.setVisible(true);
        lblOrdenarPor.setVisible(true);
        rbId.setVisible(true);
        rbTrabajador.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        separadorTitle = new javax.swing.JSeparator();
        scrollTablePagoTrabajadores = new javax.swing.JScrollPane();
        tbRegistros = new RSMaterialComponent.RSTableMetroCustom();
        lblTitle = new javax.swing.JLabel();
        dpFechaInicio = new com.toedter.calendar.JDateChooser();
        dpFechaFin = new com.toedter.calendar.JDateChooser();
        lblIntervalo = new javax.swing.JLabel();
        lblOrdenarPor = new javax.swing.JLabel();
        separadorTitle1 = new javax.swing.JSeparator();
        btnBuscarRegistros = new newscomponents.RSButtonFlat_new();
        rbTrabajador = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        lblAl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(60, 210, 868, 10);

        tbRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbRegistros.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbRegistros.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbRegistros.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbRegistros.setEffectHover(true);
        tbRegistros.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbRegistros.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbRegistros.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbRegistros.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbRegistros.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollTablePagoTrabajadores.setViewportView(tbRegistros);

        panelPrincipal.add(scrollTablePagoTrabajadores);
        scrollTablePagoTrabajadores.setBounds(60, 230, 868, 360);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Registro de trabajo");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(290, 10, 420, 57);

        dpFechaInicio.setToolTipText("Fecha inicio");
        dpFechaInicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(dpFechaInicio);
        dpFechaInicio.setBounds(310, 90, 270, 40);

        dpFechaFin.setToolTipText("Fecha fin");
        dpFechaFin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.add(dpFechaFin);
        dpFechaFin.setBounds(630, 90, 270, 40);

        lblIntervalo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblIntervalo.setText("Seleccione un intervalo...");
        panelPrincipal.add(lblIntervalo);
        lblIntervalo.setBounds(90, 100, 220, 22);

        lblOrdenarPor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblOrdenarPor.setText("Ordenar por:");
        panelPrincipal.add(lblOrdenarPor);
        lblOrdenarPor.setBounds(660, 610, 102, 20);
        panelPrincipal.add(separadorTitle1);
        separadorTitle1.setBounds(59, 76, 868, 10);

        btnBuscarRegistros.setBackground(new java.awt.Color(241, 96, 33));
        btnBuscarRegistros.setText("Buscar registros");
        btnBuscarRegistros.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnBuscarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRegistrosActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnBuscarRegistros);
        btnBuscarRegistros.setBounds(420, 160, 200, 40);

        rbTrabajador.setBackground(new java.awt.Color(255, 255, 255));
        rbTrabajador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbTrabajador.setText("Trabajador");
        rbTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTrabajadorMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbTrabajador);
        rbTrabajador.setBounds(770, 607, 120, 30);

        rbId.setBackground(new java.awt.Color(255, 255, 255));
        rbId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbId.setText("Id");
        rbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbIdMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbId);
        rbId.setBounds(890, 607, 40, 30);

        lblAl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAl.setText("al");
        panelPrincipal.add(lblAl);
        lblAl.setBounds(600, 100, 20, 22);

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

    private void btnBuscarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRegistrosActionPerformed
        if (dpFechaInicio.getDate() == null || dpFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione los intervalos deseados\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (metodos.funciones.compararFechas(dpFechaInicio.getDate(), dpFechaFin.getDate())) {
                mostrarDetalle();
                mostrarPorId(dpFechaInicio.getDate(), dpFechaFin.getDate());
                rbId.setSelected(true);
                rbTrabajador.setSelected(false);
            } else {
                JOptionPane.showMessageDialog(null, "La fecha de Fin debe ser mayor o igual que la de Inicio\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarRegistrosActionPerformed

    private void rbTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTrabajadorMouseClicked
        if (dpFechaInicio.getDate() == null || dpFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione los intervalos deseados\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            rbTrabajador.setSelected(false);
        } else {
            rbId.setSelected(false);
            rbTrabajador.setSelected(true);
            mostrarPorTrabajador(dpFechaInicio.getDate(), dpFechaFin.getDate());
        }

    }//GEN-LAST:event_rbTrabajadorMouseClicked

    private void rbIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbIdMouseClicked
        if (dpFechaInicio.getDate() == null || dpFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione los intervalos deseados\nvuelva a intentarlo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            rbId.setSelected(false);
        } else {
            rbTrabajador.setSelected(false);
            rbId.setSelected(true);
            mostrarPorId(dpFechaInicio.getDate(), dpFechaFin.getDate());
        }

    }//GEN-LAST:event_rbIdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnBuscarRegistros;
    public static com.toedter.calendar.JDateChooser dpFechaFin;
    public static com.toedter.calendar.JDateChooser dpFechaInicio;
    private javax.swing.JLabel lblAl;
    private javax.swing.JLabel lblIntervalo;
    public static javax.swing.JLabel lblOrdenarPor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    public static javax.swing.JRadioButton rbId;
    public static javax.swing.JRadioButton rbTrabajador;
    public static javax.swing.JScrollPane scrollTablePagoTrabajadores;
    private javax.swing.JSeparator separadorTitle;
    private javax.swing.JSeparator separadorTitle1;
    public static RSMaterialComponent.RSTableMetroCustom tbRegistros;
    // End of variables declaration//GEN-END:variables
}
