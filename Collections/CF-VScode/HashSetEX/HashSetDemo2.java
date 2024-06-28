import java.util.*;
public class HashSetDemo2 {

    public static void main(String[] args) {
       Set<Integer> s1 =new HashSet<Integer>();
       s1.add(10);
       s1.add(20);
       s1.add(30);
       s1.add(40);
       
       Set<Integer> s2  =new HashSet<Integer>();

       s2.add(30);
       s2.add(40);
       s2.add(50);
       s2.add(60);
       s1.addAll(s2);
       System.out.println(s1);

       s1.retainAll(s2);
       System.out.println(s1);

       




    }

    
}
