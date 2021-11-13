class Processor
{
    int price;
    String model;
    int generation;
    Processor()
    {
        price = 5000;
        model = "i7";
        generation = 11;
    }
}
class Laptop
{
    int weight;
    String company;
    Processor p1;  // containership
    Laptop()
    {
        weight = 2;
        company = "hp";
        p1= new Processor();
    }
    public  void display()
    {
        System.out.println(weight);
        System.out.println(company);
        System.out.println(p1.price);
        System.out.println(p1.model);
        System.out.println(p1.generation);
    }
}
public class ContainershipDemo {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.display();

    }
}
