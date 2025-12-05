class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val charkhesh = k % n

        reverse(nums, 0, n - 1)

        reverse(nums, 0, charkhesh - 1)

        reverse(nums, charkhesh, n - 1)
    }

    fun reverse(nums: IntArray, start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp

            left++
            right--
        }
    }
}