package desafiosanteriores;

import java.text.DecimalFormat;



public class EstruturaDeciFormet {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		DecimalFormat df = new DecimalFormat("0000");
		
		String numerocommascara = df.format(numero);
		
		System.out.println(numerocommascara);
		
	//	String nome1 = "aaa";
	//	String nome2 = "bbb";
		
	//	if (nome1.equals(nome2)) {
	//		System.out.println("senhas iguais");
			
	//	} else {
    //        System.out.println("senha diferente");
	//	}
		
		
		
	}

}
