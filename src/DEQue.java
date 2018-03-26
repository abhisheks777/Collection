  /*  import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;  
    public class DEQue {  
       public static void main(String[] args) {  
       //Creating Deque and adding elements  
       Deque<String> deque = new ArrayDeque<String>();  
       deque.add("Ravi");    
       deque.add("Vijay");     
       deque.add("Ajay");    
       //Traversing elements  
       System.out.println(deque);
       for (String str : deque) {  
       System.out.println(str);  
       }  
       System.out.println(deque.remove());
       System.out.println(deque);
       
       }  
    }*/
    import java.util.*;  
    public class DEQue {  
    public static void main(String[] args) {  
        Deque<String> deque=new ArrayDeque<String>();  
        deque.offer("arvind");  
        deque.offer("vimal");  
        deque.add("mukul");  
        deque.offerLast("jai");  
        System.out.println("After offerFirst Traversal...");  
        for(String s:deque){  
            System.out.println(s);  
        }  
        //deque.poll();  
        //deque.pollFirst();//it is same as poll()  
        deque.pollLast();  
        System.out.println("After pollLast() Traversal...");  
        for(String s:deque){  
            System.out.println(s);  
        }  
    }  
    }  