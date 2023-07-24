package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangle = new Rectangle();
        System.out.printf("Enter retangle and widht and height\n");
        retangle.height = sc.nextDouble();
        retangle.width = sc.nextDouble();

        System.out.printf("AREA " + retangle.area() + "\nPERIMETRO = " + retangle.perimetro() + " \nDIAGONAL "
                + retangle.diagonal());

        sc.close();
    }
}
