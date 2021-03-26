import junit.framework.TestCase;

public class TestCalculator extends TestCase {
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
    public void testAddition3 (){
        newCalculator();
        assertTrue(calculator.addition(3, 4) == (3 + 4));
    }

    public void testSubtraction1 (){
        newCalculator();
        assertTrue(calculator.subtraction(4, 3) == (4 - 3));
    }

    public void testSubtraction2 (){
        newCalculator();
        assertEquals(10, calculator.subtraction(22,12));
    }

    public void testMultiplication1 (){
        newCalculator();
        assertTrue(calculator.multiplication(4, 4) == (4 * 4));
    }

    public void testMultiplication2 (){
        newCalculator();
        assertEquals(8, calculator.multiplication(2,4));
    }

    public void testDivision1 (){
        newCalculator();
        assertTrue(calculator.division(8, 2) == (8 / 2));
    }

    public void testDivision2 (){
        newCalculator();
        assertEquals((9/3), calculator.division(9,3));
    }
}
