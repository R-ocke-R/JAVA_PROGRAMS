public class Box {
    private double w;
    private double h;
    private double d;
    Box(double w,double h, double d){
        this.w=w;
        this.h=h;
        this.d=d;
    }
    public void vol(){
        System.out.println(h*d*w);
    }
}
class sh{
    public static void main(String[] args) {
        Box bo = new Box(50,85,90);
        bo.vol();
    }
}