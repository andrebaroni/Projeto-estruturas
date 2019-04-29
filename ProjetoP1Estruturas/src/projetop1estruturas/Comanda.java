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
public class Comanda {
    private static final int MAX_COMANDAS = 50;
    private int inicio = 0;
    private int fim = 0;
    int v[] = new int[MAX_COMANDAS];
   
    
    public boolean insere(int numero){
        if(((fim + 1) % MAX_COMANDAS) == inicio){
            return false;
        }
        v[fim] = numero;
        fim = (fim + 1) % MAX_COMANDAS;
        JOptionPane.showMessageDialog(null, "Comanda nº:" + numero + " cadastrada!");
        return true;
    }
    
    //imprimir relação de comandas e hospedes
    public void imprimirComanda(){
        int x;
        
    }
    
}
