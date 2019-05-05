package projetop1estruturas;

/* Criação da classe Hash para aprimorar o desempenho de inserção, busca e remoção de hóspedes */
import javax.swing.JOptionPane;
import static projetop1estruturas.InterfaceHotel.h;

/**
 *
 * @authors André Baroni, Eduardo Bapsita
 */
public class Hash {

    public Hash() {
        this.numItens = 0;
    }

    /* Implementação da insereHash, essa função recebe um número de quarto e um hóspede
       A insereHash insere um hóspede num determinado andar, de acordo com o número do quarto
       O hotel é dividido em 10 andares, o cálculo da hash é feita por módulo
     */
    public void insereHash(int numQuarto, Hospede hospede, HotelLDE l) {
        if (numItens <= quantAndares && hospede != null) {
            int mod = numQuarto % quantAndares;
            System.out.println("MODULO " + mod);
            l.insereLDE(hospede);
            vetorHospedes[mod] = l;
            numItens++;
        }
    }

    /* A função de busca da classe hash recebe como parâmetros um número de quarto e um elemento do tipo HotelLDE (o objeto),
       a partir disso, verifica se o vetor de hóspedes no módulo calculado é nulo, se ele for nulo, retorna que o
       quarto não foi encontrado, se não, retorna vetor de hóspedes com a busca de hóspede da LDE
     */
    public No buscaHash(int numQuarto, HotelLDE l) {
        int mod = numQuarto % quantAndares;
        if (vetorHospedes[mod] == null) {
            JOptionPane.showMessageDialog(null, "Quarto " + numQuarto + " se encontra vazio.");
            return null;
        }
        return (vetorHospedes[mod].buscaHospede(Integer.toString(numQuarto)));
    }

    /* A função remove da classe hash recebe como parâmetros um número de quarto,
       a partir disso, verifica se o vetor de hóspedes no módulo calculado é nulo, se ele conter um valor nulo, retorna que o
       quarto está vazio, se não, retorna a função LDE de remoção de hóspedes
     */
    public void removeHash(int numQuarto) {
        int mod = numQuarto % quantAndares;
        if (vetorHospedes[mod] == null) {
            JOptionPane.showMessageDialog(null, "Quarto " + numQuarto + " se encontra vazio.");
            return;
        }
        vetorHospedes[mod].removeHospede(Integer.toString(numQuarto));
    }

    /*Função imprime hash para testar no terminal o que se passa durante a execução de código */
    public void imprimeHash() {
        for (int i = 0; i < quantAndares; i++) {
            System.out.println("Olha o imprime hash");
            if (vetorHospedes[i] != null) {
                vetorHospedes[i].imprimeLDE();
            }
        }
    }

    /* Declarações de variáveis e instâncias da classe */
    public int quantAndares = 10;
    public HotelLDE vetorHospedes[] = new HotelLDE[quantAndares];
    public int numItens;

}
