import java.util.HashMap;
import java.util.Set;

public class HashMatiqueTest{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("title1", "lyrics1 lyrics1 lyrics1");
        trackList.put("title2", "lyrics2 lyrics2 lyrics2");
        trackList.put("title3", "lyrics3 lyrics3 lyrics3");
        trackList.put("title4", "lyrics4 lyrics4 lyrics4");

        System.out.println(trackList.get("title2"));
        HashMatique h = new HashMatique();

        h.printHash(trackList);

    }
}
