import java.util.Scanner;

public class NxNMatrix_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixNumber = Integer.parseInt(scanner.nextLine());
        matrix(matrixNumber);
    }
    public static void matrix (int a) {
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j < a ; j++) {
                System.out.print(a + " ");
            }
            System.out.println(a);
        }
    }
}
