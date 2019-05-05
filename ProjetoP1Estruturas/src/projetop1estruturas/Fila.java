/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop1estruturas;

import java.util.Arrays;
import javax.swing.JList;
import javax.swing.JOptionPane;


/**
 *
 * @author André Baroni
 */
public class Fila {
    private Hospede hospede;
    private static final int MAX = 50;
    public int i, f, senhaApagada;
    public int v[] = new int[MAX];
    
    
    public Fila(){
        this.i = 0;
        this.f = i;
    }

    public void setSenhaApagada(int senhaApagada) {
        this.senhaApagada = senhaApagada;
    }


    public int getSenhaApagada() {
        return senhaApagada;
    }
    
    //funcao para enfileirar um numero na fila
    boolean enfileira(int x){
        if( ((f+1) % MAX) == i){
            System.out.println("Fila cheia");
            return false;
        }
        v[f] = x;
        f = (f+1) % MAX;
        return true;
    }
    
    //Movimenta a fila caso tenha um checkout de hospede
    public void desenfileiraHospede(Fila filaReserva[], int tamanhoFila){
        for(int i = 0; i<tamanhoFila ; i++){
            filaReserva[i] = filaReserva[i+1];
            
        }
        filaReserva[tamanhoFila]= null;
    }
    
    boolean desenfileira(){
        if(i == f){
            JOptionPane.showMessageDialog(null, "Fila vazia");
            return false;
        }
        senhaApagada = v[i];
        v[i] = 0;
        i = (i+1)%MAX;
        JOptionPane.showMessageDialog(null, "Atender senha: " + senhaApagada );
        return true;
    }
    
    void imprime(){
        int x;
        for(x = i; x != f ; x = (x+1) % MAX){
            System.out.println(v[x] + " ");
        }
        System.out.println("\n");
    }
    
    void limpa(){
        while(i != f){
            i = (i+1) % MAX;
        }
    }
    
    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
     
    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public static int getMAX() {
        return MAX;
    }

    public int getI() {
        return i;
    }

    public int getF() {
        return f;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setF(int f) {
        this.f = f;
    }
}
