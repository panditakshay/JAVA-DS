import java.util.Scanner;
import static java.lang.System.exit;

/*
*  Created by Akshay Chandrashekhar Pandit on 2/21/2017
*  This program is stack implementation
*  using push and pop functions
*  Quite simple and easy to understand program
*  Especially the entrance for learning data structures
* */

public class Stack {
    //Global variables that will be used in every corner of the program and not just some particular function.
    //We manipulate the index values while pushing and popping thus we initialize n = 0, n being the index flag
    private static int n = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static int[] stack_array = new int[100];

    public static void main(String[] args) {
        //We run the menu indefinitely
        //The only way to end the loop is implicitly exiting the application by choosing the exit option
        //Else keep on running other options
        while (true) {
            //option is the variable where the user choice is recorded to be later used as switch case,
            // to call certain functions based on the option
            int option;
            System.out.println("====================MENU====================");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("============================================");

            System.out.println("Give the option from the above MENU: ");
            //User menu decision recorded in option
            option = scanner.nextInt();
            //Switch case usage instead of else-if conditioning, making the code much readable
            switch (option) {
                case 1:
                    //push call when pressed 1
                    push();
                    break;
                case 2:
                    //pop call when pressed 2
                    pop();
                    break;
                case 3:
                    //display the stack/array when pressed 3
                    display();
                    break;
                case 4:
                    //Exit the program when pressed 4
                    exit(0);
                    break;
                default:
                    //Anything which does not match the case option, goes over here, displaying the message
                    System.out.println("Please enter the right option so as to proceed further.");
                    break;
            }
        }
    }

    //The push method definition
    //Enters the given number in the stack
    //It's called LIFO (Last In First Out)
    //It's a bottom-up approach
    //Elements are stacked upon each other
    //The first element will be on the bottom and the last element on the top
    private static void push(){
        //Display message and input the number into the variable number
        System.out.println("Give number to push into stack: ");
        int number = scanner.nextInt();
        //Enter the variable into the first index which is 0 (initialized globally)
        stack_array[n] = number;
        //increment the index, thus next index being 1 and so on...
        n++;
    }

    //The opposite of push method is pop
    //Pop is deleting numbers one by one
    //It is a top-down approach
    //The first number to be deleted/popped is the last element entered into the array/stack
    private static void pop(){
        //Remove the topmost element and display the removed element
        System.out.println("Popped number is " + stack_array[n-1]);
        //decrement the index so that the removed element won't be displayed anymore
        n--;

        //Validation such that if the index goes lesser than 0, it should display that the array
        if(n < 0){
            System.out.println("End of array");
            n = 0;
        }
    }

    //This is a normal method that displays the array onto the screen
    private static void display(){
        System.out.println();
        //Used traditional for-loop to display elements of the array/stack
        for(int i=n-1;i>=0;i--){
            System.out.printf("%d\n",stack_array[i]);
        }
        System.out.println();
    }
}