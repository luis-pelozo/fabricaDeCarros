package modelo;

import java.util.ArrayList;

public class Carro {

    protected String modelo;
    protected String cor;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void montarCarro(String modelo2, String cor2, ArrayList<Carro> listaDeCarros) {
    }

    public Carro[] getListaDeCarros() {
        return null;
    }
    public String mostraInfoCarros(){
        String informacoes  = "Catalogo de Carros";
 
        for (Carro carro:this.getListaDeCarros()){
         informacoes += carro.getModelo() + "Cor: "+ carro.getCor() + "\n";
        }
         return informacoes;
     }
 
   

}

