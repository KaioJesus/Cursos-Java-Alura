package sintaxe_variaveis_e_fluxo;

public class TestaSoma {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while(contador <= 100) {
			
			total += contador;
			contador++;
		}
		
		System.out.println(total);
	}
}
