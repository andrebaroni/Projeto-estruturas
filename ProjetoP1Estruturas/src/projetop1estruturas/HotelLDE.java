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
/**
 * Implementação da insereLDE, essa função recebe um hóspede e insere esse hospede na LDE
 * 
 */
  public No insereLDE(Hospede hospede){
    No novo = new No();
    novo.setPessoa(hospede);
    novo.setProx(null);
    No anterior = null;
    No proximo = primeiro;

    while(proximo != null){ 
      anterior = proximo;
      proximo = proximo.getProx();
    }

    if(anterior != null){
      anterior.setProx(novo);
    }else{
      primeiro = novo;
    }
    novo.setProx(proximo);
    n++;
    return novo;
  }
  
  /** essa função quando chamada, remove o hospede de acordo com o quarto passado por parametro
   */
  public boolean removeHospede(String x){
    No proximo = primeiro;
    No anterior = null;

    while(primeiro != null && proximo != null){
      if(x.equals(proximo.getPessoa().getQuarto())){
        if(anterior != null){
          anterior.setProx(proximo.getProx());
        }else{
          primeiro = proximo.getProx();
        }
        proximo = null;
        n--;
        return true;
      }
      anterior = proximo;
      proximo = proximo.getProx();
    }
    return false;
  }
  
  //essa função quando chamada, busca o hospede de acordo com o quarto passado por parametro
  public No buscaHospede(String quarto){
      No atual = primeiro;
      while(atual != null){
          if(quarto.equals(atual.getPessoa().getQuarto())){
              return atual;
          }
          atual = atual.getProx();
      }
      return null;
  }

  //função que imprime a LDE, usada apenas para testes
  public void imprimeLDE(){
    No temp = primeiro;
    while(temp != null){
      System.out.println(temp.getPessoa().getNome() + " " + temp.getPessoa().getSobrenome() + " " + temp.getPessoa().getQuarto() + " " + temp.getPessoa().getCPF() + " " + temp.getPessoa().getEmail() + " " + temp.getPessoa().getTelefone() + " " + temp.getPessoa().getEndereco() + " " + temp.getPessoa().getDataNascimento());
      temp = temp.getProx();
    }
  }
}
