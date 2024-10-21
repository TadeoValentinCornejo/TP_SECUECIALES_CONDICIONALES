import java.util.Scanner;
import java.util.Random;

public class EJERCICIO_5_CONDICIONALES {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int op;
        int randomNumber = random.nextInt(3) + 1;
        System.out.println("Jugemos al piedra, papel o tijera, elije: 1.piedra/ 2.papel / 3.tijera");
        op = sc.nextInt();

        if (op == 1) {
            if (randomNumber == 1) {
                System.out.println("La CPU escogio piedra\n¡Empataste!");
            } else if (randomNumber == 2) {
                System.out.println("La CPU escogio papel\n¡Has perdido!");
            } else System.out.println("La CPU escogio tijera\n¡Has ganado!");
        } else if (op == 2) {
            if (randomNumber == 1) {
                System.out.println("La CPU escogio piedra\n¡Has ganado!");
            } else if (randomNumber == 2) {
                System.out.println("La CPU escogio papel\n¡Empataste!");
            } else System.out.println("La CPU escogio tijera\n¡Has perdido!");
        } else if (op == 3) {
            if (randomNumber == 1) {
                System.out.println("La CPU escogio piedra\n¡Has perdido!");
            } else if (randomNumber == 2) {
                System.out.println("La CPU escogio papel\n¡Has ganado!");
            } else System.out.println("La CPU escogio tijera\n¡Empataste!");
        } else{
            System.out.println("Opcion invalida");
        }
    }
}