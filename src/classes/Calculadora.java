/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author relan
 */
public class Calculadora {
     //Atributos
    public double tensaoFonte;
    public double tensaoLed;
    public double corrente;
    public double resistencia;

    //Contrutor
    public Calculadora(double tensaoFonte, double tensaoLed, double corrente) {
        this.tensaoFonte = tensaoFonte;
        this.tensaoLed = tensaoLed;
        this.corrente = corrente;
    }
    
    //Getter e Setter
    public double getTensaoFonte() {
        return tensaoFonte;
    }

    public void setTensaoFonte(double tensaoFonte) {
        this.tensaoFonte = tensaoFonte;
    }

    public double getTensaoLed() {
        return tensaoLed;
    }

    public void setTensaoLed(double tensaoLed) {
        this.tensaoLed = tensaoLed;
    }

    public double getCorrente() {
        return corrente;
    }

    public void setCorrente(double corrente) {
        this.corrente = corrente;
    }
    
    
    public double resistorSerie(){
        resistencia = (tensaoFonte - tensaoLed) / corrente;
        return resistencia;
    }
}
