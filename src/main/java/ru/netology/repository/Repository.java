package ru.netology.repository;

import lombok.val;
import ru.netology.domain.Book;
import ru.netology.domain.NotFoundExeptions;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

public class Repository {
    Product[] repo = {new Book(1, "Troubled Blood", 200, "Robert Galbraith"),
            new Book(2, "TFantastic Beasts and Where to Find Them", 300, "Joanne Rowling"),
            new Book(3, "The big Sky", 100, "Kate Atkinson"),
            new Smartphone(4, "Galaxy-A-50", 400, "Samsung"),
            new Smartphone(5, "Mi-3", 300, "Xiaomi"),
            new Smartphone(6, "P-30", 200, "Honor")};

    public void save(Product item) {
        Product[] newRepo = new Product[repo.length + 1];
        for (int i = 0; i < repo.length; i++) newRepo[i] = repo[i];
        int lastIndex = newRepo.length - 1;
        newRepo[lastIndex] = item;
        repo = newRepo;
    }

    public Product[] getAll() {
        return repo;
    }


    public void removeById(int id) {
        boolean idExists = false;
        for (Product item : repo)
            if (item.getId() == id) {
                idExists = true;
                break;
            }
        if (idExists) {
            Product[] newRepo = new Product[repo.length - 1];
            int index = 0;
            for (Product item : repo)
                if (item.getId() != id) {
                    newRepo[index] = item;
                    index++;
                }
            repo = newRepo;
        } else {
            throw new NotFoundExeptions(" Element with id: " + id + " not found");
        }
    }

}