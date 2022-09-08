package controle;

import java.util.ArrayList;
import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

//import javax.lang.model.util.ElementScanner14;

public class Controladora {
    private Fabrica fabrica = null;

    public void exibeMenu(){
        int opcao;
        do{
            opcao = EntradaSaida.solicitaOpcao();
             if ((this.fabrica ==null && opcao ==1 )||(this.fabrica ==null && opcao ==2 )){
                JOptionPane.showMessageDialog(null, "Nenhum carro foi montado ainda");
            }else{
                switch (opcao){

                    case 0:
                        this.fabrica = new Fabrica();

                        int qtdVeiculos = EntradaSaida.solicitaQtdCarros("carro");
                        while(qtdVeiculos<=0){
                            JOptionPane.showMessageDialog(null,"Informe uma quantidade maior que 0");
                            qtdVeiculos = EntradaSaida.solicitaQtdCarros("carro");
                        }
                        ArrayList<Carros> listaDeCarros = new ArrayList<Carros>();
                        for (int i=0; i<qtdVeiculos; i++) {
                            Carros carro = new Carros();
                            carro.setModelo(EntradaSaida.solicitaModelo("carro",(i+1)));
                            carro.setCor(EntradaSaida.solicitaCor("carro",(i+1)));
                            listaDeCarros.add(carro);                        
                        }
                        this.fabrica.montaCarros(listaDeCarros);
                        for(Carros carro: fabrica.getListaDeCarros()){
                            System.out.println("Modelo"+carro.getModelo()+"\n");
                            System.out.println("Cor" + carro.getCor()+"\n");
                        }
                    break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "VENDER CARROS - EM BREVE");
                    break;

                    case 2:
                        String informacoes = this.fabrica.mostraCarros();
                        EntradaSaida.mostrInfoCarros(informacoes);
                    break;
                }
            }
        }while(opcao!=3);
        EntradaSaida.msgEncerraLoja();
		System.exit(0);        
    }
}
