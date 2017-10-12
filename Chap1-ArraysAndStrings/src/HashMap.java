import java.util.ArrayList;
import java.util.Enumeration;

public class HashMap<K,V> {
	private ArrayList<HashNode<K,V>> myHashTable;//the hash map
	private int numOfBins;// number of bins in hash map
	private int size;// current size of hash map
	
	//initialize the map to 10 bins if no size mentioned
	public HashMap(){
		this.numOfBins=10;
		this.size=0;
		initializeMap();
	}
	
	//initialize the map to the size mentioned
	public HashMap(int bins){
		this.numOfBins=bins;
		this.size=0;
		initializeMap();
	}
	
	//initialize the map
	private void initializeMap(){
		myHashTable=new ArrayList<>();
		for(int i=0;i<numOfBins;i++){
			myHashTable.add(null);
		}
	}
	
	private int getIndex(K key){
		int hashCode=key.hashCode();
		return hashCode%numOfBins;
	}
	//size of the map
	public int sizeOfMap(){return size;}
	
	//if the map is empty or not check
	public boolean isEmpty(){ return size==0;}
	
	//add to the map
	public boolean add(K key, V val){
		int idx=getIndex(key);
		HashNode< K,V> head = myHashTable.get(idx);
		while(head!=null){
			if(head.isKey(key)){
				return false;
				}
			head=head.next();
		}
		size++;
		head=myHashTable.get(idx);
		HashNode<K,V> newNode = new HashNode<K,V>(key,val);
		newNode.setNext(head);
		myHashTable.set(idx, newNode);
		 if ((1.0*size)/numOfBins >= 0.7)
	        {
	            ArrayList<HashNode<K, V>> temp = myHashTable;
	            myHashTable = new ArrayList<>();
	            numOfBins = 2 * numOfBins;
	            size = 0;
	            for (int i = 0; i < numOfBins; i++)
	            	myHashTable.add(null);
	 
	            for (HashNode<K, V> headNode : temp)
	            {
	                while (headNode != null)
	                {
	                    add(headNode.getKey(), headNode.getValue());
	                    headNode = headNode.next();
	                }
	            }
	        }
		return true;
	}
	
	//delete from the map
	public boolean delete(K key){
		int idx=getIndex(key);
		HashNode< K,V> head = myHashTable.get(idx);
		HashNode<K,V> prev=null;
		while(head!=null){
			if(head.isKey(key))
				break;
			prev=head;
			head=head.next();
		}
		if(head==null)
			return false;
		
		if(prev!=null){
			HashNode<K,V> temp=head.next();
			prev.setNext(temp);
			}
		else
			myHashTable.set(idx, head.next());
		size--;
		return true;
	}
	
	//get the value of a particular key
	public V getValue(K Key){
		int idx = getIndex(Key);
		HashNode<K,V> head = myHashTable.get(idx);
		while(head!=null){
			if(head.isKey(Key))
				return head.getValue();
			head=head.next();
		}
		return null;
	}
	
	public boolean setValue(K Key, V val){
		int idx = getIndex(Key);
		HashNode<K,V> head = myHashTable.get(idx);
		while(head!=null){
			if(head.isKey(Key)){
				head.setValue(val);
				}
			head=head.next();
		}
		if(head==null)
			return false;
		return true;
	}
	//get all the keys present in the map
	/*public Enumeration<K> keys(){
		
	}
	
	//get all the elements present in the map
	public Enumeration<V> elements(){
		
	}*/
}
