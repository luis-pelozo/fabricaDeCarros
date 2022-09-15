package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import visualizacao.*;
import controle.*;
import modelo.*;
public class Fabrica {

    //private String modelo;
    //private String cor;
    private static ArrayList<Carros> listaDeCarros = new ArrayList<Carros>();

    public ArrayList<Carros> getListaDeCarros(){
        return listaDeCarros;
    }

    public void setListaDeCarros(ArrayList<Carros> listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }

    public void montaCarros(ArrayList<Carros> listaDeCarros){
        setListaDeCarros(listaDeCarros);
    }

    public String mostraCarros(){
        String informacoes = "Lista de Carros: \n";
        for (Carros carro:this.listaDeCarros){
            informacoes+= " "+carro.getModelo() + " " + carro.getCor()+"\n";
        }
        return informacoes;
    }

    public static boolean removerCarro(String corVenda, String modeloVenda, Fabrica fabrica ){
        boolean jupiter = false;
        
        for(Carros carro: fabrica.getListaDeCarros()){
            if(modeloVenda.equalsIgnoreCase(carro.getModelo()) && corVenda.equalsIgnoreCase(carro.getCor())){
                listaDeCarros.remove(carro);  
                jupiter = true;
                
            }else{
                jupiter = false;
            }
        }   
        if(jupiter = true){
            JOptionPane.showMessageDialog(null, "Carro vendido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "foi não");
        }
        System.out.println(jupiter);
        
        return jupiter;
    
    }

}
