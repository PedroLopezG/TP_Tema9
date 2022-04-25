package vehiculos;

import java.time.LocalDate;

public abstract class Vehiculos {
        protected String marca;
        protected String modelo;
        protected LocalDate fechaDeCompra;

    public Vehiculos(String marca, String modelo, LocalDate fechaDeCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaDeCompra = fechaDeCompra;
    }
}
