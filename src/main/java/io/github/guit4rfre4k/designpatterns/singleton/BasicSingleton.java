package io.github.guit4rfre4k.designpatterns.singleton;

public class BasicSingleton {

    private static int idGen = 1;
    private final int id;

    private static BasicSingleton instance;

    private BasicSingleton() {
        id = idGen++;
    }

    static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "BasicSingleton{" +
                "id=" + id +
                '}';
    }
}
