import java.util.Scanner;

public class IT24104350Lab5Q1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

         
        int num1, num2, num3;

         
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = scanner.nextInt();

          
        int smallest = num1;
        int largest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

          
        scanner.close();
    }
}
