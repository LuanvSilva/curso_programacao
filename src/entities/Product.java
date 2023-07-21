package entities;

public class Product {
    public String name;
    public double price;
    public int quantidade;

    public double totalValueInStock() {
        return this.price * this.quantidade;
    }

    public void addProduct(int quantidade) {
        if (this.quantidade + quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    public void removeProducts(int quantidade) {
        if ((this.quantidade - quantidade) >= 0) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade indisponível");
        }
    }
}
