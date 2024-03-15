package controlador;

import entidades.*;
import modelo.conexion;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class usuarioDAO {

    private static final String Insertar = "insert into usuario(usuario, clave, rol) values(?,?,?)";
    private static final String Consultar = "select*from usuario order by (id)";
    private static final String Actualizar = "update usuario set clave=?, rol=? where usuario=?";
    private static final String Eliminar = "delete from usuario where usuario=?";
    public static conexion con = new conexion();

    public usuarioDAO() {

    }

    public List<usuario> listar() {

        Connection connection = null;
        List<usuario> lista = new ArrayList<>();
        usuario variable = new usuario();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(Consultar);
            while (funcion.next()) {
                variable = new usuario(funcion.getInt(1), funcion.getString(2),
                        funcion.getString(3), funcion.getString(4), funcion.getString(5));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public void insertar(usuario variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Insertar);
            funcion.setString(1, variable.getUsuario());
            funcion.setString(2, variable.getClave());
            funcion.setString(3, variable.getRol());
            funcion.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }

    }

    public void actualizar(usuario variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Actualizar);
            funcion.setString(1, variable.getClave());
            funcion.setString(2, variable.getRol());
            funcion.setString(3, variable.getUsuario());
            funcion.execute();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
    }

    public void delete(int variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Eliminar);
            funcion.setInt(1, variable);
            funcion.execute();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
    }

    public DefaultTableModel mostrarTabla(List<usuario> lista) {
        String[] titulos = {"ID", "Usuario", "Clave", "Rol"};
        String[] registro;
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (usuario variable : lista) {
            registro = new String[]{String.valueOf(variable.getId()), variable.getUsuario(),
                variable.getClave(), variable.getRol()};
            modelo.addRow(registro);
        }
        return modelo;
    }
}
