import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100:");
        int response = Integer.valueOf(scanner.nextLine());
        if (100 >= response && response >= 90) {
            System.out.println("Your grade is an A!");
        }
        if (89 >= response && response >= 80) {
            System.out.println("Your grade is an B!");
        }
        if (79 >= response && response >= 70) {
            System.out.println("Your grade is an C!");
        }
        if (69 >= response && response >= 60) {
            System.out.println("Your grade is an D!");
        }
        if (response <= 59) {
            System.out.println("Your grade is an F!");
        }
    }
}
