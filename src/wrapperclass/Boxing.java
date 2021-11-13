package wrapperclass;

public class Boxing {
    public static void main(String[] args) {
        //Boxing- A way to convert a primitive datatype to primitive object
        // By 2 ways-

        // 1) using constructor
//        Integer a = new Integer("100");
//        int e=200;
//        Integer t = new Integer(e);
//        char f='d';
//        Character c = new Character(f);
//        System.out.println(a);


        // 2) using utility method valueof();
        int a=25;
        Integer u = Integer.valueOf(a);

    }
}
