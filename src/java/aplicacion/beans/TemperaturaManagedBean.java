/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.modelo.dominio.Numero;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Carolina// Clase managed del punto1
 */
@ManagedBean
@RequestScoped
public class TemperaturaManagedBean {

    private Numero numero; // variable numero de tipo Numero 
    private double num;
    private char unidadOrigen;
    private char unidadDestino;
    
    public TemperaturaManagedBean() {
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    
    
    public double convertirUnidades(){
        double resultado = 0;
        numero= new Numero();
        numero.obtenerNumero(num);
        if (unidadOrigen == 'C' && unidadDestino =='F') {
            resultado = numero.obtenerCelsiusDeFarentheit();
            
        }
        return resultado;
    }
    
    
    
    
    
    
    
    
}
