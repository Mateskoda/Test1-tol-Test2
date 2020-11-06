package progmatic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Nap55 {
    public static void main(String[] args) {
        Map<Integer,String> ize = new HashMap<Integer,String>();
        ize.put(1,"alma");
        ize.put(2,"körte");
        ize.put(3,"barack");
        for (Integer integer : ize.keySet()) {
            System.out.println(integer);
            System.out.println(ize.get(integer));
        }

        System.out.println("values only");
        Collection<String> values = ize.values();
        for ( String value :values ){
        System.out.println(values);}

            Set<Map.Entry<Integer,String>> entries = ize.entrySet();
            for (Map.Entry<Integer,String>entry:entries){
                System.out.println(entry.getKey()+ "-"+ entry.getValue());
            }

    }
}

