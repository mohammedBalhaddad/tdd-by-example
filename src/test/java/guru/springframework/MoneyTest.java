package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {


    @Test
    void testMultiplications(){
        // Positive Multiplication
        Money dollar = Money.dollar(5);
        Money product = dollar.times(2);
        assertEquals(Money.dollar(10) , product);

        // Negative Multiplication
        Money franc = Money.franc(5);
        product = franc.times(-2);
        assertEquals(Money.franc(-10), product);

        // Return Different Objects , Immutability
        dollar = Money.dollar(10);
        Money product_1 = dollar.times(3);
        assertEquals(Money.dollar(30),product_1);
        Money product_2 = dollar.times(2);
        assertEquals(Money.dollar(20),product_2);
    }

    @Test
    void testEquality(){
        // Equal : same Currency
        assertEquals( Money.franc(5),Money.franc(5));

        // Not Equal : Same Currency
        assertNotEquals(Money.dollar(5),Money.dollar(10));

        // Equal : different currency

        // Not Equal : different currency
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testDollarFactoryMethod(){
        Money dollar = Money.dollar(5);
        assertEquals("USD", dollar.currency());
        assertEquals(5,dollar.amount);
    }
    @Test
    void testFrancFactoryMethod(){
        Money franc = Money.franc(5);
        assertSame("CHF", franc.currency());
        assertEquals(5,franc.amount);
    }

    @Test
    void testCurrency(){
        Money dollar = Money.dollar(10);
        assertEquals("USD",dollar.currency());
        Money franc = Money.franc(10);
        assertEquals("CHF",franc.currency());
    }
}
