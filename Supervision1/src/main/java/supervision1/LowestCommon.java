package supervision1;

public class LowestCommon {

    public static int lowestCommon(long a, long b){
        int pos = 0;
        String as = Long.toBinaryString(a);
        String bs = Long.toBinaryString(b);
        while (true){
            if (as.isEmpty()|| bs.isEmpty()) {
                break;
            }
            else if (as.charAt(as.length()-1)==bs.charAt(bs.length()-1)){
                return pos;
            }
            else {
                as = as.substring(0,as.length()-1);
                bs = bs.substring(0,bs.length()-1);
                pos ++;
            }
        }
        return -1;
        /* // previous method has not deal with negative numbers
        while (true){
            if (a == 0 && b == 0){
                return pos;
            }
            else if (a == 0 || b == 0){
                break;
            }
            else if (a % 2 == b % 2){
                return pos;
            }
            else{
                a /= 2;
                b /= 2;
                pos ++;
            }
        }
        return -1;
        */
    }
}
