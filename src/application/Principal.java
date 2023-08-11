package application;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Rota r = new Rota();
        r.planejarDia();
    }
}

class Rota {
    public void planejarDia() {
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de rotas do dia:"));

        double totalKm = 0;
        for (int i = 1; i <= quantidadeRotas; i++) {
            double kmRota = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida na rota " + i + " (em km):"));
            totalKm += kmRota;
        }

        double consumoMedio = 2.5; // km/litro
        double combustivelNecessario = totalKm / consumoMedio;

        double valorLitroDiesel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));

        double custoTotal = combustivelNecessario * valorLitroDiesel;

        JOptionPane.showMessageDialog(null,
                "Total de km percorridos: " + totalKm + " km\n" +
                "Litros de combustível necessários: " + combustivelNecessario + " litros\n" +
                "Custo total: R$" + custoTotal);
    }
}
