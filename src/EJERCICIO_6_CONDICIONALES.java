import java.util.Scanner;

public class EJERCICIO_6_CONDICIONALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasSuenio,horasEjercicio,comidasSaludables;
        System.out.println("¿Cuantas horas al dia duerme?");
        horasSuenio = sc.nextInt();
        System.out.println("¿Cuantas horas al dia hace ejericico?");
        horasEjercicio = sc.nextInt();
        System.out.println("¿Cuantas comidas saludables consume al dia?");
        comidasSaludables = sc.nextInt();

        if (horasSuenio >= 7 && horasSuenio <= 9){
            System.out.println("Tienes buenos habitos de sueño");
        } else if (horasSuenio < 9) {
            System.out.println("Deberias dormir mejor.");
        }else{
            System.out.println("Estas durmiendo mas de lo recomendado. Intenta dormir menos");
        }

        if (horasEjercicio >= 1){
            System.out.println("Te ejercitas bien");
        }else System.out.println("Debes ejericitarte mas. Es importante para tu salud.");

        if (comidasSaludables >= 3){
            System.out.println("Tienes buenos habitos alimenticios.");
        }else System.out.println("Deberias consumir comida mas saludable");

    }
}
