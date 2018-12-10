import java.io.*;
import java.nio.charset.Charset;

public class IO {

    public static void main(String[] args) {
        IO io = new IO();
        io.readFile("C:/Users/007/Desktop/路径.txt");
    }

    private void readFile(String filePath){
        File file = new File(filePath);
        Reader reader = null;
        try{
            reader = new InputStreamReader(new FileInputStream(file), "GBK");
            char tempchars[] = new char[30];
            int readchar = 0;
            while((readchar = reader.read(tempchars)) != -1){
                if(readchar == tempchars.length && tempchars[tempchars.length - 1] != '\r'){
                    System.out.println(tempchars);
                }else{
                    for(int i = 0; i < tempchars.length; i++){
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
}
