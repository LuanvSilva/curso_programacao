package entities;

public class Persons {
    
    public int id;
    public String name;
    public double salary;
    public double porcentagem;
    public int[] vec = new int[1000];

    public Persons(int id, String name, double salary){

        this.id = id;
        this.name = name ;
        this.salary  = salary;
        

    }

    

    public double porcent(){
        return (this.salary * this.porcentagem) / 100; 
    }


}
