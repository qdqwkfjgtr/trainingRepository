import java.util.*;

import static java.util.Arrays.asList;

public class Task8 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        int[] result=new int[n+m];
        result=(mergeArrays(nums1,m,nums2,n));
        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted1 = new int[m];
        int[] sorted2 = new int[n];
        int[] result = new int[n + m];
        int x=0;
        for (int i = 0; i < m; i++) {
            sorted1[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            sorted2[i] = nums2[i];
        }
        for (int i = 0; i < n ; i++) {
            result[i] = sorted1[i];
        }
            for (int i = m; i < m+n ; i++) {
                result[i] = sorted2[x];
                x++;
            }
            Arrays.sort(result);

        return result;

        }

    }
