import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int minLenght = Math.min(firstNumbers.size(), secondNumbers.size());

        String output = "";

        for (int i = 0; i < minLenght; i++) {
            output += firstNumbers.get(i) + " " + secondNumbers.get(i) + " ";
        }
        if (firstNumbers.size() > secondNumbers.size()) {
            for (int i = minLenght; i < firstNumbers.size(); i++) {
                output += firstNumbers.get(i) + " ";
            }
        }  else {
            for (int i = minLenght; i < secondNumbers.size(); i++) {
                output += secondNumbers.get(i) + " ";
            }
        }
        System.out.println(output.trim());
    }
}
