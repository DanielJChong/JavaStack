import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    
    //Print 1 - 255
    public static void print1to255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }


    //Print odd numbers between 1-255
    public static void printOdd() {
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }


    //Print Sum
    public static void printSum() {
        int sum = 0;
        String newStr;
        for (int i = 0; i < 256; i++) {
            sum += i;
            newStr = String.format("New number: %d Sum %s", i, sum);
            System.out.println(newStr);
        }
    }


    //Iterating through an array
    public static void iterateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    //Find Max
    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    //Get Average
    public static void getAvg(int[] arr) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg / arr.length;
        System.out.println(avg);
    }


    //Array with Odd Numbers
    public static void oddArr() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < 256; i++) {
            if (i % 2 == 1) {
                y.add(i);
            }
        }
        System.out.println(y);
    }


    //Greater Than Y
    public int greaterThan(int[] arr, int y) {
        int greaterNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                greaterNum += 1;
            }
        }
        return greaterNum;
    }


    //Square the values
    public static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    //Eliminate Negative Numbers
    public static void negNums(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //Max, Min, and Average
    public int[] maxMinAvg(int[] arr) {
        // new array =  MAX, MIN, AVG 
        int[] newArr = {arr[0], arr[0], 0};
        for (int i = 0; i < arr.length; i++) {
            if (newArr[0] < arr[i]) {
                newArr[0] = arr[i];
            }
            if (newArr[1] > arr[i]) {
                newArr[1] = arr[i];
            }
            newArr[2] += arr[i];
        }
        newArr[2] = newArr[2] / arr.length;
        return newArr;
    }


    //Shifting the Values in the Array
    public static void shiftValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = 0;
                break;
            }
            else {
                arr[i] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}