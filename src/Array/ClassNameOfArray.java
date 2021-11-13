package Array;

public class ClassNameOfArray {
        public static void main(String args[]){
//declaration and initialization of array
            int arr[]={4,4,5};
//getting the class name of Java array
            Class c=arr.getClass();
            String name=c.getName();
            System.out.println(name);
        }
}
