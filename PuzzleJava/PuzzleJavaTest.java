import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJavaTest{
    public static void main(String[] args){
        int[] nums = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Random r = new Random();

        ArrayList<Character> chars = new ArrayList<Character>( Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        PuzzleJava puz = new PuzzleJava();

        // System.out.println(puz.greaterTen(nums));
        // System.out.println(puz.shuffle(names));
        // puz.alpha(chars);
        // System.out.println(puz.rando());
        // System.out.println(puz.randoSort());
        // System.out.println(puz.randStr());
        System.out.println(Arrays.toString(puz.randArr()));


    }


}
