package desafiosanteriores;

import javax.swing.JOptionPane;

public class EstruturaIFELSEIF {
	
	public static void main(String[] args) {
		
		String time1 = "";
		String time2 = "";
		int gols1 = 0;
		int gols2 = 0;
		String resultado = "";
		int saldodegols = 0;
		
		time1 = JOptionPane.showInputDialog(" Digite o nome do time da CASA ");
		time2 = JOptionPane.showInputDialog(" Digite o nome do time  VISITANTE ");
		
		JOptionPane.showMessageDialog(null , " Partida entre os times:\n"+time1+" x "+time2
				);
				                                 
				                             
		
				
				
				
		
		gols1 = Integer.parseInt(JOptionPane.showInputDialog(" GOLS time da CASA: "+time1));
		gols2 = Integer.parseInt(JOptionPane.showInputDialog(" GOLS time da VISITANTE: "+time2));
		
		saldodegols = gols1 - gols2;
		
		if (saldodegols > 0) {
			resultado = time1 + " Ganhou do "+time2;
			
		} else if (saldodegols < 0) {
			resultado = time2 + " Ganhou do "+time1;}
		else {
			resultado = time1 + " Empatou com "+time2;}
		
		resultado += "\n\n" +time1+" "+gols1 +" x "+gols2+" "+time2; 
		
		JOptionPane.showMessageDialog(null , resultado );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
