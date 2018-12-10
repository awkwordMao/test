package design_mode.template_desing_mode;

public class CoffeeAndTeaMain {
    public static void main(String[] args) {
        CoffeeAndTea coffee = new Coffee();
        CoffeeAndTea tea = new Tea();
        coffee.doIt();
        tea.doIt();
    }
}
