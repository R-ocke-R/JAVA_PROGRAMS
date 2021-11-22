package BitManipulation;

public class UpdateBit {
    public static void main(String[] args) {
        int a = 5;
        int pos = 1;
        int ope= 1;  // update bit to 1.

        //set bit
        int bit_mask = 1 << pos;
        a = a | bit_mask;
        System.out.println(a);

        int oper=0; // update bit to 0.
        int b=5;
        int bit_mask2 = 1 << pos;
        bit_mask2 = ~( bit_mask2);
        b = b & bit_mask2;
        System.out.println(b);

    }
}
