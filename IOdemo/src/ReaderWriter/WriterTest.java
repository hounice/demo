package ReaderWriter;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    @Test
    public void test1(){
        FileWriter fw = null;
        try {
            File file = new File("hello1.txt");

            //还能选择对存在的文件进行覆盖还是追加，即默认的false, true
            fw = new FileWriter(file);

            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }
}
