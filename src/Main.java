import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input your two-digit number, please");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n % 10) + (n / 10);


        System.out.println("The result of addition is..." + result);
    }
}
