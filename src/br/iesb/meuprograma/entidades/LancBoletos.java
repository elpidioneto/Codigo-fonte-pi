
package br.iesb.meuprograma.entidades;


public class LancBoletos {
    

private int id;
private int cliente;
private int data;
private int vencimento;
private int valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }
    public void setCliente(int cliente) {
        
        this.cliente = cliente;
            
        }
    public void setCliente(String competencia) {
        
        try{
            this.cliente = Integer.valueOf(competencia);
        }catch(NumberFormatException e){
            this.cliente = 0;
            
        }
       
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
       
    }
    
    public void setData(String data) {
        
        try{
            this.data = Integer.valueOf(data);
        }catch(NumberFormatException e){
            this.data = 0;
            
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
}
    




