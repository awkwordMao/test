package design_mode.single_mode;

/**
 * 饿汉式
 是否 Lazy 初始化：否

 是否多线程安全：是

 实现难度：易

 描述：这种方式比较常用，但容易产生垃圾对象。
 优点：没有加锁，执行效率会提高。
 缺点：类加载时就初始化，浪费内存。
 */
public class Singleton_1 {
    private Singleton_1(){}
    private static Singleton_1 instance = new Singleton_1();
    public static Singleton_1 getInstance(){
        return instance;
    }
}
