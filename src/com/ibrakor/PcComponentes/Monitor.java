package com.ibrakor.PcComponentes;

public class Monitor {

    private Integer id;
    private String nombre;
    private String modelo;
    private String precio;
    private String pulgadas;

    public Integer getId() {
        return id;
    }

    public String getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }
}
