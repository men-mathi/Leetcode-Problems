class Solution {
    public boolean isPalindrome(int x) {
        int original=x;int rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int digit=x%10;
           // if(rev>(Integer.MAX_VALUE -digit)/10){
           //     return false;
           // }
            rev=rev*10+digit;
            x/=10;
        }
        return original==rev;
    }
}