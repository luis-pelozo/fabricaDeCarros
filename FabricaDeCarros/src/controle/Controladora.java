package controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthListUI;

import visualizacao.EntradaSaida;
import modelo.*;

//import javax.lang.model.util.ElementScanner14;

public class Controladora {
   
    private Fabrica fabrica = new Fabrica();
    private Carros carro = new Carros();
    private ArrayList<Carros> listaDeCarros = new ArrayList<Carros>();

    public void exibeMenu(){
        int opcao;
        do{
            
            opcao = EntradaSaida.solicitaOpcao();

            if ((this.fabrica ==null && opcao ==1 )||(this.fabrica ==null && opcao ==2 )){
                JOptionPane.showMessageDialog(null, "Nenhum carro foi montado ainda");
            }
            
                switch (opcao){
                    case 0:
                       // this.fabrica = new Fabrica();
                        int qtdVeiculos = EntradaSaida.solicitaQtdCarros("carro");
                        
                        while(qtdVeiculos<1){
                            JOptionPane.showMessageDialog(null,"Informe uma quantidade maior que 0");
                            qtdVeiculos = EntradaSaida.solicitaQtdCarros("carro");
                        }
                        
                        for (int i=0; i<qtdVeiculos; i++) {
                            Carros carro = new Carros();
                            carro.setModelo(EntradaSaida.solicitaModelo((i+1)));
                            carro.setCor(EntradaSaida.solicitaCor());
                            listaDeCarros.add(carro);                        
                        }
                        this.fabrica.montaCarros(listaDeCarros);
                        for(Carros carro: fabrica.getListaDeCarros()){
                            System.out.println("Modelo "+carro.getModelo()+"\n");
                            System.out.println("Cor " + carro.getCor()+"\n"); 
                        }  
                    break;

                    case 1:                    
                        String info= this.fabrica.mostraCarros();
                        EntradaSaida.mostrInfoCarros(info);
                        String modeloVenda = EntradaSaida.solicitaModeloRemover();
                        String corVenda     = EntradaSaida.solicitaCor(); 
                        fabrica.removerCarro(modeloVenda, corVenda);                              
                    break;

                    case 2:
                        String informacoes = this.fabrica.mostraCarros();
                        EntradaSaida.mostrInfoCarros(informacoes);
                    break;
                }
        
        }while(opcao!=3);
        EntradaSaida.msgEncerraLoja();
		System.exit(0);        
    }
}
