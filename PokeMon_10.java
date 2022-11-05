import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());//N
        int beginPokePower = pokePower;
        int distance = Integer.parseInt(scanner.nextLine());   // M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); // Y
        int pokes = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokes++;
            if (pokePower != 0 && pokePower * 2 == beginPokePower) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
