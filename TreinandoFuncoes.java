package desafiosanteriores;

import javax.swing.JOptionPane;

public class TreinandoFuncoes {

	
public static String declararaluno(String aluno) {
		String nome = " ";
		nome = JOptionPane.showInputDialog(aluno);
		return nome;
		}
	
	
 public static void retornarvalor(String mensagem) {
		
		 JOptionPane.showMessageDialog(null, mensagem);
		 
		 // 2(nome)+2(nome) = 4(aluno)
	 }
	
	
public static Double mediadoaluno(Double nota,Double nota1) {
		Double media = 0.0;
		media = (nota + nota1) / 2;
		return media;
	}
	
public static Double declararnotas(String nota) {
		Double numero = 0.0;		
		numero = Double.parseDouble(JOptionPane.showInputDialog(nota));
		return numero;
		
	}
	
public static Double verificarseoAlunopassou(Double media) {

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado");
					} 
		if (media < 7) {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado");
		}
		
		return media;
}
	
	public static void main(String[] args) {
		
		String aluno = " ";
		Double x = 0.0;
		Double y = 0.0;
		Double media = 0.0;
		
		aluno = declararaluno("Qual o nome do aluno");
		x = declararnotas("Digite a primeira nota de "+aluno);
		y = declararnotas("Digite a segunda nota de "+aluno);
		
		media = mediadoaluno(x,y);
		
		verificarseoAlunopassou(media);
		
		
		
		
		
		
		
		
		
	}
	
}
