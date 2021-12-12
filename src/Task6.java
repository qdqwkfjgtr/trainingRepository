public class Task6 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentResult=0;
        int result=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            currentResult += arr[i];
            result=Math.max(currentResult,result);
            if(currentResult<0)
                 currentResult=0;
        }
        System.out.println(result);
    }

}
