package design_mode.template_desing_mode;

public class Coffee extends CoffeeAndTea {

    @Override
    public void addCondiments() {
        System.out.println("加牛奶和糖");
    }

    @Override
    public void brew() {
        System.out.println("冲泡咖啡");
    }
}
