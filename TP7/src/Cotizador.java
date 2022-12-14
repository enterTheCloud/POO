import java.util.Scanner;

public class Cotizador {

    private static Scanner input = new Scanner(System.in);

    private static double cotizarAlquiler(int tipoVehiculo) {
        int cantDias = 0;
        Vehiculo vehiculo = null;
        while(cantDias < 1) {
            System.out.println("Ingrese la cantidad de días del alquiler:");
            cantDias = input.nextInt(); 
        }
            switch(tipoVehiculo) {
                case 1:
                    vehiculo = new Auto(cantDias, 4);
                    break;
                case 2:
                    vehiculo = new Minibus(cantDias, 20);
                    break;
                case 3:
                    vehiculo = new Furgoneta(cantDias, 2.5f);
                    break;
                case 4:
                    vehiculo = new Camion(cantDias, 5);
                    break;
            }
        
        return vehiculo.getPrecioAlquiler();
    }

    private static int seleccionarVehiculo(){
        int opcion = -1;
        while (opcion < 1 || opcion > 4) {
            System.out.println("Seleccione el tipo de vehículo");
            System.out.println("1: Auto (4 plazas)");
            System.out.println("2: Minibus (20 plazas)");
            System.out.println("3: Furgoneta (2.5 Toneladas)");
            System.out.println("4: Camión (5 Toneladas)");
            opcion = input.nextInt(); 
        }
        return opcion;
    }

    public static void main(String[] args){
        int opcion = -1;
        System.out.println("Bienvenido al Cotizador de Vehículos!");
        while (opcion != 0) {
            System.out.println("MENU PRINCIPAL:");
            System.out.println("Seleccione una opción");
            System.out.println("1: Cotizar alquiler");
            System.out.println("0: Salir");
            opcion = input.nextInt();
            if (opcion == 1) {
                int tipoVehiculo = seleccionarVehiculo();
                double precioFinal = cotizarAlquiler(tipoVehiculo);
                System.out.println("El precio del alquiler es de $"+precioFinal);

            }
        }
    }
}
