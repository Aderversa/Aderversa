import org.junit.Test;
import pers.calculate.Calculate;

public class CalRatioTest {

    @Test
    public void RatioTest() {
        try {
            String origin = "今天是星期天，天气晴，今天晚上我要去看电影。";
            String copy = "今天是周天，天气晴朗，我晚上要去看电影。";
            System.out.printf("%.2f", Calculate.Ratio(origin, copy));

            origin = "Hello I am a student";
            copy = "你好，我是一个学生";
            System.out.printf("%.2f\n", Calculate.Ratio(origin, copy));

            System.out.printf("%.2f\n", Calculate.Ratio(null, null));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
