package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class FbiStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack_push(stack);

    }

    
    static void stack_push(Stack<Integer> stack){
        //key in number of case files you'll put in
        System.out.println("How many case files do you want to put in ? \n");
        Scanner case_files = new Scanner(System.in);
        int case_file = Integer.parseInt(case_files.nextLine());

        Scanner files_no = new Scanner(System.in);


//        Push element to the top of the stack
        for (int i=0; i < case_file; i++ ){
            System.out.println("Enter the file ID number: ");
            int files_number = files_no.nextInt();
            stack.push(files_number);
        }

    }
}
