import java.util.*;
public class basics{
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        HashMap<String,Integer> mp=new HashMap<>();
        hm.put("Akash",21);
        hm.put("aman", 15);
        hm.put("sarb", 22);
        hm.put("anshik", 21);

        hm.get("sarb");
        hm.put("Akash", 22);
        hm.remove("aman");
        hm.containsKey("sarb");
        hm.putIfAbsent("sarb",21);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        System.out.println();

        // for loops for hashMap
        for(String key:hm.keySet()){
            System.out.printf("Age of %s is %d",key,hm.get(key));
            System.out.println();
        }
        System.out.println();

        for(Map.Entry<String,Integer> e:hm.entrySet()){
            System.out.printf("Age of %s is %d",e.getKey(),e.getValue());
            System.out.println();
        }

        System.out.println();

        for(var e:hm.entrySet()){
            System.out.printf("Age of %s is %d",e.getKey(),e.getValue());
            System.out.println();
        }
    }
}