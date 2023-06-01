class Solution {
    public int reverse(int x) {
        
        long reverse = 0;

        boolean negative = false;
        if(x<0){
            x = x * -1;
            negative =true;
        }

        while(x>0){
           reverse = reverse*10 +(x%10);
            x/=10;
        }
        if(reverse > Integer.MAX_VALUE) return 0;
        if(negative){
            return (int) reverse * -1 ;
        }

        return (int)reverse;
    }
}