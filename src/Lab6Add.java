import java.util.Scanner;

public class Lab6Add {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("1. Add\n2. Subtract");
        int MenuChoice = scnr.nextInt();
        System.out.println("Enter two numbers:");
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();

        if (MenuChoice == 1) {
            int sum = num1 + num2;
            System.out.println(sum);
        }
        if (MenuChoice == 2) {
            int difference = num1 - num2;
            System.out.println(difference);
        }


    }
}
