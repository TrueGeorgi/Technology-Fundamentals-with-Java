import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            if (Objects.equals(command[0], "Delete")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (Integer.parseInt(command[1]) == numbers.get(i)) {
                        numbers.remove(numbers.get(i));
                        i--;
                    }
                }
            } else if (Objects.equals(command[0], "Insert")) {
                numbers.add(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
            }

            input = scanner.nextLine();
        }
        String output = "";
        for (Integer number : numbers) {
            output += number + " ";
        }
        System.out.println(output.trim());
    }
}
