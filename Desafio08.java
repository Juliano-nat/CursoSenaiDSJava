package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio08 {
	
	public static void main(String[] args) {
		
		String motorista = "";
		boolean cnh = false;
		boolean documentosEmDia = false;
		boolean naobebeu = false;
		int opcao = 0;
		
		motorista = JOptionPane.showInputDialog(" Digite o nome do Motorista ");
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(motorista+" possui CNH \n0-Não\n1-Sim"));
		
		if (opcao == 0) {
			cnh = false;
			
		} else {
			cnh = true;

		}
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Documentos do carro em dia \n0-Não\n1-Sim "));
				
				if (opcao == 0) {
					documentosEmDia = false; 
					
					
				} else {
					documentosEmDia = true;

				}
				
				opcao = Integer.parseInt(JOptionPane.showInputDialog(motorista+" Não tomou ou bebeu \n0-Não\n1-Sim"));
				
				if (opcao == 0) {
					naobebeu = false;
					
				} else {
					naobebeu = true;

				}
				
				if (cnh && documentosEmDia && naobebeu) {
					JOptionPane.showMessageDialog(null , motorista+" Está liberado da PRM");
					
				} else {
					JOptionPane.showMessageDialog(null , motorista+" O carro será guinchado");
					

				}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
