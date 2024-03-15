package entidades;

public class registroPersonalizado {

    private int id;
    private int trabajador;
    private String entrada;
    private String salida;
    private int tiempo;
    private String estado;
    private String nombre;
    private double pago;

    public registroPersonalizado(int id, int trabajador, String entrada, String salida, int tiempo, String estado, String nombre, double pago) {
        this.id = id;
        this.trabajador = trabajador;
        this.entrada = entrada;
        this.salida = salida;
        this.tiempo = tiempo;
        this.estado = estado;
        this.nombre = nombre;
        this.pago = pago;
    }

    public registroPersonalizado() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(int trabajador) {
        this.trabajador = trabajador;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
     
}
