package controle;


import modelo.*;
import visualizacao.EntradaSaida;
import javax.swing.JOptionPane;
import java.util.ArrayList;
//import javax.lang.model.util.ElementScanner14;

public class Controladora {
    
    private Carro carro = null;

    public void exibeMenu(){
        int opcao;
        do{

            opcao  = EntradaSaida.solicitaOpcao();

            if (this.carro ==null && opcao ==1 || opcao ==2){
                JOptionPane.showMessageDialog(null," Nenhum carro foi montado ainda");

            }else{

                switch(opcao){

                    case 0:
                    this.carro = new Carro();

                    String modelo = EntradaSaida.solicitaModelo("Carro", 0);
                    String cor    = EntradaSaida.solicitaCor();
                   /*  int qtdCarros = EntradaSaida.solicitaQtdCarros("Carros");
                    while(qtdCarros<=0){
                        JOptionPane.showMessageDialog(null, "Informe uma quantidade válida");
                        qtdCarros = EntradaSaida.solicitaQtdCarros("Carros");
                    }*/

                    ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();
                    /*for (int i=0; i<1; i++){
                        Carro carro = new Carro();
                        carro.setModelo(EntradaSaida.solicitaModelo("Carro", (i+1)));
                        carro.setCor(EntradaSaida.solicitaCor());
                        
                    }*/
                   // this.carro.montarCarro(modelo, cor, listaDeCarros);
                   listaDeCarros.add(carro);
                    /*************************************************************** */
                    System.out.println("MODELO DO CARRO: "+ carro.getModelo() + "\n");
                    System.out.println("COR DO CARRO:" + carro.getCor()+ "\n");;
                    /*************************************************************** */
                    for(Carro carro: carro.getListaDeCarros()) {
                        System.out.println("Descrição da porta: "+ carro.getModelo()+"\n");
                        System.out.println("Estado da Porta: "   + carro.getCor()+"\n");
                    }    
                    break;
                    
                    case 1:
                    JOptionPane.showMessageDialog(null, "VENDER UM CARRO");

                    break;

                    case 2:
                    //JOptionPane.showMessageDialog(null, "VER INFO DO CARRO");
                    String informacoes = this.carro.mostraInfoCarros();
						EntradaSaida.exibeInformacaoCarro(informacoes);
                }
            }
        }while (opcao !=3);
        EntradaSaida.exibeEncerraPrograma();
		System.exit(0);
    }   
}
