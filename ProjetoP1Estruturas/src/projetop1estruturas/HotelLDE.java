/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop1estruturas;

/**
 *
 * @author André Baroni
 */
public class HotelLDE {
    public No primeiro;
  int n;

  public HotelLDE(){
    this.primeiro = null;
    this.n = 0;
  }

  public void insereLDE(Hospede hospede){
    No novo = new No();
    novo.pessoa = hospede;
    novo.prox = null;
    No anterior = null;
    No proximo = primeiro;

    while(proximo != null){ //&& proximo.valor < hospede){
      anterior = proximo;
      proximo = proximo.prox;
    }

    if(anterior != null){
      anterior.prox = novo;
    }else{
      primeiro = novo;
    }
    novo.prox = proximo;
    n++;
  }
  
  public boolean remove(String x){
    No proximo = primeiro;
    No anterior = null;

    while(primeiro != null && proximo != null){
      if(x.equals(proximo.pessoa.getQuarto())){
        if(anterior != null){
          anterior.prox = proximo.prox;
        }else{
          primeiro = proximo.prox;
        }
        proximo = null;
        n--;
        return true;
      }
      anterior = proximo;
      proximo = proximo.prox;
    }
    return false;
  }

  public void imprimeLDE(){
    No temp = primeiro;
    while(temp != null){
      System.out.println(temp.pessoa.getNome() + " " + temp.pessoa.getSobrenome() + " " + temp.pessoa.getQuarto());
      temp = temp.prox;
    }
  }
}
