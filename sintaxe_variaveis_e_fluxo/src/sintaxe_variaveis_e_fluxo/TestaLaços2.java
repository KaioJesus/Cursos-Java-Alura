package sintaxe_variaveis_e_fluxo;

public class TestaLaços2 {
	public static void main(String[] args) {
		for(int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}
