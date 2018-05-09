package datastructures;

import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

public class FbiStacks_LabAssignement {
    public static void main(String[] args){
//        Create an empty stack
        Stack<Integer> stack = new Stack<>();

        //Welcome the user
        System.out.println("--- Welcome to this Stack Data Structure test program ---");
        System.out.println();
        stack_push(stack);
        System.out.println();
        System.out.println();
        System.out.println("SUCCESSFULL !!!!");
        System.out.println("Enter 1 to Add items or 2 to Delete Items or 3 Number of Items, 4 for min " +
                " 5 max item, 6 find an item, 7 to exit  ");

        Scanner fbi_option = new Scanner(System.in);
        int option = Integer.parseInt(fbi_option.nextLine());


        switch (option) {
            case 1:  stack_push(stack);
                break;
            case 2:  stack_pop(stack);
                break;
            case 3:  stack_count(stack);
                break;
            case 4:  stack_min(stack);
                break;
            case 5:  stack_max(stack);
                break;
            case 6:
//                Collect what should be searched for then pass it to search function
                System.out.println("What would you like to find?");
                Scanner search_op = new Scanner(System.in);
                int search_re = Integer.parseInt(search_op.nextLine());
                stack_search(stack, search_re);
                break;
            case 7:  System.out.println("Bye!");
                break;


            default: System.out.println("Invalid number");
                break;
        }
    }

    //Inserts into Stack
    static void stack_push(Stack<Integer> stack){
        //key in number of case files you'll put in
        System.out.println("How many case files do you want to put in ? \n");
        Scanner case_files = new Scanner(System.in);
        int case_file = Integer.parseInt(case_files.nextLine());

        Scanner files_no = new Scanner(System.in);

        //Push element to the top of the stack
        for (int i=0; i < case_file; i++ ){
            System.out.println("Enter the file ID number: ");
            int files_number = files_no.nextInt();
            stack.push(files_number);
            System.out.println(stack);
        }

    }

    // Deletes items from the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("How many items would you like to delete? \n");
        Scanner delete_files = new Scanner(System.in);
        int delete_file = Integer.parseInt(delete_files.nextLine());

        for(int i = 0; i < delete_file; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
//        Print stack contents
        System.out.println(stack);
    }

    //    Count the number of items in the stack
    static void stack_count(Stack<Integer> stack){
        int stack_size =  stack.size();
        System.out.println(stack_size);
        System.out.println(stack);

    }

    //  Return max value from stack
    static void stack_max(Stack<Integer> stack){

        if(!stack.isEmpty()){
            Object max = Collections.max(stack);
            System.out.println("max=" + max.toString());
        }
        else{
            System.out.println("Stack is empty");
        }

    }

    //  Return min value from stack
    static void stack_min(Stack<Integer> stack){

        if(!stack.isEmpty()){
            Object max = Collections.min(stack);
            System.out.println("min=" + max.toString());
        }
        else{
            System.out.println("Stack is empty");
        }

    }

    // Find position of element in stack
    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);

    }

//    Sort and print stack
    static void stack_sort(Stack<Integer> stack){

        int sizeOfStack=stack.size();

        for(int i=0; i < sizeOfStack-1; i++){
            for (int j=0; j<sizeOfStack-i-1; j++){
                if (stack[j]>stack[j+1]){

                }
            }

        }



    }


}