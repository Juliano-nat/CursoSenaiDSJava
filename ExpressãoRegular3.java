package desafiosanteriores;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ExpressãoRegular3 {
	
	public static ArrayList<String> celulares = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	public static ArrayList<String> redes = new ArrayList<String>();
	public static ArrayList<String> cpfs = new ArrayList<String>();
	
	public static boolean celular(String placa){ // Ele valida numeros de até 11 caracteres e aceita caracteres especiais
		   boolean valido = true;
		   placa = placa.replaceAll("[^0-9]", "");
		   if(placa.length() != 11){			   
		     return false;		      
		   }		  
			   if(!placa.substring(0,10).matches("[0-9]*")){				   
				     return false;				     
				   }			    			  			   
		   return valido;
		}
	
	
			   	    			  			   
		
	
	public static boolean rede(String placa){ // Ele valida numeros de até 11 caracteres e aceita caracteres especiais
		   boolean valido = true;
		   placa = placa.replaceAll("[^0-9]", "");
		   if(placa.length() != 12){			   
		     return false;		      
		   }		  
		   if(!placa.substring(0,11).matches("[0-9]*")){				   
			     return false;				     
			   }	  
		   
		   return valido;
		}
	
	public static boolean rg(String placa){ // Ele valida numeros de até 11 caracteres e aceita caracteres especiais
		   boolean valido = true;
		   placa = placa.replaceAll("[^0-9]", "");
		   if(placa.length() != 11){			   
		     return false;		      
		   }		  
		   if(!placa.substring(0,10).matches("[0-9]*")){				   
			     return false;				     
			   }	   			  			   
		   return valido;
		}
	
	
	public static Integer jopint(String numero) { // Retorno de numeros inteiros
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog(numero));
		return num;
	}
	
	public static String jopstr(String msg) { // Retorno de String
		String m = "";
		m = JOptionPane.showInputDialog(msg);
		return m;
		
	}
	
	public static void jopmes(String msg) { // mostra mensagem
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void main(String[] args) {
		
		String cell = "";
		String email = "";
		String ipv4 = "";
		String cpf = "";
		
		StringBuffer lista = new StringBuffer();
		
		String regex = "";
		Pattern pattern = Pattern.compile(regex);
		
		int console = -1;
		
		StringBuffer menu = new StringBuffer();
		menu.append("1-Adicionar Usuario\n");
		menu.append("2-Listar Usuario\n");
		menu.append("3-Expressão Regular\n");
	    menu.append("0-Sair");
		
		while (console != 0) {
			
			console = jopint("Usuario\n"+menu.toString());
			
			switch (console) {
			case 1:
				cell = new String();
				email = new String();
				ipv4 = new String();
				cpf = new String();
				
				cell = jopstr("Digite o numero do celular\n Nesse formato:(XX)XXXXX-XXXX");
				
				if (celular(cell) == false) {
					jopmes("Numero Invalido!");
				}
				
				if (celular(cell) == true) {					
				
					celulares.add(cell);															
				}
				
				email = jopstr("Digite um email\n Nesse formato:nome_usuario@dominio");
				
				emails.add(email);
				
				
				ipv4 = jopstr("Adicione uma rede ipv4\n Forma padrão:WWW.XXX.YYY.ZZZ");
				
				if (rede(ipv4) == false) {
					jopmes("Rede IPV4 Invalido!");
				}
				if (rede(ipv4) == true) {
					
					redes.add(ipv4);
					
				}
				
				cpf = jopstr("Adicione o CPF:\n Forma padrão:XXX.XXX.XXX-XX");
				
				if (rg(cpf) == false) {
					jopmes("CPF invalido!");
				}
				if (rg(cpf) == true) {
					cpfs.add(cpf);
				}
				
				if (celulares.isEmpty() && emails.isEmpty() && redes.isEmpty() && cpfs.isEmpty()) {
					jopmes("Você errou em algum componente, digite novamente!");
				} 								
				else {
				jopmes("Usuario adicionado com sucesso!"); }
				
				break;
			case 2:
				if (celulares.isEmpty()) {
					jopmes("Nenhum usuario foi adicionado!");
				}				
				else {
				
				lista = new StringBuffer();
				
				lista.append("Lista de Usuario:\n");
				for (int i = 0; i < celulares.size(); i++) {
					lista.append("Celular: "+celulares.get(i)+"\n");
					lista.append("Email: "+emails.get(i)+"\n");
					lista.append("IPV4: "+redes.get(i)+"\n");
					lista.append("CPF: "+cpfs.get(i)+"\n");
					lista.append("============================\n");
				}
				 jopmes(lista.toString());
				}
				break;
			case 3:
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
				
				lista.append("Lista de Usuario:\n");
				for (int i = 0; i < celulares.size(); i++) {
					lista.append("Celular: "+celulares.get(i)+"\n");
					lista.append("Email: "+emails.get(i)+"\n");
					lista.append("IPV4: "+redes.get(i)+"\n");
					lista.append("CPF: "+cpfs.get(i)+"\n");
					lista.append("============================\n");
				}
				 regex = jopstr(lista.toString());
				
				 pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(lista.toString());
				System.out.println("Celulares: "+celulares);
				System.out.println("Email: "+emails);
				System.out.println("IPV4: "+redes);
				System.out.println("CPF: "+cpfs);
				System.out.println("Indice: 0123456789"); // indice de 0-9
				System.out.println("Matcher: "+matcher.pattern()); // caracter padrão
				System.out.println("Posições encontradas!"); // mostra de todos os indices onde foram encontrados o caracter padrão
				
				while (matcher.find()) {
					System.out.println(matcher.start() +" ");
				}
				
				break;
			case 0:
				JOptionPane.showConfirmDialog(null, "Sair?");
				break;
			default:
				jopmes("Comando Invalido!");
				break;
			}
			
		}
		
		
		
		
	}

}
