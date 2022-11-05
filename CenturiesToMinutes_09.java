import java.util.Scanner;

public class CenturiesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = centuries * 36524;
        int hours = centuries * 876576;
        int minutes = centuries * 52594560;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries,
                years,
                days,
                hours,
                minutes);
    }
}
