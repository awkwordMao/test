public class BitOperation {
    public static void main(String[] args) {
        int number = 10;
        printInfo(number);
        int n1 = number << 1;
        printInfo(n1);
        int n2 = number >> 1;
        printInfo(n2);
        int n3 = number >>> 1;
        printInfo(n3);
    }

    public static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }
}
