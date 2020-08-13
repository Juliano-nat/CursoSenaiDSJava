package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio07 {
	
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
		
		// Declaração de variaveis
		String frase = "";
		int console = -1;
		
		String troca = "@";
		String resultado = "";
		int qtd = frase.length();
		char alvo = ' ';
		
		// Ler a frase digitada pelo usuario
		
		
		// Opções do menu
		String menu = "1- Frase toda maiuscula\n";
		       menu += "2- Frase toda minuscula\n";
		       menu += "3- Soletrar uma palavra\n";
		       menu += "4- Substituir a frase por @\n";
		       menu += "5- Cortar a frase\n";
		       menu += "0- SAIR";
		       
		       // para que o programa continue em execução
		       while (console != 0) {
		    	   
		    	 console = Integer.parseInt(JOptionPane.showInputDialog(menu));
		    	 // as opções que o usuario vai optar
		    	 switch (console) {
				case 1:
					frase = JOptionPane.showInputDialog(" Digite uma frase ");
					JOptionPane.showMessageDialog(null , frase.toUpperCase());
					
					
					break;
                case 2:
                	frase = JOptionPane.showInputDialog(" Digite uma frase ");
                	JOptionPane.showMessageDialog(null , frase.toLowerCase());
					
					break;
                case 3:
                	frase = JOptionPane.showInputDialog(" Digite uma frase ");
                	
                	for (int i = 0; i < qtd; i++) {
                		
                		JOptionPane.showMessageDialog(null , frase.charAt(i) + " ");
                		
                		}
                	    JOptionPane.showMessageDialog(null , frase);
        				
        				
        				
        			
	             break;
                case 4:
                	
                	frase = JOptionPane.showInputDialog(" Digite uma frase ");
                	
                	JOptionPane.showMessageDialog(null , frase);
                	alvo = JOptionPane.showInputDialog("Digite um caractere a ser substituido: ").charAt(0);
                	
                	resultado = frase.replace(alvo , '@');
                	JOptionPane.showMessageDialog(null , resultado);
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                	
                  
                	
	             break;
                case 5:
                	
                	frase = JOptionPane.showInputDialog(" Digite uma frase ");
                	int corinicio = 0;
                	int corfinal = 0;
                	corinicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do corte inicial"));
                	corfinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do corte final"));
                	if (corfinal > corinicio && corfinal < frase.length() && corinicio >= 0) {
                		resultado = frase.substring(corinicio, corfinal);
                		JOptionPane.showMessageDialog(null , resultado);
                		
                		
                		
						
					} else {
                     JOptionPane.showMessageDialog(null , "Pontos de cortes estão errados");
					}
                	
                	
                	
	            break;
                case 0:
                	JOptionPane.showMessageDialog(null , "Você SAIU");
	
	            break;

				default:
					JOptionPane.showMessageDialog(null , "Erro! digite um numero valido");
					break;
				}
		    	   
				
			}
		
		
		
		
		
	}

}
