package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Stock {
public List<Vehiculos> listaStock;

    public Stock() {
        this.listaStock = new ArrayList<>();
    }

    public void mostrarStock (){
        System.out.println("\nEstos son los ciclos que ofrecemos en alquiler:");
        for (Vehiculos vehiculo : listaStock) {
            System.out.println(vehiculo);
        }
    }
}
