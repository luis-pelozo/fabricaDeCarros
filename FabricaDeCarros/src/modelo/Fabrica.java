package modelo;

import java.util.ArrayList;
public class Fabrica {

    //private String modelo;
    //private String cor;
    private ArrayList<Carros> listaDeCarros = new ArrayList<Carros>();

    public ArrayList<Carros> getListaDeCarros(){
        return listaDeCarros;
    }

    public void setListaDeCarros(ArrayList<Carros> listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }

    public void montaCarros(ArrayList<Carros> listaDeCarros){
        setListaDeCarros(listaDeCarros);
    }

}
