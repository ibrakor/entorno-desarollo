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
        msi.setId(2);
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
        nvidia.setId(3);
        nvidia.setVram("12 GB");
        nvidia.setNombre("RTX 2060");
        nvidia.setPrecio("400 €");
        System.out.println(nvidia.getVram());
        System.out.println(nvidia.getNombre());
        System.out.println(nvidia.getPrecio());
        /**
         * Salida RAM
         */
        RAM corsairam = new RAM();
        corsairam.setId(4);
        corsairam.setNombre("Corsair Vengeance");
        corsairam.setPrecio("150 €");
        corsairam.setReloj("3200 Mhz");
        System.out.println(corsairam.getNombre());
        System.out.println(corsairam.getPrecio());
        System.out.println(corsairam.getReloj());

        /**
         * Salida Torre
         */
        Torre aerocool = new Torre();
        aerocool.setId(5);
        aerocool.setNombre("Aerocool");
        aerocool.setPrecio("100 €");
        aerocool.setModelo("P7 C1");
        System.out.println(aerocool.getNombre());
        System.out.println(aerocool.getPrecio());
        System.out.println(aerocool.getModelo());
        /**
         * Disipador
         */
        Disipador coolerMaster = new Disipador();
        coolerMaster.setId(6);
        coolerMaster.setMarca("Cooler Master Hyper 212");
        coolerMaster.setChipset("AM4, AM2");
        coolerMaster.setPrecio("45 €");
        System.out.println(coolerMaster.getMarca());
        System.out.println(coolerMaster.getChipset());
        System.out.println(coolerMaster.getPrecio());
        /**
         * Fuente de alimentacion
         */
        FuenteAlimentacion corsair = new FuenteAlimentacion();
        corsair.setId(7);
        corsair.setNombre("Corsair");
        corsair.setModelo("RM750 80 Plus Gold");
        corsair.setPotencia("750W");
        corsair.setPrecio("120 €");
        System.out.println(corsair.getNombre());
        System.out.println(corsair.getModelo());
        System.out.println(corsair.getPotencia());
        System.out.println(corsair.getPrecio());
        /**
         * Disco duro
         */
        DiscoDuro barracuda = new DiscoDuro();
        barracuda.setId(8);
        barracuda.setNombre("Seagate");
        barracuda.setModelo("Barracuda 3.5´ SATA 3");
        barracuda.setPrecio("50 €");
        barracuda.setCapacidad("2 TB");
        System.out.println(barracuda.getNombre());
        System.out.println(barracuda.getModelo());
        System.out.println(barracuda.getPrecio());
        System.out.println(barracuda.getCapacidad());
    }
}
