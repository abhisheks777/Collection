import java.util.*;
public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
	    pq.add("Anr");
		pq.add("Xy");
		pq.add("Bad");
		pq.add("Emf");
		pq.add("Yxz");
		pq.add("ghbde");
       
       // System.out.println( pq.element());
		System.out.println(pq);
		/*for(String obj:pq)
		{
		System.out.println(obj);	
		}*/
//		pq.poll();
//		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		
		
		

		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
	    pq1.add(1);
		pq1.add(2);
		pq1.add(3);
		pq1.add(4);
		pq1.add(5);
		pq1.add(6);
       
       // System.out.println( pq.element());
		System.out.println(pq1);
		
		pq1.remove();
		System.out.println(pq1);
		pq1.remove();
		System.out.println(pq1);
		pq1.remove();
		System.out.println(pq1);
	}

}
