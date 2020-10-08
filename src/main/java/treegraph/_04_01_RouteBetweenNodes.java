package treegraph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a directed graph, design an algorithm to find out whether
 * there is a route between two nodes.
 */
class _04_01_RouteBetweenNodes {

    private final Digraph digraph;

    _04_01_RouteBetweenNodes(Digraph digraph) {
        this.digraph = digraph;
    }

    boolean hasRoute(int source, int target) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(source);
        while (!q1.isEmpty()) {
            int curr = q1.remove();
            for (Integer neigh: digraph.adjacent(curr)) {
                if (neigh == target) {
                    return true;
                }
                q1.add(neigh);
            }
        }
        return false;
    }

}
