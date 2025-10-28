package CollectionFrameworks.Maps.Hashmap;

import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }

    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}