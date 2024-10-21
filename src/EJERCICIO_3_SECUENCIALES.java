import java.util.Scanner;
public class EJERCICIO_3_SECUENCIALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condicion_fisica;
        String rutine;
        System.out.println("Ingrese su condicion fisica: 1.basica / 2.intermedia / 3.avanzada");
        condicion_fisica = sc.nextInt();

        switch (condicion_fisica){
            case 1:

                rutine = "Sentadillas con peso corporal - 3 series de 12 repeticiones\nFlexiones de rodillas - 3 series de 10 repeticiones\nPuente de glúteos - 3 series de 12 repeticiones";
                        break;

            case 2:
                rutine = "Sentadillas con peso - 4 series de 12 repeticiones\nPeso muerto con mancuernas o barra - 4 series de 10 repeticiones\nEstocadas caminando - 4 series de 12 repeticiones (cada pierna)";
                        break;

            case 3:
                rutine = "Sentadillas con barra - 5 series de 8 repeticiones\nPress de banca plano con barra - 5 series de 8-10 repeticiones\nRemo con barra - 5 series de 8-10 repeticiones";
                        break;

            default:
                rutine = "Rutina de ejercicios no encontrada";
                        break;
        }

        System.out.println("Su rutina de ejercicios es:\n"+ rutine);

    }
}
