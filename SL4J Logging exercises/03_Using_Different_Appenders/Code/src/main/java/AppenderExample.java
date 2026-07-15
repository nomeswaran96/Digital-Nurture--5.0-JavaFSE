import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.debug("This debug message will appear in both the console and the log file.");
        logger.info("Configuration loaded successfully from logback.xml.");
    }
}