package supervision1;

public class LowestCommon {

    public static int lowestCommon(long a, long b){
        int pos = 0;
        while (true){
            if (a == 0 || b == 0){
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
    }
}
