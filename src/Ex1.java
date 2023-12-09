//Implement the program, where you have to declare and create a 5-element
//one-dimensional table of String type. In the next step, please read 5 names using
//standard input (using Scanner class) and simultaneously save them in the previously
//created table. In the last step, please display on the standard output (screen) a
//notification: “Hello ${name}!” for every name saved in the table. Hint: In place of
//${name} you should insert proper value from the table

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String[] name = new String[5];
        System.out.println("Pleas enter 5 names");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < name.length; i++){
            name[i] = scanner.nextLine();
        }
        for (int i = 0; i < name.length; i++){
            System.out.println("Hello " + name[i]);
        }
    }
}
