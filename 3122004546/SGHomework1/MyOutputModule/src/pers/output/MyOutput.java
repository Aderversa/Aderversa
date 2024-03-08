package pers.output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyOutput {
    File outputFile;

    public MyOutput(File output) {
        this.outputFile = output;
    }

    public void myWrite(double x) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(outputFile);
            String temp = String.format("%.2f", x);
            fw.write(temp);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            try {
                if(fw != null)
                    fw.close();
            }
            catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

}
