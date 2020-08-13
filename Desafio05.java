package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio05 {
	
	public static void main(String[] args) {
		
		int opcao = 0;
		Double numero1 = 0.0;
		Double numero2 = 0.0;
		Double resultado = 0.0;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog(" Digite um numero "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog(" Digite outro numero "));
		
		
		
		String menu = " Escolha uma opção\n";
		   menu += " 1 - somar\n ";
		   menu += " 2 - subtrair\n ";
		   menu += " 3 - multiplicar\n ";
		   menu += " 4 - dividir ";
		   
		   opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		   
		   switch (opcao) {
		case 1:
			resultado = numero1 + numero2;
			JOptionPane.showMessageDialog(null , numero1+" + " +numero2+ " = " +resultado);
			
			break;
		case 2:
			resultado = numero1 - numero2;
			JOptionPane.showMessageDialog(null , numero1+" - " +numero2+ " = " +resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			JOptionPane.showMessageDialog(null , numero1+" x " +numero2+ " = " +resultado);
			break;
		case 4:
			if (numero2 == 0) {
				JOptionPane.showMessageDialog(null , " numero2 não pode ser dividido por 0!");
				
			} else {
				resultado = numero1 / numero2;
				JOptionPane.showMessageDialog(null , numero1+" ÷ " +numero2+ " = " +resultado);

			}
			break;

		default:
			JOptionPane.showMessageDialog(null , " Nenhuma opção foi selecionada corretamente!");
			break;
		}
		   
		   
		    
		   
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
