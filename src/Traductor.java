package Idiomas;

import java.util.Scanner;

public interface Traductor {

    Scanner teclado = new Scanner(System.in);

    public int introducirDistancia();

    public int introducirTiempo();

    public void inicioRespuesta();

    public void finRespuesta(int distancia, int tiempo);
}
