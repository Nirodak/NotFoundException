//1. Класс с id,name,cost.


package ru.netology.productmanager;

public class Product {

    protected int id;
    protected int cost;
    protected String name;
    private static int count = 0;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
        count++;
        this.id = count;
    }
}
