package desafiosanteriores;

import javax.swing.JOptionPane;

public class EstruturaIFELSE {
	
	public static void main(String[] args) {
		
		String nome = "";
		int idade = 0;
		
		nome = JOptionPane.showInputDialog(" digite o nome da pessoa ");
		idade = Integer.parseInt(JOptionPane.showInputDialog(" Digite a Idade "));
		
		if (idade < 18 ) {
			JOptionPane.showMessageDialog(null, nome+" � menor de idade pois tem "+idade+" anos");
			
		} else {
			JOptionPane.showMessageDialog(null, nome+" � maior  de idade pois tem "+idade+" anos");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
