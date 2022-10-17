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

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("I7");
        pentium.setFabricante("Intel");
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

        PlacaBase MSI = new PlacaBase();
        MSI.setId(3);
        MSI.setMarca("MSI Mortar");
        MSI.setChipset("AM4");
        MSI.setPrecio("150 €");
        System.out.println(MSI.getMarca());
        System.out.println(MSI.getChipset());
        System.out.println(MSI.getPrecio());

        TarjetaGrafica

    }
}
