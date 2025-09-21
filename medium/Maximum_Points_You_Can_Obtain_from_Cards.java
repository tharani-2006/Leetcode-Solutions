class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i = 0;
        int tot = 0;

        // Fixed: use cardPoints instead of undefined 'nums'
        for (int num : cardPoints) {
            tot += num;
        }

        int left = 0;
        int sum = 0;
        int n = cardPoints.length - k;

        // First window of size n (i.e., the number of cards NOT taken)
        while (i < n) {
            sum += cardPoints[i];
            i++;
        }

        int minSum = sum;

        // Sliding the window from position i to end
        while (i < cardPoints.length) {
            sum += cardPoints[i] - cardPoints[left];
            minSum = Math.min(minSum, sum);
            i++;
            left++;
        }

        return tot - minSum;
    }
}