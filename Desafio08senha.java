package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio08senha {
	
	private static String gerarSenha(){
		int qtdeMaximaCaracteres = 4;
	    String[] caracteres = { "0", "1", "2", "4", "5", "6", "7", "8",
	                "9"};
	    
		StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
        
	}

	
	public static void main(String[] args) {
		
		// DECLARAÇÃO DAS VARIAVEIS PARA O COMANDO
		
				int console = -1;
				
				
				
				String senha = "";
				
				
				
				
				// O USUARIO DEVE INFORMAR A SENHA A SER DESCOBERTA
				
				senha = JOptionPane.showInputDialog("Digite uma senha de 4 digitos para o computador descobrir");
				
				// É CRIADO A ESTRUTURA WHILE PARA QUE O PROGRAMA DE UM LOOP ATE DESCOBRIR A SENHA DO USUARIO
				
				
				
				while (console != 0) {
					
		       
					
					//COMANDO É ATIVADO PARA GERAR AS SENHAS
					
					System.out.println(gerarSenha());
					
					// QUANDO O SISTEMA ENCONTRAR A SENHA INFORMADA PELO USUARIO ELE PARA O LOOP
					
					if (senha.equals(gerarSenha())) {
						System.out.println("Senha encontrada, SENHA QUEBRADA "+senha);
						JOptionPane.showMessageDialog(null , "A SENHA FOI DESCOBERTA "+senha);
						console = 0;
						
						
						
					} else {
						System.out.println("Senha ERRADA");
						
						
						
							
							
						}
						

					}
					

		
		
		
		
		
		
		
		
		
	}
	
}

 
 