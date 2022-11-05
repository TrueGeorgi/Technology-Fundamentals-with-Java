import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");

        for (int i = 0; i < line2.length; i++) {
            for (int j = 0; j < line1.length; j++) {
                if (line2[i].equals(line1[j])) {
                    System.out.print(line2[i] + " ");
                }
            }
        }
    }
}
