package entities;

public class Rectangle {

    public double width;
    public double height;

    public void rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {

        return this.height * this.width;

    }

    public double perimetro() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.sqrt(this.width * this.width + this.height * this.height);
    }

}
