import java.util.HashMap;
import java.util.Set;

public class MapOfTheHash {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
    
        trackList.put("Jingle Bells", "Jingle bells, jingle bells, Jingle all the way.");
        trackList.put("Deck the Halls", "Deck the halls with boughs of holly.");
        trackList.put("Last Christmas", "Last Christmas, I gave you my heart");
        trackList.put("White Christmas", "I'm dreaming of a white Christmas");
        
        System.out.println(trackList.get("Jingle Bells"));

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }

    }
}