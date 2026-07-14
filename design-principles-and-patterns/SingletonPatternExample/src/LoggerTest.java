public class LoggerTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton Pattern ===");

        // Get two references to the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both references
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");

        // Check if both references point to the same instance
        boolean areEqual = (logger1 == logger2);
        System.out.println("Are logger1 and logger2 pointing to the same instance? " + areEqual);

        if (areEqual) {
            System.out.println("SUCCESS: Singleton pattern implemented correctly. Only one instance of Logger exists.");
        } else {
            System.out.println("FAILURE: Singleton pattern violation. Multiple instances of Logger were found.");
        }
    }
}
