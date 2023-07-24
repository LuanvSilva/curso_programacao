package application;

import java.util.Scanner;

import entities.Employee;

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name");
        employee.name = sc.nextLine();
        System.out.println("\nGross salario");
        employee.salary = Double.parseDouble(sc.next());
        System.out.println("\nTax:");
        employee.taxa = Double.parseDouble(sc.next());

        System.out.printf("Employee: " + employee.name + ", $ %.2f ", employee.netSalary());

        System.out.println("\nWhich percetage to increase salary ? ");
        employee.porcentagem = Double.parseDouble(sc.next());

        System.out.printf("Update data " + employee.name + " $  %.2f ", employee.increment());

        sc.close();

    }
}
