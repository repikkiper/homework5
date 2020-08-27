package lesson5.java1;

public abstract class Animal {
    protected String name;

    protected float runLimit;
    protected float swimLimit;
    protected float jumpLimit;

    public boolean run(float distance) {
        boolean move = distance > 0 && distance <= runLimit;
        if(move) {
            System.out.printf("%s success ran\n", this.name);
        } else {
            System.out.printf("%s failed ran\n", this.name);
        }
        return move;
    }

    public abstract boolean swim(float distance);

    public abstract boolean jump(float distance);
}
