package design_mode.template_desing_mode;

public class Tea extends CoffeeAndTea {
    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    public void brew() {
        System.out.println("泡茶");
    }
}
