package projetop1estruturas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*Criando a classe LES para gerenciar os quartos do hotel*/
public class HotelLES {
    //construtor precisa receber novo hospede
    public HotelLES(Hospede hospede) {
        //hospedes.add(hospede);
        this.hospede = hospede;
        //quartosOcupados = 0;
    }
    /*Construtor da classe que inicia com n inicial em zero */
    
    private Hospede hospede;
    /*Cada índice do vetorHotel é um dos quartos do hotel o hotel possui 50 quartos para locação*/
    private final char vetorHotel[] = new char[50];
    /*O estacionamento comporta 50 veículos */
    private final char vetorEstacionamento[] = new char[50];
    private int quartosOcupados;
    private int quartosLivres = 50;
    
    

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
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
    /**
    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }
    
    private ArrayList<Hospede> hospedes = new ArrayList<>();
    * **/
}     

    
    