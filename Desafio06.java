package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio06 {
	
	public static void main(String[] args) {
		
		
		// Declara��o de variaveis
		
		int opcao = -1;
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		// essa variavel � declarado especial para Divis�o( ja que pode ocorrer de numeros fracionais,quebrados)
		Double div1 = 0.0;
		Double div2 = 0.0;
		Double res = 0.0;
		
		String menu = " 1- Soma\n ";
		      menu += " 2- Subtra��o\n ";
		      menu += " 3- Multiplica��o\n ";
		      menu += " 4- Divis�o\n ";
		      menu += " 5- Pot�ncia\n ";
		      menu += " 0- Sair ";
		      
		      while (opcao != 0) {
		    	  
		    	  opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		    	  
		    	  switch (opcao) {
				case 1:
					num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
					num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
					resultado = num1 + num2;
					JOptionPane.showMessageDialog(null , num1+" + "+num2+" = "+resultado);
					
					
					break;
                 
				case 2:
                	num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
 					num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
 					resultado = num1 - num2;
 					JOptionPane.showMessageDialog(null , num1+" - "+num2+" = "+resultado);
					break;
                 
                 case 3:
                	num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
 					num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
 					resultado = num1 * num2;
 					JOptionPane.showMessageDialog(null , num1+" x "+num2+" = "+resultado);
	
	              break;
	              //Aqui foi utilizado numeros com variavel real(Double)
                 case 4:
                	 div1 = Double.parseDouble(JOptionPane.showInputDialog(" Digite um numero "));
                	 div2 = Double.parseDouble(JOptionPane.showInputDialog(" Digite um numero "));
                	 res = div1 / div2;
                	 if (div2 == 0) {
                		 JOptionPane.showMessageDialog(null , " N�o � possivel dividir por 0");
                	 } else {
                		 JOptionPane.showMessageDialog(null , div1+" � "+div2+" = "+res );}
                	 break;
                 
                 case 5:
                	num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
  					num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero "));
                	 Math.pow(num1 , num2 );
                	 JOptionPane.showMessageDialog(null , Math.pow(num1 , num2));
                	 break;
                 
                 case 0:
                	 JOptionPane.showMessageDialog(null , " O Programa foi encerrado com sucesso! " );
                	 break;
                	 
                 default:
                	 JOptionPane.showMessageDialog(null , " Informa��o invalida, use numeros" );
                	 break;
		    	  }
						
                	 
	
  					
  					
					
  					
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
				
			}
		      
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
