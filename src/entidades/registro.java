package entidades;

public class registro {

    private int id;
    private int trabajador;
    private String entrada;
    private String salida;
    private int tiempo;
    private String estado;

    public registro() {
    }

    public registro(int trabajador, String entrada) {
        this.trabajador = trabajador;
        this.entrada = entrada;
    }

    //para actualizar la entrada
    public registro(int id, int trabajador, String entrada) {
        this.id = id;
        this.trabajador = trabajador;
        this.entrada = entrada;
    }

    //para actualizar la fecha de salida
    public registro(int id, String salida, int trabajador) {
        this.id = id;
        this.trabajador = trabajador;
        this.salida = salida;

    }

    public registro(int id, int trabajador, String entrada, String salida, int tiempo, String estado) {
        this.id = id;
        this.trabajador = trabajador;
        this.entrada = entrada;
        this.salida = salida;
        this.tiempo = tiempo;
        this.estado = estado;
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

}
