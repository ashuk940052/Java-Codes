package HashMaps;

import java.util.ArrayList;

public class Map< K,V > {
   ArrayList<MapNode<K,V>> bucket;
   int size ;
   int number_Of_Buckets;
   public Map(){
       number_Of_Buckets =20;
       bucket = new ArrayList<>();
       for(int i=0 ;i<20 ; i++){
           bucket.add(null);
       }
   }
   private int getBucket_Index(K key){
       int hash_Code = key.hashCode();
       return hash_Code % number_Of_Buckets;
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
       head = bucket.get(BucketIndex);
       newElement.next = head;
       bucket.set(BucketIndex , newElement);
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
