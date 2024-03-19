package tpo2;



public class TPO2 {
    public static void main(String[] args) {        
        Aleatorio num1= new Aleatorio(1);
       
        System.out.println("¡Este es el Trabajo Practico Obligatorio 2!");
        System.out.println("Numero aleatorio es: "+ num1.getNum());
        
     //Modificado por Facundo Bacaicoa
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Suma de dos numeros aleatorios");
     Sumar suma = new Sumar(10, 10);
        System.out.println("Primer número: " + suma.getNum1());
        System.out.println("Segundo número: " + suma.getNum2());
       suma.sumarNumeros();
       
    }
    
}
