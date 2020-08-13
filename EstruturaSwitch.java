package desafiosanteriores;

import javax.swing.JOptionPane;

public class EstruturaSwitch {
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		String menu = " Escolha uma opção:\n ";
		menu += "1 - Bom dia\n ";
		menu += "2 - Boa tarde\n ";
		menu += "3 - Boa noite  ";
		
		
		
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null , " BOM DIA ");
			
			break;
		case 2:
			JOptionPane.showMessageDialog(null , " BOA TARDE ");
			
			break;
		case 3:
			JOptionPane.showMessageDialog(null , " BOA NOITE ");
			
			break;

		default:
			JOptionPane.showMessageDialog(null , " Nenhuma das alternativas foram selecionadas ");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
