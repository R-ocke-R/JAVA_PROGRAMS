public class Student {
    // characteristics and behaviour
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}

class StudentTest
{
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setName("aman");
        obj1.setAge(18);
        System.out.println(obj1.getAge());
        String result = obj1.getName();
        // System.out.println(obj1.getName());
        System.out.println(result);

    }
}