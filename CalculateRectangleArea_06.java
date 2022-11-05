import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double area = getRectangleArea(a,b);
        System.out.printf("%.0f", area);
    }
    public static double getRectangleArea (double widht, double heigth) {
        double area = widht * heigth;
        return area;
    }
}
