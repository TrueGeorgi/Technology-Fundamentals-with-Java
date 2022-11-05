package JavaInroductionExercises_01;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        if (day.equals("Friday")) {
            switch (groupType) {
                case "Students":
                    totalPrice = groupSize * 8.45;
                    if (groupSize >= 30) {
                        totalPrice -= totalPrice * 0.15;
                    }
                    break;
                case "Business":
                    totalPrice = groupSize * 10.9;
                    if (groupSize >= 100) {
                        totalPrice = totalPrice - 10 * 10.9;
                    }
                    break;
                case "Regular":
                    totalPrice = groupSize * 15;
                    if (groupSize >= 10 && groupSize <= 20) {
                        totalPrice -= totalPrice * 0.05;
                    }
                    break;
            }
        }else if (day.equals("Saturday")) {
            switch (groupType) {
                case "Students":
                    totalPrice = groupSize * 9.8;
                    if (groupSize >= 30) {
                        totalPrice -= totalPrice * 0.15;
                    }
                    break;
                case "Business":
                    totalPrice = groupSize * 15.6;
                    if (groupSize >= 100) {
                        totalPrice = totalPrice - 10 * 15.6;
                    }
                    break;
                case "Regular":
                    totalPrice = groupSize * 20;
                    if (groupSize >= 10 && groupSize <= 20) {
                        totalPrice -= totalPrice * 0.05;
                    }
                    break;
            }
        } else if (day.equals("Sunday")) {
            switch (groupType) {
                case "Students":
                    totalPrice = groupSize * 10.46;
                    if (groupSize >= 30) {
                        totalPrice -= totalPrice * 0.15;
                    }
                    break;
                case "Business":
                    totalPrice = groupSize * 16;
                    if (groupSize >= 100) {
                        totalPrice = totalPrice - 10 * 16;
                    }
                    break;
                case "Regular":
                    totalPrice = groupSize * 22.5;
                    if (groupSize >= 10 && groupSize <= 20) {
                        totalPrice -= totalPrice * 0.05;
                    }
                    break;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
