//Case 1: print 1,2,3,4,6,7,8,9,10
/*
 *  initlizaton st:  int i=1 
 *  conditional st:  i<=10
 *  incr st       :  i++ 
 */
 class Test {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            
        }
    }
    
}
