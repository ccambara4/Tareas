/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.no.pkg7;

/**
 *
 * @author PREDATOR
 */
public class Cuenta {

    public static void main(String[] args) {
        Informacion informacion = new Informacion("Carlos Armando", "Cambara Lopez", 22, 54879, "45789655", "Monetaria", true);
        Informacion informacion2 = new Informacion("Patricia Maria", "Garcia Marquez", 26, 3542, "578448", "Ahorro", false);
        Informacion informacion3 = new Informacion("Sandra Olga", "Tellez Garcia", 30, 12.58, "32548758", "Monetaria", true);
        Informacion informacion4 = new Informacion("Jose Carlos", "Hernandez Ramirez", 25, 548, "23654741", "Ahorro", false);
        Informacion informacion5 = new Informacion("Jeyson", "Valdez Ramos", 45, 200, "342025198", "Monetaria", true);
        
        informacion4.setEdad(22);
        informacion5.setNombres("Jeyson Josue");
        informacion3.setNumeroC("5698547");
        
        //Primera Persona
        if (informacion.saldo_cuenta >= 1000) {
            System.out.println("Cliente tipo A");
            System.out.println(informacion.getAtributos());
        } else if (informacion.saldo_cuenta >= 500 & informacion.saldo_cuenta < 1000) {
            System.out.println("Cliente tipo B");
            System.out.println(informacion.getAtributos());
        }else if (informacion.saldo_cuenta < 500) {
            System.out.println("Cliente tipo C");
            System.out.println(informacion.getAtributos());
        }
        
        //Segunda Persona
        if (informacion2.saldo_cuenta >= 1000) {
            System.out.println("Cliente tipo A");
            System.out.println(informacion2.getAtributos());
        } else if (informacion2.saldo_cuenta >= 500 & informacion2.saldo_cuenta < 1000) {
            System.out.println("Cliente tipo B");
            System.out.println(informacion2.getAtributos());
        }else if (informacion2.saldo_cuenta < 500) {
            System.out.println("Cliente tipo C");
            System.out.println(informacion2.getAtributos());
        }
        
        //Tercera Persona
        if (informacion3.saldo_cuenta >= 1000) {
            System.out.println("Cliente tipo A");
            System.out.println(informacion3.getAtributos());
        } else if (informacion3.saldo_cuenta >= 500 & informacion3.saldo_cuenta < 1000) {
            System.out.println("Cliente tipo B");
            System.out.println(informacion3.getAtributos());
        }else if (informacion3.saldo_cuenta < 500) {
            System.out.println("Cliente tipo C");
            System.out.println(informacion3.getAtributos());
        }
        
        //Cuarta Persona
        if (informacion4.saldo_cuenta >= 1000) {
            System.out.println("Cliente tipo A");
            System.out.println(informacion4.getAtributos());
        } else if (informacion4.saldo_cuenta >= 500 & informacion4.saldo_cuenta < 1000) {
            System.out.println("Cliente tipo B");
            System.out.println(informacion4.getAtributos());
        }else if (informacion4.saldo_cuenta < 500) {
            System.out.println("Cliente tipo C");
            System.out.println(informacion4.getAtributos());
        }
        
        //Quinta Persona
        if (informacion5.saldo_cuenta >= 1000) {
            System.out.println("Cliente tipo A");
            System.out.println(informacion5.getAtributos());
        } else if (informacion5.saldo_cuenta >= 500 & informacion5.saldo_cuenta < 1000) {
            System.out.println("Cliente tipo B");
            System.out.println(informacion5.getAtributos());
        }else if (informacion5.saldo_cuenta < 500) {
            System.out.println("Cliente tipo C");
            System.out.println(informacion5.getAtributos());
        }
    }
    
}
