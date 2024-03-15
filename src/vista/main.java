package vista;

import entidades.usuario;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static vista.login.usuarioLogin;

public class main extends javax.swing.JFrame implements Runnable {

    public static usuario usuarioAux = new usuario();
    Thread hilo;
    public static Date fechaActual = null;

    public main() {
        initComponents();
        setIconImage(getIconImage());
        usuarioAux = usuarioLogin;
        setLocationRelativeTo(null);
        mensaje.setText("¡Bienvenido " + usuarioAux.getUsuario() + "!");
        hilo = new Thread(this);
        hilo.start();
        content.setSize(1000, 650);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/icono-logo.png"));
        return retValue;
    }

    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            SetDate();
        }
    }

    public static boolean allowHost() {
        if (usuarioAux.getRol().equals("administrador")) {
            return true;
        }
        return false;
    }

    private void SetDate() {

        LocalDateTime now = LocalDateTime.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy '-' HH:mm:ss", spanishLocale)));
        fechaActual = new Date();
        try {
            Thread.sleep(1000); // Pausa de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ShowJPanel(JPanel p) {
        p.setSize(1000, 650);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        appName1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnTrabajadores = new RSMaterialComponent.RSButtonMaterialOne();
        btnRegistroDiario = new RSMaterialComponent.RSButtonMaterialOne();
        btnPagoTrabajadores = new RSMaterialComponent.RSButtonMaterialOne();
        btnFacturas = new RSMaterialComponent.RSButtonMaterialOne();
        btnUsuarios = new RSMaterialComponent.RSButtonMaterialOne();
        btnVerificarRegistros = new RSMaterialComponent.RSButtonMaterialOne();
        header = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        navText1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        content = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFICAM ICE");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background1.setBackground(new java.awt.Color(255, 255, 255));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(0, 143, 223));
        menu1.setMaximumSize(new java.awt.Dimension(270, 469));
        menu1.setPreferredSize(new java.awt.Dimension(270, 469));
        menu1.setLayout(null);

        appName1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        appName1.setForeground(new java.awt.Color(248, 251, 244));
        appName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName1.setText("SOFICAM ICE");
        menu1.add(appName1);
        appName1.setBounds(10, 50, 250, 30);

        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 5));
        menu1.add(jSeparator2);
        jSeparator2.setBounds(40, 90, 190, 20);

        btnTrabajadores.setBackground(new java.awt.Color(248, 251, 244));
        btnTrabajadores.setForeground(new java.awt.Color(13, 71, 161));
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnTrabajadores.setForegroundHover(new java.awt.Color(13, 71, 161));
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });
        menu1.add(btnTrabajadores);
        btnTrabajadores.setBounds(0, 120, 270, 40);

        btnRegistroDiario.setBackground(new java.awt.Color(248, 251, 244));
        btnRegistroDiario.setForeground(new java.awt.Color(13, 71, 161));
        btnRegistroDiario.setText("Registro diario");
        btnRegistroDiario.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnRegistroDiario.setForegroundHover(new java.awt.Color(13, 71, 161));
        btnRegistroDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDiarioActionPerformed(evt);
            }
        });
        menu1.add(btnRegistroDiario);
        btnRegistroDiario.setBounds(0, 170, 270, 40);

        btnPagoTrabajadores.setBackground(new java.awt.Color(248, 251, 244));
        btnPagoTrabajadores.setForeground(new java.awt.Color(13, 71, 161));
        btnPagoTrabajadores.setText("Pago trabajadores");
        btnPagoTrabajadores.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnPagoTrabajadores.setForegroundHover(new java.awt.Color(13, 71, 161));
        btnPagoTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoTrabajadoresActionPerformed(evt);
            }
        });
        menu1.add(btnPagoTrabajadores);
        btnPagoTrabajadores.setBounds(0, 270, 270, 40);

        btnFacturas.setBackground(new java.awt.Color(248, 251, 244));
        btnFacturas.setForeground(new java.awt.Color(13, 71, 161));
        btnFacturas.setText("Facturas");
        btnFacturas.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnFacturas.setForegroundHover(new java.awt.Color(13, 71, 161));
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        menu1.add(btnFacturas);
        btnFacturas.setBounds(0, 320, 270, 40);

        btnUsuarios.setBackground(new java.awt.Color(248, 251, 244));
        btnUsuarios.setForeground(new java.awt.Color(13, 71, 161));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnUsuarios.setForegroundHover(new java.awt.Color(13, 71, 161));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        menu1.add(btnUsuarios);
        btnUsuarios.setBounds(0, 370, 270, 40);

        btnVerificarRegistros.setBackground(new java.awt.Color(248, 251, 244));
        btnVerificarRegistros.setForeground(new java.awt.Color(13, 71, 161));
        btnVerificarRegistros.setText("Verificar Registros");
        btnVerificarRegistros.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnVerificarRegistros.setForegroundHover(new java.awt.Color(13, 71, 161));
        btnVerificarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarRegistrosActionPerformed(evt);
            }
        });
        menu1.add(btnVerificarRegistros);
        btnVerificarRegistros.setBounds(0, 220, 270, 40);

        background1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        header.setBackground(new java.awt.Color(255, 22, 33));
        header.setPreferredSize(new java.awt.Dimension(744, 150));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensaje.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("{user} - {rol}");
        header.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 300, 26));

        navText1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        navText1.setForeground(new java.awt.Color(255, 255, 255));
        navText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/soficam - 64.png"))); // NOI18N
        navText1.setText("Sistema/Control/Administración");
        header.add(navText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 80));

        jSeparator1.setBackground(new java.awt.Color(255, 22, 33));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        header.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 10, 50));

        background1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1000, 80));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        background1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 1000, 650));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        background1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, 40));

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/minimizar.png"))); // NOI18N
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        background1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, 40));

        dateText.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dateText.setText("Hoy es {dayname} {day} de {month} de {year} - {hour}:{minute}:{second}");
        background1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 780, 30));

        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        ShowJPanel(new viewTrabajadorMain());
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    private void btnPagoTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoTrabajadoresActionPerformed
        ShowJPanel(new viewPagoTrabajadores());
    }//GEN-LAST:event_btnPagoTrabajadoresActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        ShowJPanel(new viewFacturasMain());
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnRegistroDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDiarioActionPerformed
        if (allowHost()) {
            ShowJPanel(new viewRegistroDiarioMain());
        } else {
            JOptionPane.showMessageDialog(null, "No posee el permiso para acceder a este modulo", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistroDiarioActionPerformed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cerrar el Sistema?", "Importante", 2, JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            JOptionPane.showMessageDialog(null, "El sistema se cerrara en unos momentos...", "Información", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        if (allowHost()) {
            ShowJPanel(new viewUsuarioMain());
        } else {
            JOptionPane.showMessageDialog(null, "No posee el permiso para acceder a este modulo", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnVerificarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarRegistrosActionPerformed
        if (allowHost()) {
            ShowJPanel(new viewVerificarRegistros());
        } else {
            JOptionPane.showMessageDialog(null, "No posee el permiso para acceder a este modulo", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarRegistrosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName1;
    private javax.swing.JPanel background1;
    private RSMaterialComponent.RSButtonMaterialOne btnFacturas;
    private RSMaterialComponent.RSButtonMaterialOne btnPagoTrabajadores;
    private RSMaterialComponent.RSButtonMaterialOne btnRegistroDiario;
    private RSMaterialComponent.RSButtonMaterialOne btnTrabajadores;
    private RSMaterialComponent.RSButtonMaterialOne btnUsuarios;
    private RSMaterialComponent.RSButtonMaterialOne btnVerificarRegistros;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu1;
    private javax.swing.JLabel navText1;
    // End of variables declaration//GEN-END:variables
}
