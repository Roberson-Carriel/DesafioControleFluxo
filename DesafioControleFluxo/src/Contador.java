import java.util.Scanner;

public class Contador {
	int contagem;
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        if (parametroUm > parametroDois) {
            System.err.println("Segundo parametro deve ser maior que o primeiro");
        }else {
            int contagem = parametroDois - parametroUm;
			for (int contar = 0; contar < contagem;) {
				contar = contar + 1;
				System.out.println( " Imprimindo o número " + contar);
			}
        }
	}
}