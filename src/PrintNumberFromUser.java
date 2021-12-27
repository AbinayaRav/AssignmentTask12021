import java.util.Scanner;

class TestClass{
    private int number2;
}

public class PrintNumberFromUser {
 private   int number34=12;

 public static void helloExample()
 {
     System.out.println(new PrintNumberFromUser().number34);
 }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //TestClass clas1 = new TestClass();
        System.out.println(new PrintNumberFromUser().number34);
        System.out.println("Please enter data: ");
        String userData = scan.nextLine();
        System.out.println("\nUser entered the below data: ");
        System.out.println(userData);
    }
}


