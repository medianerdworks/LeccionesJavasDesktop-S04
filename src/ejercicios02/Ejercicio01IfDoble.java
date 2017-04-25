package ejercicios02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio01IfDoble {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double promedio;
        DecimalFormat df = new DecimalFormat("#.##");      
        System.out.print("Ingresa la nota del curso A: ");
        double notaA = sc.nextDouble();
        System.out.print("Ingresa la nota del curso B: ");
        double notaB = sc.nextDouble();
        System.out.print("Ingresa la nota del curso C: ");
        double notaC = sc.nextDouble();
        promedio = (notaA*3 + notaB*4 + notaC*2)/9;
        if (promedio > 10.5) {
            System.out.println("El alumno ha Aprobado");
        }
        else{
            System.out.println("El alumno ha Desaprobado");
        }
        
        System.out.println("La nota final es es: " + df.format(promedio));
        
    }
}
