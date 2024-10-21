import java.util.Scanner;
public class EJERCICIO_4_SECUENCIALES {

    static String triste = """
            Escucha esta playlist con musica triste:
            -"The Night We Met" - Lord Huron
            -"Someone Like You" - Adele
            -"Creep" - Radiohead
            -"Hurt" - Johnny Cash (cover de Nine Inch Nails)
            -"Skinny Love" - Bon Iver
""";

    static String feliz = """
            Escucha esta playlist con musica feliz:
            -"Good as Hell" - Lizzo
            -"Happy" - Pharrell Williams
            -"Can't Stop the Feeling!" - Justin Timberlake
            -"Walking on Sunshine" - Katrina and the Waves
            -"Uptown Funk" - Mark Ronson ft. Bruno Mars
            """;

    static String energico = """
            Escucha esta playlist con musica para motivarte:
            -"Eye of the Tiger" - Survivor
            -"Stronger" - Kanye West
            -"Lose Yourself" - Eminem
            -"Born to Run" - Bruce Springsteen
            -"Can't Hold Us" - Macklemore & Ryan Lewis ft. Ray Dalton           
            """;

    static String relajado = """
            Escucha esta playlist con musica relajante:
            -"Weightless" - Marconi Union
            -"Clair de Lune" - Claude Debussy
            -"Sunset Lover" - Petit Biscuit
            -"River Flows in You" - Yiruma
            -"Night Owl" - Galimatias
            """;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mood;
        System.out.println("¿Cual es tu estado de animo? triste/feliz/energico/relajado");
        mood = sc.nextLine();
        mood = mood.toLowerCase();

        switch (mood){
            case "triste":
                System.out.println(triste);
                break;

            case "feliz":
                System.out.println(feliz);
                break;

            case "energico":
                System.out.println(energico);
                break;

            case "relajado":
                System.out.println(relajado);
                break;

            default:
                System.out.println("No hemos encontrado una playlist para su estado de animo");
                break;
        }
    }
}
