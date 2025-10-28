package CollectionFrameworks.Maps.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class clone_in_hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        HashMap clone = (HashMap)capitalCities.clone();
        clone.remove("England");

        Set<Map.Entry<String, String>> entries = capitalCities.entrySet();
        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(capitalCities);

        Set<Map.Entry<String, String>> con = clone.entrySet();
        for(Map.Entry<String, String> entry : con){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nCloned capitalcities :" + clone);

    }
}
