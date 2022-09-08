package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import controle.Controladora;
import modelo.Carros;
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
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros para montar"));
	}

	public static String  solicitaModelo(String carro){
		String modeloCarro = JOptionPane.showInputDialog(null, "Informe o modelo do carro"); 
		return modeloCarro;
	}

	public static String solicitaCor(String carro){
		String corCarro = JOptionPane.showInputDialog(null, "Informe a cor do carro");
		return corCarro;
	}

	public static void mostrInfoCarros(String informacoes){
		JOptionPane.showMessageDialog(null, informacoes, "Informações dos carros", JOptionPane.INFORMATION_MESSAGE);
	}



}
