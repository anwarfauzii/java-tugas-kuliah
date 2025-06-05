package tugas_3;
import java.util.*;

public class BFSGraph {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        // Inisialisi Graph
        graph.put("a1", List.of("a2", "a3"));
        graph.put("a2", List.of("a1", "a4"));
        graph.put("a3", List.of("a1", "a5"));
        graph.put("a4", List.of("a2", "a6"));
        graph.put("a5", List.of("a3", "a7"));
        graph.put("a6", List.of("a4", "a7"));
        graph.put("a7", List.of("a6", "a5"));

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan node awal: ");
        String target = input.nextLine();

        System.out.println("Proses Pencarian, dimulai dari node a1");

        boolean ditemukan = bfs(graph, "a1", target);
        if (ditemukan) {
            System.out.println("Node " + target + " ditemukan");
        } else {
            System.out.println("Node " + target + " tidak ditemukan");
        }
    }
    public static boolean bfs(Map<String, List<String>> graph, String start, String target) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Mengunjungi: " + current);

            if (current.equals(target)) {
                return true;
            }
            for (String next : graph.getOrDefault(current, List.of())) {
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
        }
        return false;
    }
}
