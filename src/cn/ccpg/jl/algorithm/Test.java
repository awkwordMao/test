package cn.ccpg.jl.algorithm;

public class Test {

    public StringBuilder find(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int temp = 0;
        stringBuilder.append(string.charAt(0));
        for (int i = 0; i < string.length(); i++) {
            String str = string.valueOf(i);
            if(string.charAt(i) != string.charAt(i + 1)){
                str += string.indexOf(i);
            }else {
                if(stringBuilder.length() > temp) {
                    temp = stringBuilder.length();
                }else if(stringBuilder.length() < temp){

                }

            }
        }
        return stringBuilder;
    }

}
