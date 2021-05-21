package extrainumero;

public class ExtraiNumero {

	public static void main(String[] args) {
		
		
		String teste = "te4st4e215";
		String resultado = "";
		int zero =(char)'0';
		int nove = (char)'9';		
		
		for(int i = 0 ; i < teste.length();i++) {
		
			if((char)teste.charAt(i)>=zero && (char)teste.charAt(i)<=nove){
			
				resultado = resultado+teste.charAt(i);
				
			}
		
		}
		
		 System.out.print(resultado);
	}

}
