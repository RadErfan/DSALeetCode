class Solution {
    fun majorityElement(nums: IntArray): Int {



      var  padeshah = nums[0]
      var  count = 1

        for (i in 1 until nums.size) {
            if (nums[i]!=padeshah) {
                count--
            }else{
                count++
            }
            if (count ==0){
                padeshah = nums[i]
                count = 1
            }





        }
        return padeshah
    }
}