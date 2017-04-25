package ejercicios03;

import ejercicios02.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio01IfElseAnidada {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double utilidades;
        DecimalFormat df = new DecimalFormat("#.##");      
        System.out.print("Ingresa el salario del trabajador: ");
        double salario = sc.nextDouble();
        System.out.print("Ingresa los años que tiene laborando: ");
        double tiempo = sc.nextDouble();

        if (tiempo < 1) {
            utilidades = salario*5/100;
        }
        else if(tiempo >= 1 && tiempo <2){
            utilidades = salario*7/100;
        }
        else if(tiempo >= 2 && tiempo <5){
            utilidades = salario*10/100;
        }
        else if(tiempo >= 5 && tiempo <10){
            utilidades = salario*15/100;
        }
        else {
            utilidades = salario*20/100;
        }
        
        System.out.println("Las utilidades del trabajador son: " + df.format(utilidades));
        
    }
}
