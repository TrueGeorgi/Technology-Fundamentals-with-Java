import java.util.*;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 1; i <= amountOfProducts ; i++) {
            String newItem = scanner.nextLine();
            products.add(newItem);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            int position = i + 1;
            System.out.printf("%d.%s%n", position, products.get(i));
        }
    }
}
