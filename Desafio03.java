package desafiosanteriores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Desafio03 {
	
	public static void main(String[] args) {
		
		String aluno = "";
		Double nota1 = 0.0;
		Double nota2 = 0.0;
		Double nota3 = 0.0;
		Double media = 0.0;
		int frequencia = 0;
		String mensagem = "";
		
		aluno = JOptionPane.showInputDialog(" Digite o nome do aluno ");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(" Digite a primeira nota do aluno "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(" Digite a segunda nota do aluno "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(" Digite a terceira nota do aluno "));
		frequencia = Integer.parseInt(JOptionPane.showInputDialog(" Digite a frequencia do aluno"));
		
		media = (nota1 + nota2 + nota3) / 3;
		
		for( int frequencia1=0; frequencia1<=100; frequencia1++){
			if (frequencia1%2==0){
				ArrayList<Integer> d=new ArrayList<Integer>();
				d.add(frequencia1);
				System.out.println("Par" +d);
				
				
			}
		}
	
		
		
		
		
		if (media >= 7.00) {
			mensagem = "Nome do aluno: "+aluno+"\n"+
					"Media do aluno: "+media+" o aluno foi aprovado na media";
		
				   
		JOptionPane.showMessageDialog(null, mensagem);
		           
		
		
		
			
		} else {
			mensagem = "Nome do aluno: "+aluno+"\n"+
		               "Media do aluno: "+media+" o aluno foi reprovado na media";
			
			JOptionPane.showMessageDialog(null, mensagem);

		}
		
		if (frequencia >= 75) {
			mensagem = "Nome do aluno: "+aluno+"\n"+
		               "Frequência do aluno: "+frequencia+" o aluno foi aprovado na presença";
			
			JOptionPane.showMessageDialog(null, mensagem);
			
			
		} else {
			mensagem = "Nome do aluno: "+aluno+"\n"+
		               "Frequência do aluno: "+frequencia+" o aluno foi reprovado na presença";
			
			JOptionPane.showMessageDialog(null, mensagem);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
