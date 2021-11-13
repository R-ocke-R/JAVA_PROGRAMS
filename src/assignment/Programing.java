package assignment;

public class Programing {
    Programing(){
        System.out.println("I Love Programing Languages");
    }
    Programing(String s){
        System.out.println("I Love "+s);
    }
}
class d{
    public static void main(String[] args) {
        Programing p = new Programing();
        Programing p1 = new Programing("Java");
    }
}