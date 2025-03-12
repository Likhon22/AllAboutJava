import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
     
        // a data structure that stores key value pairs ..keys are unique and values can be duplicated
    
     HashMap<String,Integer> map=new HashMap<>();
     map.put("math", 121);
        map.put("science", 122);
        map.put("english", 123);
        map.put("history", 124);
        System.out.println(map);
        System.out.println(map.get("math"));
        System.out.println(map.get("science"));
       System.out.println(map.containsKey("math"));
       System.out.println(map.containsValue(129));

       map.remove("math");
       System.out.println(map);
         System.out.println(map.size());
            System.out.println(map.isEmpty());
            System.out.println(map.keySet());
            System.out.println(map.values());
            System.out.println(map.entrySet());
            for(String key:map.keySet()){
                System.out.println(key + " - " + map.get(key));
            }
    }

}
