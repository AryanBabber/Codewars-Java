public class Solution {

    public static int signChange(int[] arr) {
        if(arr.length == 0) return 0;
        
        int count = 0;
        boolean flag = arr[0] > 0;

        for(int n : arr) {

            if((n >= 0 && !flag) || (n<0 && flag)) {
                flag = !flag;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(signChange(new int[] {-1, -3, -4, 0, 5}));
    }

}