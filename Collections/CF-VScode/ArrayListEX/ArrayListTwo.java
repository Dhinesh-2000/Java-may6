import java.util.List;
import java.util.ArrayList;

public class ArrayListTwo{
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
        for (String ename : enames) {
            System.out.println(ename);
        }
        enames.set(1, "Sonia Gandhi");
        System.out.println(enames);
        enames.remove(4);
        System.out.println(enames);

    }
}