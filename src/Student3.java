public class Student3 {
     String name;
     double per;
    Student3(String name,double per){
        this.name=name;
        this.per=per;
    }
}
class Test{
    Student3 s1;
    Student3 s2;
    Student3 s3;
    Test(){
        s1=new Student3("Naman",98);
        s2=new Student3("Yash",90);
        s3 =new Student3("Pehu",95);
    }
    public void display(){
       if(s1.per>s2.per){
           if (s1.per>s3.per){
               System.out.println(s1.name);
               System.out.println(s1.per);
           }
           else {
               System.out.println(s3.name);
               System.out.println(s3.per);
           }
       }
       else {
           if (s2.per>s3.per){
               System.out.println(s2.name);
               System.out.println(s2.per);
           }
           else{
               System.out.println(s3.name);
               System.out.println(s3.per);
           }
       }
    }
}
class QWERT{
    public static void main(String[] args) {
        Test t =new Test();
        t.display();
    }
}