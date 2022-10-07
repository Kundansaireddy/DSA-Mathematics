import java.lang.Math;
public class Countdigits {
    public static void main(String[] args) {
        int n = 106;
        int res=0;
        while(n>0){
            res++;
            n/=10;
        }
        System.out.println(res);
    }
}
