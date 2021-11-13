// the main motive of the creating this program is to use of the  :-(instanceof)
// if we want to check that this object is object of the instance block or not
public class Instanceof {
    int pk;
    int mk;

    @Override
    public String toString() {
        return "Instanceof{" +
                "pk=" + pk +
                ", mk=" + mk +
                '}';
    }

    Instanceof()
    {
        pk=6;
        mk=7;

    }
    public void show()
    {
        System.out.println(pk);
        System.out.println(mk);
    }

}
class Insttanceof
{
    public static void main(String[] args) {
        //Instanceof obj=new Instanceof();
        //System.out.println(obj instanceof Instanceof );// here we use the concept of the (instanceof)
        new Instanceof().show();// anonymous object creation
        System.out.println(new Instanceof());




    }
}
