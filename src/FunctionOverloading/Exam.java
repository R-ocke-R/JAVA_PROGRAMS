package FunctionOverloading;

public class Exam {
    public int Rollno;
    public String course;
    public int marks;
    public Exam(){     // non-parametrize constructor
        Rollno=10;
        course="B.Tech";
        marks=900;
    }
    public Exam(int Rollno,String course,int marks){
        this.Rollno=Rollno;
        this.course=course;
        this.marks=marks;
    }
    public Exam(int Rollno,int marks){
        this.Rollno=Rollno;
        this.marks=marks;
        course="Mca";
    }
    public void display(){
        System.out.println(Rollno+"  "+course+"  "+marks);
    }
}
