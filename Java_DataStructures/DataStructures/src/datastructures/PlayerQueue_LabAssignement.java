package datastructures;



import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class PlayerQueue_LabAssignement {

    public static void main(String[] args){
    //    Create new queue
        Queue myQueue = new LinkedList();
        int[] vars = new int[11];

        System.out.println("--- Welcome to this data Structures test program Insert 11 ages below ---");
        System.out.println("What is your age ? \n");
        Scanner age_player1 = new Scanner(System.in);
        String age_of_player1 = age_player1.nextLine();

    //    Insert age to queue and show if it worked
        boolean flag1 = myQueue.offer(age_of_player1);
        System.out.println("Age inserted successfully? "+flag1);


        for(int i=0; i<vars.length; i++){
            System.out.println("Enter the next age: ");
            vars[i] = age_player1.nextInt();
            boolean flag = myQueue.offer(age_player1);
            System.out.println("Age inserted successfully? "+flag);
            System.out.println("11 Items inserted to queue");



            System.out.println("Enter 1 to Delete Items or 2 Number of Items, 3 for max " +
                    " 4 min item, 5 find an item, 6  to exit  ");

            Scanner fbi_option = new Scanner(System.in);
            int option = Integer.parseInt(fbi_option.nextLine());


            switch (option) {
                case 1:  queue_pop(myQueue);
                    break;
                case 2:  queue_count(myQueue);
                    break;
                case 3:  queue_max(myQueue);
                    break;
                case 4:  queue_min(myQueue);
                    break;
                case 5:
                    queue_search(myQueue);
                    break;
                case 6:  System.out.println("Bye!");
                    break;
                default: System.out.println("Invalid number");
                    break;
            }


        }

    System.out.println("Successful");
    }

    // Deletes items from the Queue
    static void queue_pop(Queue queue)
    {
        String head = null;
        //  Remove the first from the queue
        head = (String) queue.remove();
        System.out.print("1) Push out " + head + " from the queue ");
        System.out.println("and the new head is now: "+ queue.element());
        System.out.println(queue);
    }

    // Number of items in the queue
    static void queue_count(Queue queue)
    {

//        Node temp = head;
//        int count = 0;
//        while (temp != null)
//        {
//            count++;
//            temp = temp.next;
//        }

        int length = queue.size();
        System.out.println(length);
    }

    // max of queue
    static void queue_max(Queue<Integer> queue)
    {
        int max_value = Collections.max(queue);
        System.out.println("The max of this queue is: "+ max_value);
        System.out.println(queue);
    }

    // Min of queue
    static void queue_min(Queue<Integer> queue) {
        int min_value = Collections.min(queue);
        System.out.println("The max of this queue is: "+ min_value);
        System.out.println(queue);
    }


    // Search queue
    static void queue_search(Queue<Integer> queue) {
        System.out.println("What would you like to search for? \n");
        Scanner search_result = new Scanner(System.in);
        String result_search = search_result.nextLine();

        System.out.println("Does the queue contain +" +result_search  + queue.contains(result_search));
    }


}
