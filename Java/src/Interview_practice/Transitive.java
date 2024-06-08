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
        var initialCount = 2;
        var result = transitiveBuysCount(initialCount, buys);
        System.out.println("Transitive buys count: " + result);
    }
    public static int transitiveBuysCount(int initialCount, char[][] buys) {
        var buyMap = new HashMap<Character, Set<Character>>();
        for (var buy : buys) {
            buyMap.computeIfAbsent(buy[0], k -> new HashSet<>()).add(buy[1]);
        }
        var uniqueBuys = new HashSet<Character>();
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




