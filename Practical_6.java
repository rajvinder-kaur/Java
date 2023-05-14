import java.util.Scanner;

public class Practical_6 {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please enter the number of integers to sum as a command line argument.");
            return;
        }

        int numIntegers = Integer.parseInt(args[0]);
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        scanner.close();
        System.out.println("The sum of the integers is: " + sum);
    }
}


