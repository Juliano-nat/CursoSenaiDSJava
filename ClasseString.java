package desafiosanteriores;

import javax.swing.JOptionPane;

public class ClasseString {
	
	public static void main(String[] args) {
		
		// length (): Retorna o tamanho da String
		// charAt (): Retorna um caractere de acordo com indice especificado
		// toUpperCase (): Transforma todas as letras de uma determinada String em maiuscula
		// toLowerCase (): Transforma todas as letras de uma determinada String em minuscula
		// substring (): Retorna uma copia de caractere de uma string apartir de dois indices
		//               inteiros especificos.
		
		// trim(): Remove todos os espaços em branco que aparecem no inicio ou final da String
		// replace(): Utilizada para substituição de caracteres individuais em uma determinada String
		// startsWith(): Retorna true se uma String inicia com prefixo
		
		String nome = new String(" Julio ");
		String nome2 = "Juliano";
		
		JOptionPane.showMessageDialog(null , nome);
		JOptionPane.showMessageDialog(null , nome.length());
		JOptionPane.showMessageDialog(null , nome.charAt(1));
		JOptionPane.showMessageDialog(null , nome.toUpperCase());
		JOptionPane.showMessageDialog(null , nome.toLowerCase());
		JOptionPane.showMessageDialog(null , nome.substring(3));
		JOptionPane.showMessageDialog(null , nome.trim());
		JOptionPane.showMessageDialog(null , nome.replace(nome, nome2));
		JOptionPane.showMessageDialog(null , nome.startsWith(nome));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
