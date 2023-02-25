package unit_1;
import java.util.HashMap;
public class Map {
   public static void main(String[]args) {
	   HashMap<Integer,String> ll=new HashMap<Integer,String>();
	   
	   ll.put(1,"Jack");
	   ll.put(2,"Ram");
	   ll.put(3,"Jay");
	   ll.put(4,"Joy");
	   System.out.println(ll);
	   
	   System.out.println(ll.get(3));
	   
	   ll.remove(3);
	   System.out.println(ll);
	   
	   ll.clear();
	   System.out.println(ll);
	  
   }
}
