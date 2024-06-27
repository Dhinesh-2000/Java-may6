import java.util.*;
class LinkedListOne{
    public static void main(String[] args) {
      LinkedList<String> enames=new LinkedList();
      //System.out.println(enames);
      enames.add("Rahul");
      enames.add("Sonia");
      enames.add("Priyanka");
      enames.add("Modi");
      enames.add("Pradosh");

     //to find the size/ length of linkedlist
      System.out.println(enames.size());

      //to verify given LL is empty or not
      System.out.println(enames.isEmpty());

      //to get LL element-get method
      System.out.println(enames.get(1));

      Iterator itr=enames.iterator();
      while (itr.hasNext()) {
        System.out.println(itr.next());
      }

      Collections.sort(enames);
      System.out.println(enames);

      Collections.sort(enames,Collections.reverseOrder());
      System.out.println(enames);

      Collections.shuffle(enames);
      System.out.println(enames);

    }
}