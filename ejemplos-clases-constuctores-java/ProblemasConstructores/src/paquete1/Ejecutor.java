/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos*/
        Hospital h1 = new Hospital();
        
        System.out.printf("- Hospital: %s\n- Ciudad: %s\n- Numero de Doctores: "
                + "%d\n- Numero de enfermeros: %d\n", h1.obtenerNombre(),
                h1.obtenerCiudad(),h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());
        
    }
}
