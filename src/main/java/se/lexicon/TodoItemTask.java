package se.lexicon;

import java.util.Objects;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
    }

    // Getters & Setters
    public int getId() { return id; }
    public boolean isAssigned() { return assigned; }
    public TodoItem getTodoItem() { return todoItem; }

    public void setAssigned(boolean assigned) { this.assigned = assigned; }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoItemTask)) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id &&
                assigned == that.assigned &&
                Objects.equals(todoItem, that.todoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem);
    }
}
