package CollectionFrameworks.Maps.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapdemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(1,"Ayish");
        map.put(2,"Abir");
        map.put(3,"Pat");


        String student = map.get(2);
        System.out.println(student);//will print the element present in 2.

        String s = map.get(7);
        System.out.println(s);//number 7 is not present so it will return null.

        System.out.println(map.containsKey(2));//return boolean either true or false.
        System.out.println(map.containsValue("Ayish"));//this method checks the name is correct or not and also checks the upper and lower case and then returns true/false.

        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());//transforming to uppercase
        }
        System.out.println(map);

        boolean res = map.remove(2, "Benihime");//no benihime is there so it will return false
        System.out.println("REMOVED ?" + res);
        map.remove(2);
        System.out.println(map);


    }
}
