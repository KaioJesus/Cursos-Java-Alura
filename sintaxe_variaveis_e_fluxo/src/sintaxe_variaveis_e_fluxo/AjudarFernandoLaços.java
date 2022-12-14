package sintaxe_variaveis_e_fluxo;

public class AjudarFernandoLaços {
	 public static void main(String args[]) {
	    for(int linha = 0; linha < 5; linha++) {
	        for (int coluna = 0; coluna < 5; coluna++) {
	            if (coluna > linha) {
	                break;
	                
	                // quando o break é acionado, ele vai sair do if e dor for
	            }
	            System.out.print(coluna + 1);
	        }
	        System.out.println();
	    }
	 }
}
