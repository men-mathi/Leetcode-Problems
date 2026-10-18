
class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for (int p : prices) {
            int prevB1 = buy1;
            int prevS1 = sell1;
            int prevB2 = buy2;
            int prevS2 = sell2;

            buy1 = Math.max(prevB1, -p);
            sell1 = Math.max(prevS1, prevB1 + p);
            buy2 = Math.max(prevB2, prevS1 - p);
            sell2 = Math.max(prevS2, prevB2 + p);
        }

        return sell2;
    }
}
