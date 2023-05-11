import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        recursiveKural(n);
    }

    public static void recursiveKural(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        recursiveKural(n - 5);
        System.out.println(n);
    }
}