import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] dig = new int[]{1,2,9};

        int[] result = new int[3];
        result = Solution.plusOne(dig);
        System.out.println(Arrays.toString(result));

    }

    class Solution {
        public static int[] plusOne(int[] digits) {
            int n = digits.length;
            for (int i = n-1; i>=0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i]=0;
            }
            int[] newDigits=new int[n+1];
            newDigits[0]=1;

            return newDigits;
        }
    }
}

