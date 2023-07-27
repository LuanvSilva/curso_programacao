package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Persons;

public class Program9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vec = new int[1000];
        System.out.println("Quantos Funcionarios deseja cadastrar");
        int funcionario = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < funcionario; i++) {

            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Funcionario: " + i + 1);
            String nome = sc.nextLine();
            sc.nextLine();

            System.out.println("Salario:");
            double salario = Double.parseDouble(sc.next());

            
            Persons person = new Persons(id, nome, salario);
            
        }

        System.out.println("Qual funcionarios pelo id vai receber aumento: ");
        int index= sc.nextInt();
        sc.nextLine();
        System.out.println("Qual a porcentagem");
        float percentage = Float.parseFloat((sc.next()));

        for (int i = 0; i < funcionario; i++) {
            
            
        }

        sc.close();
    }
}