package cn.ccpg.jl.threadTest;

public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal tortoise = new Tortoise();
        LetOneStop letOneStop1 = new LetOneStop(tortoise);
        rabbit.callToBack = letOneStop1;
        LetOneStop letOneStop2 = new LetOneStop(rabbit);
        tortoise.callToBack = letOneStop2;
        rabbit.start();
        tortoise.start();

    }
}
