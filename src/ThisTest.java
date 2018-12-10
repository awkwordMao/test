public class ThisTest {

    String str = "hello";
    public static void main(String[] args) {
        ThisTest tt = new ThisTest();
        tt.say();
    }

    public void say(){
        String str = "hi";
        System.out.println(this.str);
    }

}
