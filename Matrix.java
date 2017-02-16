import java.util.Scanner;
import static java.lang.System.exit;

/**
 * Created by Akshay Pandit on 2/14/2017.
 *
 * Tried to give as much as references by using a lot of explanation using comments
 * so that a lot budding Programmers/Coders/Hackers can try to understand
 * the simple program of MATRIX operations
 * Hope you understand it and enjoy the too much of commenting!! :P
 *
 * Not for professional programmers, I can understand the frustration for the too much of commenting,
 * but well these are for amateurs not for you, so close this ASAP if it hurts your eyes
 *
 * Thank you!
 * P.S - This program has not been copied from anywhere, you can check it out for yourselves :)
 */

//Created a main function inside the class itself for small education related project
public class Matrix {
    //initiate the variables we need to be accessed globally
    //Since the variables are used in static main scope they are supposed to be static in order to work
    private static int[][] matrixbox;
    private static int[][] matrixbox2;
    private static int[][] matrixbox_result;
    private static int rows, columns;

    //decision variable that determines the further operations on the given matrix
    private static int decision;

    //Scanner object provides us with input into console from keyboard to various variables
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //create matrix function invocation
        create();

        //original display of two matrices
        display();

        //only provide additional options if one or more matrix table is chosen
        //providing the decision variable to be 1, ie TRUE
        if(decision == 1) {

            //Run all the commands inside the while loop indefinitely unless explicitly exited
            //Break command re-iterates the loop giving MENU when one function completes it's job
           while(true){
               System.out.println("==============================MENU==============================");
               System.out.println("1.Add");
               System.out.println("2.Subtract");
               System.out.println("3.Multiply");
               System.out.println("================================================================");
               System.out.println("Please choose the right option: ");
               int choice = scanner.nextInt();

               switch (choice){
                   case 1:

                       //Matrix addition
                       add();
                       display_result();
                       break;
                   case 2:

                       //Matrix subtraction
                       subtract();
                       display_result();
                       break;
                   case 3:

                       //Matrix multiplication
                       multiply();
                       display_result();
                       break;

                       //exiting when the chosen option for exit
                   case 4: exit(0);
                       break;

                       //if anything other than the given choice is chosen, then print certain message
                   default:
                       System.out.println("Wrong choice, please check again!");
               }
           }
        }
    }

    //Creation of Matrix
    private static void create(){
        System.out.println("Rows of the matrix: ");
        rows = scanner.nextInt();
        System.out.println("Columns of the matrix: ");
        columns = scanner.nextInt();

        //Allocating the input size to the defined variables above main function
        matrixbox = new int[rows][columns];

        System.out.println("The matrix is a " + rows + "X" + columns);
        System.out.println("Now give " + rows * columns + " elements: ");

        //Main algorithm create multidimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixbox[i][j] = scanner.nextInt();
            }
        }

        //The option to choose, if selected no (0) then end the program by displaying the matrix 1
        System.out.println("Want to create one more matrix? (1/0 for yes/no): ");
        decision = scanner.nextInt();

        //If the option selected is yes (1) then create one more matrix with same dimensions but user defined values
        //Same creation methodology as mentioned above
        if(decision == 1) {
            matrixbox2 = new int[rows][columns];

            System.out.println("The matrix is a " + rows + "X" + columns);
            System.out.println("Now give " + rows * columns + " elements for table 2: ");

            //Creation Matrix algorithm of matrix 2, same as above
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixbox2[i][j] = scanner.nextInt();
                }
            }
        }
    }

    //Display function definition
    private static void display() {

        //If decision is of creating no more matrix then print just table 1
        //Else print both the tables if the decision is yes (1) of creating 2 tables
        if (decision == 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrixbox[i][j] + "\t");
                }

                System.out.println();
            }
        } else {
            System.out.println("The matrix table 1 is as follows: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrixbox[i][j] + "\t");
                }

                System.out.println();
            }

            System.out.println("The matrix table 2 is as follows: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrixbox2[i][j] + "\t");
                }

                System.out.println();
            }
        }
    }

    //Matrix multiplication function definition
    private static void multiply(){
        matrixbox_result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < matrixbox.length; k++) {
                    matrixbox_result[i][j] += matrixbox[i][k] * matrixbox2[k][j];
                }
            }
        }
    }

    //Matrix subtraction function definition
    private static void subtract(){
        matrixbox_result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                    matrixbox_result[i][j] = matrixbox[i][j] - matrixbox2[i][j];
            }
        }
    }

    //matrix addition function definition
    private static void add(){
        matrixbox_result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixbox_result[i][j] = matrixbox[i][j] + matrixbox2[i][j];
            }
        }
    }

    //Matrix function to display the results after various operations on 2 Matrix tables
    private static void display_result(){
        System.out.println("The result of the addition of two matrixes is as follows: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixbox_result[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
