import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        int constantLenght = firstNumbers.size() / 2;

        for (int i = 0; i < constantLenght; i++) {
            int result = firstNumbers.get(i) + firstNumbers.get(firstNumbers.size() - 1);
            firstNumbers.set(i, result);
            firstNumbers.remove(firstNumbers.size() - 1);
        }
        String output = "";

        for (int i = 0; i < firstNumbers.size(); i++) {
            output += firstNumbers.get(i) + " ";
        }

        System.out.println(output);
    }
}
