import java.util.Scanner;

public class ConvertMeterToKm_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        double km = meters / 1000d;

        System.out.printf("%.2f", km);
    }
}
