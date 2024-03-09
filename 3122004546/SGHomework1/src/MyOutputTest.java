import org.junit.Test;

import java.io.File;

import pers.output.MyOutput;

public class MyOutputTest {

    @Test
    public void OutputModuleTest() {
        File answer = new File("./Test/MyOutputTest.txt");
        MyOutput output = new MyOutput(answer);
        output.myWrite(3.1415926);

        output = new MyOutput(null);
        output.myWrite(3.1415926);
    }
}
