import java.util.*;

class Test{
    public static void main(String[] args) {
        LinkedHashSet<Integer> eids = new LinkedHashSet<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        eids.add(105);
        eids.add(null);
        System.out.println(eids);

        Iterator itr = eids.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



        
    }
    
}