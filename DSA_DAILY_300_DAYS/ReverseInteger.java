package DSA_DAILY_300_DAYS;

public class ReverseInteger {
    public static void main(String[] args) {

        /*
         Given a signed 32-bit integer x, return x with its digits reversed.
         If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
         then return 0.
        
        */
        int num=reverse(1534236469);//outside the range
        System.out.println(num);
    }
    public static int reverse(int x) {
       // if(x<10) return x;

        int num=0;
        while(x!=0){
            int rem=x%10;
             if (num > Integer.MAX_VALUE / 10 || num < Integer.MIN_VALUE / 10) {
            return 0;
        }
            num=num*10+rem;
            x=x/10;
        }

        return num;
    }
}
