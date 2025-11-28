import java.util.logging.Logger; // Fixed: "logging" not "loggin"

public class LoggerExample {

    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {

        logger.info("Program started.");

        int a = 1;
        int b = 2;

        logger.info("Values: a = " + a + ", b = " + b);

        int result = a / b;

        logger.info("Result of division: " + result);
        logger.warning("This is a warning message.");
        logger.severe("This is a severe error message (example).");
        logger.info("Program ended");
    }
}