import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        double a = Math.random()*9+1;
        int first_number = (int)a;
        System.out.println("Input number  from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int second_number = scanner.nextInt();
        if (first_number==second_number) {
            System.out.println("Your guess is right: " +first_number+" = "+second_number);
        }
        else {
            System.out.println("Your guess isn't right: " +first_number+" != "+second_number);
        }
    }
}
