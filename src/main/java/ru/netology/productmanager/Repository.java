//репозиторий с методами:
//        1. сохранение
//        2. получать сохранённые
//        3. удалять по id
//        4. Хранение поля с типом Product []

package ru.netology.productmanager;

public class Repository {
    private Product[] products = new Product[0];

    /**
     * @param product - объект
     * @add - сохраняем объект в массив
     */
    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    /**
     * @findAll - весь массив
     */
    public Product[] findAll() {
        return products;
    }

    /**
     * @param id - удаляемый объект
     * @return - возвращаем массив Product без удаляемого объекта
     * @deletID - удаление объекта по ID
     */
    public Product[] deletId(int id) {
        int productsWithoutId = products.length - 1;
        Product[] tmp = new Product[productsWithoutId];
        int position = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[position] = product;
                position++;
            }


        }
        products = tmp;
        return products;
    }
}
