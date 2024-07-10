import java.util.*;
class practice1{
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        
        // insertion
        map.put("india",120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);

        //search
        if(map.containsKey("india")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        //get
        System.out.println(map.get("china"));
        System.out.println(map.get("africa"));
//iteration

        for(Map.Entry<String,Integer> e:  map.entrySet()){
            System.out.print(e.getKey()+" : ");
            System.out.println(e.getValue());
        }

        //second method to eat
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key +" "+ map.get(key));
        }
        //remove
        map.remove("us");
        System.out.println(map);

    }
}