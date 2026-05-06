import java.util.*;

public class WordBreakMemo {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Map<String, Boolean> memo = new HashMap<>();
        return solve(s, set, memo);
    }

    private static boolean solve(String s, Set<String> set, Map<String, Boolean> memo) {
        if (s.length() == 0) return true;

        if (memo.containsKey(s)) return memo.get(s);

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);

            if (set.contains(prefix) && solve(s.substring(i), set, memo)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }

    public static void main(String[] args) {
        String s = "catsanddogs";
        List<String> wordDict = Arrays.asList("and", "dogs", "cats", "animals");

        System.out.println(wordBreak(s, wordDict)); // true
    }
}
