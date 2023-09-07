/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PREDATOR
 */

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Calculos calculo = new Calculos("Operaciones");
        System.out.println(calculo.getAtributos());
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc8 = new Scanner(System.in);
        Scanner sc7 = new Scanner(System.in);
        
         
        int valor1;
        int valor2;
        int tiempo;
        boolean salir = false;
        int opcion;
         
         System.out.println("Ingrese el valor 1: ");
         valor1 = sc.nextInt();
         System.out.println("Ingrese el valor 2: ");
         valor2 = sc2.nextInt();
         System.out.println("Ingrese el anio de su nacimiento: ");
         tiempo = sc8.nextInt();
         
         
        
        while(!salir){
            
           System.out.println("*************");
           System.out.println(".............");
           System.out.println("_____________");
            
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicacion");
           System.out.println("4. Division");
           System.out.println("5. Residuo");
           System.out.println("6. Raiz");
           System.out.println("7. Factorial");
           System.out.println("8. Potencia");
           System.out.println("9. Porcentaje");
           System.out.println("10. Calcular edad");
           System.out.println("11. Mostrar todos los resultados");
           System.out.println("12. Salir");
           
           System.out.println("Escribe el numero de las opciones: ");
           opcion = sc7.nextInt();
           
           switch(opcion){
               case 1 -> {
                   
                   int suma;
                   suma = valor1 + valor2;
                   System.out.println("La suma es "+ suma);
           
                   break;
           
                }
                case 2 -> {
                   int resta;
                   resta = valor1 - valor2;
                   System.out.println("La resta es: "+ resta);
                   break;
               }
                case 3 -> {
                Scanner sc5 = new Scanner(System.in);
                Scanner sc6 = new Scanner(System.in);
                System.out.print("Introduce la cantidad de lineas a multiplicar para el valor 1: ");                                                         
                int linea1 = sc5.nextInt();
                System.out.println("Tabla del " + valor1);
                for(int i = 1; i<=linea1; i++){
                System.out.println(valor1 + " * " + i + " = " + valor1*i);                                                     
                }
                System.out.print("Introduce la cantidad de lineas a multiplicar para el valor 2: ");                                                         
                int linea2 = sc6.nextInt();
                System.out.println("Tabla del " + valor2);
                for(int i = 1; i<=linea2; i++){
                System.out.println(valor2 + " * " + i + " = " + valor2*i);                                                     
                }
                break;
                }
                case 4 -> {
                double Dividir;
                Dividir = valor1 / valor2;
                System.out.println("La división es "+ Dividir);  
                break;
                }
                case 5 -> {
                 int residuo;
                 residuo = valor1 % valor2;
                 System.out.println("El residuo de "+ valor1 + " % "+ valor2 + " es " + residuo);
                 break;
                }
                
                case 6 -> {
                double raiz1 = Math.sqrt(valor1);
                System.out.println("La raíz del valor 1 es: "+ raiz1);
                double raiz2 = Math.sqrt(valor2);
                System.out.println("La raíz del valor 2 es: "+ raiz2);
                break;
                }
                
                case 7 ->{
                 int factorial = 1;
                 for (int i = 1; i <= valor1; i++) {
                 factorial = factorial * i;
                 }
                 System.out.println("El factorial de " + valor1 + "!" + " es " + factorial);
                 for (int i = 1; i <= valor2; i++) {
                 factorial = factorial * i;
                 }
                 System.out.println("El factorial de " + valor2 + "!" + " es " + factorial);
                }
                
                case 8 -> {
                Scanner sc3 = new Scanner(System.in);
                Scanner sc4 = new Scanner(System.in);
                double potencia;
                double potencia2;
                System.out.println("Ingrese la potencia para el valor 1: ");
                int exponente = sc3.nextInt();
                System.out.println("Ingrese la potencia para el valor 2: ");
                int exponente2 = sc4.nextInt();
                potencia = Math.pow(valor1, exponente);
                System.out.println("El resultado de la potencia del valor 1 es: "+ potencia);
                potencia2 = Math.pow(valor2, exponente2);
                System.out.println("El resultado de la potencia del valor 2 es: "+ potencia2);
                break;
                } 
                
                case 9 -> {
                     Scanner sc3 = new Scanner(System.in);
                     double porcentaje;
                     double porcentaje2;
                     System.out.println("Ingrese el porcentaje: ");
                     int porciento = sc3.nextInt();
                     porcentaje = ((valor1 * 0.01) * porciento);
                     System.out.println("El "+ porciento + "%" + " del valor 1 es: "+ porcentaje);
                     porcentaje2 = ((valor2 * 0.01) * porciento);
                     System.out.println("El "+ porciento + "%" + " del valor 2 es: "+ porcentaje2);
                     break;
                }
                
                case 10 -> {
                     int total;
                     total = (tiempo - 2023) * -1;
                     System.out.println("Usted tiene: "+ total); 
                     break;
                     
                }
                
                case 11 -> {
                      Sumar(valor1,valor2);
                      System.out.println(" *** ");
                      Restar(valor1,valor2);
                      System.out.println(" *** ");
                      Dividir(valor1,valor2);
                      System.out.println(" *** ");
                      Residuo(valor1,valor2);
                      System.out.println(" *** ");
                      Raiz(valor1, valor2);
                      System.out.println(" *** ");
                      Factorial(valor1, valor2);
                      System.out.println(" *** ");
                      Potencia(valor1, valor2);
                      System.out.println(" *** ");
                      Porcentaje(valor1,valor2);
                      System.out.println(" *** ");
                      Multiplicar(valor1,valor2);
                      System.out.println(" *** ");
                      Edad(tiempo);
                      
                }
                
                case 12 -> {
                      salir = true;
                        break;
                }
                
            
       }
             
}
        
    }
public static void Sumar(int valor1, int valor2){
    int suma;
    suma = valor1 + valor2;
    System.out.println("La suma es "+ suma);
}
public static void Restar(int valor1, int valor2){
    int resta;
    resta = valor1 - valor2;
    System.out.println("La resta es: "+ resta);
}
public static void Multiplicar(int valor1, int valor2){
    Scanner sc5 = new Scanner(System.in);
    Scanner sc6 = new Scanner(System.in);
    System.out.print("Introduce la cantidad de lineas a multiplicar para el valor 1: ");
    int linea1 = sc5.nextInt();
    System.out.println("Tabla del " + valor1);
        for(int i = 1; i<=linea1; i++){
             System.out.println(valor1 + " * " + i + " = " + valor1*i);                                                     
        }
        System.out.print("Introduce la cantidad de lineas a multiplicar para el valor 2: ");                                                         
        int linea2 = sc6.nextInt();
        System.out.println("Tabla del " + valor2);
        for(int i = 1; i<=linea2; i++){
             System.out.println(valor2 + " * " + i + " = " + valor2*i);                                                     
        }
}
public static void Dividir(int valor1, int valor2){
    double Dividir;
    Dividir = valor1 / valor2;
    System.out.println("La división es "+ Dividir);
}
public static void Residuo(int valor1, int valor2){
    int residuo;
    residuo = valor1 % valor2;
    System.out.println("El residuo de "+ valor1 + " % "+ valor2 + " es " + residuo);
    
}
public static void Raiz(int valor1, int valor2){
   double raiz1 = Math.sqrt(valor1);
   System.out.println("La raíz del valor 1 es: "+ raiz1);
   double raiz2 = Math.sqrt(valor2);
   System.out.println("La raíz del valor 2 es: "+ raiz2);
} 
public static void Factorial(int valor1, int valor2){
    int factorial = 1;
    for (int i = 1; i <= valor1; i++) {
        factorial = factorial * i;
    }
   
    System.out.println("El factorial de " + valor1 + "!" + " es " + factorial);
    for (int i = 1; i <= valor2; i++) {
        factorial = factorial * i;
    }
    System.out.println("El factorial de " + valor2 + "!" + " es " + factorial);
}

public static void Potencia(int valor1, int valor2){
   Scanner sc3 = new Scanner(System.in);
   Scanner sc4 = new Scanner(System.in);
   double potencia;
   double potencia2;
   System.out.println("Ingrese la potencia para el valor 1: ");
   int exponente = sc3.nextInt();
   System.out.println("Ingrese la potencia para el valor 2: ");
   int exponente2 = sc4.nextInt();
   potencia = Math.pow(valor1, exponente);
   System.out.println("El resultado de la potencia del valor 1 es: "+ potencia);
   potencia2 = Math.pow(valor2, exponente2);
   System.out.println("El resultado de la potencia del valor 2 es: "+ potencia2);
} 
public static void Porcentaje(int valor1, int valor2){
    Scanner sc3 = new Scanner(System.in);
    double porcentaje;
    double porcentaje2;
    System.out.println("Ingrese el porcentaje: ");
    int porciento = sc3.nextInt();
    porcentaje = ((valor1 * 0.01) * porciento);
    System.out.println("El"+ porciento + "%" + " del valor 1 es: "+ porcentaje);
    porcentaje2 = ((valor2 * 0.01) * porciento);
    System.out.println("El"+ porciento + "%" + " del valor 2 es: "+ porcentaje2);
}
public static void Edad(int tiempo){
    int total;
    total = (tiempo - 2023) * -1;
    System.out.println("Usted tiene: "+ total);
 }

}
