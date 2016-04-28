package Aula27042016;
public class Main {

	public static void main (String [] args){
		
		ContaPoupanca cp1 = new ContaPoupanca("José", "Rua 1", "123");
		//ContaPoupanca cp2 = new ContaPoupanca("João", "Rua 2", "123");
		//ContaPoupanca cp3 = cp1;
				
		//System.out.println(cp1.equals(cp2));
		//System.out.println(cp1==cp2);
		//System.out.println(cp3==cp1);
		
		try{
			
			cp1.deposita(10);
			cp1.saque(100);
		}
			catch (Exception e){
				e.printStackTrace();
			}
			
		
		
	}
	
}
