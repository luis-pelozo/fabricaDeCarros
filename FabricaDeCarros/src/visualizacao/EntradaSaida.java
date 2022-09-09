package visualizacao;

//import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

//import controle.Controladora;
//import modelo.Carros;
//import modelo.Fabrica;
public class EntradaSaida {

	public static int solicitaOpcao(){
		String[] opcoes = {"Montar carros", "Vender carro", "Ver carros", "Sair da fabrica"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);

		JOptionPane.showConfirmDialog(null, menu, "Selecione uma opção", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static void msgEncerraLoja(){
		JOptionPane.showMessageDialog(null, "A loja será finalziada");
		
	}

	public static int solicitaQtdCarros(String carro){
		
		//return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros para montar"));
		int QtdCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de carros")); 
		return QtdCarros;
	}

	public static String  solicitaModelo(String carro, int ordem){
		if (ordem==1) {
			return	 JOptionPane.showInputDialog("Informe o modelo e cor do carro");
	
		}else {
		String modeloCarro = JOptionPane.showInputDialog(null, "Informe o modelo e cor do "+ordem+ " carro"); 
		return modeloCarro;
		}
	}
	/*public static String solicitaCor(String carro, int ordem){		
		return	 JOptionPane.showInputDialog("Informe a cor do carro ");		
	} */	

	public static void mostrInfoCarros(String informacoes){
		JOptionPane.showMessageDialog(null, informacoes, "Informações dos carros", JOptionPane.INFORMATION_MESSAGE);
	}

	public static String  removeCarro(String carro){
		return JOptionPane.showInputDialog(null, "Informe o carro a ser vendido");
		
	}	

	/*public static int opcaoRemover(){

		String[] opcoes = {}
		JComboBox<String> menu = new JComboBox<String>(opcoes);

		JOptionPane.showConfirmDialog(null, menu, "Selecione uma opção", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}*/
}