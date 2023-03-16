import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScientificCalculator {

    public static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter op id: \n<0> exit\n<1> factorial\n<2> power\n<3> natural log\n<4> sq root");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("terminating application...");
                    return;
                case 1:
                    System.out.println("Enter an integer");
                    int n = sc.nextInt();
                    logger.info("[FACTORIAL] - " + n);
                    try {
                        int fact = functions.factorial(n);
                        logger.info("[RESULT - FACTORIAL] - " + fact);
                        System.out.println(fact);
                    }
                    catch (Exception factException) {
                        System.out.println(factException.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter base and exponent");
                    double b = sc.nextDouble();
                    double e = sc.nextDouble();
                    logger.info("[POWER - " + b + " RAISED TO] " + e);
                    try {
                        double power = functions.power(b, e);
                        logger.info("[RESULT - POWER] - " + power);
                        System.out.println(power);
                    }
                    catch (Exception powException) {
                        System.out.println(powException.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter a positive value");
                    double l = sc.nextDouble();
                    logger.info("[NATURAL LOG] - " + l);
                    try {
                        double logval = functions.loge(l);
                        logger.info("[RESULT - NATURAL LOG] - " + logval);
                        System.out.println(logval);
                    }
                    catch (Exception logException) {
                        System.out.println(logException.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter a positive value");
                    double s = sc.nextDouble();
                    logger.info("[SQ ROOT] - " + s);
                    try {
                        double rootval = functions.sqroot(s);
                        logger.info("[RESULT - SQ ROOT] - " + rootval);
                        System.out.println(rootval);
                    }
                    catch (Exception rootException) {
                        System.out.println(rootException.getMessage());
                    }
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
            System.out.println("Enter op id: ");
        }
    }
}
