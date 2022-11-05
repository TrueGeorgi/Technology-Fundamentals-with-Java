import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = {
          "Monday",
          "Tuesday",
          "Wednesday",
          "Thursday",
          "Friday",
          "Saturday",
          "Sunday"
        };
        if (n >= 1 && n <= arr.length) {
            System.out.println(arr[n-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
