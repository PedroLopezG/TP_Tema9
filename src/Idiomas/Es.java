package Idiomas;

public class Es implements Traductor{


    @Override
    public int introducirDistancia() {
        System.out.println("Introduzca la distancia recorrida (km). ");
        return teclado.nextInt();
    }

    @Override
    public int introducirTiempo() {
        System.out.println("Introduzca el tiempo del recorrido (min). ");
        return teclado.nextInt();
    }

    @Override
    public void inicioRespuesta() {
            System.out.println("Introduzca los datos requeridos: ");
    }

    @Override
    public void finRespuesta(int distancia, int tiempo) {
        System.out.println(String.format("Su velocidad media ha sido de: %d km/h", (distancia*60)/tiempo));

    }
}
