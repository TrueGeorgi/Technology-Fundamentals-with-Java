import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int start = 97;
        for (int i = 0; i < a; i++) {
            char firstChar = (char) (start + i);
            for (int o = 0; o < a; o++) {
                char secondChar = (char) (start + o);
                for (int p = 0; p < a; p++) {
                    char thirdChar = (char) (start + p);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
