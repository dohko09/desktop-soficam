package entidades;

public class pago {

    private int id;
    private String fecha;
    private int trabajador;
    private String diasTrabajados;
    private double total;
    private String nombre;

    public pago() {
    }

    public pago(int id, String fecha, int trabajador, String diasTrabajados, double total, String nombre) {
        this.id = id;
        this.fecha = fecha;
        this.trabajador = trabajador;
        this.diasTrabajados = diasTrabajados;
        this.total = total;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(int trabajador) {
        this.trabajador = trabajador;
    }

    public String getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(String diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
