import java.util.Scanner;
public class EJERCICIO_5_SECUENCIALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaKm;
        double consumo_combustible;
        double consumo_litros;
        double costo_combustible;
        double costo_total;
        System.out.println("Ingrese cuantos Kilometros recorrio:");
        distanciaKm = sc.nextDouble();
        System.out.println("¿Cuantos litros consumio por Kilometro?");
        consumo_combustible = sc.nextDouble();
        System.out.println("¿Cuanto costo el combustible por litro?");
        costo_combustible = sc.nextDouble();

        consumo_litros = consumo_combustible * distanciaKm;
        costo_total = costo_combustible * consumo_litros;

        System.out.println("El viaje costo $"+ costo_total);

    }
}
