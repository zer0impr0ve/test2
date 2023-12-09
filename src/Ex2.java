//Implement the program, where you have to read 6 integers (using Scanner class) and
//save them in the previously declared 6-element table. Then compute an arithmetic
//average for all table values and display the result on the standard output

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to be in an array");
        int n = scanner.nextInt();//5
        int[] numbers = new int[n];//new int[5]
        System.out.println("Enter " + n +" numbers");// Enter 5 numbers
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("Average is " + (sum / numbers.length));
    }
}
