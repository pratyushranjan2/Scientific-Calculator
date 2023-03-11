import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(functions.factorial(n));
    }
}
