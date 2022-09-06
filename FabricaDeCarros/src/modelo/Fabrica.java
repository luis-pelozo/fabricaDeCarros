
package modelo;
import modelo.*;

import java.util.ArrayList;
public class Fabrica {

    //private String modelo;
	//private String cor;
	private ArrayList<Carros> listaDeCarros  = new ArrayList<Carros>(); 
   
   /*public String getModelo(){
        return modelo;
    }*/

    /*public void setModelo(String modelo){
        this.modelo = modelo;
    }*/

   /*  public String getCor(){
        return cor;
    } */

   /*  public void setCor(String cor){
        this.cor = cor;
    }*/

    public ArrayList<Carros> getListaDeCarros(){
        return listaDeCarros;
    }

    public void setListaDeCarros(ArrayList<Carros> listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }

    //construir um carro
   /*  public void montarCarro(String modelo, String cor, ArrayList<Carros> listaDeCarros){

        setModelo(modelo);
        setCor(cor);
        setListaDeCarros(listaDeCarros);
    }*/

    /*public void venderCarro(String modelo){

    }*/
   /*  public String geraInfoFabrica(){
     String informacoes = "Modelo: "+:this.getModelo + "\n Cor: "+ this.cor + "\n Lista de carros: \n";
     for (Carros carro:this.listaDeCarros){
        informacoes += carro.getModelo() + "GERAINFO";
        //add aqui a cor tbm
     }  
     return informacoes; 
    }*/
    
}
