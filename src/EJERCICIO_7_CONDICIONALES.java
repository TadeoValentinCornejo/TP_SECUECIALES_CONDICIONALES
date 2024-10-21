import java.util.Scanner;

public class EJERCICIO_7_CONDICIONALES {
    static String triste = """
            te recomiendo salir a caminar. Pasar tiempo al aire libre y moverte puede ayudarte a despejar la mente y mejorar tu estado de ánimo.
            """;
    static String feliz = """
            Escucha musica y baila.Es una excelente forma de expresar tu alegría y disfrutar del momento. ¡Déjate llevar por el ritmo!
            """;
    static String relajado = """
            Te recomiendo meditar.Tomarte un momento para concentrarte en tu respiración y en el presente puede ayudarte a profundizar en esa sensación de calma y tranquilidad.
            """;
    static String energico = """
            te recomiendo hacer ejercicio. Ya sea correr, ir al gimnasio, bailar o practicar un deporte, mover tu cuerpo es una gran manera de canalizar esa energía y disfrutar de la actividad física.
            """;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mood;
        System.out.println("¿Cual es tu estado de animo? triste/feliz/energico/relajado");
        mood = sc.nextLine();
        mood = mood.toLowerCase();

        switch (mood){
            case "relajado":
                System.out.println(relajado);
                break;
            case "feliz":
                System.out.println(feliz);
                break;
            case "triste":
                System.out.println(triste);
                break;
            case "energico":
                System.out.println(energico);
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
    }
}
