package supervision1;


public class TailRecursion{
    public static int findLength(String l, int cnt){
        if (l.equals("")){
            return cnt;
        }
        else{
            return findLength(l.substring(1),++cnt);
        }
    }

    public static void main(String[] args) {
        String myString = "apple";
        int res = findLength(myString,0);
        System.out.println(res);
    }
}