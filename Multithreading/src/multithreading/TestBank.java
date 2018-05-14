import java.util.Scanner;

public class TestBank extends Bank {

    public static void main (String [] args){
//        Get functions from TestSleep class
        Bank bank_tester = new Bank();

        System.out.println("Welcome to the TestBank class. Enter (1) to deposit, Enter (2) to withdraw, Enter (3) to view balance.");
        System.out.println(" ");
        Scanner new_option = new Scanner(System.in);
        int option_1 = Integer.parseInt(new_option.nextLine());

        if (option_1 == 1){
            System.out.println("How much would you like to deposit? Please note your balance is 1000");
            Scanner new_deposit = new Scanner(System.in);
            int deposit_amount = Integer.parseInt(new_deposit.nextLine());
//          Creates a new thread that runs the deposit cash method
            Thread deposit = new Thread(
                    new Runnable() {
                    @Override
                    public void run() {
                        bank_tester.depositCash(deposit_amount);
                    }
                    });
            deposit.start();
        }

        else if (option_1 == 2){
            System.out.println("How much would you like to withdraw? Please note your balance is 1000");
            Scanner new_withdrawal = new Scanner(System.in);
            int withdrawal_amount = Integer.parseInt(new_withdrawal.nextLine());
//            runs withdrawCash method in TestSleep class
            if (withdrawal_amount>1000){
                System.out.println("You cannot withdraw more than you have. Please put a value less than 1000");
            }
            else{
//                Creates a new thread that runs the withdraw cash method
                Thread withdraw = new Thread(
                        new Runnable(){
                            @Override
                            public void run(){
                                bank_tester.withdrawCash(withdrawal_amount);
                            }
                        });
                withdraw.start();
            }
        }

        else if (option_1 == 3){
            System.out.println("You may view your balance below for 1000ms:");
            System.out.println(bank_tester.balance);
        }

        else{
            System.out.println("Invalid Input. Please enter either 1 or 2.");
        }
    }
}



