package ReaderWriter;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    @Test
    //一次取出了一个
    public void Test1(){
        FileReader fr1 = null;
        try {
            File file = new File("hello.txt");

            fr1 = new FileReader(file);

            int data = fr1.read();
            while (data != -1){
                System.out.print((char) data);
                data = fr1.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr1 != null){try {
                fr1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }}

        }
        System.out.println("**************************");
    }

    @Test
    //一次取出了一串
    public void test2() {
        FileReader fr2 = null;
        try {
            File file = new File("hello.txt");

            fr2 = new FileReader(file);

            char[] cbuf = new char[5];
            int len;
            fr2.read(cbuf);
            while ((len = fr2.read(cbuf)) != -1) {
                //            for (int i = 0; i < len;i++){
                //                System.out.print(cbuf[i]);
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr2 != null){
                try {
                    fr2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }
}

