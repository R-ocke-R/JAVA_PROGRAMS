package Array;

public class ArrayCopy {
        public static void main(String[] args) {
            char[] c1= { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd' };
            char[] c2 = new char[7];
            System.arraycopy(c1,4,c2,0,5);
            System.out.println(String.valueOf(c2));
        }
    }
