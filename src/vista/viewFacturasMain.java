package vista;

import controlador.registroDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class viewFacturasMain extends javax.swing.JPanel {

    public static registroDAO lista = new registroDAO();

    public viewFacturasMain() {
        initComponents();
        mostrar();
        ajustarColumnas();
    }

    public static void ajustarColumnas() {
        tbFacturas.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbFacturas.getColumnModel().getColumn(1).setPreferredWidth(170);
        tbFacturas.getColumnModel().getColumn(2).setPreferredWidth(170);
        tbFacturas.getColumnModel().getColumn(3).setPreferredWidth(170);
        tbFacturas.getColumnModel().getColumn(4).setPreferredWidth(10);

    }

    public static void mostrar() {
        tbFacturas.setModel(lista.mostrarTablaPagos(lista.obtenerRegistrosPago()));
        ajustarColumnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        separadorTitle = new javax.swing.JSeparator();
        scrollPanel = new javax.swing.JScrollPane();
        tbFacturas = new RSMaterialComponent.RSTableMetroCustom();
        btnImprimirFactura = new newscomponents.RSButtonFlat_new();

        setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setName(""); // NOI18N

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTitle.setText("Listado de Facturas");
        panelPrincipal.add(lblTitle);
        lblTitle.setBounds(280, 10, 440, 57);
        panelPrincipal.add(separadorTitle);
        separadorTitle.setBounds(59, 69, 868, 10);

        tbFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbFacturas.setBackgoundHover(new java.awt.Color(0, 143, 223));
        tbFacturas.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tbFacturas.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tbFacturas.setEffectHover(true);
        tbFacturas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbFacturas.setFontHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbFacturas.setFontRowHover(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbFacturas.setFontRowSelect(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        tbFacturas.setSelectionBackground(new java.awt.Color(0, 143, 223));
        scrollPanel.setViewportView(tbFacturas);

        panelPrincipal.add(scrollPanel);
        scrollPanel.setBounds(59, 85, 868, 470);

        btnImprimirFactura.setBackground(new java.awt.Color(241, 96, 33));
        btnImprimirFactura.setText("Imprimir Factura");
        btnImprimirFactura.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFacturaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnImprimirFactura);
        btnImprimirFactura.setBounds(380, 580, 200, 40);

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

    private void btnImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFacturaActionPerformed

        int filaSeleccionada = -1, idFactura = -1;
        try {
            filaSeleccionada = tbFacturas.getSelectedRow();
            if (filaSeleccionada >= 0) {
                idFactura = Integer.parseInt(tbFacturas.getValueAt(filaSeleccionada, 0).toString());
                conexion con = new conexion();
                try (Connection conn = con.conectar()) {
                    JasperReport reporte = null;
//                    String path = "C:\\SOFICAM\\src\\reportes\\factura.jasper";
                    Map<String, Object> parametros = new HashMap<>();
                    parametros.put("idFactura", idFactura);
                    reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/factura.jasper"));
                    System.out.println(getClass().getResource("/reportes/factura.jasper"));
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametros, conn);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un registro", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al generar el reporte: " + ex.getMessage(), "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al conectar con la base de datos: " + ex.getMessage(), "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnImprimirFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnImprimirFactura;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separadorTitle;
    public static RSMaterialComponent.RSTableMetroCustom tbFacturas;
    // End of variables declaration//GEN-END:variables
}
