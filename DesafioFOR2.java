package desafiosanteriores;

import javax.swing.JOptionPane;

public class DesafioFOR2 {
	
	public static void main(String[] args) {
		
int quantidade = 0;
String ois = "";
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero que ser� a quantidade de OIs"));
		
		if (quantidade > 0) {
			for (int i = 0; i < quantidade; i++) {
				ois += " Oi ";
				JOptionPane.showMessageDialog(null , ois);
				
				
			}
			
		} else {
            JOptionPane.showMessageDialog(null , " O valor tem que ser um numero maior do que 0");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
