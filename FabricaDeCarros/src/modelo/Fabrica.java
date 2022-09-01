
package modelo;
import java.util.ArrayList;
    

public class Fabrica {
    private ArrayList<Carro> listaDeCarros  = new ArrayList<Carro>();   

    
    public ArrayList<Carro> listaDeCarros(){
        return listaDeCarros;
    }
    public void listaDeCarros(ArrayList<Carro> listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }

    public String venderCarro(){
        return "1";
    }

    public String fabricarCarro(){
        return "1";
    }
}
