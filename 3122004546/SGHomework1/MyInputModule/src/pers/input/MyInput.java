package pers.input;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyInput {
    String originString;
    String copyString;
    File answer;

    // 作为一个方法，处理来自用户的输入数据，将这些数据转化成其他模块可以直接利用的形式
    public MyInput(File origin, File copy, File answer)
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(origin);
            byte[] bytes = new byte[(int)origin.length()];

            int n = fis.read(bytes);
            fis.close();
            this.originString = new String(bytes, StandardCharsets.UTF_8);

            fis = new FileInputStream(copy);
            bytes = new byte[(int)copy.length()];
            n = fis.read(bytes);
            fis.close();
            this.copyString = new String(bytes, StandardCharsets.UTF_8);

            this.answer = answer;
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            try {
                if(fis != null)
                    fis.close();
            }
            catch (IOException e) {
                System.out.println(e.toString());

            }
        }
    }

    public String getOriginString() {
        return this.originString;
    }
    public String getCopyString() {
        return this.copyString;
    }
    public File getAnswer() {
        return answer;
    }
}
