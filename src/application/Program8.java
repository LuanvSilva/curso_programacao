package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program8 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Luan");
        list.add("Tozzi");
        list.add("Carbonar");
        list.add(2, "Larissa");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'C'); // remover a string conforme O primeiro caractere for C

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("Index of Tozzi : " + list.indexOf("Tozzi"));// a posicao que string se encontra no arry
                                                                        // senao existir retorna -1
        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList()); // Gera uma
                                                                                                          // nova string
                                                                                                          // com nomes
                                                                                                          // que comece
                                                                                                          // com letra L

        for (String x : result) {
            System.out.println(x);
        }

         System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);// retorna so o primeiro nome de acordo com aquela 

        System.out.println(name);

    }

}
