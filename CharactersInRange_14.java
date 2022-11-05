import java.util.Scanner;

public class CharactersInRange_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        int smallesChar = Math.min(first,second);
        int biggerChar = Math.max(first,second);
        fromSmallToBig(smallesChar, biggerChar);

    }

    private static void fromSmallToBig(int smallesChar, int biggerChar) {
        for (int i = smallesChar + 1; i < biggerChar; i++) {
            char toPrint = (char)i;
            System.out.print(toPrint + " ");
        }
    }

}
