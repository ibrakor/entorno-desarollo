package com.ibrakor.PcComponentes;

public class TarjetaGrafica {
    /**
     * Atrbituos.
     */
    private Integer id;
    private String nombre;
    private String vram;
    private String precio;

/**metodos
 */
    public String getNombre() {
        return nombre;
    }

    public String getVram() {
        return vram;
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

    public void setVram(String vram) {
        this.vram = vram;
    }
}
