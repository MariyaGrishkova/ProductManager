package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();


    @Test
    void shouldRemoveByIdIfExists() {
        repo.removeById(4);
        Product[] expected = {new Book(1, "Troubled Blood", 200, "Robert Galbraith"),
                new Book(2, "TFantastic Beasts and Where to Find Them", 300, "Joanne Rowling"),
                new Book(3, "The big Sky", 100, "Kate Atkinson"),
                new Smartphone(4, "Galaxy-A-50", 400, "Samsung"),
                new Smartphone(5, "Mi-3", 300, "Xiaomi"),
                new Smartphone(6, "P-30", 200, "Honor")};
        assertArrayEquals(expected, repo.getAll());
    }


    @Test
    void shouldRemoveByIdIfDoesNotExist() {
        Repository repo = new Repository();
        assertThrows(NotFoundExeptions.class, () -> repo.removeById(10));
    }
}