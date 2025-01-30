package hashmaphashfuntion.implementhashmap;

// Class with name ImplementationOfHashmap used for the purpose of
// implementation a basic hashmap class with operations for insertion,
// deletion, and retrieval
import java.util.*;
public class ImplementationOfHashmap {

        // Here K, V are generic value
        static class HashMap<K,V>{
            private class Node{
                K key;
                V value;

                // Constructor
                public Node(K key, V value){
                    this.key = key;
                    this.value = value;
                }
            }

            private int n;
            private int N;
            // N is the length of bucket
            private LinkedList<Node>bucket[];

            // @SuppressWarnings("unchecked")
            // Constructor of HashMap class
            public HashMap(){
                // size of bucket is assign
                this.N = 4;

                this.bucket = new LinkedList[4];
                for(int i = 0; i < 4; i++){
                    // here inside bucket we assign linked list
                    this.bucket[i] = new LinkedList<>();
                }

            }

            // Method which is used for hashing
            private int hashFunction(K key){
                // here we use inbuilt hashCode() for hashing
                int hash = key.hashCode(); // 0 to n-1
                return Math.abs(hash) % N;
            }

            // Method which is used for searching a linked list inside the bucket
            private int searchInLinkedList(K key, int bucketIndex){
                // Create a linked list of Node type and assign it bucket
                LinkedList <Node> linkedList =  bucket[bucketIndex];
                int dataIndex = 0;
                // Check if the key is found or not
                // if found the return dataIndex
                // if not found return -1
                for(int i = 0; i < linkedList.size(); i++){
                    Node node = linkedList.get(i);
                    if(node.key == key){
                        return dataIndex;
                    }
                    dataIndex++;
                }
                return -1;
            }

            // Method which is used for rehashing
            // it is used when the value of lambda is greater than constant value
            // then we have to rehash
            private void rehash(){
                // Create a linked list of Node type and assign it bucket
                LinkedList<Node> oldBucket[] = bucket;
                // The new bucket will be double of old one
                bucket =  new LinkedList[N*2];
                N = 2 * N;
                for(int i=0;i<bucket.length;i++){
                    bucket[i]=new LinkedList<>();

                }

                //nodes->add in bucket
                for(int i = 0; i < oldBucket.length; i++){
                    LinkedList<Node> linkedList = oldBucket[i];
                    for(int j = 0; j < linkedList.size(); j++){
                        Node node  = linkedList.remove();
                        put(node.key,node.value);
                    }
                }
            }

            // Method to add key and value inside hashmap
            public void put(K key, V value){
                // For bucketIndex call hashFunction()
                int bucketIndex = hashFunction(key);
                // For dataIndex call searchInLinkedList()
                int dataIndex = searchInLinkedList(key, bucketIndex);
                if(dataIndex != -1){
                    Node node = bucket[bucketIndex].get(dataIndex);
                    node.value = value;
                }
                else{
                    bucket[bucketIndex].add(new Node(key, value));
                    n++;
                }

                double lambda = (double)n/N;
                if(lambda > 2.0){
                    rehash();
                }
            }

            // Method for searching the key in HashMap
            public boolean ContainsKey(K key){
                // For bucketIndex call hashFunction()
                int bucketIndex = hashFunction(key);
                // For dataIndex call searchInLinkedList()
                int dataIndex = searchInLinkedList(key, bucketIndex);
                if(dataIndex != -1){
                    return true;
                }
                else{
                    return false;
                }
            }

            // Method for getting the Value
            public V get(K key){
                // For bucketIndex call hashFunction()
                int bucketIndex = hashFunction(key);
                // For dataIndex call searchInLinkedList()
                int dataIndex =  searchInLinkedList(key,bucketIndex);
                // if the dataIndex not equal to - 1
                // then it will return the value
                // else it will return null
                if(dataIndex != -1){
                    Node node = bucket[bucketIndex].get(dataIndex);
                    return node.value;
                }
                else {
                    return null;
                }
            }

            // Method for removing the key
            public V remove(K key){
                // For bucketIndex call hashFunction()
                int bucketIndex = hashFunction(key);
                // For dataIndex call searchInLinkedList()
                int dataIndex =  searchInLinkedList(key,bucketIndex);
                if(dataIndex != -1){
                    Node node = bucket[bucketIndex].get(dataIndex);
                    n--;
                    return node.value;
                }
                else {
                    return null;
                }
            }

            // Method for keySet
            public ArrayList<K> keySet(){
                ArrayList<K> keys=new ArrayList<>();
                for(int i=0;i<bucket.length;i++){
                    LinkedList<Node> ll=bucket[i];
                    for(Node node:ll){
                        keys.add(node.key);
                    }
                }
                return keys;
            }

            // Method for isEmpty()
            public boolean isEmpty() {
                return n == 0;
            }

        }

    }




