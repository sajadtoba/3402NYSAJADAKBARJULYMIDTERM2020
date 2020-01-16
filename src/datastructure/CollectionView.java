package datastructure;  //..................Done

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        // only the values

        for(String  values:map.values() )
                System.out.println(values);
        // only the keys
        for(Integer values:map.keySet())
                System.out.println(values);




        System.out.println(map);
        System.out.println(map.get(5));
        map.remove(4);
        System.out.println(map);
        // Now time to see if the hashmap contains the value or not
        //Test the case true or false
        System.out.println(map.containsValue("Demver"));
        System.out.println(map.containsValue("Denver"));
        System.out.println("");
        System.out.println(map.containsKey(7));






//        Set(String) setCodes = CollectionView.keSet();
//        Iterator<String> iterator = setCodes.iterator();
//        While(Iterator.hasNext()){







//        Map<String, String> mapCountryCodes = new HashMap<>();
//
//        mapCountryCodes.put("1", "USA");
//        mapCountryCodes.put("44", "United Kingdom");
//        mapCountryCodes.put("33", "France");
//        mapCountryCodes.put("81", "Japan");
//
//        Set<String> setCodes = mapCountryCodes.keySet();
//        Iterator<String> iterator = setCodes.iterator();
//
//        while (iterator.hasNext()) {
//                String code = iterator.next();
//                String country = mapCountryCodes.get(code);
//
//                System.out.println(code + " => " + country);
//        }
//
//        Set<String> setCodes= mapCountryCountry




    }

}
