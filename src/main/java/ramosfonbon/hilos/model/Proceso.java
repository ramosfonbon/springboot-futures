package ramosfonbon.hilos.model;

public class Proceso {
    private int id;
    private String nombre;
    private int espera;
    private String estado;

    public Proceso() {
        this.estado = "NEW";
    }

    public Proceso(int id, String nombre, int espera) {
        this.id = id;
        this.nombre = nombre;
        this.espera = espera;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEspera() {
        return espera;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }
}
