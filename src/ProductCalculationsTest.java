
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCalculationsTest {

    // Unit Test 1 - EXACT NAME FROM PAPER
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // Price 3500 -> VAT = 3500 * 0.15 = 525.0
        ProductCalculations calc = new ProductCalculations(3500);
        assertEquals(525.0, calc.GetVat(), 0.01);
    }

    // Unit Test 2 - EXACT NAME FROM PAPER
    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // Price 3500 -> Total = 3500 + 525 + 175 = 4200.0
        ProductCalculations calc = new ProductCalculations(3500);
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }
}