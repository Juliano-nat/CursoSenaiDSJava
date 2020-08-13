package desafiosanteriores;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		int controle = -1;
		
		String menu = " 1- Bom Dia\n ";
		       menu += "2- Boa Tarde\n ";
		       menu += "3- Boa Noite\n ";
		       menu += "0-Sair";
		       
		       while (controle != 0) {
		    	   
		    	   controle = Integer.parseInt(JOptionPane.showInputDialog(menu));
		    	   switch (controle) {
				  case 1:
					  JOptionPane.showMessageDialog(null , " Bom Dia ");
					
					break;
                   case 2:
                	   JOptionPane.showMessageDialog(null , " Bom Tarde ");
					
					break;
                   case 3:
                	   JOptionPane.showMessageDialog(null , " Boa Noite ");
					break;
                   case 0:
                	   JOptionPane.showMessageDialog(null , " Programa esta sendo encerrado ");
	               break;

				default:
					JOptionPane.showMessageDialog(null , " Você digitou uma opção invalida ");
					break;
				}
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
