import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String output = "";
                    switch (tokens[1]) {
                        case "even":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    output += numbers.get(i) + " ";
                                }
                            }
                            break;
                        case "odd":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 != 0) {
                                    output += numbers.get(i) + " ";
                                }
                            }
                            break;
                    }
                    System.out.println(output.trim());
                    output = "";
                    break;
                case "Get":
                    if (tokens[1].equals("sum")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String result = "";
                    switch (tokens[1]) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < Integer.parseInt(tokens[2])) {
                                    result += numbers.get(i) + " ";
                                }
                            }
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > Integer.parseInt(tokens[2])) {
                                    result += numbers.get(i) + " ";
                                }
                            }
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= Integer.parseInt(tokens[2])) {
                                    result += numbers.get(i)+ " ";
                                }
                            }
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= Integer.parseInt(tokens[2])) {
                                    result += numbers.get(i)+ " ";
                                }
                            }
                            break;
                    }
                    System.out.println(result.trim());
                    result = "";
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
