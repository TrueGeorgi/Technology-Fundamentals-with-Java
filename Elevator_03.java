import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int groups = people / capacity;
        int restPeople = people - groups * capacity;
        if (restPeople != 0) {
            groups++;
        }
        System.out.println(groups);
    }
}
