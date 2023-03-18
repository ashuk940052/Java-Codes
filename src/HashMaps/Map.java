package HashMaps;

import java.util.ArrayList;

public class Map< K,V > {
   ArrayList<MapNode<K,V>> bucket;
   int size ;
   int number_Of_Buckets;
   public Map(){
       number_Of_Buckets =5;
       bucket = new ArrayList<>();
       for(int i=0 ;i<20 ; i++){
           bucket.add(null);
       }
   }
   private int getBucket_Index(K key){
       int hash_Code = key.hashCode();
       return hash_Code % number_Of_Buckets;
   }
   public double load_Factorr(){
       return (0.1*size) / number_Of_Buckets;
   }
   private void Rehash(){
       System.out.println("Rehashing : Buckets :-" + number_Of_Buckets +" Size :-"+ size );
       ArrayList<MapNode<K,V>> temp = bucket;
       bucket = new ArrayList<>();
       for (int i=0 ; i< 2*number_Of_Buckets ; i++){
           bucket.add(null);
       }
       size = 0;
       number_Of_Buckets *= 2;
       for(int i=0; i< temp.size() ; i++){
           MapNode< K, V > head = temp.get(i);
           K key = head.key;
           V value = head.value;
           insert(key,value);
       }
       
   }
   public void insert(K key , V value){
       int BucketIndex = getBucket_Index(key);
       MapNode<K,V> head = bucket.get(BucketIndex);
       while (head != null){
           if(head.key.equals(key)){
               head.value = value;
               return;
           }
           head = head.next;
       }
       MapNode<K,V> newElement = new MapNode<K,V>(key , value);
       size++;
       head = bucket.get(BucketIndex);
       newElement.next = head;
       bucket.set(BucketIndex , newElement);
       double loadFactor = (0.1*size)/number_Of_Buckets;
       if(loadFactor > 0.7){
           Rehash();
       }
   }
   public V getValue(K key){
       int BucketIndex = getBucket_Index(key);
       MapNode<K, V> head =  bucket.get(BucketIndex);
       while (head != null){
           if(head.key.equals(key)){
               return head.value;
           }
           head = head.next;
       }
       return null;
   }
   public V removeValue(K key){
       int BucketIndex = getBucket_Index(key);
       MapNode<K,V> head = bucket.get(BucketIndex);
       MapNode<K,V> prev = null;
       while (head != null){
           if(head.key.equals(key)){
               size--;
               if(prev == null){
                   bucket.set(BucketIndex, head.next);
               }else {
                   prev.next = head.next;
               }
               return head.value;
           }
           prev = head;
           head = head.next;
       }
       return null;
   }

}
