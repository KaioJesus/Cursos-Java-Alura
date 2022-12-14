package sintaxe_variaveis_e_fluxo;

public class DesafioMultiplo3 {
	 public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				// operador módulo, retorna o resto da divisão
				System.out.println(i);
			}
		}
		//duas formas de fazer
		for (int i = 0; i <= 100; i+= 3) {
				System.out.println(i);
			
		}
	}
}
