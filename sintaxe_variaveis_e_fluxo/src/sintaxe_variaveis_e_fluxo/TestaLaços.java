package sintaxe_variaveis_e_fluxo;

public class TestaLaços {
	
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("Tabaduada do " + multiplicador);
			for (int multiplicador2 = 0; multiplicador2 <= 10; multiplicador2++) {
				System.out.print(multiplicador + " * " + multiplicador2 + " = " + multiplicador * multiplicador2);
				System.out.println("");
			}			
			System.out.println("");
		}
	}
}
