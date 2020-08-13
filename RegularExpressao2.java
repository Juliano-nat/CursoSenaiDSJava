package desafiosanteriores;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegularExpressao2 {
	
	// TODO INICIO
	
	public static ArrayList<String> celulares = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	
	
	public static boolean celular(String placa){ // Ele valida numeros de até 11 caracteres e aceita caracteres especiais
		   boolean valido = true;
		   placa = placa.replaceAll("[^0-9]", "");
		   if(placa.length() != 5){			   
		     return false;		      
		   }		  
			   if(!placa.substring(0,4).matches("[0-9]*")){				   
				     return false;				     
				   }			    			  			   
		   return valido;
		}
	
	public static boolean email(String placa){ // Ele valida numeros de até 11 caracteres e aceita caracteres especiais
		   boolean valido = true;
		   placa = placa.replaceAll("[^a-z,A-Z]", "");
		   if(placa.length() != 5){			   
		     return false;		      
		   }		  
			   if(!placa.substring(0,4).matches("[a-z,A-Z]*")){				   
				     return false;				     
				   }			    			  			   
		   return valido;
		}
	
	public static Integer jopint(String numero) { // Retorno de numeros inteiros
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog(numero));
		return num;
	}
	
	public static void jopmes(String msg) { // mostra mensagem
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String jopstr(String msg) { // Retorno de String
		String m = "";
		m = JOptionPane.showInputDialog(msg);
		return m;
		
	}
	
	public static void main(String[] args) {
		
		String texto = "";
		String regex = "";
		Pattern pattern = Pattern.compile(regex);
		
		
		String num = "";
		
		int console = -1;
		
		StringBuffer lista = new StringBuffer();
		
		StringBuffer menu = new StringBuffer();
		menu.append("1-Numero do celular\n");
		menu.append("2-Endereço de Email\n");
		menu.append("3-Endereço de rede IPV4\n");
		menu.append("4-CPF\n");
		menu.append("0-Sair");
		
		StringBuffer cell = new StringBuffer();
		cell.append("1-Adicionar:\n");
		cell.append("2-Listar\n");
		cell.append("3-Pesquisar através de Expressão Regular:\n");
		cell.append("0-Sair");
		
		int controle = -1;
		
		
		
		
		
		
		while (console != 0) {
			
			console = jopint(menu.toString());
			
			controle = -1;
			
			switch (console) {
			
			case 1: // NUMERO DO CELULAR
				controle = -1;
				
				// TODO CELULAR
				
				while (controle != 0) {
					
					controle = jopint("Celular:\n"+cell.toString());
					
					switch (controle) {
					case 1: // ADICIONAR NUMERO DE CELULAR
						num = new String();
						
						
						
						num = JOptionPane.showInputDialog("Digite o numero do celular\n Nesse formato:(XX)XXXXX-XXXX");
						
						if (celular(num) == false) {
							jopmes("Numero Invalido!");
						}
						
						if (celular(num) == true) {
							
							celulares.add(num);
							
							jopmes("Numero adicionado com sucesso!");					
						}
						break;
					
					case 2: // LISTAR NUMERO DE CELULAR
						if (celulares.isEmpty()) {
							jopmes("Nenhum numero a ser listado!");
						}
						else {
						lista = new StringBuffer();
						
						lista.append("Lista de numeros de celular:\n");
						for (int i = 0; i < celulares.size(); i++) {
							lista.append("Celulares: "+celulares.get(i)+"\n");
							lista.append("================================\n");
						}
						jopmes(lista.toString());}
						break;
					
					case 3: // PESQUISAR POR EXPRESSÃO REGULAR
						
						// \d - DIGITOS
						
						// \D - TUDO QUE NÃO FOR DIGITO
						
						// \s - BUSCA ESPAÇOS EM BRANCO \t \n \f \r
						
						// \S CARACTERES QUE NÃO ESTÃO EM BRANCO
										
						// \w CARACTERES DE PALAVRAS a-z A-Z, DIGITOS e_
						
						// \W TUDO O QUE NÃO FOR CARACTERES DE PALAVRAS
						
						// Lembre-se do metodo de escape utilizando no caso do Java é "\" 
						
						// No caso de querermos encontrar digitos POR EXEMPLO seria assim no regex "\\d"
						
						lista = new StringBuffer();
						
						regex = "";
						
						    lista.append("Lista de numeros de celular:\n");
						for (int i = 0; i < celulares.size(); i++) {
							lista.append("Celulares: "+celulares.get(i)+"\n");
							lista.append("================================\n");
						}
						  regex = jopstr(lista.toString()+"\nPesquise através da Expressão Regular");
						    
						
						pattern = Pattern.compile(regex);
						Matcher matcher = pattern.matcher(celulares.toString());
						System.out.println("Celulares: "+celulares); // mostra o texto saida de dados
						System.out.println("Indice: 0123456789"); // indice de 0-9
						System.out.println("Matcher: "+matcher.pattern()); // caracter padrão
						System.out.println("Posições encontradas!"); // mostra de todos os indices onde foram encontrados o caracter padrão
						
						while (matcher.find()) {
							System.out.println(matcher.start() +" ");
						}
						
						
						break;
					
					case 0: // SAIR
						jopmes("Você retornou ao menu principal!");
						break;

					default: // OPÇÃO INVALIDA
						jopmes("Erro!\nOpção invalida");
						break;
					}
					
				}
				
				
				break;
			case 2: // ENDEREÇO DE EMAIL
				
				// TODO EMAIL
				
				controle = -1;
				
				while (controle != 0) {
					
					controle = jopint("Endereço de Email:\n"+cell.toString());
					
					switch (controle) {
					case 1: // ADICIONAR EMAIL
						texto = new String();
						
						
						
						
						break;
					case 2: // LISTAR EMAIL
						
						break;
					case 3: // EXPRESSÃO REGULAR DO EMAIL
						
						break;
					case 0: // SAIR

					default: // OPÇÃO INVALIDA
						break;
					}
					
				}
				
				break;
			case 3: // ENDEREÇO IPV4
				
				// TODO IPV4
				
				controle = -1;
				
	                 while (controle != 0) {
					
					controle = jopint("Endereço IPV4:\n"+cell.toString());
					
					
					
				}
				
				break;
			case 4: // CPF
				
				// TODO CPF
				
	            controle = -1;
				
				while (controle != 0) {
					
					controle = jopint("CPF:\n"+cell.toString());
					
					
					
				}
				
				
				
				break;
			case 0: // SAIR
				JOptionPane.showConfirmDialog(null, "Deseja sair?");
				break;
			default: // INVALIDO
				jopmes("Erro!\nOpção Invalida!");
				break;
			}
			
		}
		
		
	}

}
