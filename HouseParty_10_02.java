import java.util.ArrayList;
import java.util.Scanner;

public class HouseParty_10_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 1; i <= commands; i++) {
            String input = scanner.nextLine();
            String[] devided = input.split(" ");
            if (devided[2].equals("not")) {
                if (nameList.contains(devided[0])) {
                    nameList.remove(devided[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", devided[0]);
                }
            } else {
                if (nameList.contains(devided[0])) {
                    System.out.printf("%s is already in the list!%n", devided[0]);
                } else {
                    nameList.add(devided[0]);
                }
            }
        }
        for (String name:nameList) {
            System.out.println(name);
        }
    }
}
