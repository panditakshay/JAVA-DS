import java.util.Scanner;

/**
 * Created by Akshay Chandrashekhar Pandit on 3/7/2017.
 */
public class Selection {
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

    //The main sorting algorithm implementation of selection sort and displaying the sorted array
    private static void sortDisplay() throws InterruptedException {
        System.out.println("The sorting process begins...");
        Thread.sleep(500);
        //The fix variable keeps the minimum value intact and moves forward (used for swapping)
        //The min records the minimum variable after traversing through the array
        int fix,min;

        for(int i=0; i < size; i++){
            min = i;
            for (int j=i+1; j<size; j++){
                if(myArray[j] < myArray[min]){
                    min = j;
                }
            }

            fix = myArray[min];
            myArray[min] = myArray[i];
            myArray[i] = fix;
        }

        //Displaying the sorted array using advanced for loop
        System.out.println("The sorted array is as follows: ");
        for (int x: myArray){
            System.out.print(x + "\t");
        }
    }
}
