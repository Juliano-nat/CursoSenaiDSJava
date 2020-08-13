package desafiosanteriores;

public class Teste {
	
	public static void main(String[] args) {
		
long i = System.currentTimeMillis();
        
        for(int count=1 ; count <=1000000 ; count++){
            if(count % 2 == 0){
                continue;
            }
            if((count % 17 == 0) && (count % 19 == 0)){
                System.out.println(count);
                break;
            }
            
        }

        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() -i));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
