import kotlin.math.min

class Solution {
    fun maxProfit(prices: IntArray): Int {
       var minPrice = Int.MAX_VALUE
        var maxPrice = 0
        minPrice = prices[0]
        for (i in prices.indices) {

            if (prices[i] < minPrice) {
                minPrice = prices[i]
            }else if (prices[i]- minPrice > maxPrice) {
                maxPrice = prices[i] - minPrice
            }
        }

        return maxPrice
    }
}