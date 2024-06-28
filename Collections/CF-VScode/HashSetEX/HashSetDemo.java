import java.util.*;
class HashSetDemo{
    public static void main(String[] args) {
        HashSet h1=new HashSet();
        Set h2 = new HashSet();
        Set<Integer> eids =new HashSet<Integer>();

        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        eids.add(105);
        eids.add(106);


        System.out.println(h1);
        System.out.println(h2);
        System.out.println(eids);

        for (Integer eid : eids) {
            System.out.println(eid);
        }

        Iterator itr=eids.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}