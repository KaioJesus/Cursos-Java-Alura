package sintaxe_variaveis_e_fluxo;

// aprendendo sobre variáveis no Java

public class TestaVariaveis {
	public static void main(String[] args) {
		System.out.println("ola novo teste");
		
		int idade = 23;
		System.out.println(idade);
		
		idade = 20 + 15;
		System.out.println(idade);
		
		idade = 25 + 15;
		System.out.println(idade);
		
		System.out.println("A idade é: " + idade);
		// concatenação da string com o tipo inteiro usando "+"
		
		double salario = 1250.70;
		System.out.println("Meu salário é " + salario);
		
		double idade2 = 37;
		// tipo inteiro cabe no tipo flutuante, mas a recíproca não é verdadeira
		
		double divisao = 3.14 / 2;
		System.out.println("divisao");
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		/* Aqui retornará 2, a divisão entre dois números do tipo int, retornará um tipo int
			mesmo que a resposta seja um número decimal.
		*/
		
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
		/* para dar 2.5, é preciso que a conta seja feita com um ponto flutuante e um inteiro
			caso contrário, o valor a retornar será 2.			
		*/
		
		
		// Testando conversão
		double salarioConversao = 1270.50;
		int valor = (int) salarioConversao;
		System.out.println(valor);
		// transformando um ponto flutuante (double) em inteiro.
		
	}
}
