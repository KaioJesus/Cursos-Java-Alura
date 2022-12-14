package sintaxe_variaveis_e_fluxo;

public class AjudandoJoão {

	public static void main(String[] args) {
		double salario = 2300.0;
		double imposto;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			imposto = salario * 0.075;
			System.out.println("A sua aliquota é de 7,5%, ou seja, " + imposto);
			System.out.println("Você pode deduzir até R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			imposto = salario * 0.15;
			System.out.println("A sua aliquota é de 15% ou seja, " + imposto);
			System.out.println("Você pode deduzir até R$ 350");
		} else {
			imposto = salario * 0.225;
			System.out.println("A sua aliquota é de 2%, ou seja, " + imposto);
			System.out.println("Você pode deduzir até R$ 636");
		}
	}

}
