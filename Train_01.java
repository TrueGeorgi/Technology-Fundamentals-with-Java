import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsCount];
        int totalPassangers = 0;
        for (int i = 0; i < wagonsCount; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            totalPassangers += wagons[i];
            if (i == wagons.length - 1) {
                System.out.println(wagons[i]);
            } else {
                System.out.print(wagons[i] + " ");
            }
        }
        System.out.println(totalPassangers);
    }
}
