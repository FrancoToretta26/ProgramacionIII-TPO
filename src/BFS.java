import java.util.*;

public class BFS {

    public static void bfs(Grafo G, int origen) {
        int[] marca = new int[G.obtenerVertices().size()];
        int[] d = new int[G.obtenerVertices().size()];
        int[] p = new int[G.obtenerVertices().size()];

        for (Integer u : G.obtenerVertices()) {
            if(u!=origen) {
                u = u-1;
                marca[u] = 0;
                d[u] = Integer.MAX_VALUE;
                p[u] = -1;
            }
        }

        marca[origen-1] = 1;
        d[origen-1] = 0;
        p[origen-1] = -1;

        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(origen-1);

        while(!Q.isEmpty()) {
            int u = Q.poll();

            for (Arista<Integer> arista : G.obtenerAristas(u+1)) {
                int v = arista.getDestino();
                if (marca[v-1] == 0) {
                    marca[v-1] = 1;
                    p[v-1] = u+1;
                    d[origen-1] = d[u] + 1;
                    Q.add(v-1);
                }
            }

            marca[u] = 2;
            System.out.println(u+1);
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        //Agregar Vertices
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);
        grafo.agregarVertice(7);
        grafo.agregarVertice(8);


        // Agregar aristas con rótulos
        grafo.agregarAristaConRotulo(1, 2, 5); // 1
        grafo.agregarAristaConRotulo(2, 4, 10); // 2
        grafo.agregarAristaConRotulo(1, 3, 40); // 3
        grafo.agregarAristaConRotulo(3, 5, 10); // 5
        grafo.agregarAristaConRotulo(3, 7, 5); // 6
        grafo.agregarAristaConRotulo(5, 7, 5); // 7
        grafo.agregarAristaConRotulo(5, 8, 20); // 8
        grafo.agregarAristaConRotulo(7, 8, 20); // 9
        grafo.agregarAristaConRotulo(8, 6, 10); // 10
        grafo.agregarAristaConRotulo(6, 7, 10); //

        bfs(grafo, 1);

    }
}
