package ejemplos01;

public class SentenciaIfAnidada {
    public static void main(String[] args) {
        /*
        Estructura condicional If anidada
        Evalúa una expresión lógica (Condición).
        Si esta condición es verdadera, ejecuta un grupo de instrucciones
        y si la condición lógica es falsa evalua otra condición para
        ejecutar otro grupo de instrucciones
        */
        //Evaluando niños segun su edad para ingresar a cierta categor{ia
        //en una escuela de futbol
        //hasta los 5 años -> Categoría Infantil
        //hasta los 12 años -> Categoría Junior
        //hasta los 18 años -> Categoría Juvenil
        //y mayor a los 18 años -> Categoría Adulta
        int edad = 12;
        if (edad<=5) {
            System.out.println("Perteneces a la categoría Infantil");
        }
        else if(edad>5 && edad<=12){
            System.out.println("Perteneces a la categoría Junior");
        }
        else if(edad>12 && edad<=18){
            System.out.println("Perteneces a la categoría Juvenil");
        }
        else{
            System.out.println("Pertenece a la categoria adulta");
        }
    }
    
}
