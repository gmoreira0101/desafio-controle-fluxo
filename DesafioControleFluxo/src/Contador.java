import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmentro é menor que o primeiro");
		}finally{
			System.out.println("Sistema encerrado");
		}
		terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		} else{
			int contagem = parametroDois - parametroUm;
			System.out.println("O numero de ocorrencias é " + contagem);
			System.out.println("Contagem iniciando...");
			for( int i = parametroUm - parametroUm + 1; i<= contagem; i++){
				System.out.println(i);
			}
		}
	}
}