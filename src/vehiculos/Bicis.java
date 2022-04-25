package vehiculos;

import java.time.LocalDate;

public class Bicis extends Vehiculos{
    public int vel;
    public double precio = 4.90;


    public Bicis(String marca, String modelo,LocalDate fechaDeCompra, int vel) {
        super(marca, modelo, fechaDeCompra);
        this.vel = vel;
    }

    @Override
    public String toString() {
        return String.format("- Bicicleta %s %s (%d años) %d velocidades \t %.2f €/hora", super.marca,super.modelo, 2022-fechaDeCompra.getYear(), vel, precio);
    }
}
