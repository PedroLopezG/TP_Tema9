package Interfaces;

import vehiculos.Bicis;
import vehiculos.Giroscopio;
import vehiculos.Segways;
import vehiculos.Stock;

import java.time.LocalDate;

public class Catalogo {
    public void crearCatalogo(){
        Stock stock = new Stock();
        Bicis Lapierre = new Bicis("Lapierre", "Speed 400", LocalDate.parse("2021-04-15"), 27);
        stock.listaStock.add(Lapierre);

        Bicis Btwin = new Bicis("Btwin", "Riverside 900", LocalDate.parse("2022-04-15"), 10);
        stock.listaStock.add(Btwin);

        Giroscopio Nine = new Giroscopio("Segway", "Nine", LocalDate.parse("2022-04-15"), 40, 165);
        stock.listaStock.add(Nine);

        Giroscopio Echo = new Giroscopio("Weebot", "Echo", LocalDate.parse("2021-04-15"), 35, 170);
        stock.listaStock.add(Echo);

        Segways v8 = new Segways("Immotion", "v8", LocalDate.parse("2022-04-15"), 40);
        stock.listaStock.add(v8);

        Segways Ninebot = new Segways("Segway", "Ninebot One E+", LocalDate.parse("2022-04-15"), 30);
        stock.listaStock.add(Ninebot);

        stock.mostrarStock();

    }
}
