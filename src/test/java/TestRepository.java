import ru.netology.productmanager.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRepository {

    Repository repository = new Repository();
    ProductManager manager = new ProductManager(repository);


    Product product1 = new Book(500, "50 татуировок менеджера", "Батырёв");
    Product product2 = new Book(900, "Атлант расправил плечи", "Забыл");
    Product product3 = new Smartphone(50000, "Apple", "China");
    Product product4 = new Smartphone(20000, "Xiaomi", "China");

    Product product5 = new Book(900, "Атлант расправил плечи 2", "Забыл");

    /**
     * Проверка сохранения объектов
     * Отображение всех объектов массива
     */
    @Test
    public void addTest() {

        repository.add(product1);
        repository.add(product2);

        Product[] expected = {product1, product2};
        Assertions.assertArrayEquals(expected, repository.findAll());


    }

    /**
     * Проверка удаления объекта из массива по id.
     */
    @Test
    public void deleteIdTest() {
        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        repository.add(product4);

        repository.deleteId(product4.getId());

        Product[] expected = {product1, product2, product3};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }

    /**
     * Поиск по объектам при наличии
     */
    @Test
    public void testSearchPositive() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);

        Product[] expected = {product2, product5};
        Product[] actual = manager.searchBy("плечи");

        Assertions.assertArrayEquals(expected, actual);
    }

    /**
     * Поиска по наименованию с результатом 0
     */
    @Test
    public void testSearchNegative() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Колобок");

        Assertions.assertArrayEquals(expected, actual);
    }
//    @Test
//    public void testNotFoundException(){
//        manager.add(product1);
//        manager.add(product2);
//        manager.add(product3);
//        manager.add(product4);
//        manager.add(product5);
//
//       Assertions.assertThrows(NotFoundException.class, () ->{
//           repository.deleteId(6);
//       });


    }
}
