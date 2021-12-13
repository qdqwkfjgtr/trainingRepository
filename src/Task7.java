public class Task7 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if (n == 0 || n == 1 || n == 2)
            return n;
        int[] solution = new int[n + 1];
        solution[0] = 0;
        solution[1] = 1;
        solution[2] = 2;
        for (int i = 3; i <= n; i++) {
            solution[i] = solution[i - 1] + solution[i - 2];
        }
        return solution[n];
    }
}
