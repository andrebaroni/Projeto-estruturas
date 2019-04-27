package projetop1estruturas;

/**
 *
 * @author André Baroni
 */
public class Hash {
    public Hash(){

  }

  void insere(int numQuarto, Hospede hospede){
    if(numItens <= tam){
      //int mod = x % tam;
      //table[mod].insereLDE(x);
      vetorHospedes[numQuarto].insereLDE(hospede);
      numItens++;
    }
  }

  public int tam = 50;
  public HotelLDE vetorHospedes[] = new HotelLDE[tam];
  public int numItens;
}
