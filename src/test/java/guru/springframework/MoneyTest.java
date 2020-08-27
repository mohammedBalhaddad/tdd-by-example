package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void testDifferentCurrencyEquality(){
        // different currency should not compared based on their amount only
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testDollarFactoryMethod(){
        Money dollar = Money.dollar(5);
        assertSame(Dollar.class, dollar.getClass());
        assertEquals(5,dollar.amount);
    }
    @Test
    void testFrancFactoryMethod(){
        Money franc = Money.franc(5);
        assertSame(Franc.class, franc.getClass());
        assertEquals(5,franc.amount);
    }
}
