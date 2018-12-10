import java.io.*;
import java.nio.charset.Charset;

public class IO {

    public static void main(String[] args) {
        IO io = new IO();
        io.readFile("C:/Users/007/Desktop/路径.txt");
//        readFileByChars("C:/Users/007/Desktop/路径.txt");
    }

    private void readFile(String filePath){
        File file = new File(filePath);
        Reader reader = null;
        try{
            char tempchars[] = new char[30];
            int readchar = 0;
            reader = new InputStreamReader(new FileInputStream(filePath), "GBK");
            while((readchar = reader.read(tempchars)) != -1){
                System.out.println(tempchars.length);
                if((readchar == tempchars.length) && (tempchars[tempchars.length - 1]) != '\r'){
                    System.out.print(tempchars);
                }else{
                    for(int i = 0; i < readchar; i++){
                        if(tempchars[i] == '\r'){
                            continue;
                        }else{
                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void readFileByChars(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
//        try {
//            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
//            // 一次读一个字符
//            reader = new InputStreamReader(new FileInputStream(file));
//            int tempchar;
//            while ((tempchar = reader.read()) != -1) {
//                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
//                // 但如果这两个字符分开显示时，会换两次行。
//                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
//                if (((char) tempchar) != '\r') {
//                    System.out.print((char) tempchar);
//                }
//            }
//            reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            System.out.println("以字符为单位读取文件内容，一次读多个字节：");
            // 一次读多个字符
            char[] tempchars = new char[60];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(fileName), "GBK");
            // 读入多个字符到字符数组中，charread为一次读取字符数
            while ((charread = reader.read(tempchars)) != -1) {
                // 同样屏蔽掉\r不显示
                if ((charread == tempchars.length)
                        && (tempchars[tempchars.length - 1] != '\r')) {
                    System.out.print(tempchars);
                } else {
                    for (int i = 0; i < charread; i++) {
                        if (tempchars[i] == '\r') {
                            continue;
                        } else {
                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
