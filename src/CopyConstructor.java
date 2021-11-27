import exceptionhandling.Stu;

class Stud{
    String name;
    int roll;
    Stud(){        //Constructor for obj1

    }
    Stud(Stud obj1){     // copy constructor
        name=obj1.name;
        roll = obj1.roll;
    }
    public void m1(){
        System.out.println(name);
        System.out.println(roll);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Stud obj1 = new Stud();
        obj1.name="Stu1";
        obj1.roll=1;

        Stud obj2 = new Stud(obj1);
        obj1.m1();
        obj2.m1();
    }
}
