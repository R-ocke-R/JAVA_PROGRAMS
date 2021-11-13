class go{
    int arr1[][];

    go(int x, int y, int z, int q) {
        arr1 = new int[2][2];
        arr1[0][0] = x;
        arr1[0][1] = y;
        arr1[1][0] = z;
        arr1[1][1] = q;
        System.out.println("The given Array is:"); //Printing the array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public void display(){
        System.out.println("The Reverse of the array is:");
        for (int r=(arr1.length-1);r>=0;r--){
            for (int u=(arr1.length-1);u>=0;u--){
                System.out.print(arr1[r][u]+" ");
            }
            System.out.print("\n");
        }
    }
}
public class Array6 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        int q = Integer.parseInt(args[3]);
        go a = new go(x, y, z, q);
        a.display();
    }
}