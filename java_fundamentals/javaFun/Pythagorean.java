import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        int sum = (legA * legA) + (legB * legB);
        double hypotenuse = Math.sqrt(sum);
        return hypotenuse;
    }
}

