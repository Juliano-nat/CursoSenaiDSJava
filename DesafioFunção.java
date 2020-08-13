package desafiosanteriores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DesafioFunção {
	
	static  ArrayList<String> nomes = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		// Cada função armazena outra função
		adicionarNome(
				criarNome(
						janelaStr("Informe ", "o nome"), 
						janelaStr("Informe", "o sobrenome")));
		adicionarNome(
				criarNome(
						janelaStr("Informe ", "o nome"), 
						janelaStr("Informe", "o sobrenome")));
		adicionarNome(
				criarNome(
						janelaStr("Informe ", "o nome"), 
						janelaStr("Informe", "o sobrenome")));
		
		janela("Listar nomes: ", listarNomes());
		
	}

	public static String criarNome(String nome, String sobrenome) { // Esse é o nome+sobrenome
		String usuario = " ";
		usuario = nome+" "+sobrenome;
		return usuario;
		
		
	}
	
	public static void adicionarNome(String nome) { // Executa o armazenamento do nome na ArrayList
		nomes.add(nome);
		JOptionPane.showMessageDialog(null, nome+" Adicionado!");
		System.out.println(nome);
	}
	
	public static String janelaStr(String titulo, String conteudo) { // Esse pergunta ao Usuario o nome e sobrenome
		String msg = "";
		msg = JOptionPane.showInputDialog(titulo+" "+conteudo);
		return msg;
	}
	
	public static void janela(String titulo, String conteudo) { // Este mostra a lista de nomes
		JOptionPane.showMessageDialog(null, titulo+"\n"+conteudo);
		
	}
	
	public static String listarNomes() { // esse lista os nomes nas quantidades informadas
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < nomes.size(); i++) {
			sb.append(nomes.get(i));
			sb.append("\n");
			
			}
		return sb.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
