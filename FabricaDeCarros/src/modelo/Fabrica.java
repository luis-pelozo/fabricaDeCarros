package modelo;

//import java.io.Console;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*import visualizacao.*;
import controle.*;
import modelo.*;*/
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
        for (Carros carro : this.getListaDeCarros()){
        //for(int i = 0; i < listaDeCarros.size(); i ++){
            System.out.println("Olá");
            informacoes+= " "+ carro.getModelo() + " " + carro.getCor()+"\n";
        }
        return informacoes;
    }

    public void removerCarro(String modeloVenda, String corVenda){
        boolean jupiter = false;
        Carros carro = null;

        ArrayList<Carros> listaDeCarros = getListaDeCarros();

        for(int i = 0; i < listaDeCarros.size(); i ++){
          
            carro = listaDeCarros.get(i);

            if((modeloVenda.equalsIgnoreCase(carro.getModelo())) && (corVenda.equalsIgnoreCase(carro.getCor()))){
                listaDeCarros.remove(carro);  
                jupiter = true;
                JOptionPane.showMessageDialog(null, "Carro vendido com sucesso");                               
            }
        }   
        if(jupiter == false){
            JOptionPane.showMessageDialog(null, "Não foi possivel fazer a venda");            
        }
    }
}
