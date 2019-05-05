package projetop1estruturas;

/**
 *
 * @author André Baroni
 */
//leticia
//andre ******************* OLHA PARA MIM PFFFFFFFFFFFFFFFFFFFFF ******************************
public class No {
  private Hospede pessoa;
  private No prox;
  private String texto;

    public Hospede getPessoa() {
        return pessoa;
    }

    public void setPessoa(Hospede pessoa) {
        this.pessoa = pessoa;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
  
}
