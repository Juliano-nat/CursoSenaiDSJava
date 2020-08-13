package desafiosanteriores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegularExpressao {
	
	public static void main(String[] args) {
		
		// \d - DIGITOS
		
		// \D - TUDO QUE N�O FOR DIGITO
		
		// \s - BUSCA ESPA�OS EM BRANCO \t \n \f \r
		
		// \S CARACTERES QUE N�O EST�O EM BRANCO
						
		// \w CARACTERES DE PALAVRAS a-z A-Z, DIGITOS e_
		
		// \W TUDO O QUE N�O FOR CARACTERES DE PALAVRAS
		
		// Lembre-se do metodo de escape utilizando no caso do Java � "\" 
		
		// No caso de querermos encontrar digitos POR EXEMPLO seria assim no regex "\\d"
		
		
		String regex = "a"; // carlos, ana, acs  os padr�es de caracteres a ser encontrado
		String texto = "abca";
				
															
		Pattern pattern = Pattern.compile(regex); // variavel padr�o
		Matcher matcher = pattern.matcher(texto); // matcher o caracter a ser considerado padr�o como carlos ou ana ou acs
		System.out.println("texto: "+texto); // mostra o texto saida de dados
		System.out.println("Indice: 0123456789"); // indice de 0-9
		System.out.println("Matcher: "+matcher.pattern()); // caracter padr�o
		System.out.println("Posi��es encontradas!"); // mostra de todos os indices onde foram encontrados o caracter padr�o
		
		while (matcher.find()) { // while estrutura de repeti��o que encerra apos encontrar o caracter padr�o
			System.out.println(matcher.start() +" "); // saida de dados atraves da procura o programa finaliza!
			
		}
		
		
		
		
		
		
		
	}

}
