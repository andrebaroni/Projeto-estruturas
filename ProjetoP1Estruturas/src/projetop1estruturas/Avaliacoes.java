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

/*  Implementando a estrutura de dados Pilha para armazenar avaliações dos clientes. Desta maneira, as avaliações mais recentes serão as primeiras a serem vistas */
public class Avaliacoes {

    /* Verificando se está lotado de avaliações */
    public boolean listaCheia() {
        if (topo == tamanho - 1) {
            return true;
        }
        return false;
    }

    /* Verificando se há espaço para novas avaliações */
    public boolean listaVazia() {
        if (topo == -1) {
            return true;
        }
        return false;
    }
    
    /* Função que insere uma avaliação */
    public void insereAvaliacao(String avaliacao) {
        if (listaCheia() == false) {
            topo = topo + 1;
            vetorAvaliacoes[topo] = avaliacao;
        } else {
            JOptionPane.showMessageDialog(null, "Lista cheia de avaliações, limpe a lista!");
        }
    }
    
    /*Função para remover avaliação do topo */
    public String removeAvaliacao() {
        String avaliacaoRemovida;
        if (listaVazia() == true) {
            avaliacaoRemovida = "Sem avaliações!";
        } else {
            avaliacaoRemovida = vetorAvaliacoes[topo];
            topo = topo - 1;
        }
        return avaliacaoRemovida;
    }
    
    
    public String imprimeAvaliacoes() {
        if (listaVazia() == true) {
            return "Sem avaliações!";
        } 
        else {
            for (int cont = topo; cont >= 0; cont--) {
                System.out.println(vetorAvaliacoes[cont]);
                return vetorAvaliacoes[cont];
            }
        }
        return null;
    } 
     
    
    /*
    public void imprimeAvaliacoes() {
        if (listaVazia() == true) {
            System.out.println("Sem avaliações!");
        } else {
            for (int cont = topo; cont >= 0; cont--) {
                System.out.println(vetorAvaliacoes[cont]);
            }
        }
        System.out.println("");
    } */
 
    public int tamanho = 100;
    public int topo = -1;
    String[] vetorAvaliacoes = new String[tamanho];

}
