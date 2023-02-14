import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    @Tag("Positive")
    public void squareTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assertions.assertEquals(6, triangle.square());
    }

    @Test
    @Tag("Negative")
    public void nullTest() {
        Triangle triangle = new Triangle(3, 4, 0);
        Assertions.assertNotEquals(0, triangle.getA(), "Сторона равна нулю");
        Assertions.assertNotEquals(0, triangle.getB(), "Сторона равна нулю");
        Assertions.assertNotEquals(0, triangle.getC(), "Сторона равна нулю");
    }

    @Test
    @Tag("Negative")
    public void notTriangleTest() {
        Triangle triangle = new Triangle(3, 4, 7);
        Assertions.assertNotEquals(triangle.getA() + triangle.getB(), triangle.getC(), "Это не треугольник");
    }

    @Test
    @Tag("Negative")
    public void mathTest() {
        Triangle triangle = new Triangle(3, 4, -11);
        Assertions.assertNotEquals(Math.sqrt(-10), triangle.square(), "Нельзя извчечь корень из отрицательного числа");  // При извлечении из отрицательного числа мне выдаётся NaN в результат. Я не знаю какое ожидание тут нужно. Пришлось писать костыль
    }
}
