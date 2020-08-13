package desafiosanteriores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegularExpressao {
	
	public static void main(String[] args) {
		
		// \d - DIGITOS
		
		// \D - TUDO QUE NÃO FOR DIGITO
		
		// \s - BUSCA ESPAÇOS EM BRANCO \t \n \f \r
		
		// \S CARACTERES QUE NÃO ESTÃO EM BRANCO
						
		// \w CARACTERES DE PALAVRAS a-z A-Z, DIGITOS e_
		
		// \W TUDO O QUE NÃO FOR CARACTERES DE PALAVRAS
		
		// Lembre-se do metodo de escape utilizando no caso do Java é "\" 
		
		// No caso de querermos encontrar digitos POR EXEMPLO seria assim no regex "\\d"
		
		
		String regex = "a"; // carlos, ana, acs  os padrões de caracteres a ser encontrado
		String texto = "abca";
				
															
		Pattern pattern = Pattern.compile(regex); // variavel padrão
		Matcher matcher = pattern.matcher(texto); // matcher o caracter a ser considerado padrão como carlos ou ana ou acs
		System.out.println("texto: "+texto); // mostra o texto saida de dados
		System.out.println("Indice: 0123456789"); // indice de 0-9
		System.out.println("Matcher: "+matcher.pattern()); // caracter padrão
		System.out.println("Posições encontradas!"); // mostra de todos os indices onde foram encontrados o caracter padrão
		
		while (matcher.find()) { // while estrutura de repetição que encerra apos encontrar o caracter padrão
			System.out.println(matcher.start() +" "); // saida de dados atraves da procura o programa finaliza!
			
		}
		
		
		
		
		
		
		
	}

}
