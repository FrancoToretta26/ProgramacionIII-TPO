import java.util.*;

public class Dijkstra {
    public static int[] dijkstra(Grafo g, int s) {
        int[] D = new int[g.obtenerVertices().size() + 1];
        int[] P = new int[g.obtenerVertices().size() + 1];
        boolean[] visitado = new boolean[g.obtenerVertices().size() + 1];
        PriorityQueue<Integer> Q = new PriorityQueue<Integer>(g.obtenerVertices().size(), new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return D[a] - D[b];
            }
        });

        for (Integer v : g.obtenerVertices()) {
            D[v] = Integer.MAX_VALUE;
            P[v] = -1;
            visitado[v] = false;
        }

        D[s] = 0;

        Q.add(s);

        while (!Q.isEmpty()) {
            int u = Q.poll();
            visitado[u] = true;
            for (Arista<Integer> a : g.obtenerAristas(u)) {
                int v = a.getDestino();
                int w = a.getRotulo();
                if (!visitado[v] && D[v] > D[u] + w) {
                    D[v] = D[u] + w;
                    P[v] = u;
                    Q.add(v);
                }
            }
        }

        return D;
    }


    public static void main(String[] args) {
        Grafo g = new Grafo();

        g.agregarVertice(1);
        g.agregarVertice(2);
        g.agregarVertice(3);
        g.agregarVertice(4);
        g.agregarVertice(5);
        g.agregarVertice(6);


        g.agregarAristaConRotulo(1, 6, 5);
        g.agregarAristaConRotulo(1, 3, 40);
        g.agregarAristaConRotulo(1, 5, 10);
        g.agregarAristaConRotulo(6, 2, 20);
        g.agregarAristaConRotulo(6, 5, 10);
        g.agregarAristaConRotulo(5, 4, 20);
        g.agregarAristaConRotulo(2, 4, 5);
        g.agregarAristaConRotulo(4, 3, 5);
        g.agregarAristaConRotulo(3, 2, 10);
        g.agregarAristaConRotulo(3, 5, 5);



        int[] camino = dijkstra(g, 1);

        // Se imprime camino mas corto desde el vertice 1 a todos los demas vertices
        for (int i = 1; i < camino.length; i++) {
            System.out.println("Camino mas corto desde 1 a " + i + " = " + camino[i]);
        }
    }

}
