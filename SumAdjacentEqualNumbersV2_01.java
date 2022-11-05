import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbersV2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double firstNum = numbers.get(i);
            double secondNum = numbers.get(i+1);

            if (firstNum == secondNum) {
                double sum = firstNum + secondNum;
                numbers.set(i, sum);
                numbers.remove(i+1);
                i = -1;
            }
        }
        String output = "";
        DecimalFormat format = new DecimalFormat("#.###");
        for (Double number:numbers) {
            output += format.format(number) + " ";
        }
        System.out.println(output.trim());
    }
}
