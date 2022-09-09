package modelo; 

public  class Carros { 

    protected String modelo;
    protected String cor;
    protected int quantidadeCarros;

    public String getModelo(){
        return modelo;
    }

    public void setModelo( String modelo){
        this.modelo = modelo;
    }

   /* public String getCor(){
        return cor;
    }*/ 

    /* public void setCor(String cor){
        this.cor = cor;
    }*/ 

    public int getQuantidadeCarros(){
        return quantidadeCarros;
    }

    public void setQuantidadeCarros(int quantidadeCarros){
        this.quantidadeCarros = quantidadeCarros;
    }

}

