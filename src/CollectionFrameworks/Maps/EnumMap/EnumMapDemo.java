package CollectionFrameworks.Maps.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        //array of size same as enum\
        //[_,"dsa",_,_,_,_,_]
        //no hashing
        //ordinal/index is used
        //FASTER THAN HASHMAP
        //MEMORY EFFICIENT
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"dsa");
        map.put(Day.MONDAY,"backend");
        map.put(Day.THRUSDAY,"Figma");
        map.put(Day.SATURDAY,"Collections");
        map.put(Day.SUNDAY,"Spring");
        map.put(Day.WEDNESDAY,"Frontend");
        map.put(Day.FRIDAY,"Prayer");
        System.out.println(map);
        String s = map.get(Day.TUESDAY);
        System.out.println(s);
    }
}
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}
