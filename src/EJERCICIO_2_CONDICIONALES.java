import java.util.Scanner;

public class EJERCICIO_2_CONDICIONALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        int categoria;
        System.out.println("Ingresa el precio del producto");
        precio = sc.nextDouble();
        System.out.println("¿A que categoria perteneces? 1. Estudiantes / 2. adultos / 3. jubilados");
        categoria = sc.nextInt();

        if (categoria == 1) {
            System.out.println("Se aplica un descuento del 10% por ser estudiante");
            System.out.println("Precio final " + (precio - (precio * 0.1)));
        } else if (categoria == 2) {
            System.out.println("Se aplica un descuento del 5% por ser adulto");
            System.out.println("Precio final " + (precio - (precio * 0.05)));
        } else if (categoria == 3) {
            System.out.println("Se aplica un descuento del 15% por ser jubilado");
            System.out.println("Precio final " + (precio - (precio * 0.15)));
        }else{
            System.out.println("Categoria no encontrada");
            System.out.println("Su precio es"+ precio);
        }

    }
}