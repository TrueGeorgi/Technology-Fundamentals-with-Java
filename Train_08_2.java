import java.util.*;
import java.util.stream.Collectors;

public class Train_08_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> filledWagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCap = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputV2 = input.split(" ");
            if (Objects.equals(inputV2[0], "Add")) {
               filledWagons.add(Integer.parseInt(inputV2[1]));
            } else {
                int passengers = Integer.parseInt(inputV2[0]);
                for (int i = 0; i < filledWagons.size(); i++) {
                    int freeSeats = maxCap - filledWagons.get(i);
                    if (freeSeats >= passengers) {
                        int newAmount = filledWagons.get(i) + passengers;
                        filledWagons.set(i, newAmount);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        String output = "";
        for (int i = 0; i < filledWagons.size(); i++) {
            output += filledWagons.get(i) + " ";
        }
        System.out.println(output.trim());
    }
}
