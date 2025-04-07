package se.lexicon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testGetSummary() {
        Person person = new Person(1, "Martin", "Josefsson", "martin.josefsson@test.test");
        assertEquals("{id: 1, name: Martin Josefsson, email: martin.josefsson@test.test}", person.getSummary());
    }
}
