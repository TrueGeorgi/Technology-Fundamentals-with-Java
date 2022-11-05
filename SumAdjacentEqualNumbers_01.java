import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s");
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Double.parseDouble(input[i]));
        }
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                double newNumber = numbers.get(i) + numbers.get(i);
                numbers.set(i, newNumber);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        String output = "";
        DecimalFormat format = new DecimalFormat("0.#");
        for (Double number:numbers) {
            output += format.format(number) + " ";
        }
        System.out.println(output);
    }
}
