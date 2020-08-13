package desafiosanteriores;

import javax.swing.JOptionPane;

public class DefinindoumaSenha {
	
	public static void main(String[] args) {
		
		String senhaPrincipal = "123";
		String senhaqualquer = "";
		boolean confere = false;
		
		while (confere == false) {
			
			senhaqualquer = JOptionPane.showInputDialog(" Digite a senha verdadeira ");
			if (senhaqualquer.equals(senhaPrincipal)) {
				confere = true;
				JOptionPane.showMessageDialog(null , "Senha aceita");
				} else {
				JOptionPane.showMessageDialog(null , "Senha incorreta!");}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
