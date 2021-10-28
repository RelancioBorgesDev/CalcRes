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
    private double tensaoFonte;
    private double tensaoLed;
    private double corrente;
    private int quantidade;


    //Contrutor
    public Calculadora(double tensaoFonte, double tensaoLed, double corrente) {
        this.tensaoFonte = tensaoFonte;
        this.tensaoLed = tensaoLed;
        this.corrente = corrente;
    }
      public Calculadora() {
     
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
    
      public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double resistor(){
        return (tensaoFonte - tensaoLed) / (corrente / 1000);
    }
    public double resistorSerie(){
        return (tensaoFonte - (tensaoLed * quantidade)) / (corrente / 1000);
    }
    public double resistorParalelo(){
        return (tensaoFonte - tensaoLed)  / ((corrente / 1000) * quantidade);
      
    }
    
}
