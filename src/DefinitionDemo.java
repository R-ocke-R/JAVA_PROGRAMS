public class DefinitionDemo  extends Object{
    public int a ; // instance variable
    public String name ;

    @Override
    public String toString() {
        return "DefinitionDemo{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DefinitionDemo obj = new DefinitionDemo();  // object creation
        DefinitionDemo obj1 = new DefinitionDemo();
        obj1.a = 45;
        obj1.name = "neeraj";
        obj.a = 900; // initializing instance variable
        System.out.println(obj);  // printing the object
        System.out.println(obj1);
        // we will override toString method of the Object class.

    }
}