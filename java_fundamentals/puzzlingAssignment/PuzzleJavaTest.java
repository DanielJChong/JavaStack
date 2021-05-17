import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();

        int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        int[] newArr = pj.sumAndsome(arr);
        System.out.println(Arrays.toString(newArr));


        String[] strArray = pj.shufflePrint();
        System.out.println(Arrays.toString(strArray));


        pj.letters();


        arr = pj.randNums();
        System.out.println(Arrays.toString(arr));


        arr = pj.randomSortedNums();
        System.out.println(Arrays.toString(arr));


        System.out.println(pj.randomStr());


        pj.tenRandStrings();
    }
}