package com.ibrakor.PcComponentes;

import com.ibrakor.PcComponentes.PlacaBase;
import com.ibrakor.PcComponentes.Procesador;
import com.ibrakor.PcComponentes.TarjetaGrafica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Ryzen 5 2600");
        amd.setFabricante("AMD");
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());
        /**
         * Salida Placa Base
         */

        PlacaBase msi = new PlacaBase();
        msi.setId(3);
        msi.setMarca("MSI Mortar");
        msi.setChipset("AM4");
        msi.setPrecio("150 €");
        System.out.println(msi.getMarca());
        System.out.println(msi.getChipset());
        System.out.println(msi.getPrecio());
        /**
         * Salida Tarjeta Grafica
         */

        TarjetaGrafica nvidia = new TarjetaGrafica();
        nvidia.setId(4);
        nvidia.setVram("12 GB");
        nvidia.setNombre("RTX 2060");
        nvidia.setPrecio("400 €");
        System.out.println(nvidia.getVram());
        System.out.println(nvidia.getNombre());
        System.out.println(nvidia.getPrecio());

        RAM corsair = new RAM();
        corsair.setId(5);
        corsair.setNombre("Corsair Vengeance");
        corsair.setPrecio("150 €");
        corsair.setReloj("3200 Mhz");
        System.out.println(corsair.getNombre());
        System.out.println(corsair.getPrecio());
        System.out.println(corsair.getReloj());

    }
}
