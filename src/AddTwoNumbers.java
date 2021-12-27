import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number (Between 1 and 10) : ");
        int x = scan.nextInt();
        AddTwoNumbers add = new AddTwoNumbers();
        boolean flag = add.checkRange(x);
        while (!flag) {
            System.out.println("Range of the number should be between 1 and 10 : ");
            x = scan.nextInt();
            flag = add.checkRange(x);
        }
        System.out.println("Enter the second number (Between 1 and 10) : ");
        int y = scan.nextInt();
        flag = add.checkRange(y);
        while (!flag) {
            System.out.println("Range of the number should be between 1 and 10 : ");
            y = scan.nextInt();
            flag = add.checkRange(y);
        }
        int z;
        z = x + y;
        //Adding 30 to z
        z += 30;
        System.out.println("\nThe value of x = " + x);
        System.out.println("The value of y = " + y);
        System.out.println("The value of z = " + z);
    }

    public boolean checkRange(int num) {
        boolean flag = false;
        if (num >= 1 && num <= 10) {
            flag = true;
        }
        return flag;
    }
}
