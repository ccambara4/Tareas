/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.no.pkg7;

/**
 *
 * @author PREDATOR
 */
public class Informacion {
        String Nombres;
        String Apellidos;
        int Edad;
        double saldo_cuenta;
        String NumeroC;
        String Tipo;
        boolean Estado;

    public Informacion() {
    }

    public Informacion(String Nombres, String Apellidos, int Edad, double saldo_cuenta, String NumeroC, String Tipo, boolean Estado) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.saldo_cuenta = saldo_cuenta;
        this.NumeroC = NumeroC;
        this.Tipo = Tipo;
        this.Estado = Estado;
    }


    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSaldo_cuenta() {
        return saldo_cuenta;
    }

    public void setSaldo_cuenta(double saldo_cuenta) {
        this.saldo_cuenta = saldo_cuenta;
    }

    public String getNumeroC() {
        return NumeroC;
    }

    public void setNumeroC(String NumeroC) {
        this.NumeroC = NumeroC;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    public String getAtributos(){
        return "Nombre Completo: " + this.Nombres + " " + this.Apellidos + "\n" +
                "Edad: " + this.Edad + "\n" +
                "Saldo: " + this.saldo_cuenta + "\n" +
                "Numero de cuenta: " + this.NumeroC + "\n" +
                "Tipo: " + this.Tipo + "\n" +
                "Estado: " + this.Estado + "\n";
    }

    
        
        
}
