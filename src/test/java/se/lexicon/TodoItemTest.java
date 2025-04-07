package se.lexicon;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class TodoItemTest {
    @Test
    public void testIsOverdue() {
        Person creator = new Person(1, "Martin", "Josefsson", "martin.josefsson@test.test");
        TodoItem todoItem = new TodoItem(1, "Task 1", "Description", LocalDate.now().minusDays(1), creator);
        assertTrue(todoItem.isOverdue());
    }
}
