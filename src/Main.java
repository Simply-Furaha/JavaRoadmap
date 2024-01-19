import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        System.out.print("Enter Your Full Name2:");
        String name = scanner.next();
        String name2 = scanner.nextLine();
        System.out.println("Your Name is " + name + "!");
        System.out.println("Your Full Name2 is " + name2 + "!");

    }
}