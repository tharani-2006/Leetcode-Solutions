import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];
        Stack<Integer> st = new Stack<>();

        // Finding the left smaller index for every element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                leftSmall[i] = 0;
            } else {
                leftSmall[i] = st.peek() + 1;
            }
            st.push(i);
        }

        // Clear the stack to reuse it
        st.clear();

        // Finding the right smaller index for every element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                rightSmall[i] = n - 1;
            } else {
                rightSmall[i] = st.peek() - 1;
            }
            st.push(i);
        }

        // Calculate the area of each bar as the smallest bar
        int maxA = 0;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (rightSmall[i] - leftSmall[i] + 1);
            maxA = Math.max(maxA, area);
        }

        return maxA;
    }
}