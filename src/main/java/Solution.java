import java.util.*;

public class Solution {
    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= n / i; i++) {
            if (i * i <= n) {
                squares.add(i * i);
            }
        }
        Map<Integer, Integer> memo = new HashMap<>();
        return dfs(squares, n, memo);
    }

    private int dfs(List<Integer> squares, int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MAX_VALUE / 2;
        }
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < squares.size(); i++) {
            result = Math.min(result, dfs(squares, n - squares.get(i), memo) + 1);

        }
        memo.put(n, result);
        return result;
    }
}
