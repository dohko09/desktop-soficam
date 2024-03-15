package vista;

import controlador.usuarioDAO;
import entidades.usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public static usuario usuarioLogin = new usuario();
    public usuarioDAO auxDAO = new usuarioDAO();
    int contador = 3;

    public login() {
        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(this);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/icono-logo.png"));
        return retValue;
    }

    public boolean comprobarDatos(String usuario, String password) {
        boolean respuesta = false;
        for (usuario var : auxDAO.listar()) {
            if (var.getUsuario().equals(usuario) && var.getClave().equals(password)) {
                usuarioLogin = var;
                respuesta = true;
                return respuesta;
            }
        }
        return respuesta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUsuario = new RSMaterialComponent.RSTextFieldIconOne();
        btnCerrar = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnVerificar = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtContrasena = new RSMaterialComponent.RSPasswordIconOne();
        lblInicioSesion = new javax.swing.JLabel();
        lblImagenMan = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 143, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(248, 251, 244));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Bienvenido al Sistema SOFICAM ICE");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 650, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBorderColor(new java.awt.Color(102, 102, 102));
        txtUsuario.setColorIcon(new java.awt.Color(102, 102, 102));
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        txtUsuario.setPlaceholder("Usuario");
        txtUsuario.setSelectionColor(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 22, 33));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBackgroundHover(new java.awt.Color(153, 153, 153));
        btnCerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 110, -1));

        btnVerificar.setBackground(new java.awt.Color(255, 22, 33));
        btnVerificar.setText("Verificar");
        btnVerificar.setBackgroundHover(new java.awt.Color(153, 153, 153));
        btnVerificar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerificar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SECURITY);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, -1));

        txtContrasena.setForeground(new java.awt.Color(102, 102, 102));
        txtContrasena.setBorderColor(new java.awt.Color(102, 102, 102));
        txtContrasena.setColorIcon(new java.awt.Color(102, 102, 102));
        txtContrasena.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtContrasena.setPlaceholder("Contraseña");
        jPanel3.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, -1));

        lblInicioSesion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(6, 63, 179));
        lblInicioSesion.setText("Iniciar Sesion");
        jPanel3.add(lblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        lblImagenMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hombre.png"))); // NOI18N
        jPanel3.add(lblImagenMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 260, 340));

        lblLogo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(6, 63, 179));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo1.png"))); // NOI18N
        lblLogo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 260));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 10, 350));

        jLabel2.setText("A SERVICE BY DOHKO CORP. © 2023. ALL RIGHTS RESERVED");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir del Sistema?", "Alerta", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Acción abortada", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (contador > 0) {
            if (comprobarDatos(txtUsuario.getText(), txtContrasena.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Ingreso exitoso: " + usuarioLogin.getUsuario(), "Información", JOptionPane.INFORMATION_MESSAGE);
                main var = new main();
                var.show();
                this.dispose();
            } else {
                contador--;
                JOptionPane.showMessageDialog(null, "Credenciales invalidas, vuelva a intentar", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha excedido los intentos permitidos", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnCerrar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVerificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImagenMan;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private RSMaterialComponent.RSPasswordIconOne txtContrasena;
    private RSMaterialComponent.RSTextFieldIconOne txtUsuario;
    // End of variables declaration//GEN-END:variables
}
