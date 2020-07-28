package corretora;
import java.util.Scanner;

import corretora.calculo;
public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
        calculo ca = new calculo();
        System.out.println("Bem vindo ");
        System.out.println("Qual a cotação do dia? ");
        ca.cotacao = sc.nextDouble();
        System.out.println("Quantos euros você quer comprar? ");
        ca.quanto = sc.nextDouble();
        
        System.out.printf("Você comprou: %.2f%n",ca.conta());
	}

}
