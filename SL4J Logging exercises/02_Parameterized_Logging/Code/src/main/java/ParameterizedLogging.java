import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String databaseName = "CustomerDB";
        int retryCount = 3;

        logger.info("Attempting to connect to database: {} (Attempt {})", databaseName, retryCount);
    }
}