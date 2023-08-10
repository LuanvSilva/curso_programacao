package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class program12 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter departament'a name:  ");
        String departmentName = sc.nextLine();
        System.out.print("Enter Worker data ");
        System.out.print("Name ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workLevel = sc.nextLine();
        System.out.print("Base salary");
        double baseSalary = sc.nextDouble();

       // Worker worker new Worker(workerName, WorkerLevel.valueOf(workLevel), baseSalary, new Department(departmentName));

         System.out.print("How namy contracts to worker?");
         int n = sc.nextInt();
         for (int i = 0; i <n; i++) {
            System.out.println("Enter contract " + i+1 + "data:");
            System.out.print("Date (DD/MM/YYYY)");
         }
///////////////////////////////////////////////////
        sc.close();
    }
}
