class Solution {
    fun removeDuplicates(nums: IntArray): Int {

        var k = 1
     for (i in 1 until nums.size - 1) {
         if (nums[i] != nums[i - 1]) {
             nums[k] = nums[i]
             k++
         }
     }
        return k
    }
}