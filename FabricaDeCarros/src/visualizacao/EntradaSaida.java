package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int solicitaOpcao() {
		
		String[] opcoes = {"Fabricar Carro" , "Vender um carro", "Ver informações do carro", "Sair do programa"};
		
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
	}

	public static String solicitaModelo(String modelo, int ordem) {		
		return JOptionPane.showInputDialog("Informe o modelo do "+modelo);
	
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa");
	}
    
}
