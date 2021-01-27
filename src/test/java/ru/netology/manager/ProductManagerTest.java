package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.manager.ProductManager;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    @Test
    void shouldSearchByAuthor() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(2, "Fantastic Beasts and Where to Find Them", 300, "Joanne Rowling")};
        Product[] actual = manager.searchBy("Joanne Rowling");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByName() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(3, "The big Sky", 100, "Kate Atkinson")};
        Product[] actual = manager.searchBy("The big Sky");
        assertArrayEquals(expected, actual);
    }
}