public class PrivateMembers {
    private String name;
    private int rollno;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
class Student1Main
{
    public static void main(String[] args) {
        PrivateMembers obj1 = new PrivateMembers();
        PrivateMembers obj2 = new PrivateMembers();
        // print the name of student who get highest marks\
        obj1.setName("Naman");
        obj1.setRollno(12);
        obj1.setMarks(50);
        obj2.setName("aman");
        obj2.setRollno(13);
        obj2.setMarks(60);
        if (obj1.getMarks()>obj2.getMarks()){
            System.out.println(obj1.getName());
        }
        else{
            System.out.println(obj2.getName());
        }
    }
}