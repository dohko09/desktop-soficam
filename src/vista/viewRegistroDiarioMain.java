package vista;

import controlador.registroDAO;
import controlador.trabajadorDAO;
import entidades.registro;
import entidades.trabajador;
import java.util.Date;
import javax.swing.JOptionPane;
import static vista.viewRegistroDiario.dpFechaEntrada;
import static vista.viewRegistroDiario.txtCedula;
import static vista.viewRegistroDiario.txtId;
import static vista.viewRegistroDiario.txtTrabajador;

public class viewRegistroDiarioMain extends javax.swing.JPanel {

    public static registroDAO lista = new registroDAO();
    public static trabajadorDAO listaAux = new trabajadorDAO();

    public static void ajustarColumnas() {
        tbRegistroDiario.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbRegistroDiario.getColumnModel().getColumn(1).setPreferredWidth(140);
        tbRegistroDiario.getColumnModel().getColumn(2).setPreferredWidth(160);
        tbRegistroDiario.getColumnModel().getColumn(3).setPreferredWidth(160);
        tbRegistroDiario.getColumnModel().getColumn(4).setPreferredWidth(60);
        tbRegistroDiario.getColumnModel().getColumn(5).setPreferredWidth(90);
        tbRegistroDiario.getColumnModel().getColumn(6).setPreferredWidth(30);
    }

    public viewRegistroDiarioMain() {
        initComponents();
        mostrar();
        rbPendiente.setSelected(true);
        ajustarColumnas();

    }

    public static void mostrar() {
        registroDAO var = new registroDAO();
        tbRegistroDiario.setModel(var.mostrarTabla(lista.listar()));
        ajustarColumnas();
    }

    public static void mostrarPendienteCompletado() {
        registroDAO var = new registroDAO();
        tbRegistroDiario.setModel(var.mostrarTabla(lista.listarPendienteCompletado()));
        ajustarColumnas();
    }

    public static void mostrarCompletado() {
        registroDAO var = new registroDAO();
        tbRegistroDiario.setModel(var.mostrarTabla(lista.listarCompletado()));
        ajustarColumnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        scrollPanel = new javax.swing.JScrollPane();
        tbRegistroDiario = new RSMaterialComponent.RSTableMetroCustom();
        btnEliminar = new newscomponents.RSButtonFlat_new();
        btnRegistrarSalida = new newscomponents.RSButtonFlat_new();
        rbTodos = new javax.swing.JRadioButton();
        rbPendiente = new javax.swing.JRadioButton();
        btnCrear = new newscomponents.RSButtonFlat_new();
        rbCompletado = new javax.swing.JRadioButton();
        btnModificarEntrada = new newscomponents.RSButtonFlat_new();

        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setName(""); // NOI18N
        panelPrincipal.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Registro diario de Trabajadores");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(160, 10, 690, 57);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(59, 76, 880, 10);

        tbRegistroDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbRegistroDiario.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbRegistroDiario.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbRegistroDiario.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbRegistroDiario.setEffectHover(true);
        tbRegistroDiario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbRegistroDiario.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbRegistroDiario.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbRegistroDiario.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbRegistroDiario.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollPanel.setViewportView(tbRegistroDiario);

        panelPrincipal.add(scrollPanel);
        scrollPanel.setBounds(60, 140, 880, 402);

        btnEliminar.setBackground(new java.awt.Color(241, 96, 33));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnEliminar);
        btnEliminar.setBounds(740, 580, 200, 40);

        btnRegistrarSalida.setBackground(new java.awt.Color(241, 96, 33));
        btnRegistrarSalida.setText("Registrar salida");
        btnRegistrarSalida.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnRegistrarSalida);
        btnRegistrarSalida.setBounds(510, 580, 200, 40);

        rbTodos.setBackground(new java.awt.Color(255, 255, 255));
        rbTodos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbTodos.setText("Todos");
        rbTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTodosMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbTodos);
        rbTodos.setBounds(870, 100, 90, 27);

        rbPendiente.setBackground(new java.awt.Color(255, 255, 255));
        rbPendiente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbPendiente.setText("Pendiente");
        rbPendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbPendienteMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbPendiente);
        rbPendiente.setBounds(600, 100, 120, 27);

        btnCrear.setBackground(new java.awt.Color(241, 96, 33));
        btnCrear.setText("Crear nuevo");
        btnCrear.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCrear);
        btnCrear.setBounds(60, 580, 200, 40);

        rbCompletado.setBackground(new java.awt.Color(255, 255, 255));
        rbCompletado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbCompletado.setText("Completado");
        rbCompletado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCompletadoMouseClicked(evt);
            }
        });
        panelPrincipal.add(rbCompletado);
        rbCompletado.setBounds(730, 100, 130, 27);

        btnModificarEntrada.setBackground(new java.awt.Color(241, 96, 33));
        btnModificarEntrada.setText("Modificar entrada");
        btnModificarEntrada.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnModificarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEntradaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnModificarEntrada);
        btnModificarEntrada.setBounds(290, 580, 200, 40);

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

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        String nombre = "", fechaEntrada = "", estado = "", fechayHoraSalida = "", fechayHoraSalidaFormateada = "";
        int row = -1, id = -1, idTrabajador = -1;
        trabajador varAux = new trabajador();
        Date fechaActual = new Date();
        row = tbRegistroDiario.getSelectedRow();
        if (row >= 0) {
            estado = tbRegistroDiario.getValueAt(row, 5).toString();
            if (estado.equals("pendiente")) {
                id = Integer.parseInt(tbRegistroDiario.getValueAt(row, 0).toString());
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea marcar la salida automaticamente?", "Importante", 2, JOptionPane.INFORMATION_MESSAGE);
                if (respuesta == 0) {
                    fechayHoraSalida = metodos.funciones.convertirDateAFechayHora(fechaActual);
                    fechayHoraSalidaFormateada = metodos.funciones.convertirDateAFechayHoraFormateada(fechaActual);
                    registro variable = new registro(id, fechayHoraSalida, 0);
                    lista.actualizarSalida(variable);
                    JOptionPane.showMessageDialog(null, "------ Salida Registrada ------\nFecha y hora: "
                            + fechayHoraSalidaFormateada, "Información", JOptionPane.INFORMATION_MESSAGE);
                    mostrar();
                } else {
                    nombre = tbRegistroDiario.getValueAt(row, 1).toString();
                    fechaEntrada = tbRegistroDiario.getValueAt(row, 2).toString();
                    viewRegistroDiario var = new viewRegistroDiario("Registrar");
                    var.id = id;
                    main.ShowJPanel(var);
                    idTrabajador = lista.filtrar(id).getTrabajador();
                    varAux = listaAux.filtrar(idTrabajador);
                    dpFechaEntrada.setDate(metodos.funciones.convertirCadenaADate(fechaEntrada));
                    txtId.setText(String.valueOf(varAux.getId()));
                    txtTrabajador.setText(nombre);
                    txtCedula.setText(varAux.getCedula());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registro no valido para edición", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int row = -1, id = -1;
        row = tbRegistroDiario.getSelectedRow();
        if (row >= 0) {
            try {
                id = Integer.parseInt(tbRegistroDiario.getValueAt(row, 0).toString());
                lista.delete(id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Registro diario esta relacionada con uno o \nmas registros de Factura", "Información", JOptionPane.WARNING_MESSAGE);
            }
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        main.ShowJPanel(new viewRegistroDiario("Insertar"));
    }//GEN-LAST:event_btnCrearActionPerformed

    private void rbCompletadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCompletadoMouseClicked
        mostrarCompletado();
        rbCompletado.setSelected(true);
        rbPendiente.setSelected(false);
        rbTodos.setSelected(false);
        btnRegistrarSalida.setEnabled(false);
        btnModificarEntrada.setEnabled(false);
    }//GEN-LAST:event_rbCompletadoMouseClicked

    private void rbPendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPendienteMouseClicked
        mostrar();
        rbPendiente.setSelected(true);
        rbCompletado.setSelected(false);
        rbTodos.setSelected(false);
        btnRegistrarSalida.setEnabled(true);
        btnModificarEntrada.setEnabled(true);
    }//GEN-LAST:event_rbPendienteMouseClicked

    private void rbTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTodosMouseClicked
        mostrarPendienteCompletado();
        rbTodos.setSelected(true);
        rbPendiente.setSelected(false);
        rbCompletado.setSelected(false);
        btnRegistrarSalida.setEnabled(true);
        btnModificarEntrada.setEnabled(true);
    }//GEN-LAST:event_rbTodosMouseClicked

    private void btnModificarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEntradaActionPerformed
        String nombre = "", fechaEntrada = "", estado = "";
        int row = -1, id = -1, idTrabajador = -1;
        trabajador varAux = new trabajador();
        row = tbRegistroDiario.getSelectedRow();
        if (row >= 0) {
            estado = tbRegistroDiario.getValueAt(row, 5).toString();
            if (estado.equals("pendiente")) {
                id = Integer.parseInt(tbRegistroDiario.getValueAt(row, 0).toString());
                nombre = tbRegistroDiario.getValueAt(row, 1).toString();
                fechaEntrada = tbRegistroDiario.getValueAt(row, 2).toString();
                viewRegistroDiario var = new viewRegistroDiario("Modificar");
                var.id = id;
                main.ShowJPanel(var);
                idTrabajador = lista.filtrar(id).getTrabajador();
                varAux = listaAux.filtrar(idTrabajador);
                dpFechaEntrada.setDate(metodos.funciones.convertirCadenaADate(fechaEntrada));
                txtId.setText(String.valueOf(varAux.getId()));
                txtTrabajador.setText(nombre);
                txtCedula.setText(varAux.getCedula());

            } else {
                JOptionPane.showMessageDialog(null, "Registro no valido para edición", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnCrear;
    private newscomponents.RSButtonFlat_new btnEliminar;
    private newscomponents.RSButtonFlat_new btnModificarEntrada;
    private newscomponents.RSButtonFlat_new btnRegistrarSalida;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rbCompletado;
    private javax.swing.JRadioButton rbPendiente;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separadorTitle;
    public static RSMaterialComponent.RSTableMetroCustom tbRegistroDiario;
    // End of variables declaration//GEN-END:variables
}
