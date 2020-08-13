package desafiosanteriores;

import javax.swing.JOptionPane;

public class DesafioFOR1 {
	
	public static void main(String[] args) {
		
		int quantidade = 0;
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero que será a quantidade de OIs"));
		
		if (quantidade > 0) {
			for (int i = 0; i < quantidade; i++) {
				JOptionPane.showMessageDialog(null , "Oi "+i);
				
				
			}
			
		} else {
            JOptionPane.showMessageDialog(null , " O valor tem que ser um numero maior do que 0");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
