import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_12_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> variables = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int specialBombNumber = variables.get(0);
        int power = variables.get(1);
        for (int i = 0; i < input.size(); i++) {
            if (specialBombNumber == input.get(i)) {
                int count1 = 0;
                int count2 = 0;
                for (int j = i; j <= i+power ; j++) {
                    if (j-count1 + 1 <= input.size()) {
                        input.remove(j - count1);
                        count1++;
                    } else {
                        break;
                    }
                }
                for (int j = i - power; j < i ; j++) {
                    if (j-count2 + 1 <= input.size()) {
                        input.remove(j - count2);
                        count2++;
                    } else {
                        break;
                    }
                }
                i=-1;
            }
        }
        int sum = 0;
        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }
        System.out.println(sum);
    }
}
