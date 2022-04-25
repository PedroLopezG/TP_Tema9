package Idiomas;

public class En implements Traductor{


    @Override
    public int introducirDistancia() {
        System.out.println("Enter the distance traveled (km). ");
        return teclado.nextInt();
    }

    @Override
    public int introducirTiempo() {
        System.out.println("Enter the travel time (min). ");
        return teclado.nextInt();
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Enter the required data: ");
    }

    @Override
    public void finRespuesta(int distancia, int tiempo) {
        System.out.println(String.format("The average speed has been: %d km/h", (distancia*60)/tiempo));

    }
}