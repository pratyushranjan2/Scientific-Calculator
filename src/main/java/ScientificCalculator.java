import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScientificCalculator {

    public static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        logger.info("[FACTORIAL] - " + n);
        int result = functions.factorial(n);
        logger.info("[RESULT - FACTORIAL] - " + result);
        System.out.println(result);
    }
}
