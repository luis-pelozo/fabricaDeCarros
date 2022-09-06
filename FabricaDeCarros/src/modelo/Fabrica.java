
package modelo;

import java.util.ArrayList;
public class Fabrica {
    private String modelo;
    private String cor;

    private ArrayList<Veiculo> listaDeCarros  = new ArrayList<Veiculo>();   
    
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

    public ArrayList<Veiculo> getListaDeCarros(){
        return listaDeCarros;
    }

    public void  setListaDeCarros(ArrayList<Veiculo> listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }


    //construir um carro
    public void montarCarro(String modelo, String cor, ArrayList<Veiculo> listaDeCarros){

        setModelo(modelo);
        setCor(cor);
        setListaDeCarros(listaDeCarros);
    }

    public String mostraInfoCarros(){
       // String informações = "Modelo: "+ this.modelo + "\n Cor: "+ this.cor + ""
       String informacoes  = "";

       for (Veiculo veiculo:this.listaDeCarros){
        String modeloCarro = veiculo.getModelo();
       }

        return "1";
    }

}
