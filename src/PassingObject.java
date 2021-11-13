class box8{
    int w;
    box8(){
        w=5;
    }
    public int change(box8 o){
        o.w=21;
        return o.w;
    }}
public class PassingObject {
    public static void main(String[] args) {
        box8 p1 = new box8();
        System.out.println(p1.w);
        System.out.println(p1.change(p1));
    }}
