package desafiosanteriores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DesafioSprint {
	
	// DADOS DE FUNCIONARIOS
	static ArrayList<String> nomesFuncionarios = new ArrayList<String>();
	static ArrayList<String> cpfsFuncionarios = new ArrayList<String>();
	static ArrayList<Double> vendasFuncionarios = new ArrayList<Double>();
	
	// DADOS DOS CLIENTES
	static ArrayList<String> nomesClientes = new ArrayList<String>();
	static ArrayList<String> celularesClientes = new ArrayList<String>();
	static ArrayList<String> emailsClientes = new ArrayList<String>();
	static ArrayList<Double> vendasClientes = new ArrayList<Double>();
	
	// DADOS DOS SERVIÇOS
	static ArrayList<String> nomesServicos = new ArrayList<String>();
	static ArrayList<Double> valoresServicos = new ArrayList<Double>();
	
	// DADOS DAS VENDAS

	static ArrayList<Integer> vendasFuncionario = new ArrayList<Integer>();
	static ArrayList<Integer> vendaCliente = new ArrayList<Integer>();
	static ArrayList<Integer> vendasServicos = new ArrayList<Integer>();
	
	public static Integer jopInt(String msg) { // Função que pergunta valores do tipo inteiro
		int s = 0;
		s = Integer.parseInt(JOptionPane.showInputDialog(msg));
		return s;
	}
	
	public static Double jopDou(String msg) { // Função que pergunta valores do tipo double
		double s = 0;
		s = Integer.parseInt(JOptionPane.showInputDialog(msg));
		return s;
	}
	
	
	public static String jopstr(String msg) { // Função que pergunta valores do tipo String
		String j = "";
		j = JOptionPane.showInputDialog(msg);
		return j;
		
	}
	public static void jopmes(String msg) { // Função para mensagens
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
	public static void efetuarvenda(Integer vendedor, Integer cliente, Integer servico) {
		
		vendasFuncionario.add(vendedor);
	    vendaCliente.add(cliente);
	    vendasServicos.add(servico);
		saldovendedor(vendedor, valoresServicos.get(servico));		
	    saldoCliente(cliente, valoresServicos.get(servico));
	}
	
	public static void saldovendedor(Integer vendedor, Double valor) {
		Double novoValor = 0D;
		novoValor = vendasFuncionarios.get(vendedor);
		novoValor = novoValor + valor;
		vendasFuncionarios.set(vendedor, novoValor);
				
	}
	
	public static void saldoCliente(Integer cliente, Double valor) {
		Double novoValor = 0D;
		novoValor = vendasClientes.get(cliente);
		novoValor = novoValor + valor;
		vendasClientes.set(cliente, novoValor); }
	
	public static void main(String[] args) {
		
		// TODO MENU PRINCIPAL
		
		int valorint = 0;
		String nomeFuncionario = ""; // Essa variavel foi reaproveitada em todos os sistemas que pediam Nomes: seja em Funcionarios,clientes,serviços e vendas.
		String cpfFuncionario = "";
		Double valorVendas = 0.0; // esse foi reaproveitadas em todos os sistemas que pediam um valor
		int lisFuncionario = 0; // esse foi reaproveitados em todos sistemas que necessitavam um indice
		
		int principal = -1;
		StringBuffer menuPrincipal = new StringBuffer();
		menuPrincipal.append("1- Funcionarios\n");
		menuPrincipal.append("2- Clientes\n");
		menuPrincipal.append("3- Serviços\n");
		menuPrincipal.append("4- Vendas\n");
		menuPrincipal.append("0- Sair");
		
		int controle2 = -1;
		StringBuffer menu2 = new StringBuffer();
		menu2.append("1- Adicionar\n");
		menu2.append("2- Remover\n");
		menu2.append("3- Alterar\n");
		menu2.append("4- Listar\n");
		menu2.append("0- Retornar ao menu Principal");
		
		StringBuffer vendas = new StringBuffer();
		vendas.append("1-Efetuar vendas\n");
		vendas.append("2-Listar vendas\n");
		vendas.append("0-Sair");
		
		
		while (principal != 0) {
			
			principal = jopInt(menuPrincipal.toString());
			controle2 = -1;
			
			// exemplo Dados temporarios para testes rapidos
			
			
			
			
			
			
			switch (principal) {
			case 1:
				// FUNCIONARIOS
				// TODO Funcionarios
				while (controle2 != 0) {
				controle2 = jopInt("FUNCIONARIOS:\n"+menu2.toString());
				
				 nomeFuncionario = "";
				 cpfFuncionario = "";
				 valorVendas = 0.0;
				StringBuffer funcionarioSB = new StringBuffer();
				
				 lisFuncionario = 0; // listar funcionarios em remover ou alterar
				
					switch (controle2) {
					case 1: // ADICIONAR FUNCIONARIO
						 nomeFuncionario = "";
						 cpfFuncionario = "";
						 valorVendas = 0.0;
						nomeFuncionario = jopstr("Nome do funcionário?");
						cpfFuncionario = jopstr("CPF do funcionário? "+nomeFuncionario);
						nomesFuncionarios.add(nomeFuncionario);
						cpfsFuncionarios.add(cpfFuncionario);
						vendasFuncionarios.add(valorVendas);
						jopmes("Funcionário adicionado com sucesso!");
						
					break;
					case 2: // REMOVER FUNCIONARIO
						lisFuncionario = 0;
						funcionarioSB = new StringBuffer();
						
						if(nomesFuncionarios.isEmpty()) {
							jopmes("Erro!\nNenhum funcionário para remover!");
						} else {
						funcionarioSB = new StringBuffer();
						funcionarioSB.append("Lista de Funcionários para remover:\n");
						for (int i = 0; i < nomesFuncionarios.size(); i++) {
							funcionarioSB.append("=============================================\n");
							funcionarioSB.append("Índice: ");
							funcionarioSB.append(i+"\n");
							funcionarioSB.append("Nome: ");
							funcionarioSB.append(nomesFuncionarios.get(i)+"\n");
							funcionarioSB.append("CPF: ");
							funcionarioSB.append(cpfsFuncionarios.get(i)+"\n");
							funcionarioSB.append("Valor de vendas: ");
							funcionarioSB.append(vendasFuncionarios.get(i)+"\n");
						}
						lisFuncionario = jopInt(funcionarioSB.toString());
						nomesFuncionarios.remove(lisFuncionario);
						cpfsFuncionarios.remove(lisFuncionario);
						vendasFuncionarios.remove(lisFuncionario);
						jopmes("Funcionário no Índice removido! "+lisFuncionario);
						}
						
						break;
						
					case 3: // ALTERAR FUNCIONARIO                       
						if (nomesFuncionarios.isEmpty()) {
							jopmes("Erro!\nNenhum funcionário encontrado!");
						} else {
							nomeFuncionario = jopstr("Digite o nome do funcionário que deseja alterar:");
							for (int i = 0; i < nomesFuncionarios.size(); i++) {
								if (nomesFuncionarios.get(i).equalsIgnoreCase(nomeFuncionario)) {
									
									nomeFuncionario = jopstr("Digite o nome do novo funcionário:");
									nomesFuncionarios.set(i, nomeFuncionario);
									
									cpfFuncionario = jopstr("CPF de "+nomeFuncionario);
									cpfsFuncionarios.set(i, cpfFuncionario);
																											
								}
							}
							 jopmes("Funcionário alterado com sucesso!");
							
							
							
							
						}
						break;
						
					case 4: // LISTAR FUNCIONARIOS
						if(nomesFuncionarios.isEmpty()) {
							jopmes("Erro!\nNenhum funcionário encontrado!");
						} else {
						funcionarioSB = new StringBuffer();
						funcionarioSB.append("Lista de Funcionários:\n");
						for (int i = 0; i < nomesFuncionarios.size(); i++) {
							funcionarioSB.append("=============================================\n");
							funcionarioSB.append("Nome: ");
							funcionarioSB.append(nomesFuncionarios.get(i)+"\n");
							funcionarioSB.append("CPF: ");
							funcionarioSB.append(cpfsFuncionarios.get(i)+"\n");
							funcionarioSB.append("Valor de vendas: ");
							funcionarioSB.append(vendasFuncionarios.get(i)+"\n");
						}
						jopmes(funcionarioSB.toString());
						}
						break;
					case 0:
						JOptionPane.showConfirmDialog(null, "Deseja mesmo, retornar ao menu principal?");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Erro!\nDigite um comando valido!");
						break;
					}
					
				}
				
			break;
            case 2:
				// CLIENTES
            	// TODO Clientes
            	while (controle2 != 0) {
            		
            		controle2 = jopInt("CLIENTES:\n"+menu2.toString());
            		
            		StringBuffer clientesSB = new StringBuffer();   				
    				 // listar clientes em remover ou alterar
    				
    				String celularCliente = "";
    				String emailCliente = "";
    				
    				
    				 cpfFuncionario = "";
    				 valorVendas = 0.0;
    				 lisFuncionario = 0;
    				
    				switch (controle2) {
					case 1: // ADICIONAR CLIENTES
						nomeFuncionario = "";
						celularCliente = "";
						emailCliente = "";
						valorVendas = 0.0;
						nomeFuncionario = jopstr("Nome do Cliente:");
						celularCliente = jopstr("Celular do Cliente:");
						emailCliente = jopstr("Email do cliente:");
					    nomesClientes.add(nomeFuncionario);
					    celularesClientes.add(celularCliente);
					    emailsClientes.add(emailCliente);
					    vendasClientes.add(valorVendas);
					    jopmes("Cliente " +nomeFuncionario+ " cadastrado com sucesso!");
						break;
                    case 2: // REMOVER CLIENTES
						lisFuncionario = 0;
						clientesSB = new StringBuffer();
						
						if (nomesClientes.isEmpty()) {
							jopmes("Não a nenhum cliente a ser removido!");
						} else {
							clientesSB.append("Índice do cliente para REMOVER:\n");
							for (int i = 0; i < nomesClientes.size(); i++) {
								clientesSB.append("Índice: "+i+"\n");
								clientesSB.append(" - Cliente: "+nomesClientes.get(i)+"\n");
								clientesSB.append("=======================================\n");
							}
							 lisFuncionario = jopInt(clientesSB.toString());
							 nomesClientes.remove(lisFuncionario);
							 celularesClientes.remove(lisFuncionario);
							 emailsClientes.remove(lisFuncionario);
							 vendasClientes.remove(lisFuncionario);
							 jopmes("Cliente Removido com sucesso!");
						}
						
						break;
                    case 3: // ALTERAR CLIENTES
	                     
	                     clientesSB = new StringBuffer();
	                     nomeFuncionario = "";
	                     valorVendas = 0.0;
	                     if (nomesClientes.isEmpty()) {
							jopmes("Não a nenhum cliente para ser alterado!");
						
	                     } else {
							 
	                    	 nomeFuncionario = jopstr("Digite o nome do Cliente a ser alterado");
	                    	 
	                    	 for (int i = 0; i < nomesClientes.size(); i++) {
	                    		 if (nomesClientes.get(i).equalsIgnoreCase(nomeFuncionario)) {
	                    			 nomeFuncionario = jopstr("Nome do novo cliente: ");
	 								nomesClientes.set(i, nomeFuncionario);
	 								
	 								celularCliente = jopstr("Digite o celular do novo cliente");
	 								celularesClientes.set(i, celularCliente);
	 								
	 								emailCliente = jopstr("Email do novo cliente:");
	 								emailsClientes.set(i, emailCliente);
	 								
	 								valorVendas = 0.0;
	 								vendasClientes.set(i, valorVendas);
								}																
								
							}
	                    	 jopmes("Cliente alterado com sucesso!");
						}
	                    
	                   break;
                    case 4: // LISTAR CLIENTES
	                   clientesSB = new StringBuffer();
                    	if (nomesClientes.isEmpty()) {
							jopmes("Nenhum cliente a ser listado!");
						} else {
                         
							clientesSB.append("Lista de clientes:\n");
							for (int i = 0; i < nomesClientes.size(); i++) {
								clientesSB.append("Nome: "+nomesClientes.get(i)+"\n");
								clientesSB.append("Celular: "+celularesClientes.get(i)+"\n");
								clientesSB.append("Emails: "+emailsClientes.get(i)+"\n");
								clientesSB.append("Valor de venda: "+vendasClientes.get(i)+"\n");
								clientesSB.append("=========================================\n");
							}
							jopmes(clientesSB.toString());
						}
                    	
	                  break;
                    case 0: // SAIR
	              JOptionPane.showConfirmDialog(null, "Deseja sair?");
	                 break;
					default: // INVALIDO
						jopmes("Comando Invalido, ERRO!");
						break;
					}
				}
            	
		    break;
            case 3:
	            // SERVIÇOS
            	// TODO
            	
            	while (controle2 != 0) {
					controle2 = jopInt("SERVIÇOS: "+menu2.toString());
										
					StringBuffer servicoSB = new StringBuffer(); 
					lisFuncionario = 0;
					
					
					 nomeFuncionario = "";    				 
    				 valorVendas = 0.0;
    				 
    				 switch (controle2) {
 					case 1: // ADICIONAR SERVIÇO
 						nomeFuncionario = "";
 						valorVendas = 0.0;
 						nomeFuncionario = jopstr("Nome do Serviço:");
 						valorVendas = jopDou("Valor a ser cobrado pelo serviço:");
 						nomesServicos.add(nomeFuncionario);
 						valoresServicos.add(valorVendas);
 						jopmes("Serviço adicionado!");
 						break;
                     case 2: // REMOVER SERVIÇO
 						lisFuncionario = 0;
 						servicoSB = new StringBuffer();
 						
 						if (nomesServicos.isEmpty()) {
							jopmes("Nenhum serviço a ser removido!");
						} else {
							servicoSB.append("Índice de serviços para REMOVER:\n");
	 						for (int i = 0; i < nomesServicos.size(); i++) {
								servicoSB.append("Índice: "+i+"\n");
								servicoSB.append("Serviço: "+nomesServicos.get(i)+"\n");
								servicoSB.append("Valor: R$ "+valoresServicos.get(i)+"\n");
								servicoSB.append("=======================================\n");
							}
	 						 lisFuncionario = jopInt(servicoSB.toString());
	 						 nomesServicos.remove(lisFuncionario);
	 						 valoresServicos.remove(lisFuncionario);
	 						 jopmes("Serviço removido com sucesso!");
						}
 						
 						break;
                     case 3: // ALTERAR SERVIÇO
                    	 nomeFuncionario = "";
 	                      if (nomesServicos.isEmpty()) {
							jopmes("Nenhum serviço a ser alterado!");
						} else {
                            nomeFuncionario = jopstr("Digite o nome do serviço a ser alterado:");
                            for (int i = 0; i < nomesServicos.size(); i++) {
								if (nomesServicos.get(i).equalsIgnoreCase(nomeFuncionario)) {
									nomeFuncionario = jopstr("Nome do novo serviço");
									nomesServicos.set(i, nomeFuncionario);
									
									valorVendas = jopDou("Novo valor do serviço:");
									valoresServicos.set(i, valorVendas);
								}
							}
						}
 	                      jopmes("Serviço alterado com sucesso!");
 	                   break;
                     case 4: // LISTAR SERVIÇO
 	                   servicoSB = new StringBuffer();
 	                   
                    	 if (nomesServicos.isEmpty()) {
							jopmes("Nenhum serviço a listar!");
						} else {
                            servicoSB.append("Lista de Serviços:\n");
                            for (int i = 0; i < nomesServicos.size(); i++) {
								servicoSB.append("Serviço: "+nomesServicos.get(i)+"\n");
								servicoSB.append("Valor: R$"+valoresServicos.get(i)+"\n");
								servicoSB.append("====================================\n");
							}
                            jopmes(servicoSB.toString());
						}
 	                  break;
                     case 0: // SAIR
 	              JOptionPane.showConfirmDialog(null, "Deseja sair?");
 	                 break;
 					default: // INVALIDO
 						jopmes("Comando Invalido, ERRO!");
 						break;
 					}
					
				}
	        break;
           case 4:
	           // VENDAS
        	   // TODO vendas
        	   while (controle2 != 0) {
					controle2 = jopInt("VENDAS:\n"+vendas.toString());
					
					StringBuffer vendasSB = new StringBuffer(); 
					StringBuffer infovendas = new StringBuffer();
					lisFuncionario = 0;
					
					int indiceVendasacao = 0;
					Integer servico = 0;
					Integer cliente = 0;
					Integer vendedor = 0;
					
				nomeFuncionario = "";
   				 
   				 valorVendas = 0.0;
   				 
   				 switch (controle2) {
					case 1: // EFETUAR VENDAS
						if (nomesFuncionarios.isEmpty()) {
							if (nomesClientes.isEmpty()) {
								if (nomesServicos.isEmpty()) {
									jopmes("Não ha nenhum funcionario ou cliente ou serviço a ser listado!");
								}
							}
						} else {												
						
						infovendas = new StringBuffer();
						infovendas.append("Indice Funcionario:\n");
						for (int i = 0; i < nomesFuncionarios.size(); i++) {
							infovendas.append("=============================================\n");
							infovendas.append("Índice: ");
							infovendas.append(i+"\n");
							infovendas.append("Nome: ");
							infovendas.append(nomesFuncionarios.get(i)+"\n");
																				
						}
							vendedor = jopInt(infovendas.toString());
							
							infovendas = new StringBuffer();
							infovendas.append("Indice Clientes:\n");
						    for (int i = 0; i < nomesClientes.size(); i++) {
						    	infovendas.append(i+"\n");
								infovendas.append("Nome: ");
								infovendas.append(nomesClientes.get(i)+"\n");
							}
						    cliente = jopInt(infovendas.toString());
						    
						    infovendas = new StringBuffer();
							infovendas.append("Indice Serviço:\n");
						    for (int i = 0; i < nomesServicos.size(); i++) {
						    	infovendas.append(i+"\n");
								infovendas.append("Nome: ");
								infovendas.append(nomesServicos.get(i)+"\n");
							}
						    servico = jopInt(infovendas.toString());
						    
						    efetuarvenda(vendedor, cliente, servico);
						   
						    infovendas = new StringBuffer();
						    infovendas.append("Vendas efetuadas:\n");
						    infovendas.append("Funcionario: "+nomesFuncionarios.get(vendedor)+"\n");
						    infovendas.append("Cliente: "+nomesClientes.get(cliente)+"\n");
						    infovendas.append("Serviço: "+nomesServicos.get(servico));
						    jopmes(infovendas.toString());
						}
							
						break;
                      
        	           case 2: // LISTAR VENDAS
        	        	   if (vendasFuncionario.isEmpty()) {
							jopmes("Não ha nenhuma venda efetuada");
						} else {
                    	 vendasSB = new StringBuffer();
                    	 vendasSB.append("Vendas efetuadas:\n");
                    	 for (int i = 0; i < vendasFuncionario.size(); i++) {
							vendasSB.append("Funcionario: "+nomesFuncionarios.get(vendasFuncionario.get(i))+"\n");
							vendasSB.append("Cliente: "+nomesClientes.get(vendaCliente.get(i))+"\n");
							vendasSB.append("Serviço: "+nomesServicos.get(vendasServicos.get(i))+"\n");
							vendasSB.append("R$: "+valoresServicos.get(vendasServicos.get(i))+"\n");
							vendasSB.append("====================================\n");
						}
                    	 jopmes(vendasSB.toString());
						}
                    	
						break;
                    
                    case 0: // SAIR
	              JOptionPane.showConfirmDialog(null, "Deseja sair?");
	                 break;
					default: // INVALIDO
						jopmes("Comando Invalido, ERRO!");
						break;
					}
					
				}
	       break;
           case 0:
	           // SAIR
        	   JOptionPane.showConfirmDialog(null, "Deseja mesmo, sair?");
	       break;
			default:
				JOptionPane.showMessageDialog(null, "Erro!\nDigite um comando valido!");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
