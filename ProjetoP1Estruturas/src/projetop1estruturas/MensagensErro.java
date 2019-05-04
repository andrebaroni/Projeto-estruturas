package projetop1estruturas;

/**
 *
 * @author augus
 */
public enum MensagensErro {
    
    /**
     *
     */
    DATA_INVALIDA("Data inválida!"),
    CAMPO_OBRIGATORIO_NOME("Campo obrigatório nulo. Por favor, preencher o nome do hóspede"),
    CAMPO_OBRIGATORIO_SOBRENOME("Campo obrigatório nulo. Por favor, preencher o sobrenome do hóspede"),
    CAMPO_OBRIGATORIO_ENDERECO("Campo obrigatório nulo. Por favor, preencher o endereco do hóspede"),
    CAMPO_OBRIGATORIO_TELEFONE("Campo obrigatório nulo. Por favor, preencher o telefone do hóspede"),
    CAMPO_OBRIGATORIO_CPF("Por favor, informar CPF do hóspede"),
    ERRO_TAMANHO("Campo com tamanho inválido!"),
    QUANTIDADE_QUARTOS("Existem apenas 50 quartos"),
    QUARTOS_OCUPADOS("Todos os quartos estão ocupados"),
    CAMPO_OBRIGATORIO_QUARTO("Por favor, preencha o número do quarto do hóspede");
    

    private MensagensErro(String mensagem) {
        this.mensagem = mensagem;
    }
    
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    } 

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
