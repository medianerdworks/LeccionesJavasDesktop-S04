package ejercicios01;

import java.util.Scanner;

public class Ejercicio01IfSimple {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double descuento = 0.0;
        System.out.print("Ingresa el precio Unitario del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingresa la cantidad del producto: ");
        double cantidad = sc.nextDouble();
        double precio_parcial = precio*cantidad;
        if (precio_parcial > 150) {
            descuento = precio_parcial*7/100;
        }
        
        double precio_neto = precio_parcial-descuento;
        
        System.out.println("El precio Parcial es: " + precio_parcial);
        System.out.println("El descuento es: " + descuento);
        System.out.println("El precio Neto es: " + precio_neto);
        
    }
}
