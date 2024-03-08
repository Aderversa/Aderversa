package pers.calculate;

public class Calculate {

    // 统计原文文章和抄袭文章的相同部分，返回 相同部分字数 和 原文总字数 的比值
    public static double Ratio(String origin, String copy) {
        int equals = 0;
        origin = origin.replaceAll("\\s*", "");
        copy = copy.replaceAll("\\s*", "");
        char[] originArray = origin.toCharArray();
        char[] copyArray = copy.toCharArray();

        int originIndex = 0;
        int copyIndex = 0;

        while(originIndex < originArray.length && copyIndex < copyArray.length) {
            if(originArray[originIndex] == copyArray[copyIndex])  {
                equals++;
                originIndex++;
                copyIndex++;
            }
            else {
                int tmp = 0;
                for(tmp = copyIndex + 1; tmp < copyArray.length; tmp++) {
                    if(copyArray[tmp] == originArray[originIndex]) {
                        copyIndex = tmp;
                        break;
                    }
                }
                if(tmp == copyArray.length) {
                    originIndex++;
                }
            }
        }
        return  (double) equals / originArray.length;
    }
}
