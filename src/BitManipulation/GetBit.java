package BitManipulation;
/**
 * Step 1- find Bit Mask that is 1<<i  here i is the position of bit we want to get.
 * step 2- Perform "AND" operation of bit Mask with number we have.
 * If the result is non-zero then the position bit is 1
 * and result is zere then position bit is 0.
 */
// Here we will find the 3rd(position=2) bit if number 5.(0101)
public class GetBit {
    public static void main(String[] args) {
        int a =5;
        int pos=2;
       int bit_mask=1<<pos;
        a=a&bit_mask;
        if (a>0)
            System.out.println("Bit is 1");
        else
            System.out.println("Bit is 0");
    }
}
