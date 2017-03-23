import java.util.Scanner;

/**
 * Created by Akshay Chandrashekhar Pandit on 3/7/2017.
 */
public class Bubble {
    private static int[] myArray;
    private static int size;
    private static Scanner scanner = new Scanner(System.in);

    //just function calls in main
    public static void main(String[] args) throws InterruptedException {
        createDisplay();
        sortDisplay();
    }

    //Creation of array and display the original array
    private static void createDisplay(){
        System.out.println("Please give the array length: ");
        size = scanner.nextInt();
        System.out.println("Now give " + size + " elements: ");
        myArray = new int[size];
        for(int i=0; i<size; i++){
            myArray[i] = scanner.nextInt();
        }

        System.out.println("The array is as follows: ");
        for (int x: myArray){
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    //***Main sorting algorithm function goes here***
    // Sorting the set and displaying the sorted array
    private static void sortDisplay() throws InterruptedException {
        System.out.println("The sorting process begins...");
        Thread.sleep(2000);

        //Swap adjacent elements
        for(int i = 0; i < size; i++){
            for (int j = i + 1; j < size; j++){
                if(myArray[j] < myArray[i]){
                    int temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }

        System.out.println("The sorted array is as follows: ");
        for (int x: myArray){
            System.out.print(x + "\t");
        }
    }
}
