package wrapperclass;
class integer{
    int a;
    integer(int a){
        this.a=a;
    }

    @Override
    public String toString() {
        return a+"";
    }
}
public class WrapperClass {
    public static void main(String[] args) {
       integer obj = new integer(100);
        System.out.println(obj);
        //Wrapper class-
        Integer a=14;
        Character c='a';
        Float f =524.25f;
        Double d =5470.2d;
        Byte b=1;
        Short s =25;
        Boolean bb= true;
        Long l =1455541981951951656l;
    }
}
