import org.junit.Test;

import pers.input.MyInput;
import pers.calculate.Calculate;
import pers.output.MyOutput;

import java.io.File;

public class ProjectTest {
    @Test
    public void Test() {
        File origin = new File("./Test/orig.txt");
        File copy = new File("./Test/orig_0.8_del.txt");
        File answer = new File("./Test/answer_0.8_del.txt");
        MyInput input = new MyInput(origin, copy, answer);
        try {
            MyOutput output = new MyOutput(input.getAnswer());
            output.myWrite(Calculate.Ratio(input.getOriginString(), input.getCopyString()));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        input = new MyInput(null, null, null);
        try {
            MyOutput output = new MyOutput(input.getAnswer());
            output.myWrite(Calculate.Ratio(input.getOriginString(), input.getCopyString()));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
