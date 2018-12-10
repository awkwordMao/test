package design_mode.template_desing_mode;

/**小张的团队最近接受一个需求，实现实现一家咖啡店的冲泡咖啡和茶的冲泡自动化。之前这家咖啡店都是由咖啡师傅手动进行调制咖啡和茶。
 * 现在咖啡店需要引入自动化的点单和调制饮料的系统，小张负责实现调制饮料的功能。
 咖啡师傅手工冲泡咖啡和茶的流程：
 冲泡咖啡：
        把水煮沸
        用沸水冲泡咖啡
        把咖啡倒入杯子
        加糖和牛奶
 冲泡茶：
        把水煮沸
        用沸水冲泡茶叶
        把茶倒入杯子
        加柠檬**/
public abstract class CoffeeAndTea {

    //算法，子类不能修改
    public final void doIt(){
        //算法的具体步骤
        boilWater(); //烧水
        brew();//冲泡
        pourInCup();// 把饮料倒入杯子
        if(hook()){
            addCondiments();// 加调料
        }
    }

    public abstract void addCondiments();

    public boolean hook() {
        return true;
    }

    public void pourInCup() {
        System.out.println("把饮料倒入杯子");
    }

    public abstract void brew();

    public void boilWater() {
        System.out.println("烧水");
    }


}
