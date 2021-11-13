package FunctionOverloading;

public class Exam2 {
    public int rollno;
    public String course;
    public int marks;
    public Exam2(){     // non-parametrize constructor
        rollno=0;
        course="Unknown";
        marks=0;
    }
    public void setval(int rollno,String course,int marks){
        this.rollno=rollno;
        this.course=course;
        this.marks=marks;
    }
    public void setval(int rollno,int marks){
        this.rollno=rollno;
        this.course=course;
        this.marks=marks;
    }
    public void display(){
        System.out.println(rollno+"  "+course+"  "+marks);
    }
}
