class Solution {
    fun removeElement(nums: IntArray, `vall`: Int): Int {

        //[1,5,7,3,9]

        val sizeNums = nums.size // 4

        var k = 0

        for ( i in 0 until sizeNums ) {
            if(nums[i] != vall ){
                nums[k] = nums[i]
                k++

            }
        }

        return k

    }
}