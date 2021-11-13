class a{
    int a;
    a(int a){
        this.a=a;
        System.out.println(a);
    }
    a(){
        this(67);
        System.out.println("naman");
    }
}
class bq extends a {
    int bb;

    bq(int bb,int a){
        super(20);
        super.a=a;
        System.out.println(a);
        this.bb=bb;
        System.out.println(bb);
    }
}
public class SuperMethod {
        public static void main(String[] args) {
            bq g = new bq(334,76);
            String A ="madam";
            StringBuilder a = new StringBuilder(A);
            String  B=a.reverse().toString();

            if(A.equals(B))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

