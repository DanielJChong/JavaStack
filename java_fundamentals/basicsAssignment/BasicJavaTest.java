import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava printNums = new BasicJava();
        
        //Print 1 - 255
        printNums.print1to255();


        //Print odd numbers between 1-255
        printNums.printOdd();


        //Print Sum
        printNums.printSum();


        //Iterating through an array
        int[] arrX =  {1, 3, 5, 7, 9, 13};
        printNums.iterateArray(arrX);


        //Find Max
        int[] arrX = {1, 2, 3, -4, -5, -10};
        printNums.findMax(arrX);


        //Get Average
        int[] arrX = {2, 10, 3};
        printNums.getAvg(arrX);


        //Array with Odd Numbers
        printNums.oddArr();


        //Greater Than Y
        int[] arrX = {1, 3, 5, 7};
        int y = 3;
        System.out.println(printNums.greaterThan(arrX, y));


        //Square the values
        int[] arrX = {1, 5, 10, -2};
        printNums.square(arrX);


        //Eliminate Negative Numbers
        int[] arrX = {1, 5, 10, -2};
        printNums.negNums(arrX);


        // //Max, Min, and Average
        int[] arrX = {1, 5, 10, -2};
        System.out.println(Arrays.toString(printNums.maxMinAvg(arrX)));


        //Shifting the Values in the Array
        int[] arrX = {1, 5, 10, 7, -2};
        printNums.shiftValues(arrX);
    }
}