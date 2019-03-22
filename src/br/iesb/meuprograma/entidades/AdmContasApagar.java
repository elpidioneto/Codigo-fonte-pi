
package br.iesb.meuprograma.entidades;


public class AdmContasApagar {
    private int id;
    private int competencia;
    private int valor;
    private int vencimento; 
    private int valorPago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompetencia() {
        return competencia;
    }
    public void setCompetencia(int competencia) {
        
        this.competencia = competencia;
            
        }
    public void setCompetencia(String competencia) {
        
        try{
            this.competencia = Integer.valueOf(competencia);
        }catch(NumberFormatException e){
            this.competencia = 0;
            
        }
       
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
       
    }
    
    public void setValor(String valor) {
        
        try{
            this.valor = Integer.valueOf(valor);
        }catch(NumberFormatException e){
            this.valor = 0;
            
        }
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }
    
    public void setVencimento(String vencimento) {
        
        try{
            this.vencimento = Integer.valueOf(vencimento);
        }catch(NumberFormatException e){
            this.vencimento = 0;
            
        }
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
        }
    
     public void setValorPago(String valorPago) {
        
        try{
            this.valorPago = Integer.valueOf(valorPago);
        }catch(NumberFormatException e){
            this.valorPago = 0;
            
        }
    }
}
    




