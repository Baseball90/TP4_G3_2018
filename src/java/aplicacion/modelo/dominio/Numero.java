/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Carolina_ Clae dominio del punto1
 */
public class Numero implements Serializable{
    private double numero;
    
    public Numero(){
        
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public void obtenerNumero(double numero){
        this.numero = numero;
        
    }
    public double obtenerCelsiusDeFarentheit(){
        return 1.8*numero+32;
    }
    
}
