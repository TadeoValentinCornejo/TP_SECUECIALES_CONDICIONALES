import java.util.Scanner;

public class EJERCICIO_3_CONDICIONALES {

    static String fantasia = "Si te gusta la fantasia te recomiendo leer \"El nombre del viento\" de Patrick Rothfuss.";
    static String misterio = "Si te gusta el misterio te recomiendo que leas \"La sombra del viento\" de Carlos Ruiz Zafón.";
    static String romance = "Si te gusta el romance te recomiendo leer \"Orgullo y prejuicio\" de Jane Austen.";
    static String cienciaFiccion = "Si te gusta la ciencia ficción te recomiendo leer \"Dune\" de Frank Herbert.";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Ingresa tu genero de libro favorito 1.fantasia / 2.misterio / 3.romance / 4.ciencia ficcion");
        op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println(fantasia);
                break;

            case 2:
                System.out.println(misterio);
                break;

            case 3:
                System.out.println(romance);
                break;

            case 4:
                System.out.println(cienciaFiccion);
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}
