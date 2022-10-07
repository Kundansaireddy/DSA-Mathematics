public class Lcm {
    public static void main(String[] args) {
        int a =4;
        int b=6;
        int lcm = (a*b)/gcd(a,b);
        System.out.println(lcm);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
