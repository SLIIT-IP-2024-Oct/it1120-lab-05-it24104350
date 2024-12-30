import java.util.Scanner;

public class IT24104350Lab5Q3 {
    public static void main(String[] args) {
        
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int DISCOUNT_10_PERCENT = 10;
        final int DISCOUNT_20_PERCENT = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;  
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;  
        }

        int numberOfDays = endDate - startDate;

        double discountRate = 0;
        if (numberOfDays >= 5) {
            discountRate = DISCOUNT_20_PERCENT;
        } else if (numberOfDays >= 3) {
            discountRate = DISCOUNT_10_PERCENT;
        }

        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        double discount = totalAmount * (discountRate / 100);
        double finalAmount = totalAmount - discount;


        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: Rs. " + finalAmount);

        scanner.close();
    }
}
