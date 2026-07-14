public class Logger {
    // Private static volatile instance to prevent thread-safety issues during double-checked locking
    private static volatile Logger instance;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {
        System.out.println("Logger Instance Created.");
    }

    // Public static method to retrieve the single instance of the class
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // A method to log messages
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
