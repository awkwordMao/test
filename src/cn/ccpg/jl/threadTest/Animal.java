package cn.ccpg.jl.threadTest;

/**
 * 龟兔赛跑：2000米
 要求：
 (1)兔子每 0.1 秒 5 米的速度，每跑20米休息1秒;
 (2)乌龟每 0.1 秒跑 2 米，不休息；
 (3)其中一个跑到终点后另一个不跑了！
 */
public abstract class Animal extends Thread{
    public int length = 200;

    volatile boolean stop = false;
    abstract void running();

    @Override
    public void run() {
        System.out.println(stop);
        if(!stop){
            while(length > 0){
                running();
            }
        }
    }

    public static interface CallToBack{
        void win();
    }


    public CallToBack callToBack;
}
