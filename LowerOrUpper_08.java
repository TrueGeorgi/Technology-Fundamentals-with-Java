import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        if (Character.isLowerCase(a)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
