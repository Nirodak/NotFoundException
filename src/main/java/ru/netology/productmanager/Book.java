//1. Дочерний класс с автором и полями от родительского

package ru.netology.productmanager;

public class Book extends Product {
    private String author;


    public Book(int cost, String name, String author) {
        super(cost, name);
        this.author = author;

    }
}

