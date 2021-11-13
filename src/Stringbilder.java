public class Stringbilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("naman");
        System.out.println(sc);

        // char at index i
        System.out.println(sc.charAt(0));

        //set char at any index.
        sc.setCharAt(0, 'a');
        System.out.println(sc);

        //add any char like Naman to aNaman
        sc.insert(0,'N');
        System.out.println(sc);

        // delete any char at any index.
        sc.delete(1,2);
        System.out.println(sc);

        // append any
        sc.append(" Parahar");
      System.out.println(sc);

      // reverse a string
        StringBuilder s = new StringBuilder("HELLO");
        for (int i =s.length()-1; i >=0; i--)
            System.out.print(s.charAt(i)+"");
    }
}
