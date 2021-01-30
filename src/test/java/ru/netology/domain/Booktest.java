package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldMatchesByAuthor() {
        Book book = new Book(3, "The big Sky", 100, "Kate Atkinson");
        assertEquals(true, book.matches("Kate Atkinson"));

    }

    @Test
    void shouldMatchesByName() {
        Book book = new Book(3, "The big Sky", 100, "Kate Atkinson");
        assertEquals(true, book.matches("The big Sky"));
    }

}