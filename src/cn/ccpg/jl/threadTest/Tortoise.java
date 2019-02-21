package cn.ccpg.jl.threadTest;

public class Tortoise extends Animal{
    @Override
    void running() {
        int velocity = 2;
        length -= velocity;
        System.out.println("Tortoise ran " + (200 - length) + ", there are " + length+ "meters.");
        if(length <= 0){
            System.out.println("Tortoise won!");
            if(callToBack != null)
                callToBack.win();
        }

        try{
            sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
