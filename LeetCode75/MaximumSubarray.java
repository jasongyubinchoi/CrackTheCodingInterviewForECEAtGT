/*  For GT ECE student, if you already take CS1332, this problem can be solved with DP(dynamic programming).
*   For this problem, people usually use dynamic programming, but I didn't learn the concept yet,
*   I solved this problem without using DP concept.
*   Let's simply think two process.
*
*   For example, we have input array [-2, 2,  5, -11, 6] and the current sum and max are initialized with the first element.
*   1. If the new element is bigger than the sum of current sum and the new element, we always start over with the the new element.
*   If we are on the index 1, the new element is 2 and the sum of current sum and the new element is [-2, 2] = 0.
*   Since 2 is bigger than the sum of current sum and the new element, we update the current sum with the newelement 2.
*   2. After updating the current sum, we update the max by comparing max value and the current sum.
*   If the current sum (local sum) is smaller than the max, we keep the old max value. Otherwise, update max.
*/


public class MaximumSubarray {
    public maxSubarray((int[] nums)) {
         int current_sum = nums[0];
         int max = current_sum;
         for (int i = 0; i < nums.length; i++) {
             current_sum = Math.max(current_sum + nums[i], nums[i]);
             max = Math.max(current_sum, max);
         }
         return max;
    }
    public static void main(String[] args) {

        }
    }
}

