package lesson5.java1;

import lesson5.java1.Animal;

public class Cat extends Animal {
    public Cat(String name, float runLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

//    public boolean run(float distance) {
//        boolean move = distance > 0 && distance <= runLimit;
//        if(move) {
//            System.out.printf("%s Success move\n", this.name);
//        } else {
//            System.out.printf("%s Fail move\n", this.name);
//        }
//        return move;
//    }

//    public boolean swim(float distance) {
    //    return distance <= swimLimit;
    //}

  //  public boolean jump(float distance) {
//        return distance <= jumpLimit;
//    }
}
