public class Demo2 {
    public static void main(String[] args) {
        String day="Monday";
        String result ="";

        result=switch (day) {
            // case "Saturday","Sunday":
            //    System.out.println("6am"); 
            //     break;
            // case "Monday":
            //    System.out.println("8am");
            //    break;
            // default:
            //     System.out.println("7am");
            //     break;
            case "Saturday","Sunday" -> "6am";
            case "Monday"-> "8am";
            default -> "7am";
        };
        System.out.println(result);
    }
}
