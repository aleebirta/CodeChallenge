package bankTransactions;

public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount from = new BankAccount("Source", 500);
        BankAccount to = new BankAccount("Destination", 800);
        System.out.println("before:");
        System.out.println(from);
        System.out.println(to);

        TransactionThread t1 = new TransactionThread("T1", from, to, 800);
        TransactionThread t2 = new TransactionThread("T2", from, to, 100);

        //start transacting
        t1.start();
        t2.start();

        //wait for transfers to be completed
        t1.join();
        t2.join();

        System.out.println("after:");
        System.out.println(from);
        System.out.println(to);
    }
}
