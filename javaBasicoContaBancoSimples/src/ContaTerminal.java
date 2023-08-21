import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		ContaBanco conta01 = new ContaBanco();
		
		
		System.out.println("Qual o numero da Agencia?");
		conta01.setAgencia(scanner.next());
		
		System.out.println("Qual o numero da conta?");
		conta01.setNumero(scanner.nextInt());

		System.out.println("Qual o nome do cliente?");
		conta01.setNomeCliente(scanner.next());
		
		System.out.println("Qual o saldo inicial da conta?");
		conta01.setSaldo(scanner.nextDouble());
		
		
		System.out.println("Ola " + conta01.getNomeCliente() + "! "
				+ "Obrigado por criar uma conta em nosso banco! "
				+ "\nSua agencia e a " + conta01.getAgencia() + " e sua conta e a numero " + conta01.getNumero()
				+ "\nSeu saldo de R$"+conta01.getSaldo() + " ja esta disponível para saque!");
		
		scanner.close();
		
	}

}

/* 
 * TODO: Conhecer e importar a classe Scanner
 * Exibir as mensagens para o nosso usuário
 * Obter pela classe Scanner os valores digitador no terminal
 * Exibir a mensagem "conta criada"
 */
