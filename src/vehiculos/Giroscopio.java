package vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Giroscopio extends Vehiculos {

        public double altura;
        public double autonomia;
        public double precio = 29.90;

    public Giroscopio(String marca, String modelo, LocalDate fechaDeCompra, double autonomia, double altura) {
        super(marca, modelo, fechaDeCompra);
        this.altura = altura;
        this.autonomia = autonomia;
    }
    @Override
    public String toString() {
        return String.format("- Giroscopio %s %s (%d años) %.2f km de autonomía \t %.2f €/hora", super.marca,super.modelo,2022-fechaDeCompra.getYear(), autonomia, precio);
    }
}
