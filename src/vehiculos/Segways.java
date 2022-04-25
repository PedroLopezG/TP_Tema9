package vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Segways extends Vehiculos{
    public double autonomia;
    public double precio = 18.90;

    public Segways(String marca, String modelo, LocalDate fechaDeCompra, double autonomia) {
        super(marca, modelo, fechaDeCompra);
        this.autonomia = autonomia;
    }
    @Override
    public String toString() {
        return String.format("- Segway %s %s (%d años) %.2f km de autonomía \t %.2f €/hora", super.marca,super.modelo,2022-fechaDeCompra.getYear(), autonomia, precio);
    }
}
