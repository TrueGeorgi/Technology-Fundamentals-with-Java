import java.util.Scanner;

public class VowelsCount_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isVowel(char a) {
        switch (a) {
            case 'a':
            case 'y':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
                return true;

        }
        return false;
    }
}
