/*
ALUMNO: TADEO CORNEJO
EJERCICIO 1 SECUENCIALES
*/

import java.util.Scanner;

public class EJERCICIO_1 {
    public static void main(String[] args) {
        String acuario = "La visión futurista de Acuario revoluciona ideas y promueve el cambio social.";
        String piscis = "La empatía y la intuición de Piscis son profundas, conectando el mundo emocional con lo espiritual.";
        String aries = "La energía y el impulso de Aries son imparables. Siempre el primero en actuar y abrir caminos nuevos.";
        String tauro = "La estabilidad y perseverancia de Tauro te recuerdan que con paciencia, todo florece.";
        String geminis = "La dualidad de Géminis es su fortaleza. Comunicativo y adaptable, siempre tiene algo que compartir.";
        String cancer = "La sensibilidad y protección de Cáncer te envuelven como un refugio emocional.";
        String leo = "El brillo de Leo ilumina cualquier lugar. Su confianza y creatividad inspiran a todos a su alrededor.";
        String virgo = "Virgo, con su precisión y atención al detalle, demuestra que en lo pequeño reside la perfección.";
        String libra = "El equilibrio y la armonía son el don de Libra, siempre buscando la justicia y la paz.";
        String escorpio = "La intensidad de Escorpio transforma todo a su paso. No teme profundizar en lo oculto para hallar la verdad.";
        String sagitario = "La aventura y el optimismo de Sagitario te animan a explorar más allá de tus horizontes.";
        String capricornio = "La determinación de Capricornio es inquebrantable. El éxito llega a quienes trabajan con perseverancia";

        Scanner sc = new Scanner(System.in);
        int dia,mes,anio;
        System.out.println("Introduzca su fecha de nacimiento en el siguiente formato: DD/MM/AAAA");
        System.out.println("Introduzca el dia de su nacimiento");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes de su nacimiento");
        mes = sc.nextInt();
        System.out.println("Introduzca el año en el que nacio");
        anio = sc.nextInt();
        System.out.println("Usted nacio el "+dia+"/"+mes+"/"+anio+" y su signo del zodiaco es: ");

        if((dia >= 20 && dia <= 31 && mes == 1) || dia >= 0 && dia <= 18 && mes == 2) {
            System.out.println("Acuario: "+acuario);
        } else if ((dia >= 20 && dia <= 30 && mes == 2) || dia >= 0 && dia <= 20 && mes == 3 ) {
            System.out.println("Piscis: "+ piscis);
        } else if ((dia >= 21 && dia <= 31 && mes == 3) || dia >= 0 && dia <= 19 && mes == 4) {
            System.out.println("Aries: "+aries);
        }else if ((dia >= 20 && dia <= 31 && mes == 4) || dia >= 0 && dia <= 20 && mes == 5) {
            System.out.println("Tauro: "+tauro);
        }else if ((dia >= 21 && dia <= 31 && mes == 5) || dia >= 0 && dia <= 20 && mes == 6) {
            System.out.println("Geminis: "+ geminis);
        }else if ((dia >= 21 && dia <= 30 && mes == 6) || dia >= 0 && dia <= 22 && mes == 7) {
            System.out.println("Cancer: "+ cancer);
        }else if ((dia >= 23 && dia <= 31 && mes == 7) || dia >= 0 && dia <= 22 && mes == 8) {
            System.out.println("Leo: "+leo);
        }else if ((dia >= 23 && dia <= 31 && mes == 8) || dia >= 0 && dia <= 22 && mes == 9) {
            System.out.println("Virgo: "+virgo);
        }else if ((dia >= 23 && dia <= 30 && mes == 9) || dia >= 0 && dia <= 22 && mes == 10) {
            System.out.println("Libra: "+libra);
        }else if ((dia >= 23 && dia <= 31 && mes == 10) || dia >= 0 && dia <= 21 && mes ==11) {
            System.out.println("Escorpio: "+escorpio);
        }else if ((dia >= 22 && dia <= 31 && mes == 11) || dia >= 0 && dia <= 21 && mes == 12) {
            System.out.println("Sagitario: "+sagitario);
        }else if ((dia >= 22 && dia <= 31 && mes == 12) || dia >= 0 && dia <= 19 && mes == 1) {
            System.out.println("Capricornio: "+capricornio);
        }else System.out.println("fecha invalida");


    }
}

