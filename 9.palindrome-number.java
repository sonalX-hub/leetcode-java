/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int original=x;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;

        }
        return rev==original;

        
    }
}
// @lc code=end

