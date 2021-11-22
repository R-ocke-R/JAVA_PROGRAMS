package BitManipulation;
/**
 * Step 1- find Bit Mask that is 1<<i  here i is the position of bit we want to get.
 * step 2- Perform "OR" operation of bit Mask with number we have.
 */
// Here we will find the 3rd(position=1) bit if number 5.(0101)
public class SetBit {
    public static void main(String[] args) {
        int a = 5;
        int pos = 1;
        int bit_mask = 1 << pos;
        a = a | bit_mask;
        System.out.println(a);
    }
}
