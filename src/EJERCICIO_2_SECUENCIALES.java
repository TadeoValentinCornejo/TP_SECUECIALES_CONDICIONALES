import java.util.Scanner;

public class EJERCICIO_2_SECUENCIALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoKg;
        int ejerciciominutos;
        int tipoEjercicio;
        double correr = 8.0;
        double andarEnBicicleta = 7.0;
        double nadar = 9.8;
        double caloriasQuemadas;
        double caloriasPorMinuto;

        System.out.println("Introduce tu peso en kg: ");
        pesoKg = sc.nextDouble();
        System.out.println("¿Que ejercicio hiciste? ingresa el numero de las siguientes opciones: 1. andar en bicileta/ 2. nadar/ 3. correr");
        tipoEjercicio = sc.nextInt();
        System.out.println("¿Por cuantos minutos realizaste la actividad?");
        ejerciciominutos = sc.nextInt();

        if (tipoEjercicio == 1) {
            caloriasQuemadas = andarEnBicicleta * pesoKg * 0.0175;
            caloriasPorMinuto = caloriasQuemadas * ejerciciominutos;
            System.out.println("Usted quemo " + caloriasPorMinuto + " calorias en " + ejerciciominutos + " minutos");
        } else if (tipoEjercicio == 2) {
            caloriasQuemadas = nadar * pesoKg * 0.0175;
            caloriasPorMinuto = caloriasQuemadas * ejerciciominutos;
            System.out.println("Usted quemo " + caloriasPorMinuto + " calorias en " + ejerciciominutos + " minutos");
        } else if (tipoEjercicio == 3) {
            caloriasQuemadas = correr * pesoKg * 0.0175;
            caloriasPorMinuto = caloriasQuemadas * ejerciciominutos;
            System.out.println("Usted quemo " + caloriasPorMinuto + " calorias en " + ejerciciominutos + " minutos");
        }else System.out.println("Ejercicio no encontrado");
    }
}