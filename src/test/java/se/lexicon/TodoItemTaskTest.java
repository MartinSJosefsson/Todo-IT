package se.lexicon;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TodoItemTaskTest {
    @Test
    public void testGetSummary() {
        Person assignee = new Person(1, "Martin", "Josefsson", "martin.josefsson@test.test");
        TodoItem todoItem = new TodoItem(1, "Task 1", "Description", LocalDate.now().plusDays(1), assignee);
        TodoItemTask task = new TodoItemTask(1, todoItem, assignee);
        assertEquals("{id: 1, task: Task 1, assigned: true}", task.getSummary());
    }
}
