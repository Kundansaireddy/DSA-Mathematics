public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        if(n==0 || n==1) System.out.println(1);
        else{
            int fact=1;
            while(n>0){
                fact*=n;
                n-=1;
            }
            System.out.println(fact);
        }
    }
}
