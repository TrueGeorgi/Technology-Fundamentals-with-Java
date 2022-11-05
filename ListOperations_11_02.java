import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_11_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] workSheet = input.split("\\s+");
            switch (workSheet[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(workSheet[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(workSheet[2]);
                    if (index < numbers.size() && index >= 0) {
                        numbers.add(Integer.parseInt(workSheet[2]), Integer.parseInt(workSheet[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(workSheet[1]);
                    if (indexToRemove < numbers.size() && indexToRemove >= 0) {
                        numbers.remove(Integer.parseInt(workSheet[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(workSheet[2]);
                    if (numbers.size() > 0) {
                        switch (workSheet[1]) {
                            case "left":
                                for (int i = 0; i < count % numbers.size(); i++) {
                                    numbers.add(numbers.get(0));
                                    numbers.remove(0);
                                }
                                break;
                            case "right":
                                for (int i = 0; i < count % numbers.size(); i++) {
                                    numbers.add(0, numbers.get(numbers.size() - 1));
                                    numbers.remove(numbers.size() - 1);
                                }
                                break;
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
