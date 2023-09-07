/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradateclado;

import java.util.Scanner;

/**
 *
 * @author PREDATOR
 */
public class EntradaTeclado {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vall = 0, val2 = 0;
        int factorial;
        System.out.println("Ingrese dos numeros");
        System.out.println("Ingrese un numero: ");
        vall = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        val2 = sc.nextInt();
        
        System.out.println("Usted ingreso los siguientes numero: ");
        System.out.println(vall + ", "+ val2);
        System.out.println("");
        
        Suma(vall, val2);
        Resta(vall, val2);
        Multiplicar(vall, val2);
        Dividir(vall, val2);
        Residuo(vall, val2);
        Raiz(vall, val2);
        Potencia(vall, val2);
        
        
        System.out.println("Ingrese un numero para calcular el factorial");
        System.out.println("n!");
        factorial = sc.nextInt();
        Factorial(factorial);
        
    }
    
    public static void Suma(int valor1, int valor2){
        int suma;
        suma = valor1 + valor2;
        System.out.println("La suma es: " + suma);
    }
    
    public static void Resta(int valor1, int valor2){
        int resta;
        resta = valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }
    
    public static void Multiplicar(int valor1, int valor2){
        int multi;
        multi = valor1 * valor2;
        System.out.println("La multiplicacion es: " + multi);
    }
    
    public static void Dividir(int valor1, int valor2){
        double division;
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }
    
    public static void Residuo(int valor1, int valor2){
        int residuo;
        residuo = valor1 % valor2;
        System.out.println("El residuo es: " + residuo);
    }
    
    public static void Raiz(int valor1, int valor2){
        double raizVall = Math.sqrt(valor1);
        double raizVal2 = Math.sqrt(valor2);
        System.out.println("La raiz de " + valor1 + " es " + raizVall);
        System.out.println("La raiz de " + valor2 + " es " + raizVal2);
    }
    
    public static void Potencia(int valor1, int valor2){
        double potencial = Math.pow(valor1, 2);
        double potencial2 = Math.pow(valor2, 2);
        System.out.println("El cuadrado de  "+ valor1 + " es " + potencial);
        System.out.println("El cuadrado de  "+ valor2 + " es " + potencial2);
    }
    
    public static void Factorial(int valor1){
        int factorial = 1;
        for (int i = 1; i <= valor1; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + valor1 + "!" + " es " + factorial);
    }
}
