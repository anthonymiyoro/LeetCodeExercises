package datastructures;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class PlayerQueue {

public static void main(String[] args){
    Queue myQueue = new LinkedList();
    int[] vars = new int[11];

    //key in age after printing out string below :)
    System.out.println("What is your age ? \n");
    Scanner age_player1 = new Scanner(System.in);
//    String age_of_player1 = age_player1.nextLine();

////    Insert age to queue and show if it worked
//    boolean flag = myQueue.offer(age_of_player1);
//    System.out.println("Wednesday inserted successfully? "+flag);


    for(int i=0; i<vars.length; i++){
        System.out.println("Enter the next age: ");
        vars[i] = age_player1.nextInt();
        boolean flag = myQueue.offer(age_player1);
        System.out.println("Age inserted successfully? "+flag);
    }

    System.out.println("Successful");
  }
}
