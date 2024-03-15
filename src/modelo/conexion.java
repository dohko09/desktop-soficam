package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static Connection conexion = null;
    private static final String usr = "postgres";
    private static final String pswd = "admin";
    private static final String url = "jdbc:postgresql://localhost:5432/soficam";

    public conexion() {
    }

    public Connection conectar() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usr, pswd);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida");
        }
        return conexion;
    }

    public void cerrar() throws SQLException {
        conexion.close();
        System.out.println("Conexion terminada");
    }
}
