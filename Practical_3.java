import java.util.Scanner;

public class Practical_3 {
    public static void main(String[] args) {
        int n = 5;
        Scanner a = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        a.close();
        System.out.println("Array elements are :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}



