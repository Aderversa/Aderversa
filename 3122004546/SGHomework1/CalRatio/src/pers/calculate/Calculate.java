package pers.calculate;

public class Calculate {

    // 统计原文文章和抄袭文章的相同部分，返回 相同部分字数 和 抄袭文章总字数 的比值
    public static double Ratio(String origin, String copy) throws Exception {
        if(origin == null || copy == null) {
            throw new Exception("原文文章或者抄袭文章是空文章，无法比较");
        }
        int MAX_SEARCH = 10;
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
                for(tmp = copyIndex + 1; tmp < copyIndex + MAX_SEARCH && tmp < copyArray.length; tmp++) {
                    if(copyArray[tmp] == originArray[originIndex]) {
                        copyIndex = tmp;
                        break;
                    }
                }
                if(tmp < copyArray.length && copyArray[tmp] != originArray[originIndex]) {
                    originIndex++;
                }
                else {
                    copyIndex = tmp;
                }
            }
        }
        return  (double) equals / copyArray.length;
    }
}
