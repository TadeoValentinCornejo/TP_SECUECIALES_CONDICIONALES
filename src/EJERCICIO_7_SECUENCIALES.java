import java.util.Scanner;
public class EJERCICIO_7_SECUENCIALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int satisfaccionLive,estres,salud,alimentacion,social;
        System.out.println("Califica del 1 al 10 tu satisfacción con la vida");
        satisfaccionLive = sc.nextInt();
        System.out.println("Califica del 1 al 10 tu nivel de estres");
        estres = sc.nextInt();
        System.out.println("Califica del 1 al 10 tu estado de salud");
        salud = sc.nextInt();
        System.out.println("Califica del 1 al 10 tu dieta diaria");
        alimentacion =sc.nextInt();
        System.out.println("Califica el 1 al 10 que tan conforme estas con tu circulo social");
        social = sc.nextInt();
        double indiceFelicidad = (satisfaccionLive+estres+salud+alimentacion+social) / 5;
        System.out.println("Su Indice de felicidad es de "+ indiceFelicidad+ " Puntos.");
    }
}
