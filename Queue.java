import java.util.Scanner;
import static java.lang.System.exit;
/*
* Created by Akshay Chandrashekhar Pandit on 2/21/2017
* It's a Data structure implementation of Queue algorithm in java
* It's a very similar algorithm to stack, yet there's a lot different
* */

public class Queue {
    //Initialised both head and tail to -1, below 0, the starting point of array indexing as the initial point
    //Also initialized some things to be performed globally hence outside all the function definitions including main

    private static int head = -1;
    private static int tail = -1;
    private static Scanner scanner = new Scanner(System.in);
    private static int[] queue_array = new int[100];

    public static void main(String[] args) {

        System.out.println("Please give the required size of the queue: ");
        while (true) {
            //Option is where the user choice is recorded and used, thus declared a variable here
            int option;
            System.out.println("====================MENU====================");
            System.out.println("1. INSERT");
            System.out.println("2. DELETE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("============================================");

            System.out.println("Give the option from the above MENU: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Please enter the right option so as to proceed further.");
                    break;
            }
        }
    }

    //All the elements are inserted as top-down approach
    //It's a FIFO architecture unlike LIFO in stack
    //FIFO is First in First out
    //Hence elements are not stacked over one another
    //Elements are chronologically queued, top to down
    //Elements are entered via tail
    private static void insert(){
        System.out.println("Please enter the data to be inserted/Enqueue: ");
        int data = scanner.nextInt();
        tail++;
        if(tail == 0) {
            head++;
        }
        queue_array[tail] = data;
    }

    //The deletion is done by the same way it is inserted
    //The first element entered will be the first element removed
    //Elements are removed via head
    private static void delete(){

        //Queue/array validation code
        if(head > tail) {
            System.out.println("The queue is empty, can't delete the elements anymore.");
        }else {
            System.out.println("The deleted/Dequeue element is: " + queue_array[head]);
            head++;
        }
    }

    private static void display(){
        if(head > tail){
            System.out.println("The queue is empty, please first enter the elements.");
        }else {
            for (int i = head; i <= tail; i++) {
                System.out.printf("\n%d\n", queue_array[i]);
            }
            System.out.println();
        }
    }
}