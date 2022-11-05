import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrickV2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int length = numbers.size() / 2;
        for (int i = 0; i < length; i++) {
            int firstNum = numbers.get(i);
            int secondNum = numbers.get(numbers.size() - 1);
            int sum = firstNum + secondNum;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);
        }
        String output = "";
        for (int number: numbers) {
            output += number + " ";
        }
        System.out.println(output.trim());
    }
}
