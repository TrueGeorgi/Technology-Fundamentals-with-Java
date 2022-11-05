import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingListsV2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String endResult = "";
        int shortesInput = 0;
        int difference = 0;

        if (firstNumbers.size() > secondNumbers.size()) {
            shortesInput = secondNumbers.size();
        } else if (firstNumbers.size() < secondNumbers.size()) {
            shortesInput = firstNumbers.size();
        } else {
            shortesInput = firstNumbers.size();
        }
        for (int i = 0; i < shortesInput; i++) {
            endResult += firstNumbers.get(i) + " " + secondNumbers.get(i) + " ";
        }
        if (firstNumbers.size() > secondNumbers.size()) {
            for (int i = shortesInput; i < firstNumbers.size() ; i++) {
                endResult += firstNumbers.get(i) + " ";
            }
        } else if (firstNumbers.size() < secondNumbers.size()) {
            for (int i = shortesInput; i < secondNumbers.size() ; i++) {
                endResult += secondNumbers.get(i) + " ";
            }
        }
        System.out.println(endResult.trim());
    }
}
