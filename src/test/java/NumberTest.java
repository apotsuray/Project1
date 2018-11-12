import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class NumberTest {
    Number num = new Number();
    @Test
    public void sqrtValue() {
        double actual = num.sqrtValue(16);
        double expected = 4;
      assertEquals(expected,actual,0.01,"Найденный корень числа не сходится с ожидаемым");
    }

    @Test
    public void squereValue() {
        double actual = num.squereValue(3);
        double expected = 9;
        assertEquals(expected,actual,0.01,"Найденный квадрат числа не сходится с ожидаемым");
    }

    @Test
    public void cosValue() {
        double actual = num.cosValue(Math.PI);
        double expected = -1;
        assertEquals(expected,actual,0.01,"Найденный косинус числа не сходится с ожидаемым");
    }

    @Test
    public void serialMethodFactorial() {
        double actual = num.serialMethodFactorial(5);
        double expected = 120;
        assertEquals(expected,actual,0.01,"Найденный факториал не сходится с ожидаемым");
    }

    @Test
    public void recursionMethodFactorial() {
        double actual = num.recursionMethodFactorial(4);
        double expected = 24;
        assertEquals(expected,actual,0.01,"Найденный факториал не сходится с ожидаемым");

    }
}