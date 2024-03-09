import pers.input.MyInput;
import pers.output.MyOutput;
import pers.calculate.Calculate;

import java.io.*;


public class SGMain {

    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: SGMain originFile copyFile answerFile");
            return;
        }
        File origin = new File(args[0]);
        File copy = new File(args[1]);
        File answer = new File(args[2]);
        MyInput input = new MyInput(origin, copy, answer);
        MyOutput output = new MyOutput(input.getAnswer());
        try {
            output.myWrite(Calculate.Ratio(input.getOriginString(), input.getCopyString()));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
