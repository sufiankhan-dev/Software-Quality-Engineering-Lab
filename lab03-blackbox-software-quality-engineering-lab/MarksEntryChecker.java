import java.util.Scanner;

public class MarksEntryChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student marks (0 to 100): ");
        int marks = input.nextInt();

        if (marks >= 0 && marks < 100) {
            System.out.println("Valid marks");
        } else {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
        }

        input.close();
    }
}
