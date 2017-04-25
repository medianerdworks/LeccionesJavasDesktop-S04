package ejemplos01;

public class SentenciaIfDoble {
    public static void main(String[] args) {
        /*
        Estructura condicional If-Else
        Evalúa una expresión lógica (Condición)
        Si esta condición es verdadera, ejecuta una determinada instrucción o instrucciones
        y si esta condición lógica es falsa va a ejecutar otro grupo de instrucciones
        */
        int edad = 24;
        if (edad<18) {
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("Eres mayor de edad");
        }
    }
    
}
