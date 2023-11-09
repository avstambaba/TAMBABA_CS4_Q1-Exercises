package ex03_tau_tambaba;
public class Penguins {
    private String name, breed;
    private int age;
    private double weight;
    
    public Penguins(String n, String b, int a, double w) {
        name = n;
        breed = b;
        age = a;
        weight = w;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getWeight(){
        return weight;
    }
}
