package tugas_3;
import java.util.*;

public class DFSGraph {
    static Map<String, List<String>> graph = new HashMap<>();
    static Set<String> visited = new HashSet<>();

    public static void main(String[] args){
        //Inisialisi Graph
        graph.put("a1", List.of("a2","a3"));
        graph.put("a2", List.of("a1","a4"));
        graph.put("a3", List.of("a1","a5"));
        graph.put("a4", List.of("a2","a6"));
        graph.put("a5", List.of("a3","a7"));
        graph.put("a6", List.of("a4","a7"));
        graph.put("a7", List.of("a6","a5"));

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan node awal: ");
        String target = input.nextLine();

        System.out.println("Proses Pencarian, dimulai dari node a1");
        if(!dfs("a1", target)){
            System.out.println("Node "+ target + " tidak ditemukan");
        }

    }

    static boolean dfs(String current, String target){
        System.out.println("Mengunjungi: " + current );

        if(current.equals(target)){
            System.out.println("Nilai Ditemukan: "+ target);
            return true;
        }

        visited.add(current);

        for(String next: graph.getOrDefault(current, List.of())){
            if(!visited.contains(next)){
                if(dfs(next, target)){
                    return true;
                }
            }
        }
        return false;
    }

}
