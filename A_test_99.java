import java.util.ArrayList;
import java.util.List;

public class A_test_99 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(2);
        num.add(5);
        num.add(3);
        num.add(3);
        num.add(3);
        num.add(3);

        int max = Math.max(num.size() - 1, num.get(5));
        int min = Math.min(num.get(0),num.indexOf(5));

        System.out.println(min);
        System.out.println(max);
    }
}
