import java.util.*;
public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(18928);
		al.add(765);
		al.add(76769);
		System.out.println(al);
		Collections.addAll(al,777778,883928);
        System.out.println(al);		
		
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));

	}

}
