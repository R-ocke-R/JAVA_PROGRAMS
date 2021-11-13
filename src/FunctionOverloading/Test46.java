package FunctionOverloading;
// there is no object for parent class when we create the object of child class.
// we use super method when there is a parameterize constructor.
class parent{
    parent(){
        System.out.println("parent cons");
        System.out.println(this.hashCode());
    }
}

class child extends  parent{
    child(){
        System.out.println("child cons");
        System.out.println(this.hashCode());
    }
}

public class Test46 {
    public static void main(String[] args) {
        child c = new child();
        System.out.println(c);
    }
}
