
import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n; // number of nodes
        private int N; // number of bucket
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();

            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;

        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;



        }
        @SuppressWarnings("unchecked")

        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets =  new LinkedList[N*2];
            for(int i= 0;i<N*2 ;i++){
                buckets[i]= new LinkedList<>();
            }

            for(int i =0;i<oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j =0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }



        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di means data index
            if(di == -1){   //key doesnt exist
                buckets[bi].add(new Node(key,value));
                n++;

            }
            else{   //key exists
                Node node = buckets[bi].get(di);
                node.value =value;

            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                //Rehashing
                rehash();
            }
        
        }


        public  V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di means data index
            if(di == -1){   //key doesnt exist
                return null;

            }
            else{   //key exists
                Node node = buckets[bi].get(di);
                return node.value;

            }
        }


        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di means data index
            if(di == -1){   //key doesnt exist
                return false;

            }
            else{   //key exists
                Node node = buckets[bi].get(di);
                return true;

            }
        }


        public  V remove (K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di means data index
            if(di == -1){   //key doesnt exist
                return null;

            }
            else{   //key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
                

            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

     public ArrayList<K> KeySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
            LinkedList<Node> ll = buckets[i];
            for(int j=0;j<ll.size();j++){
                Node node = ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
     }
       



      









    }

  public static void main(String[] args) {
    HashMap<String,Integer> map = new HashMap<>();
    map.put("india",190);
    map.put("china",200);

    map.put("us",50);

ArrayList<String> keys = map.KeySet();
for(int i=0;i<keys.size();i++){
    System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
}

map.remove("india");
System.out.println(map.get("india"));

  }


}
