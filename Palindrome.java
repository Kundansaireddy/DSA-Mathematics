public class Palindrome {
    public static void main(String[] args) {
        int n = 76967;
        int rev=0;
        int temp = n;
        while(n>0){
            rev = (rev*10)+(n%10);
            n/=10;
        }
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
