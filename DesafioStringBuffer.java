package desafiosanteriores;

import javax.swing.JOptionPane;

public class DesafioStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer menu = new StringBuffer();
		menu.append("Escolha uma opção");
		menu.append("\n");
		menu.append("1-Bom dia");
		menu.append("\n");
		menu.append("2-Boa Tarde");
		menu.append("\n");
		menu.append("3-Boa noite");
		menu.append("\n");
		menu.append("0-Sair");
		       
		int controle = -1;
		       
		       while (controle != 0) {
		    	   // menu = objeto quando StringBuffer. menu.toString() transforma em String
		    	   controle = Integer.parseInt(JOptionPane.showInputDialog(menu.toString()));
		    
		    	   switch (controle) {
			   case 1:
				JOptionPane.showMessageDialog(null , "Bom dia");
				break;
			   case 2:
			   JOptionPane.showMessageDialog(null , "Boa tarde");
			   break;
			   case 3:
				   JOptionPane.showMessageDialog(null , "Boa noite");
				   break;
			   case 4:
				   JOptionPane.showMessageDialog(null , "Sair");
				   break;
			default:
				   JOptionPane.showMessageDialog(null , "Erro");
				break;
			}
				
			}
		       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
