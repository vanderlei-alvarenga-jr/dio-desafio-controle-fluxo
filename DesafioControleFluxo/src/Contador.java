import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		try{
			System.out.println("Digite o primeiro número: ");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo número: ");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			}
			catch (ParametrosInvalidosException ex) {
				System.out.println(ex.getMessage());
			}
		}
		catch (InputMismatchException ex) {
			System.out.println("O parâmetro informado deve ser um número inteiro.");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois)
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++)
		{
			System.out.println(String.format("Número %d", i));
		}
	}
}