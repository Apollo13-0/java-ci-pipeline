import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    public void newCalculator (){
        calculator = new Calculator();
    }

    public void testAddition1 (){
        newCalculator();
        assertTrue(calculator.addition(3, 3) == (3 + 3));
    }

    public void testAddition2 (){
        newCalculator();
        assertEquals(8, calculator.addition(2,6));
    }

    public void testSubtraction1 (){
        ;
    }

    public void testSubtraction2 (){
        ;
    }

    public void testMultiplication1 (){
        ;
    }

    public void testMultiplication2 (){
        ;
    }

    public void testDivision1 (){
        ;
    }

    public void testDivision2 (){
        ;
    }
}
