import java.util.HashMap;
import java.util.Set;

public class HashMatique{
    public void printHash(HashMap<String,String> hash){
        Set<String> keys = hash.keySet();
        for(String key: keys){
            System.out.println(key + ": " + hash.get(key) );
        }
    }


}
