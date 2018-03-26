import java.util.*;
public class JLInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Rahim");
		al.add("Amit");
		
		al.add("SHK");
		System.out.println(al.get(2));
		al.remove(2);
		al.add(1,"SHK");
		for(String obj:al)
		{
			
			System.out.println(obj);
			
		}
		
		
	}

}
