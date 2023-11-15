package se.lexicon;
import java.util.Scanner;

public class Main {
    //public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        boolean isCalc = true;
        System.out.println("Sample Calculator app");
        while (isCalc) {
            Scanner input = new Scanner(System.in);
            int op, n1, n2, n3;
            System.out.println("Please enter the operation u want to perform:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Select any mathematical operation to perform:");
            op = input.nextInt();
            if (op == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            System.out.println("Please enter 2 numbers to perform arithmetic operation\n");
            System.out.println("N1:\n");
            n1 = input.nextInt();
            System.out.println("N2:\n");
            n2 = input.nextInt();

            switch (op) {
                case 1:
                    n3 = n1 + n2;
                    System.out.println("Addition of " + n1 + "and" + n2 + "is " + " " + n3);
                    break;
                case 2:
                    n3 = n1 - n2;
                    System.out.println("Subtraction of " + n1 + "and" + n2 + "is " + n3);
                    break;
                case 3:
                    n3 = n1 * n2;
                    System.out.println("Multiplication of " + n1 + "and" + n2 + "is " + n3);
                    break;
                case 4:
                    if (n2 != 0) {
                        n3 = n1 / n2;
                        System.out.println("Division of " + n1 + " and " + n2 + "is " + n3);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Do you want to continue?<1/0>");
            isCalc = input.nextBoolean();
            input.close();

        }
    }
}

    /*static int getNumber(int n1,int n2) {
        Scanner input = new Scanner(System.in);
        int answer;

        answer=n1+n2;
        return answer;
    }
    class getNumbers{
        int n1,n2;
        public string*/

