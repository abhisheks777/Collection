import java.util.*;
enum days{
	
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class Enumset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<days> x=EnumSet.of(days.SUNDAY,days.FRIDAY);
		
		for(days obj:x)
		{
			
			System.out.println(obj);
		}

	}

}
