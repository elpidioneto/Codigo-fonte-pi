
package br.iesb.meuprograma.entidades;

import java.sql.Blob;
import java.sql.Date;


public class Pessoa_1 {
    private String nome;
    private String rg;
    private String cpf;
    private Date dataNascimento;
    private Date dataCadastro;
    private String genero;  
    private String endereco;
    private String email;    
    private String telefone;
    private String celular;
    private int Id;
    private Blob foto;
    private Blob biometria;
    private char[] senha;

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public Blob getBiometria() {
        return biometria;
    }

    public void setBiometria(Blob biometria) {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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
        if (nome != null){
        this.nome = nome;
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
