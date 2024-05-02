/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        FacturaTelefonica fac = new FacturaTelefonica();
        // se llama al método que calcula el valor de la factura
        fac.calcularValorFactura(); 
        System.out.printf("%s\n", fac);
        
        // Se crea un objeto haciendo referencia al constructor 
        // con argumentos de la clase
        String numero = "123456789";
        double minutos = 100;
        double valorMinutos = 0.25;
        
        FacturaTelefonica fac2 = new FacturaTelefonica(numero, minutos, 
                valorMinutos);
        // se llama al método que calcula el valor de la factura
        fac2.calcularValorFactura(); 
        System.out.printf("%s\n", fac2);
    }
}
