import java.util.Collections;

public class MD5 {
    public static void main(String[] args) {

        Integer i = 257;
        System.out.println(i.byteValue());
        Byte b = -127;
        System.out.println(b.intValue());
    }

    public static String byteToHexString(byte b){
        int n = b;
        if(n < 0)
            n = n + 256;
        int b1 = n / 16;
        return null;
    }
}
