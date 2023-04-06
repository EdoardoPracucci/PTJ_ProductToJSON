package Test;

import Controller.ClassToTestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassToTestControllerTest {

    @Test
    void sum() {
        ClassToTestController classToTestController = new ClassToTestController();
        assertEquals(5,classToTestController.sum(3,2));
    }

    @Test
    void minus() {
        ClassToTestController classToTestController = new ClassToTestController();
        assertEquals(1,classToTestController.minus(3,2));
    }

    @Test
    void allString() {
        ClassToTestController classToTestController = new ClassToTestController();
        assertEquals("a b",classToTestController.allString("a","b"));
    }
}