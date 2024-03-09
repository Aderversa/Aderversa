import org.junit.Before;
import org.junit.Test;
import pers.input.MyInput;

import java.io.File;

public class MyInputTest {

    MyInput input;

    @Test
    public void InputModuleTest() {
        // 用户正常输入
        File origin = new File("./Test/orig.txt");
        File copy = new File("./Test/orig_0.8_del.txt");
        File answer = new File("./Test/answer_0.8_del.txt");
        this.input = new MyInput(origin, copy, answer);
        System.out.println(input.getOriginString());
        System.out.println(input.getCopyString());

        // 用户输入不存在的文件路径
        origin = new File("H:/Test/orig.txt");
        copy = new File("H:/Test/orig_0.8_del.txt");
        answer = new File("H:/Test/answer_0.8_del.txt");
        this.input = new MyInput(origin, copy, answer);
        System.out.println(input.getOriginString());
        System.out.println(input.getCopyString());

        // 用户错误数据
        input = new MyInput(null, null, null);
        System.out.println(input.getOriginString());
        System.out.println(input.getCopyString());
    }
}
