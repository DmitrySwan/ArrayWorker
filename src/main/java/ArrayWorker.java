import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayWorker {
    public static void main(String[] args) {
        //#1
        int[] first = new int[]{1,2,3,4,5};
        int[] second = new int[]{6,7,8,9,10};
        int[] resultFromLang3 = ArrayUtils.addAll(first, second);
        Arrays.sort(resultFromLang3);
        System.out.println(Arrays.toString(resultFromLang3));

        //#2
        int[] resultFromJava8 = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).sorted().toArray();
        System.out.println(Arrays.toString(resultFromJava8));

        //#3
        int[] resultFromJava6 = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, resultFromJava6, first.length, second.length);
        System.out.println(Arrays.toString(resultFromJava6));
    }
}
