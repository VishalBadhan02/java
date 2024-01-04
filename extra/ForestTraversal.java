import java.util.*;

public class ForestTraversal {
    static List<Integer> smallestLexicographicalSequence(int n, int m, int[] a, int[] b) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            graph.computeIfAbsent(a[i], k -> new ArrayList<>()).add(b[i]);
            graph.computeIfAbsent(b[i], k -> new ArrayList<>()).add(a[i]);
        }

        for (List<Integer> neighbors : graph.values()) {
            neighbors.sort(Comparator.naturalOrder());
        }

        List<Integer> sequence = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        dfs(1, visited, sequence, graph);

        return sequence;
    }

    static void dfs(int node, boolean[] visited, List<Integer> sequence, Map<Integer, List<Integer>> graph) {
        visited[node] = true;
        sequence.add(node);

        List<Integer> neighbors = graph.get(node);
        if (neighbors != null) {
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    dfs(neighbor, visited, sequence, graph);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of nodes
        int m = scanner.nextInt(); // Number of edges

        int[] a = new int[m];
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        List<Integer> result = smallestLexicographicalSequence(n, m, a, b);
        System.out.println("Lexicographically smallest sequence of nodes:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}