import java.util.*;
public class HashMapBookExample {
	
	
	
	String name;
	int id;
	int price;
	
	HashMapBookExample(String name,int id,int price){
		
		this.name=name;
		this.id=id;
		this.price=price;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapBookExample s=new HashMapBookExample("Abhbui",10,1000);
		HashMapBookExample s1=new HashMapBookExample("Bbhbui",13,2000);
		HashMapBookExample s2=new HashMapBookExample("Zbhbui",12,1000);
		HashMapBookExample s3=new HashMapBookExample("Kbhbui",12,4000);
		HashMapBookExample s4=new HashMapBookExample("Fbhbui",15,6000);
		HashMapBookExample s5=new HashMapBookExample("Gbhbui",10,1000);
		
		HashMap<Integer,HashMapBookExample> x=new HashMap<Integer,HashMapBookExample>();
		
		x.put(1, s);
		x.put(2, s1);
		x.put(3, s2);
		x.put(4, s3);
		x.put(5, s4);
		x.put(6, s5);
		for(Map.Entry<Integer, HashMapBookExample> entry:x.entrySet())
		{
			 HashMapBookExample b=entry.getValue();
			System.out.println("description of"+entry.getKey()+"Book");
			System.out.println(b.name+" "+b.id+" "+b.price);
		}
		
	}

}
