package syncronizedKeyword;

import java.util.Scanner;
class account{
    public int balance;
    public account()
    {
        Scanner sc = new Scanner(System.in);
        try {
            balance=sc.nextInt();
        }
        finally {
            sc.close();
        }

    }
    public synchronized void withdraw(int val)throws InterruptedException{
        Thread.sleep(1000);
        balance=balance-val;
        System.out.println(balance);
    }
}
class Mythread extends Thread {
    account obj = null;

    public Mythread(account tobj) {
        obj = tobj;
    }

    public void run() {
        try {
            obj.withdraw(500);
        } catch (InterruptedException b) {
            System.out.println("error");
        }
    }
}

public class syncro {
    public static void main(String[] args) {
    account obj = new account();
    Mythread t1 = new Mythread(obj);
    Mythread t2 = new Mythread(obj);
    t1.start();
    t2.start();
}
}
