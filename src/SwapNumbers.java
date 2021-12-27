import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************Swapping two numbers using a third variable*******************");
        System.out.println("Enter the first number : ");
        int number1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = scan.nextInt();
        int result;
        //Swap the numbers
        result = number1;
        number1 = number2;
        number2 = result;
        System.out.println("After swapping: ");
        System.out.println("The First number = " + number1);
        System.out.println("The Second number = " + number2);
        System.out.println("\n-----------------------------------------------------------------------------------------");
        System.out.println("**********************Swapping two numbers without a third variable*******************");
        System.out.println("Enter the first number : ");
        number1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        number2 = scan.nextInt();
        //Swap the numbers
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After swapping: ");
        System.out.println("The First number = " + number1);
        System.out.println("The Second number = " + number2);


    }
}

