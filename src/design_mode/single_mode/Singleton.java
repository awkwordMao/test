package design_mode.single_mode;

/**
 * 单例模式
 * 静态内部类/登记式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
