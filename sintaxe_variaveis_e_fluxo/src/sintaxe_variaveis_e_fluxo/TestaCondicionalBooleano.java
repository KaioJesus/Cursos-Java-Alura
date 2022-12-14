package sintaxe_variaveis_e_fluxo;

public class TestaCondicionalBooleano {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		// booleano retorna verdadeiro ou falso, ou seja, ou você pode pôr uma expressão que retorne uma verdade ou uma mentira,
		/* ou você põe literalmente que é verdade (true) ou falso (false)*/
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}
}
