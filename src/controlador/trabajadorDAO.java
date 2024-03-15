package controlador;

import entidades.*;
import modelo.conexion;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class trabajadorDAO {

    private static final String Insertar = "insert into trabajador(cedula, nombre, apellido_paterno, apellido_materno, telefono, direccion) values(?,?,?,?,?,?)";
    private static final String Consultar = "select*from trabajador order by (id)";
    private static final String ConsultarTrabajadoresHabilitados = "select*from view_trabajadores_habilitados order by (id)";
    private static final String ConsultarTrabajadoresCobrar = "select*from view_trabajadores_cobrar order by (id)";
    private static final String Actualizar = "update trabajador set cedula=?, nombre=?, apellido_paterno=?, apellido_materno=?, telefono=?, direccion=? where id=?";
    private static final String Eliminar = "delete from trabajador where id=?";
    public static conexion con = new conexion();

    public trabajadorDAO() {

    }

    public List<trabajador> listar() {

        Connection connection = null;
        List<trabajador> lista = new ArrayList<trabajador>();
        trabajador variable = new trabajador();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(Consultar);
            while (funcion.next()) {
                variable = new trabajador(funcion.getInt(1), funcion.getString(2),
                        funcion.getString(3), funcion.getString(4), funcion.getString(5),
                        funcion.getString(6), funcion.getString(7));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<trabajador> listarTrabajadoresHabilitados() {

        Connection connection = null;
        List<trabajador> lista = new ArrayList<trabajador>();
        trabajador variable = new trabajador();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(ConsultarTrabajadoresHabilitados);
            while (funcion.next()) {
                variable = new trabajador(funcion.getInt(1), funcion.getString(2),
                        funcion.getString(3), funcion.getString(4), funcion.getString(5),
                        funcion.getString(6), funcion.getString(7));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<trabajador> listarTrabajadoresCobrar() {

        Connection connection = null;
        List<trabajador> lista = new ArrayList<trabajador>();
        trabajador variable = new trabajador();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(ConsultarTrabajadoresCobrar);
            while (funcion.next()) {
                variable = new trabajador(funcion.getInt(1), funcion.getString(2),
                        funcion.getString(3), funcion.getString(4), funcion.getString(5),
                        funcion.getString(6), funcion.getString(7));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public trabajador filtrar(int id) {
        trabajador variable = null;
        try {
            Connection connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery("select*from trabajador where id='" + id + "'");
            while (funcion.next()) {
                variable = new trabajador(funcion.getInt(1), funcion.getString(2),
                        funcion.getString(3), funcion.getString(4), funcion.getString(5),
                        funcion.getString(6), funcion.getString(7));
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return variable;
    }

    public List<trabajador> filtrar(String cadena) {

        Connection connection = null;
        List<trabajador> lista = new ArrayList<trabajador>();
        trabajador variable = new trabajador();
        try {
            connection = con.conectar();
            String query = "SELECT * FROM trabajador WHERE cedula LIKE ? or nombre LIKE ? or apellido_paterno LIKE ? order by (id)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, "%" + cadena + "%");
            ps.setString(2, "%" + cadena + "%");
            ps.setString(3, "%" + cadena + "%");
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                variable = new trabajador(funcion.getInt(1), funcion.getString(2),
                        funcion.getString(3), funcion.getString(4), funcion.getString(5),
                        funcion.getString(6), funcion.getString(7));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public void insertar(trabajador variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Insertar);
            funcion.setString(1, variable.getCedula());
            funcion.setString(2, variable.getNombre());
            funcion.setString(3, variable.getApellido_paterno());
            funcion.setString(4, variable.getApellido_materno());
            funcion.setString(5, variable.getTelefono());
            funcion.setString(6, variable.getDireccion());
            funcion.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }

    }

    public void actualizar(trabajador variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Actualizar);
            funcion.setString(1, variable.getCedula());
            funcion.setString(2, variable.getNombre());
            funcion.setString(3, variable.getApellido_paterno());
            funcion.setString(4, variable.getApellido_materno());
            funcion.setString(5, variable.getTelefono());
            funcion.setString(6, variable.getDireccion());
            funcion.setInt(7, variable.getId());
            funcion.execute();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
    }

    public void delete(int variable) throws SQLException {
        Connection connection = con.conectar();
        PreparedStatement funcion = connection.prepareStatement(Eliminar);
        funcion.setInt(1, variable);
        funcion.execute();
    }

    public DefaultTableModel mostrarTabla(List<trabajador> lista) {
        String[] titulos = {"ID", "Cedula", "Nombre", "Apellido P.", "Apellido M.", "Telefono", "Direccion"};
        String[] registro;
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (trabajador variable : lista) {
            registro = new String[]{String.valueOf(variable.getId()), variable.getCedula(),
                variable.getNombre(), variable.getApellido_paterno(), variable.getApellido_materno(), variable.getTelefono(), variable.getDireccion()};
            modelo.addRow(registro);
        }
        return modelo;
    }

    public DefaultTableModel mostrarTablaTrabajadoresHabilitados(List<trabajador> lista) {
        String[] titulos = {"ID", "Cedula", "Nombres"};
        String[] registro;
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (trabajador variable : lista) {
            registro = new String[]{String.valueOf(variable.getId()), variable.getCedula(),
                variable.getNombre() + " " + variable.getApellido_paterno() + " " + variable.getApellido_materno()};
            modelo.addRow(registro);
        }
        return modelo;
    }
}
