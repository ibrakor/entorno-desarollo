package com.ibrakor.PcComponentes;

public class FuenteAlimentacion {

    private Integer id;
    private String nombre;
    private String modelo;
    private String precio;
    private String potencia;

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

    public String getPotencia() {
        return potencia;
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

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
