// 9. Palindrome Number 

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false; 
        else 
        {
            long rev = 0; 
            int org = x; 

            while(x != 0) 
            {
                rev = rev * 10 + (x % 10); 
                x = x / 10; 
            }

            return rev == org;
        }
    }
}

