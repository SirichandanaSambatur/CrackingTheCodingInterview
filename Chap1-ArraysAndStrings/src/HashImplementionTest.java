
public class HashImplementionTest {
	 public static void main(String[] args)
	    {
	        HashMap<String, Integer>map = new HashMap<>();
	        map.add("this",1 );
	        map.add("coder",2 );
	        map.setValue("this",4 );
	        System.out.println(map.getValue("this"));
	        map.add("hi",5 );
	        System.out.println(map.sizeOfMap());
	        System.out.println(map.delete("this"));
	        System.out.println(map.delete("this"));
	        System.out.println(map.sizeOfMap());
	        System.out.println(map.isEmpty());
	    }
}

