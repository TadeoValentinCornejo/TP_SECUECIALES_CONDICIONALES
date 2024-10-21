import java.util.Scanner;
import java.math.*;
public class EJERCICIO_4_CONDICIONALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoKg, alturaM;
        System.out.println("Introduce tu peso en Kilogramos");
        pesoKg = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce tu altura en metros");
        alturaM = sc.nextDouble();
        double IMC = pesoKg / Math.pow(alturaM,2);
        System.out.println("Su indice de Masa Corporal es de: "+IMC);
        if (IMC < 18.5){
            System.out.println("Su peso en bajo, debe comer mas proteinas y carbohidratos.");
        } else if (IMC >= 18 && IMC <= 24.9) {
            System.out.println("Usted tiene un peso adecuado");
        } else if (IMC >=25 && IMC <= 29.9) {
            System.out.println("Usted tiene sobre peso, debe realizar un deficit calorico");
        } else if (IMC >= 30) {
            System.out.println("Usted sufre de obesidad debe perder urgentemente");
        }
    }
}
