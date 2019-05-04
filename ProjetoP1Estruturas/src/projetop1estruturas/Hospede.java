/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop1estruturas;

/**
 *
 * @author Letica Augusto
 */
public class Hospede {
    
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String CPF;
    private String email;
    private String telefone;
    private String endereco;
    private String quarto;

    public Hospede(String nome, String sobrenome, String dataNascimento, String CPF, String email, String telefone, String endereco, String quarto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.quarto = quarto;
    }
    
        public Hospede(String nome, String sobrenome, String dataNascimento, String CPF, String email, String telefone, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
       
}
