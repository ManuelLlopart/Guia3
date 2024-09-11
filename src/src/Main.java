import models.Autobus;
import models.Bicicleta;
import models.Tranvia;

public class Main {
    public static void main(String[] args) {
        Autobus bus = new Autobus(51, 28);
        Tranvia tren = new Tranvia("Pinamar", 200);
        Bicicleta bici = new Bicicleta("1234");

        bus.arrancar();
        tren.arrancar();
        bici.arrancar();
        bus.detener();
        tren.detener();
        bici.detener();
        System.out.println("Bus tiene " + bus.obtenerCapacidad() + " de capacidad, bici tiene "
                + bici.obtenerCapacidad() + " de capacidad y el tren tiene " + tren.obtenerCapacidad() + " de capacidad");




    }
}