
package modelo;

import java.util.ArrayList;
public class Fabrica {
    private String modelo;
    private String cor;
    private ArrayList<Carro> listaDeCarros  = new ArrayList<Carro>();   
    
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

    public ArrayList<Carro> getListaDeCarros(){
        return listaDeCarros;
    }

    public void  setListaDeCarros(ArrayList<Carro> listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }

    //construir um carro
    public void montarCarro(String modelo, String cor, ArrayList<Carro> listaDeCarros){

        setModelo(modelo);
        setCor(cor);
        setListaDeCarros(listaDeCarros);
    }

    /*public void venderCarro(String modelo){

    }*/

    
}
