import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i -= 1;
            }
        }
        if (numbers.size() > 0) {
            for (int i = numbers.size() -1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(numbers.get(i));
                } else {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        } else {
            System.out.println("empty");
        }
    }
}
