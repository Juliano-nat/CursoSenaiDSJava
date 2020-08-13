package desafiosanteriores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Desafio10daArrayList {

	public static void main(String[] args) {
		
		int indice = 0;
		StringBuffer menu = new StringBuffer();
		StringBuffer lista = new StringBuffer();
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Double> pesos = new ArrayList<Double>();
		ArrayList<Integer> idades = new ArrayList<Integer>();
		String nome = " ";
		Double peso = 0.0;
		Integer idade = 0;
		int console = -1;
		
		menu.append("1- Adicionar Pessoa \n ");
		menu.append("2- Remover pessoa \n ");
		menu.append("3- Listar Pessoa \n ");
		menu.append("4- Pessoa mais Jovem \n ");
		menu.append("5- Pessoa mais Obesas \n ");
		menu.append("6- Apagar Todas \n ");
		menu.append("0- Sair");
		
		while (console != 0) {
			
			console = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (console) {
			case 1:
				// Adicionar Pessoa
				nome = new String();
				peso = 0.0;
				idade = 0;
				nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
				peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da Pessoa"));
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade de uma pessoa"));
				nomes.add(nome);
				pesos.add(peso);
				idades.add(idade);
				JOptionPane.showMessageDialog(null, nome+ " Foi adicionado ");
				
				break;
			case 2:
				// Remover Pessoa
				lista = new StringBuffer();
				 indice = 0;
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Não ha ninguem na lista, impossivel remover");
					
				} else {
					lista.append("Listar o indice de pessoas para remover: \n ");
					for (int i = 0; i < nomes.size(); i++) {
						lista.append(i+" - ");
						lista.append(nomes.get(i)+" , ");
						lista.append(pesos.get(i)+" kg ");
						lista.append(idades.get(i)+" anos. \n  ");
						}
					indice = Integer.parseInt(JOptionPane.showInputDialog(lista));
					nomes.remove(indice);
					pesos.remove(indice);
					idades.remove(indice);
					JOptionPane.showMessageDialog(null, "Pessoa no Indice "+indice+" Removida!");
                  }
				
				break;
			case 3:
				// Listar Pessoa
				lista = new StringBuffer();
				if (nomes.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Não ha ninguem na lista");
					
				} else {
					lista.append("Lista de pessoas : \n ");
					for (int i = 0; i < nomes.size(); i++) {
						lista.append(i+" - ");
						lista.append(nomes.get(i)+" , ");
						lista.append(pesos.get(i)+" kg ");
						lista.append(idades.get(i)+" anos. \n  ");
						}
					JOptionPane.showMessageDialog(null, lista);
				}
				
				break;
			case 4:
				// Pessoa mais Jovem
				int jovem = 9999;
				indice = 0;
				for (int i = 0; i < idades.size(); i++) {
					if (jovem > idades.get(i)) {
						jovem = idades.get(i);
						indice = i;
						} 
					}
				lista = new StringBuffer();
				lista.append("As pessoas mais novas são: \n ");
				lista.append(nomes.get(indice)+" \n ");
				lista.append("com "+idades.get(indice)+" anos!");
				JOptionPane.showMessageDialog(null, lista);
				break;
			case 5:
				// Pessoa mais Obesa
				double obeso =  0.0;
				indice = 0;
				for (int i = 0; i < pesos.size(); i++) {
					if (obeso < pesos.get(i)) {
						obeso = pesos.get(i);
						indice = i;
						} 
					}
				lista = new StringBuffer();
				lista.append("As pessoas mais novas são: \n ");
				lista.append(nomes.get(indice)+" \n ");
				lista.append("com "+pesos.get(indice)+" kg!");
				JOptionPane.showMessageDialog(null, lista);
				
				break;
			case 6:
				//Apagar Todas
				nomes.clear();
				pesos.clear();
				idades.clear();
				JOptionPane.showMessageDialog(null, "Todos Removidos");
				
				break;
			case 0:
				// Sair
				JOptionPane.showMessageDialog(null, "O Programa foi encerrado com Sucesso");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Comando Invalido");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
