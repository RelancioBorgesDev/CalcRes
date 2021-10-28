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
public class Informações {
    public String formulas(){
        return "Um LED: R = (VtensãoResistor - VtensãoLed) ÷ I"+
                "\nLed em série R = (VtensãoResistor - (VtensãoLed * quantidadeDeLeds)) ÷ I"
                +"\nLed em paralelo R = (VtensãoResistor - VtensãoLed ) ÷ I * quantidadeDeLeds ";
    }
    public String autores(){
        String dados = "Autores do Projeto: ";
        return dados += "\nCristiano Afonso Emanuel Francisco da Silva" +
                "\nJoão Pedro José Assis Hermenegildo" +
                "\nRelancio Borges dos Santos";
    }
    
    public String objetivo(){
        return "O objetivo do nosso projeto é trabalhar a programação\n"
                + "com a física de forma que podemos criar um projeto que \n"
                + "engloba as duas matérias e também praticamos a gestão de projetos.";
    }
    
    public String versao(){
        return "Versão 0.1.0";
    }
}
