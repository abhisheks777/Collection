import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String> x=new HashMap<Integer,String>();
		x.put(4, "uhuihuh");
		x.put(3, "Anjkndie");
		x.put(5, "Krrish");
		x.put(5, "Krrish");
		x.put(6,"Krrish");
		
		System.out.println(x);
		for(Map.Entry m:x.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//System.out.println(x.keySet());
		
		
		

	}

}
