import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    // Test Fixture
    private BankAccount account;

    // SETUP: This runs BEFORE every single @Test
    @BeforeEach
    public void setUp() {
        // We start every test with a fresh account holding 100.0
        account = new BankAccount(100.0);
        System.out.println("Setup completed: New account created.");
    }

    // TEARDOWN: This runs AFTER every single @Test
    @AfterEach
    public void tearDown() {
        account = null;
        System.out.println("Teardown completed: Account reset.");
    }

    @Test
    public void testDeposit() {
        // ARRANGE: Set up the specific data for this test
        double depositAmount = 50.0;
        double expectedBalance = 150.0;

        // ACT: Perform the action being tested
        account.deposit(depositAmount);

        // ASSERT: Verify the result
        assertEquals(expectedBalance, account.getBalance(), "Balance should increase by deposit amount");
    }

    @Test
    public void testWithdraw() {
        // ARRANGE
        double withdrawAmount = 30.0;
        double expectedBalance = 70.0;

        // ACT
        account.withdraw(withdrawAmount);

        // ASSERT
        assertEquals(expectedBalance, account.getBalance(), "Balance should decrease by withdraw amount");
    }
}