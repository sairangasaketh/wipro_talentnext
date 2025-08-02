package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    DailyTasks dt = new DailyTasks();

    @Test
    public void testPresenceTrue() {
        assertTrue(dt.checkPresence("Talent Next", "Next"));
    }

    @Test
    public void testPresenceFalse() {
        assertFalse(dt.checkPresence("Wipro Learning", "Tech"));
    }

    @Test
    public void testPresenceCaseMismatch() {
        assertFalse(dt.checkPresence("Hello World", "world")); // Case-sensitive
    }

    @Test
    public void testPresenceEmptySearch() {
        assertTrue(dt.checkPresence("Check me", ""));
    }

    @Test
    public void testPresenceEmptySource() {
        assertFalse(dt.checkPresence("", "Wipro"));
    }
}
