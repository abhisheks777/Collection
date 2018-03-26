import java.util.*;
public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> x=new ArrayDeque<String>();
		
		x.add("A1");
		x.add("1S");
		x.add("Ca");
		x.add("H1");
		for(String a:x)
		{
			
			System.out.println(a);
			
		}
		x.add("ahbhg");
		System.out.println(x);
		
		

	}

}
