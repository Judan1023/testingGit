package unit_1;
import java.util.HashMap;
public class Map {
   public static void main(String[]args) {
	   HashMap<Integer,String> ll=new HashMap<Integer,String>();
	   
         ll.put(0,"this");
	   ll.put(1,"Jack");
	   ll.put(17,"Floid");
	   ll.put(3,"Jay");
	   
	   System.out.println(ll);
	   
	   System.out.println(ll.get(3));
	   
	   ll.remove(3);
	   System.out.println(ll);
	   
	   ll.clear();
	   System.out.println(ll);
	  
   }
}

