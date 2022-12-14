package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 13;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Você não tem 18, mas pode entrar, pois está acompanho");
		} else {
			System.out.println("Você é menor de idade!");
		}
	
	}
}
