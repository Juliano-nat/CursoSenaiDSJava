package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio02 {
	
	public static void main(String[] args) {
		
		//Declaração das variaveis
		String nome= "";
		int idade = 0;
		double altura = 0.0;
		double peso = 0.0;
		String genero = "";
		String email = "";
		
		String mensagem = "";
		
		// Armazenagem de variaveis e comandos
		nome = JOptionPane.showInputDialog(" Digite um nome ");
		idade = Integer.parseInt(JOptionPane.showInputDialog(" Digite a Idade "));
		altura = Double.parseDouble(JOptionPane.showInputDialog(" Digite a Altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog(" Digite o Peso "));
		genero = JOptionPane.showInputDialog(" Digite o sexo da pessoa ");
		email = JOptionPane.showInputDialog(" Digite o e-mail da pessoa ");
		
		
		mensagem = "Nome: "+nome+"\n"+
		           "Idade: "+idade+"\n"+
				   "Altura: "+altura+"\n"+
		           "Peso: "+peso+"\n"+
				   "Gênero: "+genero+"\n"+
		           "E-mail: "+email;
		
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		idade = idade + 2;
		
		mensagem = "Nome: "+nome+"\n"+
		           "Idade: "+idade+"\n"+
				   "Altura: "+altura+"\n"+
		           "Peso: "+peso+"\n"+
				   "Gênero: "+genero+"\n"+
		           "E-mail: "+email;
		
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		altura = altura - 0.01;
		
		mensagem = "Nome: "+nome+"\n"+
		           "Idade: "+idade+"\n"+
				   "Altura: "+altura+"\n"+
		           "Peso: "+peso+"\n"+
				   "Gênero: "+genero+"\n"+
		           "E-mail: "+email;
		
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		peso = peso + 4.5;
		
		mensagem = "Nome: "+nome+"\n"+
		           "Idade: "+idade+"\n"+
				   "Altura: "+altura+"\n"+
		           "Peso: "+peso+"\n"+
				   "Gênero: "+genero+"\n"+
		           "E-mail: "+email;
		
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		email = JOptionPane.showInputDialog(" digite um NOVO email ");
		
		mensagem = "Nome: "+nome+"\n"+
		           "Idade: "+idade+"\n"+
				   "Altura: "+altura+"\n"+
		           "Peso: "+peso+"\n"+
				   "Gênero: "+genero+"\n"+
		           "E-mail: "+email;
		
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
