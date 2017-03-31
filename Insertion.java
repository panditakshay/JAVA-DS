import java.util.Scanner;

/**
 * Created by Akshay Chandrashekhar Pandit on 3/7/2017.
 */
public class Insertion {
    //Global variables
    private static int[] myArray;
    private static int size;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        createDisplay();
        sortDisplay();
    }

    //Creating array and displaying the unsorted array
    private static void createDisplay(){
        System.out.println("Please give the array length: ");
        size = scanner.nextInt();
        System.out.println("Now give " + size + " elements: ");
        myArray = new int[size];
        for(int i=0; i<size; i++){
            myArray[i] = scanner.nextInt();
        }

        //Display block with advanced for loop
        System.out.println("The array is as follows: ");
        for (int x: myArray){
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    //The main sorting algorithm implementation of insertion sort and displaying the sorted array
    private static void sortDisplay() throws InterruptedException {
        System.out.println("The sorting process begins...");
        Thread.sleep(2000);

        //Assume that 0th position element falls in the sorted set
        for(int i=1;i<size;i++){
            int value = myArray[i]; //Put the 2nd element in the value and iterate further, first element being already the sorted element
            int hole = i; //Put the 1st index into the hole

            //Start the loop where the
            while(hole > 0 && myArray[hole-1] > value){
                myArray[hole] = myArray[hole - 1]; //Shifting the hole towards left (the sorted set)
                hole--; //Setting the pointer on the previous index
            }

            myArray[hole] = value; //Put the value into the current hole position

        }

        //Displaying the sorted array using advanced for loop
        System.out.println("The sorted array is as follows: ");
        for (int x: myArray){
            System.out.print(x + "\t");
        }
    }
}
