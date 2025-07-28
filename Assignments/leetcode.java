package Assignments;

class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,temp,n;
        n=x;
        while(n>0){
            temp=n%10;
            sum=10*sum+temp;
            n/=10;
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
}