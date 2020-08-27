package lesson5.java1;

import lesson5.java1.Animal;

public class Dog extends Animal {
    public Dog(String name, float runLimit, float swimLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

//    public boolean run(float distance) {
//        return distance <= runLimit;
//    }

    public boolean swim(float distance) {
        return distance <= swimLimit;
    }

    public boolean jump(float distance) {
        return distance <= jumpLimit;
    }
}
