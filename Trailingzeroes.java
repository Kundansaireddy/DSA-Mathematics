public class Trailingzeroes {
    public static void main(String[] args) {
        int y = 6;
        int n = fact(y);
        int res=0;
        for(int i=5;i<=n;i*=5){
            res++;
        }
        System.out.println(res);

    }
    public static int fact(int n) {
        if(n==0 || n==1) return 1;
        else{
            int fact=1;
            while(n>0){
                fact*=n;
                n-=1;
            }
            return fact;
        }
    }
}
