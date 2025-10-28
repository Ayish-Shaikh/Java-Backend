package CollectionFrameworks.Maps.Hashmap;

import java.util.HashMap;
//The clear() method removes all entries from the map.
public class clear_in_hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
