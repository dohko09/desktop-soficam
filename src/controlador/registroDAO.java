package controlador;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.conexion;
import javax.swing.table.DefaultTableModel;

public class registroDAO {

    private static final String Insertar = "insert into registro(trabajador, entrada) values(?,?)";
    private static final String Consultar = "select*from function_registro() order by (id)";
    private static final String ConsultarCompletado = "select*from function_registro_completado() order by (id)";
    private static final String ConsultarPendienteCompletado = "select*from function_registro_hoy() order by (id)";
    private static final String ConsultarDetalleSemanaTrabajador = "select*from function_detalle_semana(?,?,?) order by (id)";
    private static final String ConsultarRegistroTodosOrdenadoID = "select*from function_reporte_todos(?,?)";
    private static final String ConsultarRegistroTodosOrdenadoTrabajador = "select*from function_reporte_todos(?,?) order by (trabajador)";
    private static final String ConsultarPagos = "select*from view_pagos";
    private static final String ObtenerPagoSemanaTrabajador = "select*from obtener_pago_semana(?,?,?)";
    private static final String CancelarSemanaTrabajador = "select*from cancelar_trabajador(?,?,?,?)";
    private static final String ultimoIdPago = "SELECT max(id) as ultimoId from pagos";
    private static final String Actualizar = "update registro set entrada=? where id=?";
    private static final String ActualizarSalida = "update registro set salida=? where id=?";
    private static final String Eliminar = "delete from registro where id=?";
    public static conexion con = new conexion();

    public registroDAO() {

    }

    public void insertar(registro variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Insertar);
            funcion.setInt(1, variable.getTrabajador());
            funcion.setTimestamp(2, metodos.funciones.convertirCadenaATimestamp(variable.getEntrada()));
            funcion.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }

    }

    public void actualizar(registro variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(Actualizar);
            funcion.setTimestamp(1, metodos.funciones.convertirCadenaATimestamp(variable.getEntrada()));
            funcion.setInt(2, variable.getId());
            funcion.execute();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
    }

    public void actualizarSalida(registro variable) {
        try (Connection connection = con.conectar()) {
            PreparedStatement funcion = connection.prepareStatement(ActualizarSalida);
            funcion.setTimestamp(1, metodos.funciones.convertirCadenaATimestamp(variable.getSalida()));
            funcion.setInt(2, variable.getId());
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

    public registroPersonalizado filtrar(int id) {
        registroPersonalizado variable = new registroPersonalizado();
        try {
            Connection connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery("select*from function_registro() where id='" + id + "'");
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return variable;
    }

    public List<registroPersonalizado> listar() {

        Connection connection = null;
        List<registroPersonalizado> lista = new ArrayList<registroPersonalizado>();
        registroPersonalizado variable = new registroPersonalizado();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(Consultar);
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<registroPersonalizado> listarPendienteCompletado() {

        Connection connection = null;
        List<registroPersonalizado> lista = new ArrayList<registroPersonalizado>();
        registroPersonalizado variable = new registroPersonalizado();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(ConsultarPendienteCompletado);
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<registroPersonalizado> listarCompletado() {

        Connection connection = null;
        List<registroPersonalizado> lista = new ArrayList<registroPersonalizado>();
        registroPersonalizado variable = new registroPersonalizado();
        try {
            connection = con.conectar();
            Statement statement = connection.createStatement();
            ResultSet funcion = statement.executeQuery(ConsultarCompletado);
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<registroPersonalizado> filtrar(int trabajador, Date fechaInicio, Date fechaFin) {

        Connection connection = null;
        List<registroPersonalizado> lista = new ArrayList<registroPersonalizado>();
        registroPersonalizado variable = new registroPersonalizado();
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(ConsultarDetalleSemanaTrabajador);
            ps.setInt(1, trabajador);
            ps.setDate(2, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(3, new java.sql.Date(fechaFin.getTime()));
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<registroPersonalizado> obtenerRegistrosPorId(Date fechaInicio, Date fechaFin) {

        Connection connection = null;
        List<registroPersonalizado> lista = new ArrayList<registroPersonalizado>();
        registroPersonalizado variable = new registroPersonalizado();
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(ConsultarRegistroTodosOrdenadoID);
            ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<registroPersonalizado> obtenerRegistrosPorTrabajador(Date fechaInicio, Date fechaFin) {

        Connection connection = null;
        List<registroPersonalizado> lista = new ArrayList<registroPersonalizado>();
        registroPersonalizado variable = new registroPersonalizado();
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(ConsultarRegistroTodosOrdenadoTrabajador);
            ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                variable = new registroPersonalizado(funcion.getInt(1), funcion.getInt(2), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(3)),
                        funcion.getTimestamp(4) == null ? " - " : metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(4)), funcion.getInt(5), funcion.getString(6), funcion.getString(7), funcion.getDouble(8));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public List<pago> obtenerRegistrosPago() {

        Connection connection = null;
        List<pago> lista = new ArrayList<pago>();
        pago variable = new pago();
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(ConsultarPagos);
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                variable = new pago(funcion.getInt(1), metodos.funciones.convertirTimestampAFechayHora(funcion.getTimestamp(2)),
                        funcion.getInt(3), funcion.getString(4), funcion.getDouble(5), funcion.getString(6));
                lista.add(variable);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return lista;
    }

    public double obtenerPagoTrabajador(int trabajador, Date fechaInicio, Date fechaFin) {
        Connection connection = null;
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(ObtenerPagoSemanaTrabajador);
            ps.setInt(1, trabajador);
            ps.setDate(2, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(3, new java.sql.Date(fechaFin.getTime()));
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                return funcion.getDouble(1);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return 0;
    }

    public void cancelarTrabajador(int trabajador, Date fechaInicio, Date fechaFin, double total) {
        Connection connection = null;
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(CancelarSemanaTrabajador);
            ps.setInt(1, trabajador);
            ps.setDate(2, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(3, new java.sql.Date(fechaFin.getTime()));
            ps.setDouble(4, total);
            ResultSet funcion = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
    }

    public int obtenerUltimoId() {
        Connection connection = null;
        try {
            connection = con.conectar();
            PreparedStatement ps = connection.prepareStatement(ultimoIdPago);
            ResultSet funcion = ps.executeQuery();
            while (funcion.next()) {
                return funcion.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error" + e);
        }
        return 0;
    }

    public DefaultTableModel mostrarTabla(List<registroPersonalizado> lista) {
        String[] titulos = {"ID", "Trabajador", "H. Entrada", "H. Salida", "Tiempo", "Estado", "Pago"};
        String[] registro;
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (registroPersonalizado variable : lista) {
            registro = new String[]{String.valueOf(variable.getId()), variable.getNombre(), variable.getEntrada(),
                variable.getSalida() == null ? " - " : variable.getSalida(), String.valueOf(variable.getTiempo()) == null ? " - " : String.valueOf(variable.getTiempo()),
                variable.getEstado(), String.valueOf(variable.getPago()) == null ? " - " : String.valueOf(variable.getPago())};
            modelo.addRow(registro);
        }
        return modelo;
    }

    public DefaultTableModel mostrarTablaPagos(List<pago> lista) {
        String[] titulos = {"ID", "Generado", "Trabajador", "Intervalo cobrado", "Total"};
        String[] registro;
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (pago variable : lista) {
            registro = new String[]{String.valueOf(variable.getId()), variable.getFecha(), variable.getNombre(),
                variable.getDiasTrabajados(), String.valueOf(variable.getTotal())};
            modelo.addRow(registro);
        }
        return modelo;
    }
}
