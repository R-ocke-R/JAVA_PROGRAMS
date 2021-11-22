package BitManipulation;
/**
 * Step 1- find Bit Mask that is 1<<i  here i is the position of bit we want to get.
 * step 2- Perform "NOT" operation to bit Mask.
 * step 3- now perform "AND" operation with number and bit mask.
 */
// Here we will find the 3rd(position=2) bit if number 5.(0101)

public class ClearBit {
    public static void main(String[] args) {
        int a = 5;
        int pos = 2;
        int bit_mask = 1 << pos;
        bit_mask = ~(bit_mask);
        a=bit_mask & a;
        System.out.println(a);
    }
}
