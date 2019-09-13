package domain.service.student617;

import domain.service.ITask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task617Test {

    @Test
    void task1() {
        ITask task = new Task617();
        assertTrue(task.task1("すべての文字列"));
    }

    @Test
    void task2() {
        ITask task = new Task617();
        assertTrue(task.task1("A10"));
    }

    @Test
    void task3() {
        ITask task = new Task617();
        assertTrue(task.task1("USA"));
    }
}
