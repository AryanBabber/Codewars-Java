public class Solution {
    public int solution(int number) {
        int s = 0;
        int l = 0;
        int r = number - 1;

        while (l < r) {
            if (l % 3 == 0 || l % 5 == 0) {
                s += l++;
            } else if (r % 3 == 0 || r % 5 == 0) {
                s += r--;
            } else {
                l++;
                r--;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}