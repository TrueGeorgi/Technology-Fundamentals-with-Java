import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        String endResult = solution(input, repeat);
        System.out.println(endResult);
    }

    public static String solution(String input, int repeat) {
        String finale = "";
        for (int i = 1; i <= repeat; i++) {
            finale += input;
        }
        return finale;
    }
}
