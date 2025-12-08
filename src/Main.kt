class Solution {
    fun canJump(nums: IntArray): Boolean {
        var record = 0

        for (i in 0 until nums.size) {

            if (i > record) {
                return false
            }

            val cherag = i + nums[i]

            if (cherag > record) {
                record = cherag
            }

            if (record >= nums.lastIndex) {
                return true
            }
        }

        return true
    }
}