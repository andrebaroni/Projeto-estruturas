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
    CAMPO_OBRIGATORIO_CPF("Por favor, informar CPF do hóspede");

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
