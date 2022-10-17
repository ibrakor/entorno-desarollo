package com.ibrakor.PcComponentes;

public class TarjetaGrafica {
    /**
     * Atrbituos.
     */
    private Integer id;
    private String nombre;
    private String socket;
    private String precio;

/**metodos
 */
    public String getNombre() {
        return nombre;
    }

    public String getSocket() {
        return socket;
    }

    public String getPrecio() {
        return precio;
    }

    public Integer getId() {
        return id;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
