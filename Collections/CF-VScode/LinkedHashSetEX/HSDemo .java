import java.util.*;

class Test{
    public static void main(String[] args) {
        HashSet<Integer> eids = new HashSet<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        eids.add(105);
        eids.add(null);
        eids.add(null);
        System.out.println(eids);
    }
}