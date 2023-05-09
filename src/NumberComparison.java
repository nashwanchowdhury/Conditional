import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number:");
     int first = Integer.valueOf(scanner.nextLine());
     System.out.println("Enter another number:");
     int second = Integer.valueOf(scanner.nextLine());
     if (first > second) {
         System.out.println("The first number was larger than the second");
     }
     if (second > first) {
         System.out.println("The second number was larger than the first");
     }
     if (second == first) {
        System.out.println("Numbers are the same");
        }
    }
}
