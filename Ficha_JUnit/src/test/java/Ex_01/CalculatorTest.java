package Ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculadora;

    @BeforeEach
    public void setUp(){
        this.calculadora = new Calculator();
    }

    @Test
    public void addTest(){

        assertEquals(10,calculadora.add(7,3));
        assertEquals(15,calculadora.add(15,0));
        assertEquals(60,calculadora.add(100,-40));
        assertEquals(-30,calculadora.add(10,-40));
        assertEquals(0,calculadora.add(40,-40));
        assertEquals(0,calculadora.add(0,0));

    }

    @Test
    public void subtractTest(){

        assertEquals(50,calculadora.subtract(110,60));
        assertEquals(-170,calculadora.subtract(-110,60));
        assertEquals(0,calculadora.subtract(5,5));
        assertEquals(10,calculadora.subtract(5,-5));
    }

    @Test
    public void multiplyTest(){

        assertEquals(20,calculadora.multiply(10,2));
    }

    @Test
    public void divideTest(){

        assertEquals(10,calculadora.divide(100,10));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(10, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(0, 0);
        });
    }

}