package desafiosanteriores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Celular {
	
	private static boolean validar(String numero) {
        try {
                    int soma = 0;
                    for (int i = 0; i < 15; i++) {
                         soma = soma
                                     + calculoDoDigito((Integer.parseInt(String.valueOf(numero
                                                 .charAt(i)))), (i + 1) % 2 == 0);
                    }

                    if (soma % 10 == 0)
                         return true;
                    else
                         return false;


        } catch (Exception e) {
              e.printStackTrace();
              return false;
        }

  }
	
	private static int calculoDoDigito(int valorSemDigito, boolean indexKey) {
        if (indexKey) {
              int number = valorSemDigito * 2;
              while (number > 9) {
                    number = Integer.parseInt(String.valueOf(String.valueOf(number)
                               .charAt(0)))
                               + Integer.parseInt(String.valueOf(String
                                           .valueOf(number).charAt(1)));
              }
              return number;
        } else {
              return valorSemDigito;
        }
  }

	
	public static void main(String[] args) {
		
		try {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                       System.in));
            boolean isValid = false;
            while (!isValid) {

                  System.out.println();
                  System.out.println("--------------------------------------");
                  System.out
                             .println("Digite o n�mero do IMEI: [Digite 'exit' para sair]");
                  String numero = in.readLine();

                  if (numero.equals("exit")) {
                       System.out.println("Aplica��o finalizada");
                       return;
                  }

                  if (validar(numero)) {
                       System.out.println("O IMEI " + numero + " � v�lido.");
                       isValid = true;
                  } else
                       System.out.println("O IMEI " + numero + " � inv�lido.");

            }
      } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
      }
	
	
		
	}

}
