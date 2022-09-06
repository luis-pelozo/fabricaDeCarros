package visualizacao;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import controle.Controladora;

public class EntradaSaida {

    public static int solicitaOpcao() {
		
		String[] opcoes = {"Fabricar Carro" , "Vender um carro", "Ver informações do carro", "Sair do programa"};
		
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
	}

	public static void exibeEncerraPrograma(){
		JOptionPane.showMessageDialog(null, "Programa finalizado");
	}

	public static int solicitaQtdCarros(String carro){
		
		return Integer.parseInt( JOptionPane.showInputDialog("Informe a quantidade de "/*+carro*/));
	}

	public static String solicitaModelo(String modelo, int ordem) {		
		if (ordem == 0){
			return JOptionPane.showInputDialog("Informe o modelo do "+modelo);
		}else{
			return JOptionPane.showInputDialog("Informe o modelo do "+ordem + " "+modelo);
		}		
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor do Carro");
	}

	
    
	public static void exibeInformacaoCarro(String informacoes){
		JOptionPane.showMessageDialog(null, informacoes, "Informações do carro", JOptionPane.INFORMATION_MESSAGE);
	}
}
