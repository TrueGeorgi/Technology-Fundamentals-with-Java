import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballsAmount = Integer.parseInt(scanner.nextLine());
        int best = Integer.MIN_VALUE;
        int bestSnow = Integer.MIN_VALUE;
        int bestTime = Integer.MIN_VALUE;
        int bestQuality = Integer.MIN_VALUE;
        for (int i = 1; i <= snowballsAmount; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (best < snowballValue) {
                best = (int)snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnow, bestTime, best, bestQuality);
    }
}
