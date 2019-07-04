// Work on the puzzles below. Make your code as clean as possible. The class name should be PuzzleJava; 
//you will need to create methods for each of the tasks below and test them in the main method.

// ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
//Print the sum of all numbers in the array. Also have the function return an array that only includes 
//numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

// ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
//Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.

// ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
//Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. 
//If the first letter in the array is a vowel, have it display a message.

// To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation
// ● Generate and return an array with 10 random numbers between 55-100.

// To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
// ● Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
//(showing the smallest number in the beginning). Display all the numbers in the array. 
//Next, display the minimum value in the array as well as the maximum value.

// To sort a collection, you can use the sort method of the Collections class.
// ● Create a random string that is 5 characters long.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public ArrayList<Integer> greaterTen(int[] arr){
        int sum = 0;

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i: arr){
            sum += i;
            if(i > 10){
                result.add(i);
            }
        }

        System.out.println(sum);
        return result;

    }

    public ArrayList<String> shuffle(ArrayList<String> arr){
        Collections.shuffle(arr);
        ArrayList<String> result = new ArrayList<String>();

        for(String i: arr){
            System.out.println(i);
            if(i.length() > 5){
                result.add(i);
            }
        }

        return result;
    }

    public void alpha(ArrayList<Character> arr){
        Collections.shuffle(arr);
        char[] vowels = {'a','e','i','o','u'};

        System.out.println("Last letter: " + arr.get(arr.size()-1));
        System.out.println("First letter: " + arr.get(0));


    
        for(char i: vowels){
            if(i == arr.get(0)){
                System.out.println("First letter is a vowel!");
            }
        }
          

    }


    public ArrayList<Integer> rando(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random r = new Random();

        for(int i=0;i<10;i++){
            arr.add(r.nextInt((100-55) + 1) + 55);
        }

        return arr;
    }

    public ArrayList<Integer> randoSort(){
        ArrayList<Integer> arr = rando();
        Collections.sort(arr);
        for(int i: arr){
            System.out.println(i);
        }

        System.out.println("Min: " + arr.get(0));
        System.out.println("Max: " + arr.get(arr.size()-1));

        return arr;

    }

    public String randStr(){
        Random r = new Random();
        String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        String result = chars[r.nextInt(26)] + chars[r.nextInt(26)] + chars[r.nextInt(26)] + chars[r.nextInt(26)] + chars[r.nextInt(26)] + "";

        return result;
    }

    public String[] randArr(){
        String[] arr = new String[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = randStr();
        }

        return arr;
    }











}
