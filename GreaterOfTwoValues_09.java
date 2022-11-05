import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        switch (input) {
            case "int":
                System.out.println(getMax(Integer.parseInt(a), Integer.parseInt(b)));
                break;
            case "char":
                char a1 = a.charAt(0);
                char b1 = b.charAt(0);
                System.out.println(getMax(a1, b1));
                break;
            case "string":
                System.out.println(getMax(a, b));
                break;
        }
    }


    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static char getMax(char a, char b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }

    }
}
