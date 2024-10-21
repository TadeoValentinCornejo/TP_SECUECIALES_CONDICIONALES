import java.util.Scanner;
public class EJERCICIO_6_SECUENCIALES {

    static String dosHoras = """
            Tu plan de estudio es:
            Lunes: Introduccion a la programacion (2 horas)
            Martes: Matematica (2 horas)
            Miercoles: Sistemas Operativos (2 horas)
            Jueves: introduccion a la progrmacion (2 horas)
            Vierenes: ingles (2 horas)
            """;

    static String tresHoras = """
            Tu plan de estudio es:
            Lunes: Programacion con python (3 horas)
            Martes: Sistemas Operativos (3 horas)
            Miercoles: Algoritmos y estructuras de datos (3 horas)
            Jueves: Ingles (1 hora y media) - Arquitectura de Computadores (1 hora y media)
            Viernes: Matematica (3 horas)
            """;

    static String cuatroHoras = """
            Tu plan de estudio es:
            Lunes: Matematica (4 horas)
            Martes: Programacion con java (4 horas)
            Miercoles: Ingles (2 horas) - Logica y estructuras Discretas (2 horas)
            Jueves: Sistemas operativos  (4 horas)
            Viernes: Progrmacion con Javascript (4 horas)
            """;

    static String cincoHoras = """
            Tu plan de estudio:
            Lunes: Algoritmos y estructura de datos (5 horas)
            Martes: Matematica (2 horas y media) - ingles (2 horas y media)
            Miercoles: Programacion Con C#
            Jueves: Matematica (2 horas y media) - Sistemas operativos (2 horas y media)
            Viernes: Programacion con Python
            """;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasEstudio;
        System.out.println("¿Cuantas horas la dia puedes estudiar?");
        horasEstudio = sc.nextInt();
        if (horasEstudio>= 2 && horasEstudio<6){
            switch (horasEstudio){
                case 2:
                    System.out.println(dosHoras);
                    break;

                case 3:
                    System.out.println(tresHoras);
                    break;

                case 4:
                    System.out.println(cuatroHoras);
                    break;

                case 5:
                    System.out.println(cincoHoras);
                    break;
            }
        } else if (horasEstudio < 2) {
            System.out.println("El minimo de horas de estudio diarias es de 2 horas");
        }else System.out.println("El limite de horas diarias es 5");

    }
}
