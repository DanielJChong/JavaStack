import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class PuzzleJava {

    public int[] sumAndsome(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                myArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        int[] newArray = new int[myArray.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myArray.get(i);
        }
        return newArray;
    }


    public String[] shufflePrint() {
        //put all names in list with variable
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        List<String> list = Arrays.asList(names);
        //create arraylist for names longer than 5 characters
        ArrayList<String> nameLongerThanFive = new ArrayList<String>();
        //shuffle names in list
        Collections.shuffle(list);
        //loop through list and print out new shuffled names
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //if name is longer than 5 characters add name to new arraylist
            if (list.get(i).length() > 5) {
                nameLongerThanFive.add(list.get(i));
            }
        }
        //give variable to new array and loop through to get out of the arraylist into new array the names that have more than 5 characters
        String[] newArray = new String[nameLongerThanFive.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nameLongerThanFive.get(i);
        }
        //return the new array with names that have more than 5 char
        return newArray;
    }


    public static void letters() {
        //all letters to variable to put into list and shuffle letters
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> list = Arrays.asList(letters);
        Collections.shuffle(list);
        //put shuffled letters into new list to loop through and get each letter
        String[] shuffledLetters = new String[list.size()];
        for (int i = 0; i < shuffledLetters.length; i++) {
            shuffledLetters[i] = list.get(i);
        }
        //print out the last letter of that new shuffled list
        System.out.println(shuffledLetters[shuffledLetters.length - 1]);
        //print out the first letter of that new shuffled list
        System.out.println(shuffledLetters[0]);
        //list vowels into a list so that we can loop through to find if the first letter of new shuffled list is a vowel, we print a message
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (shuffledLetters[0] == vowel) {
                System.out.println("The first letter is a vowel");
            }
        } 
    }  


    public int[] randNums() {
        int[] randInts = new int[10];
        Random x = new Random();
        for (int i = 0; i < randInts.length; i++) {
            randInts[i] = x.nextInt((100-55) + 1) + 55;
        }
        return randInts;
    }


    public int[] randomSortedNums() {
        int[] randInts = new int[10];
        Random x = new Random();
        for (int i = 0; i < randInts.length; i++) {
            randInts[i] = x.nextInt((100 - 55) +1) + 55; 
        }
        Arrays.sort(randInts);
        System.out.println(randInts[0]);
        System.out.println(randInts[randInts.length - 1]);
        return randInts;
    } 


    public String randomStr() {
        int leftLimit = 97;
        int rightLimit = 122;
        char[] charNew = new char[5];
        Random x = new Random();
        for (int i = 0; i < charNew.length; i++) {
            int randomInt = x.nextInt((rightLimit - leftLimit) + 1) + leftLimit;
            charNew[i] = (char) randomInt;
        }
        String newStr = Arrays.toString(charNew);
        return newStr;
    }


    public void tenRandStrings() {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomStr()); 
        }
    }
}