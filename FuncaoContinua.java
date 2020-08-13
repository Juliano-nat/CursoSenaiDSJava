package desafiosanteriores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FuncaoContinua {
	
	// NOMES
	static ArrayList<String> nomes = new ArrayList<String>();
	// EMAIL
	static ArrayList<String> emails = new ArrayList<String>();
	// CELULAR
	static ArrayList<String> celulares = new ArrayList<String>();
	// SEXO
	static ArrayList<Character> sexos = new ArrayList<Character>();
	// IDADE
	static ArrayList<Integer> idades = new ArrayList<Integer>();
	private static int remove;
	
	
	public static void main(String[] args) {
		
		String nome = "";
		String email = "";
		String celular = "";
		Character sexo = ' ';
		Integer idade = 0;
		Integer tiposexo = 0;
		
		StringBuffer menu = new StringBuffer();
		menu.append("1- ADICIONAR UM CONTATO \n");
		menu.append("2- REMOVER CONTATO \n");
		menu.append("3- LISTAR CONTATOS \n");
		menu.append("4- POR GÊNERO \n");
		menu.append("5- PESQUISAR \n");
		menu.append("0- SAIR");
		
		int controle = -1;
		
		while (controle != 0) {
			
			controle = jopInt(menu.toString()); // Isso porque menu é um STRINGBUFFER, quando declaramos toString() ele se torna uma STRING NORMAL
			
			switch (controle) {
			case 1:
				// 1- ADICIONAR UM CONTATO
				// 1.1- CAPTANDO OS DADOS
				nome = usuario("Digite o nome do CONTATO");
				email = usuario("Digite o email de "+nome);
				celular = usuario("Digite o CELULAR de "+nome);
				tiposexo = jopInt("Escolha o SEXO:\n0-MASCULINO\n1-FEMININO");
				if (tiposexo==0) {
					sexo = 'M';
				} if(tiposexo==1) {
                    sexo = 'F';
				} 
				// 1.2- ADICIONANDO DADOS
				idade = jopInt("Digite a IDADE de "+nome);
				add(nome, email, celular, sexo, idade);
				
				
				break;
			case 2:
				// 2- REMOVER CONTATO
				// VAI INFORMAR O INDICE A SER REMOVIDO
				// VAI LISTAR O CONTATO REMOVIDO
				int indice = 0;
				if (nome.isEmpty()) {
					mostrar("Não ha nenhum contato!\n IMPOSSIVEL REMOVER!");
				} else {
					StringBuffer lista = new StringBuffer();
				    lista.append("Lista de Contatos para ser removida:\n");
				    lista.append("==========================================================\n");
				for (int i = 0; i < nomes.size(); i++) {
					lista.append(i+" - ");
					lista.append("Nome: ");
					lista.append(nomes.get(i)+"\n");
					lista.append("Email: ");
					lista.append(emails.get(i)+"\n");
					lista.append("Celular: ");
					lista.append(celulares.get(i)+"\n");
					lista.append("Sexo: ");
					lista.append(sexos.get(i)+"\n");
					lista.append("Idade: ");
					lista.append(idades.get(i)+"\n");
					lista.append("==========================================================\n");
					}
				indice = Integer.parseInt(JOptionPane.showInputDialog(lista));
				remContato(indice);
				mostrar("Contato removido!");
                
				}
				
						
								
				
				break;
			case 3:
				// 3- LISTAR CONTATOS
				mostrar(listarComandos());
				break;
			case 4:
				// 4- POR GÊNERO
				// vAI PERGUNTAR QUAL GENERO DEVE SER LISTADO M OU F
				Integer qualsexo = 0;
				qualsexo = jopInt("Escolha o SEXO:\n0-MASCULINO\n1-FEMININO");
				if (qualsexo==0) {
					sexo = 'M';
				} if(qualsexo==1) {
                    sexo = 'F';
				} 
				mostrar(listarporGenero(qualsexo));
				break;
			case 5:
				// 5- PESQUISAR
				nome = usuario("Quem você deseja encontrar");
				mostrar(pesquisar(nome));
				break;
			case 0:
				// 0- SAIR
				mostrar("Você Saiu");
				break;
				
			default:
				// ERRO
				mostrar("ERRO\nCOMANDO INVALIDO!");
				break;
			}
		}
		}
	
	public static Integer jopInt(String mensagem) {
		Integer numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		return numero;
		}
	
	public static String usuario(String mensagem) {
		String conta = "";
		conta = JOptionPane.showInputDialog(mensagem);
		return conta;
		}
	
	public static void  mostrar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}
	
	public static void add(String nome,String email,String celular,Character sexo,Integer idade) {
		nomes.add(nome);
		emails.add(email);
		celulares.add(celular);
		sexos.add(sexo);
		idades.add(idade);
		mostrar("CONTATO ADICIONADO");
		System.out.println(nomes+"\n"+emails+"\n"+celulares+"\n"+sexos+"\n"+idades);
	}
	
	public static String listarComandos() {
            StringBuffer lista = new StringBuffer();
		    lista.append("Lista de Contatos:\n");
		    lista.append("==========================================================\n");
		for (int i = 0; i < nomes.size(); i++) {
			lista.append("Nome: ");
			lista.append(nomes.get(i)+"\n");
			lista.append("Email: ");
			lista.append(emails.get(i)+"\n");
			lista.append("Celular: ");
			lista.append(celulares.get(i)+"\n");
			lista.append("Sexo: ");
			lista.append(sexos.get(i)+"\n");
			lista.append("Idade: ");
			lista.append(idades.get(i)+"\n");
			lista.append("==========================================================\n");
		}
		
		return lista.toString();
	}
	
	public static void remContato(Integer indice) {
		 nomes.remove(nomes.get(indice));
		 emails.remove(emails.get(indice));
		 celulares.remove(celulares.get(indice));
		 sexos.remove(sexos.get(indice));
		 idades.remove(idades.get(indice));
			
		
			
		 
		}
		
	public static String listarContatosIndice() {
		// Muito parecido com listar contatos
		StringBuffer lista = new StringBuffer();
	    lista.append("Lista de Contatos:\n");
	    lista.append("==========================================================\n");
	for (int i = 0; i < nomes.size(); i++) {
		lista.append("Indice: "+i);
		lista.append("Nome: ");
		lista.append(nomes.get(i)+"\n");
		lista.append("Email: ");
		lista.append(emails.get(i)+"\n");
		lista.append("Celular: ");
		lista.append(celulares.get(i)+"\n");
		lista.append("Sexo: ");
		lista.append(sexos.get(i)+"\n");
		lista.append("Idade: ");
		lista.append(idades.get(i)+"\n");
		lista.append("==========================================================\n");
	}
		return lista.toString();
		}
	
	public static String listarporGenero(Integer tiposexo) {
		// VAI FAZER UM LOOP NAS LISTAS E VER QUEM TEM GENERO IGUAL A VARIAVEL G
		// ADICIONAR UM STRINGBUFFER E VAI DEPOIS RETORNAR NO FIM O.TOSTRING
		Character g = ' ';
		if (tiposexo == 0) {
			g = 'M';
		}
		if (tiposexo == 1) {
			g = 'F';
		}
		StringBuffer lista = new StringBuffer();
	    lista.append("Lista de Contatos:\n");
	    lista.append("==========================================================\n");
	for (int i = 0; i < sexos.size(); i++) {
		if (sexos.get(i).equals(g)) {
			lista.append("Nome: ");
			lista.append(nomes.get(i)+"\n");
			lista.append("Email: ");
			lista.append(emails.get(i)+"\n");
			lista.append("Celular: ");
			lista.append(celulares.get(i)+"\n");
			lista.append("Sexo: ");
			lista.append(sexos.get(i)+"\n");
			lista.append("Idade: ");
			lista.append(idades.get(i)+"\n");
			lista.append("==========================================================\n");
		}
	}
	
	return lista.toString();
	}
	
	public static String pesquisar(String parametro) {
		// vai pesquisar no LOOP e ver aquilo que começa com a variavel PARAMETRO
		// CRIAR UM STRINGBUFFER IR ADICIONANDO QUANDO O IF FOR VERDADEIRO
		// NO FIM RETORNA O STRINGBUFFER.TOSTRING();
		StringBuffer lista = new StringBuffer();
	    lista.append("Lista de Contatos:\n");
	    lista.append("==========================================================\n");
	for (int i = 0; i < nomes.size(); i++) {
		if (nomes.get(i).toUpperCase().startsWith(parametro.toUpperCase())) {
			lista.append("Nome: ");
			lista.append(nomes.get(i)+"\n");
			lista.append("Email: ");
			lista.append(emails.get(i)+"\n");
			lista.append("Celular: ");
			lista.append(celulares.get(i)+"\n");
			lista.append("Sexo: ");
			lista.append(sexos.get(i)+"\n");
			lista.append("Idade: ");
			lista.append(idades.get(i)+"\n");
			lista.append("==========================================================\n");
		}
		
	}
	   return lista.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
