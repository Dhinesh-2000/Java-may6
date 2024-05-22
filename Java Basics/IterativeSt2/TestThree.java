 //break - stop the iteration and come out from block/loop
 class Test {
    public static void main(String[] args) {
        int[] prices={9,99,199,299,399,499,599,699,799,899};

        for (int price : prices) {
            if (price>500) {
                break;
                
            }
            System.out.println(price);
            
        }
    }
    
}
