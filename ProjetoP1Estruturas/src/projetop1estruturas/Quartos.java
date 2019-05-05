/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop1estruturas;

import javax.swing.JOptionPane;

/**
 *
 * @author augus
 */
public class Quartos {
    
    private Hospede hospede;
    private int numQuarto;
    private boolean disponivel;
    private String dataCheckout;
    private int numero = 0;
    private int i;
    
    public Quartos(){}
    
    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    //funcao que insere quartos na LES
    public int insereQuartosLES(int x, int maxQuartos, Quartos v[]){    
        if(numero == maxQuartos){
            JOptionPane.showMessageDialog(null, MensagensErro.QUARTOS_OCUPADOS.getMensagem());
        }
        
        for(; i < numero && v[i].getNumQuarto() < x; i ++){}
            for(int j = numero; j > i; j--){
                v[j] = v[j-1];
            }
           
            v[numero] = new Quartos();
            v[numero].setNumQuarto(x);
            int retornaQuarto = v[numero].getNumQuarto();
            numero++;
            return retornaQuarto;
    
    }
    
    
}
