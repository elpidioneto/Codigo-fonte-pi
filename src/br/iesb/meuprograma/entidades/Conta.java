
package br.iesb.meuprograma.entidades;
public class Conta {
    int id;
    String conta;
   // int Idtitulo; // caminho ideal de armazenamento, nesta versão não usada.
    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

/*    public int getIdtitulo() {
        return Idtitulo;
    }

    public void setIdtitulo(int Idtitulo) {
        this.Idtitulo = Idtitulo;
    }*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
     
}
