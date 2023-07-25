package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter accounty number ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String nome = sc.nextLine();

        System.out.println("Enter initial deposit value: ");
        double valor = sc.nextDouble();

        Account account = new Account(conta, nome, valor);

        System.out.printf("Account: " + account.conta + " Holder: " + account.nome + " Balance $: %.2f ",
                account.valor);

        System.out.println("\nEnter a deposit value :");
        account.deposito = sc.nextDouble();

        System.out.printf("Account: " + account.conta + " Holder: " + account.nome + " Balance $: %.2f ",
                account.deposito());

        System.out.println("\nEnter a withdraw value :");
        account.saque = sc.nextDouble();

        System.out.printf("Account: " + account.conta + " Holder: " + account.nome + " Balance $: %.2f ",
                account.saque());

        sc.close();
    }

}
