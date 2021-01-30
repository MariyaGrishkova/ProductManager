package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {


    @Test
    void shouldSearchByAuthor() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(2, "TFantastic Beasts and Where to Find Them", 300, "Joanne Rowling")};
        Product[] actual = manager.searchBy("Joanne Rowling");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByName() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(2, "TFantastic Beasts and Where to Find Them", 300, "Joanne Rowling")};
        Product[] actual = manager.searchBy("TFantastic Beasts and Where to Find Them");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByProducer() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(4, "Galaxy-A-50", 400, "Samsung")};
        Product[] actual = manager.searchBy("samsung");
        assertArrayEquals(expected, actual);
    }


}