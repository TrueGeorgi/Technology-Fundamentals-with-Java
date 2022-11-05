import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        gradeString(grade);
    }

    public static void gradeString(double input) {
        if (input >= 2 && input < 3) {
            System.out.println("Fail");
        } else if (input >= 3 && input < 3.5) {
            System.out.println("Poor");
        } else if (input >= 3.5 && input < 4.5) {
            System.out.println("Good");
        } else if (input >= 4.5 && input < 5.5) {
            System.out.println("Very good");
        } else if (input >= 5.5 && input <= 6) {
            System.out.println("Excellent");
        }
    }
}
