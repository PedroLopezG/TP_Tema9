import Interfaces.Catalogo;
import Interfaces.Traducir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        while (seleccion !=3) {
        menu();
        seleccion = teclado.nextInt();

            switch (seleccion) {
                case 1:
                    Catalogo catalogo = new Catalogo();
                    catalogo.crearCatalogo();
                    break;
                case 2:
                    Traducir traductor = new Traducir();
                    traductor.Traducir(teclado);
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
        }
    }



    private static void menu(){
        System.out.println("\nSeleccione un ejercico:");
        System.out.println("1 - El alquiler de bicis ");
        System.out.println("2 - Velocidad media versión plurilingüe ");
        System.out.println("3 - Salir");
    }

}
