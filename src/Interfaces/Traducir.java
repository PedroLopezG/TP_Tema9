package Interfaces;

import Idiomas.En;
import Idiomas.Es;
import Idiomas.Traductor;

import java.util.Scanner;

public class Traducir {
        public void Traducir(Scanner teclado){
            int seleccion = 0;
            while (seleccion!=3){
                elegirIdiomas();
                seleccion = teclado.nextInt();
                switch (seleccion){
                    case 1:
                        Traductor es = new Es();
                        es.inicioRespuesta();
                        es.finRespuesta(es.introducirDistancia(),es.introducirTiempo());
                        seleccion = 3;
                        break;
                    case 2:
                        Traductor en = new En();
                        en.inicioRespuesta();
                        en.finRespuesta(en.introducirDistancia(),en.introducirTiempo());
                        seleccion = 3;
                        break;
                    case 3:
                        System.out.println("Volviendo . . .");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

            }



        }







    private static void elegirIdiomas(){
        System.out.println("Seleccione su idioma: ");
        System.out.println("1.- Español");
        System.out.println("2.- English");
        System.out.println("3 - Volver atras");
    }
}
