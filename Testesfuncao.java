package desafiosanteriores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Testesfuncao {
	
	
	
	public static void main(String[] args) {
		
		Integer qualsexo = 0;
		Character sexo = ' ';
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Character> sexos = new ArrayList<Character>();
		String nome = "";
		int console = -1;
		StringBuffer menu = new StringBuffer();
		StringBuffer lista = new StringBuffer();
		
		menu.append("1-Adicionar nome \n");
		menu.append("2-Listar nomes \n");
		menu.append("3-Listar por gênero \n");
		menu.append("0-Sair");
		
		while (console != 0) {
			
			console = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (console) {
			case 1:
				// Adicionar nomes
				nome = new String();
				nome = JOptionPane.showInputDialog("Adicione um nome na lista");
				qualsexo = Integer.parseInt(JOptionPane.showInputDialog("Qual o sexo de "+nome+"\n0-Masculino\n1-Feminino"));
				if (qualsexo == 0) {
					sexo =  'M';
				}
				if (qualsexo == 1) {
					sexo = 'F';
				}
				nomes.add(nome);
				sexos.add(sexo);
				JOptionPane.showMessageDialog(null, "Nome adicionado");
			 break;
			case 2:
				// Listar nomes
				 lista = new StringBuffer();
				     lista.append("Nomes:\n");
				     lista.append("=======================\n");
				 for (int i = 0; i < nomes.size(); i++) {
					 lista.append("Nome: "+nomes.get(i)+"\n");
					 lista.append("Sexo:"+sexos.get(i)+"\n");
					 lista.append("=======================\n");
					 }
				 JOptionPane.showMessageDialog(null, lista);
				break;
			case 3:
				qualsexo = Integer.parseInt(JOptionPane.showInputDialog("Qual o sexo de "+nome+"\n0-Masculino\n1-Feminino"));
				if (qualsexo == 0) {
					sexo =  'M';
					lista = new StringBuffer();
				     lista.append("Nomes:\n");
				     lista.append("=======================\n");
				 for (int i = 0; i < nomes.size(); i++) {
					 lista.append("Nome: "+nomes.get(i)+"\n");
					 lista.append("Sexo:"+sexos.get(i)+"\n");
					 lista.append("=======================\n");
					 }
				 JOptionPane.showMessageDialog(null, lista);
				}
				if (qualsexo == 1) {
					sexo = 'F';
					lista = new StringBuffer();
				     lista.append("Nomes:\n");
				     lista.append("=======================\n");
				 for (int i = 0; i < nomes.size(); i++) {
					 lista.append("Nome: "+nomes.get(i)+"\n");
					 lista.append("Sexo:"+sexos.get(i)+"\n");
					 lista.append("=======================\n");
					 }
				 JOptionPane.showMessageDialog(null, lista);
				}
				
			  
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Saiu com sucesso!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO\nOpção Invalida!");
				break;
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
