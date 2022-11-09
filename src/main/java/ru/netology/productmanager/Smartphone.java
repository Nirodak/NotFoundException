//1. дочерний класс с производителем и наследованными переменными.

package ru.netology.productmanager;

public class Smartphone extends Product {
    private String manufactured;


    public Smartphone(int cost, String name, String manufactured) {
        super(cost, name);
        this.manufactured = manufactured;

    }
}
