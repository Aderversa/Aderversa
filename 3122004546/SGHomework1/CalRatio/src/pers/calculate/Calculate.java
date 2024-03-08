package pers.calculate;

public class Calculate {

    public static double Ratio(String origin, String copy) {
        int equals = 0;
        // 去除原文和抄袭文章的全部空白字符
        origin = origin.replaceAll("\\s*", "");
        copy = copy.replaceAll("\\s*", "");
        // 将String转化成charArray便于单个中文字符的比较
        char[] originArray = origin.toCharArray();
        char[] copyArray = copy.toCharArray();

        // oIndex 作为原文字符的下标
        int oIndex = 0;
        // cIndex 作为抄袭文章的字符的下标
        int cIndex = 0;

        while(oIndex < originArray.length && cIndex < copyArray.length) {
            if(originArray[oIndex] == copyArray[cIndex])  {
                equals++;
                oIndex++;
                cIndex++;
            }
            else {
                int tmp = 0;
                for(tmp = cIndex + 1; tmp < copyArray.length; tmp++) {
                    if(copyArray[tmp] == originArray[oIndex]) {
                        cIndex = tmp;
                        break;
                    }
                }
                if(tmp == copyArray.length) {
                    oIndex++;
                }
            }
        }
        System.out.printf("%d, %d%n", equals, originArray.length);
        return  (double) equals / originArray.length;
    }
}
