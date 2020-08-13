package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio28Função {
	
	
	
	public static void main(String[] args) {
		
		Integer a = 0;
		Integer b = 0;
		Integer resultado;
		
		a = janelaInt("Digite o valor do primeiro numero");
		b = janelaInt("Digite o valor do segundo numero");
		resultado = somar(a,b); // aqui perceba que não colocamos resultado = a + b; 
		janela("SOMAR", resultado+" ");
		resultado = subtrair(a,b);
		janela("Subtrair", resultado+" "); // Devido a função janela, não precisamos declarar variavel para chamar resultado JOptionPane...
		resultado = vezes(a,b);
		janela("Multiplicar", resultado+" ");
	}
 
	public static Integer somar(int x, int y ) {
		Integer r = 0;
		r = x + y;
		return r;
		// Usamos a logica simples da soma dessas variaveis a+b
		// Podemos utilizar ao inves de declarar todos esses codigos x = a + b  para o retorno
		// De uma função, basta usar: return(x+y);
		
	}
	
	public static Integer subtrair(int x, int y) {
		Integer r = 0;
		r = x - y;
		return r;
		// Podemos utilizar tambem return(x-y); 
		
		
	}
	public static Integer vezes(int x, int y) {

		Integer r = 0;
		r = x * y;
		return r;
		
	}
	
	public static void janela(String titulo, String conteudo) {
		JOptionPane.showMessageDialog(null, titulo+"\n"+conteudo);
		System.out.println(titulo+"\n"+conteudo);
		
	}
	
	public static Integer janelaInt(String msn) {
		Integer x = 0;
		x = Integer.parseInt(JOptionPane.showInputDialog(msn));
		return x;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
