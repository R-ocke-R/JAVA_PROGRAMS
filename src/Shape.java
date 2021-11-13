public class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing Shape");
    }
}
class exe{
    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.draw();
        sh.erase();
    }
}
