package com.ibrakor.PcComponentes;

public class RAM {
    private Integer id;
    private String nombre;
    private String reloj;
    private String precio;

    /**
     *
     * Metodos
     */

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReloj() {
        return reloj;
    }

    public String getPrecio() {
        return precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReloj(String reloj) {
        this.reloj = reloj;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
