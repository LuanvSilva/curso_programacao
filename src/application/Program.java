package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

   public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      Triangle x, y;
      x = new Triangle();
      y = new Triangle();

      System.out.println("Enter the measures of tringule x:");
      x.a = sc.nextDouble();
      x.b = sc.nextDouble();
      x.c = sc.nextDouble();
      System.out.printf("Enter the measures of triangule y:\n");
      y.a = sc.nextDouble();
      y.b = sc.nextDouble();
      y.c = sc.nextDouble();

      double areaX = x.area();

      double areaY = y.area();

      System.out.printf("Triangle X area: %.4f ", areaX);
      System.out.printf("\n Triangle Y area: %.4f ", areaY);

      if (areaX > areaY) {

         System.out.print("Larger area X.");
      } else {
         System.out.print("Larger area Y");

      }

      sc.close();

   }

}
