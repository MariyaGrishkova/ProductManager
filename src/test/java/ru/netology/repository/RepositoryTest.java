package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.NotFoundExeptions;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();


    @Test
    void shouldRemoveByIdIfExists() {
        repo.removeById(5);
        Product[] expected = {new Book(1, "Troubled Blood", 200, "Robert Galbraith"),
                new Book(2, "Fantastic Beasts and Where to Find Them", 300, "Joanne Rowling"),
                new Book(3, "Kate Atkinson", 100, "Kate Atkinson"),
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