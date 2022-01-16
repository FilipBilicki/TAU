import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CalculatorMoc {

    private final Calculator calc = new Calculator(3,4);
    @Test
    public void test(){
        Calculator testcalculator = mock(Calculator.class);

    }
}
