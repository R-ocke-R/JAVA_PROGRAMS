class author{
    String autName;
    author(){
        autName="Naman Parashar";
    }
}
public class Book {
    String name;
    int qtyInStock;
    double price;
    author a;

    Book(String name,int qtyInStock,double price){
        this.name=name;
        this.qtyInStock=qtyInStock;
        this.price=price;
        a= new author();

    }

    public String getName() {
        return name;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public double getPrice() {
        return price;
    }
    public void display(){
        System.out.println(a.autName);
    }

}
class disp{
    public static void main(String[] args) {
        Book bk = new Book("lp",500,150.25);
        bk.display();
        System.out.println(bk.getName());
        System.out.println(bk.getPrice());
        System.out.println(bk.getQtyInStock());
    }
}
