/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false;
            }
        seen.add(n);
        int sum =0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit;
            n=n/10;

        }
        n=sum;
        }
        return true;
        
        
    }
}
// @lc code=end

