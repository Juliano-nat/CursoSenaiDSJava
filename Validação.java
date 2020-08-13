package desafiosanteriores;

import javax.swing.JOptionPane;

public class Validação {
	
	
	
	public static boolean validaPlaca(String placa){
		   boolean valido = true;
		   placa = placa.replaceAll("[^0-9]", "");
		   if(placa.length() != 5){
		      valido = false;
		   }
		  
			   if(!placa.substring(3).matches("[0-9]*")){
			      valido = false;
			   }
		   return valido;
		}
	
	public static void main(String[] args) {
		
		String num = "";
		
		num = JOptionPane.showInputDialog("Digite um numero com 5 caracteres");
		
		validaPlaca(num);
		
		if (validaPlaca(num) == false) {
			
			JOptionPane.showMessageDialog(null, "Erro!");			
		}
		if (validaPlaca(num) == true) {
			
			JOptionPane.showMessageDialog(null, num);
			
		}
		
		
	}

}
