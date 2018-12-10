import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectInIf {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("wo");
//        Scanner sc = new Scanner(System.in);
//        if(sc.nextInt() == 1){
//            sb.append("是人");
//        }
//        if(sc.nextInt() == 2){
//            sb.append("不是人");
//        }
//        System.out.println(sb);
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == 1){
            list.add("woshi 1");
        }
        if(sc.nextInt() == 2){
            list.add("woshi 2");
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
