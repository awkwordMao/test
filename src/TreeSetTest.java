import java.time.LocalDate;
import java.util.*;
import java.util.regex.Pattern;

public class TreeSetTest {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add("c");
//        treeSet.add("C");
//        treeSet.add("g");
//        treeSet.add("a");
//        String str = "ljljlk";
//        int[][] nums = new int[3][4];
//
//        for(Object o : treeSet){
//            System.out.println(o.toString());
//        }
//        List list = new LinkedList();
//        list.add(3);
//        list.add(1);
//        list.add(6);
//        list.add(4);
//        for(Object o : list){
//            System.out.println(o.toString());
//        }

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        String str = "我的邮箱是：2624824150@qq.com";
        String[] strings = str.split("：");
        for(String str1 : strings){
            System.out.println(str1);
        }

    }


    Pattern pattern = Pattern.compile("\\w+");


}
