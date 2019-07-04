import java.util.ArrayList;

public class BasicJava{
    public static void print(){
        for(int i=1;i<=255;i++){
            System.out.println(i);
        }
    }
    
    public static void printEach(int[] arr){
        for(int val: arr){
            System.out.println(val);
        }
    }

    public int findMax(int[] arr){
        int max = arr[0];

        for(int val: arr){
            if (val > max){
                max = val;
            }
        }

        return max;
    }

    public float average(int[] arr){
        float sum = 0;
        float avg = 0;

        for(int val: arr){
            sum += val;
        }

        avg = sum/arr.length;

        return avg;
    }

    public ArrayList<Integer> arrayOdd(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<=255;i+=2){
            numbers.add(i);
        }

        return numbers;
    }

    public int greater(int[] arr, int y){
        int count = 0;

        for(int val: arr){
            if(val > y){
                count++;
            }
        }

        return count;
    }

    public int[] squareValues(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }

        return arr;
    }

    public ArrayList<Integer> removeNeg(ArrayList<Integer> arr){
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i) < 0){
                arr.remove(i);
            }
        }

        return arr;
    }

    public int findMin(int[] arr){
        int min = arr[0];

        for(int val: arr){
            if(val < min){
                min = val;
            }
        }

        return min;
    }

    public float[] minMaxAvg(int[] arr){
        float[] arrs = {(float) findMax(arr), (float) findMin(arr), average(arr)};
        return arrs;
    }

    public int[] shift(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];

        }

        arr[arr.length-1] = 0;

        return arr;

    }

















}
