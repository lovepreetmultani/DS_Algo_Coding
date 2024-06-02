import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Transitive {
    public static void main(String[] args) {
        char[][] buys = {
                {'A', 'B'},
                {'B', 'C'}
        };
        int initialCount = 2;
        int result = transitiveBuysCount(initialCount, buys);
        System.out.println("Transitive buys count: " + result);
    }
    public static int transitiveBuysCount(int initialCount, char[][] buys) {
        Map<Character, Set<Character>> buyMap = new HashMap<>();
        for (char[] buy : buys) {
            buyMap.computeIfAbsent(buy[0], k -> new HashSet<>()).add(buy[1]);
        }
        Set<Character> uniqueBuys = new HashSet<>();
        dfs('A', buyMap, uniqueBuys, new HashSet<>());
        return uniqueBuys.size()-1;
    }

    public static void dfs(char current, Map<Character, Set<Character>> buyMap, Set<Character> uniqueBuys, Set<Character> visited) {
        if (!buyMap.containsKey(current) || visited.contains(current)) return;
        visited.add(current);
        for (char next : buyMap.get(current)) {
            uniqueBuys.add(next);
            dfs(next, buyMap, uniqueBuys, visited);
        }
    }
}




