package desafiosanteriores;

import javax.swing.JOptionPane;

public class Desafio04 {
	
	public static void main(String[] args) {
		
		//Declara��o de variaveis
		String  nome = "";
		double  peso = 0.0;
		double altura = 0.0;
		String sexo = "";
		double imc = 0.0;
		
		
		//Defini��o de variaveis
		nome = JOptionPane.showInputDialog(" Digite um nome ");
		peso = Double.parseDouble(JOptionPane.showInputDialog(" Digite o peso de " +nome));
		altura = Double.parseDouble(JOptionPane.showInputDialog(" Digite a altura de " +nome));
		sexo = JOptionPane.showInputDialog(nome+ " � masculino ou feminino ");
		
		//calculo de IMC peso dividido pela altura * altura
		
		imc = peso / (altura * altura);
		
	//	MENOR QUE 18,5	MAGREZA	0
	//	ENTRE 18,5 E 24,9	NORMAL	0
	//	ENTRE 25,0 E 29,9	SOBREPESO
    //  ENTRE 29,9 E 34,9   OBESIDADE   I
	//	ENTRE 34,9 E 39,9	OBESIDADE	II
	//	MAIOR QUE 40,0	OBESIDADE GRAVE	III
		
		JOptionPane.showMessageDialog(null , " O IMC de "+nome+" � igual a:\n"+imc);
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null , nome+ " Voc� esta abaixo do peso ideal");}
		else if (imc >= 18.5 && imc < 25 ) {
			JOptionPane.showMessageDialog(null , nome+ " Voc� esta no peso ideal ");}
		else if (imc >= 25 && imc < 30 ) {
			JOptionPane.showMessageDialog(null , nome+ " Voc� esta acima do peso ");}
		else if (imc >= 30 && imc < 35) {
			JOptionPane.showMessageDialog(null , nome+ " Voc� esta com obesidade grau I");}
		else if (imc >= 35 && imc < 40 ) {
			JOptionPane.showMessageDialog(null , nome+ " Voc� esta com obesidade grau II ");}
		else if (imc >= 40 ) {
			JOptionPane.showMessageDialog(null , nome+ " Voc� esta com obesidade cr�nica gra III ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
