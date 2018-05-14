public class Bank {
    int balance = 1000;

    public int depositCash (int amount){
        System.out.println("Your Previous balance was :");
        System.out.println(balance);
        balance  =  amount + balance;
        System.out.println("Your New balance is :");
        System.out.println(balance);
        return balance;
    }

    public int withdrawCash (int amount){
        System.out.println("Your Previous balance was :");
        System.out.println(balance);
        balance  =  balance - amount;
        System.out.println("Your New balance is :");
        System.out.println(balance);
        return balance;
    }
}
