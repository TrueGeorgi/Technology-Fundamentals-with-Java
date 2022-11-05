import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int spices = 0;
        while (yield >= 100) {
            spices += yield - 26;
            days++;
            yield -= 10;
        }
        spices -= 26;
        System.out.println(days);
        System.out.println(spices);

    }
}
