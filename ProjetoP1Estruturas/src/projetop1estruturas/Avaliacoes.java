/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop1estruturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Baptista
 */

/*  implementando a estrutura de dados Pilha dinâmica pra as avaliações desta maneira, as últimas avaliações serão as primeiras a serem vistas */

public class Avaliacoes {
    No novo = new No();
    public Avaliacoes() {
        this.topo = topo;
        topo = null;
    }
    No topo;
    No anterior;
    int contador = 0;
    
    public void insereAvaliacao(String avaliacao){
        novo.texto = avaliacao;
        anterior = topo; 
        topo = novo;
        contador++; 
    } 
    
 
    public String imprimeAvaliacao(){
        if(novo.texto == null){
            return "Não há avaliações";
            //JOptionPane.showMessageDialog(null, "Não há avaliações!");
        } 
        else
            System.out.println(topo.texto);
          // JOptionPane.showMessageDialog(null, topo.texto);
           for(int i = contador-2; i >= 0; i--){
           // JOptionPane.showMessageDialog(null, anterior.texto);
             return anterior.texto;
        }  
        return null;
  }
  public void removeAvaliacao(){
      
  }
    
}
