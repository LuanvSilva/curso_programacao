package entities;

public class Employee {

    public String name;
    public double salary;
    public double taxa;
    public double porcentagem;
    public double result;

    public double netSalary() {

        return this.result = this.salary - this.taxa;
    }

    public double increment() {

        return this.result + ((this.salary * this.porcentagem) / 100);

    }

}
