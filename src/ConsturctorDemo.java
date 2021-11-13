public class ConsturctorDemo {
    public int num1;  // instance variable
    public int num2;

    public ConsturctorDemo(int num11, int num2) {
        num1 = num11;
        this.num2 = num2;
    }
    ConsturctorDemo()
    {
        // empty
    }
}
class ConstrucorDemomain
{
    public static void main(String[] args) {
        ConsturctorDemo obj = new ConsturctorDemo(34,67);
        ConsturctorDemo obj1 = new ConsturctorDemo();
    }
}