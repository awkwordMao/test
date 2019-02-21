package cn.ccpg.jl.threadTest;

public class LetOneStop implements Animal.CallToBack{

    private Animal animal;

    public LetOneStop(Animal animal){
        this.animal = animal;
    }
    @Override
    public void win() {
//        animal.stop();
        animal.stop = true;
        System.out.println(animal + " was stopped!");
    }
}
