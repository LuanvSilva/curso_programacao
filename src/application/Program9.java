package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Persons;

public class Program9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Persons[] personsArray = new Persons[1000];

        System.out.println("Quantos Funcionarios deseja cadastrar");
        int funcionario = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < funcionario; i++) {
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome: " + (i + 1));
            String nome = sc.nextLine();

            System.out.println("Salario:");
            double salario = Double.parseDouble(sc.next());

            Persons person = new Persons(id, nome, salario);
            personsArray[id] = person;
            System.out.println("-----------------------");
        }

        System.out.println("Qual funcionario pelo id vai receber aumento: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------");
        System.out.println("Qual a porcentagem");
        float percentage = Float.parseFloat(sc.next());
        System.out.println("-----------------------");

        // Procurar o funcionario no array com o ID fornecido
        Persons selectedPerson = personsArray[index];

        // Se encontrou o funcionario, aplicar o aumento no salário
        if (selectedPerson != null) {
            double aumento = selectedPerson.getSalario() * (percentage / 100);
            selectedPerson.setSalario(selectedPerson.getSalario() + aumento);
            System.out.println("Aumento aplicado com sucesso!");
            System.out.println("-----------------------");
        } else {
            System.out.println("Funcionario com o ID informado nao encontrado.");
        }

        for (Persons person : personsArray) {

            if (person != null) {
                System.out.println("ID: " + person.getId());
                System.out.println("Nome: " + person.getNome());
                System.out.printf("Salario: %.2f\n", person.getSalario());
                System.out.println("-----------------------");

            }
        }
        
        sc.close();
    }
}
