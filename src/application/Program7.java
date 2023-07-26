package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    
     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos os hospedes vão se hospedar");
        int h = sc.nextInt();
        sc.nextLine();

        String[] name = new String[h];
        String[] email = new String[h];
        int[] room = new int[h]; 

        for (int i = 0; i < h; i++) {
            
            System.out.println("Rent #" + i);
            System.out.println("Name: ");
            name[i] = sc.nextLine();
            System.out.println("email: ");
            email[i] = sc.nextLine();
            System.out.println("Room: ");
            room[i] = sc.nextInt();
            sc.nextLine();



        }

        for (int i = 0; i < h; i++) {
            System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
        }

        sc.close();
     }
}
