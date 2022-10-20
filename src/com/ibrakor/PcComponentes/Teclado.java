package com.ibrakor.PcComponentes;

public class Teclado {

    private Integer id;
    private String nombre;
    private String modelo;
    private String precio;
    private String colorswitch;

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

    public String getColorswitch() {
        return colorswitch;
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

    public void setColorswitch(String colorswitch) {
        this.colorswitch = colorswitch;
    }
}
