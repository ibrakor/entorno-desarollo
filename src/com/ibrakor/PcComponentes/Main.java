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
        /**
         * Salida tarjeta de sonido
         */
        TarjetaSonido sound = new TarjetaSonido();
        sound.setId(9);
        sound.setNombre("Sound BlasterX");
        sound.setPrecio("140 €");
        sound.setModelo("AE-5");
        System.out.println(sound.getNombre());
        System.out.println(sound.getPrecio());
        System.out.println(sound.getModelo());
        /**
         * Salida DVD
         */
        DVD dvdsony = new DVD();
        dvdsony.setId(10);
        dvdsony.setNombre("DVD SONY");
        dvdsony.setPrecio("40 €");
        dvdsony.setModelo("DVP-SR370B");
        System.out.println(dvdsony.getNombre());
        System.out.println(dvdsony.getPrecio());
        System.out.println(dvdsony.getModelo());
        /**
         * Salida monitor
         */
        Monitor viewSonic = new Monitor();
        viewSonic.setId(11);
        viewSonic.setNombre("ViewSonic");
        viewSonic.setModelo("VX24");
        viewSonic.setPulgadas("24´");
        viewSonic.setPrecio("100 €");
        System.out.println(viewSonic.getNombre());
        System.out.println(viewSonic.getPrecio());
        System.out.println(viewSonic.getModelo());
        System.out.println(viewSonic.getPulgadas());
        /**
         * Salida teclado
         */
        Teclado logitech = new Teclado();
        logitech.setId(12);
        logitech.setNombre("Logitech");
        logitech.setModelo("G PRO");
        logitech.setColorswitch("GX Blue");
        logitech.setPrecio("110 €");
        System.out.println(logitech.getNombre());
        System.out.println(logitech.getPrecio());
        System.out.println(logitech.getModelo());
        System.out.println(logitech.getColorswitch());
        /**
         * Salida Ratón
         */
        Raton razer = new Raton();
        razer.setId(13);
        razer.setNombre("Razer");
        razer.setPrecio("50 €");
        razer.setModelo("Basilisk V3");
        System.out.println(razer.getNombre());
        System.out.println(razer.getPrecio());
        System.out.println(razer.getModelo());
        /**
         * Salida altavoz
         */
        Altavoces jbl = new Altavoces();
        jbl.setId(14);
        jbl.setNombre("JBL");
        jbl.setPrecio("40 €");
        jbl.setModelo("Go 3");
        System.out.println(jbl.getNombre());
        System.out.println(jbl.getPrecio());
        System.out.println(jbl.getModelo());

    }
}
