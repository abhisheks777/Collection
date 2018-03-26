import java.util.ArrayList;
import java.util.Iterator;  
class AL2{ 
	String name;
	int roll;
	
	AL2(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
		
		//System.out.println();
	}
 public static void main(String args[]){
	AL2 s1= new AL2("Abhi",5);
	AL2 s2= new AL2("A",6);
	
  ArrayList<AL2> list=new ArrayList<AL2>();  
  list.add(s1);  
  list.add(s2);  
    
  //Iterator itr=list.iterator();  
 /* while(itr.hasNext()){  
	  AL2 x=(AL2)itr.next();
   System.out.println(x.name+" "+x.roll);
  */
  //System.out.println();
  for( AL2 a:list) {
	  System.out.println(a.name+" "+a.roll);
  }  
 }  
}  