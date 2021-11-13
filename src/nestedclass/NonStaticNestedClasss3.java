package nestedclass;

class Door{
    Lock lo;        // declaring an object.
    class Lock{
        private boolean lockstatus;
        public Lock(boolean l){
            lockstatus=l;
        }

        public boolean isLockstatus() {
            return lockstatus;
        }
    }
    public Door(){
         lo = new Lock(true);        //creating object.
    }
    public void shopStatus(){
        if (lo.isLockstatus()==true)    //if we don't declare the obj above then we can't access it here
            System.out.println("Shop is open");
    }
}
public class NonStaticNestedClasss3 {
    public static void main(String[] args) {
        Door d = new Door();
        d.shopStatus();
    }
}
