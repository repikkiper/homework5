package lesson5.java1;

public class main {
    public static void main(String[] args) {

        Cat cat_first = new Cat("Pusik", 200, 2);
        Cat cat_second = new Cat("Barsik", 100, 2);
        Dog dog_first = new Dog("Barboss", 500, 10, 0.5f);
        Dog dog_second = new Dog ("Sharik", 600, 10, 0.5f);
        cat_first.run(10);
        cat_first.run(-10);
        cat_first.swim(10);
        dog_first.run(10);
        dog_first.run(-10);
        dog_first.swim(10);
        cat_first.swim(5);
    }
}
