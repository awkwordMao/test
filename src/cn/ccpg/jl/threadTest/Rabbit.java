package cn.ccpg.jl.threadTest;

public class Rabbit extends Animal {
    public Rabbit(){
        setName("兔子");
    }

    @Override
    void running() {
          int velocity = 5;
          length -= velocity;
          System.out.println("Rabbit ran " + (200 - length) + ", there are " + length + "meters.");
          if(length <= 0){
              System.out.println("Rabbit won!");
              if(callToBack != null)
                callToBack.win();
          }

          try{
              if((200 - length) % 20 == 0){
                  sleep(1000);
              }else{
                  sleep(100);
              }
          }catch (Exception e){
              e.printStackTrace();
          }
    }
}
