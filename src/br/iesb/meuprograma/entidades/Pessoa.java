package br.iesb.meuprograma.entidades;

import java.awt.image.BufferedImage;

public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String dataCadastro;
    private String genero;
    private String endereco;
    private String email;
    private String telefone;
    private String celular;
    private int Id;
    private BufferedImage foto;
    private BufferedImage biometria;
    private String bloco;
    private int Unidade;

    public Pessoa() {
    }
   

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    public BufferedImage getBiometria() {
        return biometria;
    }

    public void setBiometria(BufferedImage biometria) {
        this.biometria = biometria;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = "";
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getUnidade() {
        return Unidade;
    }

    public void setUnidade(int Unidade) {
        this.Unidade = Unidade;
    }

}
