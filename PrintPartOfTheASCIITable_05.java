import java.util.Scanner;

public class PrintPartOfTheASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for ( ; a <=b; a++ ) {
            System.out.print((char)a);
        }
    }
}
