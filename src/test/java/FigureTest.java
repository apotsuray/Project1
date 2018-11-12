
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import ru.annotation.MyInterface;


@DisplayName("TestFigureClass")
class FigureTest {
    Figure figure = new Figure();
    @org.junit.jupiter.api.Test
    @Tag("squere")
    @MyInterface
    public void myInterfaceSquereArea(){
        System.out.println("\n============ Run myInterface tests ============\n");
        double result = figure.squereArea(2);
        assertEquals(4, result,"Wrong value!");
        assertTrue(result==4, "Wrong value!");
        assertNotNull(result, "Wrong value!");
    }
    @org.junit.jupiter.api.Test
    @Tag("squere")
    @Disabled("Disabled test")
    public void disabledSquereArea(){
        double result = figure.squereArea(2);
        assertEquals(4, result,"Wrong value!");
    }

    @org.junit.jupiter.api.Test
    @Tag("squere")
    @Tag("integration")
    public void tagSquereArea(){
        System.out.println("\n============ Run integration tests ============\n");
        double result = figure.squereArea(2);
        assertEquals(4, result,"Wrong value!");
    }
    @Tag("squere")
    @ParameterizedTest(name = "Check value = ''{0}''")
    @DisplayName("Check pow function with value source")
    @ValueSource(doubles = {2, 4})
    @Disabled("Disabled test")
    public void squereAreaValueTest(double value){
        double result = figure.squereArea(2);
        assertNotNull(result, "Wrong value!");
    }


    @org.junit.jupiter.api.Test
    @Tag("circle")
    @MyInterface
    public void myInterfaceCircleArea(){
        System.out.println("\n============ Run myInterface tests ============\n");
        double result = figure.circleArea(3);
        assertEquals(28.27, result,0.1,"Wrong value!");
        assertTrue(result==28.27, "Wrong value!");
        assertNotNull(result, "Wrong value!");
    }
    @org.junit.jupiter.api.Test
    @Tag("circle")
    @Disabled("Disabled test")
    public void disabledCircleArea(){
        double result = figure.circleArea(3);
        assertEquals(28.27, result,0.1,"Wrong value!");
    }

    @org.junit.jupiter.api.Test
    @Tag("circle")
    @Tag("integration")
    public void tagCircleArea(){
        System.out.println("\n============ Run integration tests ============\n");
        double result = figure.circleArea(3);
        assertEquals(28.27, result,0.1,"Wrong value!");
    }
    @Tag("circle")
    @ParameterizedTest(name = "Check value = ''{0}''")
    @DisplayName("Check pow function with value source")
    @ValueSource(doubles = {3, 28.27})
    @Disabled("Disabled test")
    public void circleAreaValueTest(double value){
        double result = figure.circleArea(3);
        assertNotNull(result, "Wrong value!");
    }


    @org.junit.jupiter.api.Test
    @Tag("triangle")
    @MyInterface
    public void myInterfaceTriangleArea(){
        System.out.println("\n============ Run myInterface tests ============\n");
        double result = figure.triangleArea(4,2);
        assertEquals(4, result,"Wrong value!");
        assertTrue(result==4, "Wrong value!");
        assertNotNull(result, "Wrong value!");
    }
    @org.junit.jupiter.api.Test
    @Tag("triangle")
    @Disabled("Disabled test")
    public void disabledTriangleArea(){
        double result = figure.triangleArea(4,2);
        assertEquals(4, result,"Wrong value!");
    }

    @org.junit.jupiter.api.Test
    @Tag("triangle")
    @Tag("integration")
    public void tagTriangleArea(){
        System.out.println("\n============ Run integration tests ============\n");
        double result = figure.triangleArea(4,2);
        assertEquals(4, result,"Wrong value!");
    }
    @Tag("triangle")
    @ParameterizedTest(name = "Check value = ''{0}''")
    @DisplayName("Check pow function with value source")
    @ValueSource(doubles = {2, 4})
    @Disabled("Disabled test")
    public void triangleAreaValueTest(double value){
        double result = figure.triangleArea(4,2);
        assertNotNull(result, "Wrong value!");
    }

}