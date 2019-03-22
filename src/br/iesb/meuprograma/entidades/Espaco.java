
package br.iesb.meuprograma.entidades;

public class Espaco {
  int id;
  String nome;
  int horaMin;
  int horaMax;
  int qtdHoras;
  int qtdReserva;
  int qtdConvidados;
  double valorReserva;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoraMin() {
        return horaMin;
    }

    public void setHoraMin(int horaMin) {
        this.horaMin = horaMin;
    }

    public int getHoraMax() {
        return horaMax;
    }

    public void setHoraMax(int horaMax) {
        this.horaMax = horaMax;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public int getQtdReserva() {
        return qtdReserva;
    }

    public void setQtdReserva(int qtdReserva) {
        this.qtdReserva = qtdReserva;
    }

    public int getQtdConvidados() {
        return qtdConvidados;
    }

    public void setQtdConvidados(int qtdConvidados) {
        this.qtdConvidados = qtdConvidados;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

  
}
