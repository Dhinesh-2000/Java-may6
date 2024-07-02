import java.util.*;

class Test{
    public static void main(String[] args) {
        PriorityQueue<String> enames = new PriorityQueue<String>();
        enames.add("Rahul");
        enames.add("Priyanka");
        enames.add("Sonia");
        enames.add("Modi");
        enames.add("Pradosh");

        System.out.println(enames);

        enames.poll();
        System.out.println(enames);
    }
    

}