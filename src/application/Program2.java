package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter product data ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantidade = sc.nextInt();

        System.out.print(product.toString());

        sc.close();
    }
}