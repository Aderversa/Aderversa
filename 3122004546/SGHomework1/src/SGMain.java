import pers.input.MyInput;
import pers.output.MyOutput;
import pers.calculate.Calculate;

import java.io.*;


public class SGMain {
    public static void main(String[] args) {
        File origin = new File("D://PersonalProjectTest//origin.txt");
        File copy = new File("D://PersonalProjectTest//copy.txt");
        File answer = new File("D://PersonalProjectTest//answer.txt");

        MyInput input = new MyInput(origin, copy, answer);
        MyOutput output = new MyOutput(input.getAnswer());
        output.myWrite(Calculate.Ratio(input.getOriginString(), input.getCopyString()));
    }
}
