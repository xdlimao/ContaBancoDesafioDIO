package project;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da Agência!");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite o nome da Agência !");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o nome do Cliente !");
		String nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o valor do saldo !");
		double saldo = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
	}

}
