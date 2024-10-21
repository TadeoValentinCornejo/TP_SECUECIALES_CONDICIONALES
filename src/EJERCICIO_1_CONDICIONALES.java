import java.util.Scanner;

public class EJERCICIO_1_CONDICIONALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("¿Cual es tu genero de pelicula favorito?  1.accion / 2. drama / 3. comedia / 4.ciencia ficcion");
        op = sc.nextInt();
        if (op == 1){
            System.out.println("Si te gusta las peliculas de acccion tienes que ver \"John Wick\".sigue a un asesino retirado que se ve obligado a volver al mundo del crimen después de sufrir una tragedia personal. ");
        }else if (op == 2){
            System.out.println("Si te gusta el drama y las peliculas no te puedes perder de \"El indomable Will Hunting\" (Good Will Hunting). Protagonizada por Matt Damon y Robin Williams, trata sobre un joven genio autodidacta que trabaja como conserje en el MIT y tiene la oportunidad de cambiar su vida cuando un profesor descubre su increíble talento para las matemáticas. ");
        }else if (op == 3){
            System.out.println("Si te gusta las Comedias debes ver \"¿Que paso ayer?\", la historia sigue a un grupo de amigos que despiertan en Las Vegas sin recordar lo que pasó la noche anterior, después de una descontrolada despedida de soltero.?");
        }else if (op == 4){
            System.out.println("Si te gusta la ciencia ficción tienes que ver \"El dia de la independencia\".La película está protagonizada por Will Smith.La película sigue a grupos dispares de personas que convergen en el desierto de Nevada después de un ataque mundial por parte de una poderosa raza extraterrestre  ");
        }else System.out.println("Opcion invalida");
    }
}
