package desafiosanteriores;

import javax.swing.JOptionPane;

public class DesafioFOR3 {
	
	public static void main(String[] args) {
		
		int quantidade = 0;
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero maior do que 0 "));
		
		if (quantidade > 0) {
			
			for (int i = 1; i <= quantidade; i++) {
				if (i % 2 == 0) {
					JOptionPane.showMessageDialog(null , i+" É PAR ");
					}
				else { 
					JOptionPane.showMessageDialog(null , i+" É IMPAR ");}}
			} else {
			JOptionPane.showMessageDialog(null , " O numero como informado deve ser maior do que 0! ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
