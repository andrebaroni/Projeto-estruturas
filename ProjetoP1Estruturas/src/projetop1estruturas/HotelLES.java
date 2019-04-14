package projetop1estruturas;

import javax.swing.JOptionPane;

/*
 * @author Eduardo Baptista
 */

/*Criando a classe LES para gerenciar os quartos do hotel*/
public class HotelLES {
    /*Cada índice do vetorHotel é um dos quartos do hotel o hotel possui 50 quartos para locação*/
    private final char vetorHotel[] = new char[50];
    /*O estacionamento comporta 50 veículos */
    private final char vetorEstacionamento[] = new char[50];
    private int quartosOcupados;
    private int quartosLivres = 50;
    
    /*Construtor da classe que inicia com n inicial em zero */
    public HotelLES() {
        this.quartosOcupados = quartosOcupados;
        quartosOcupados = 0;
    }
     
    public void insereNoQuarto(int x){
        if(quartosOcupados==50){
            JOptionPane.showMessageDialog(null, "O hotel não suporta mais locações!");
        }
        vetorHotel[x] = 'O';
        quartosOcupados++;
        quartosLivres--;
    }
    
    public void imprime(){
        System.out.println(vetorHotel[2]);
        JOptionPane.showMessageDialog(null, "Quartos ocupados: " + quartosOcupados);
        JOptionPane.showMessageDialog(null, "Quartos livres: " + quartosLivres);
    }  
}     

  
