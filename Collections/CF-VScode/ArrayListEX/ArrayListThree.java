import java.util.*;

public class ArrayListThree{
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Modi");
        enames.add("Priyanka");
        enames.add("Stalin");

        System.out.println(enames);
        // for(int i=0;i<=enames.size()-1;i++){
        //     System.out.println(enames.get(i));
        // }

        // for (String ename : enames) {
        //     System.out.println(ename);
        // }

         Iterator itr=enames.iterator();
         while (itr.hasNext()) {
            System.out.println(itr.next());
         }

       Collections.sort(enames);

       System.out.println(enames);


       Collections.sort(enames, Collections.reverseOrder());
       System.out.println(enames);

       Collections.shuffle(enames);
       System.out.println(enames);

    }
}