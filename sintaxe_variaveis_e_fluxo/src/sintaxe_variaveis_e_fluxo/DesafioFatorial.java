package sintaxe_variaveis_e_fluxo;

public class DesafioFatorial {
	public static void main(String[] args) {	
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.print("Fatorial de " + i + " é");
		 * int fatorial = 1;
		 * 
		 * for (int j = 1; j <= i; j++) { fatorial = fatorial * j; }
		 * System.out.print(" = " + fatorial); System.out.println(); }
		 */
		int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
		
	}
}
