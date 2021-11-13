package assignment;

public class PiggiBank {
    int amount=50;
    PiggiBank(){
        System.out.println("Total amount is "+amount);
    }
    PiggiBank(int a){
        System.out.println("Total Amount: "+(amount+a));
    }
}
class add{
    public static void main(String[] args) {
        PiggiBank p = new PiggiBank(100);

    }
}

