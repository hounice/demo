package ReaderWriter;

import org.testng.annotations.Test;

import java.io.*;

public class FileReaderWriterTest {
    @Test
    public void test1(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //创建File类对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //创建Stream的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
