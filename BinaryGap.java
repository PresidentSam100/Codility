// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
  // https://app.codility.com/programmers/trainings/9/binary_gap/
    public int solution(int N) {
        int ans = 0;
        boolean one = false;
        int temp = 0;
        while (N > 0) {
            if ((N & 1) == 1) {
                one = true;
                temp = 0;
            } else if (one) {
                temp++;
                ans = Math.max(temp, ans);
            }
            N >>= 1;
        }
        return ans;
    }
}
