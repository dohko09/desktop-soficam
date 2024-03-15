package entidades;

public class usuario {

    private int id;
    private String usuario;
    private String clave;
    private String rol;
    private String estado;

    public usuario() {
    }

    public usuario(String usuario, String clave, String rol) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public usuario(int id, String usuario, String clave, String rol) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public usuario(int id, String usuario, String clave, String rol, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
