import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Heigth: ");
        double heigth = Double.parseDouble(scanner.nextLine());
        double volume = (length * width * heigth) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
