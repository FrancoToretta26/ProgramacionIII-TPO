import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFS {

    public static void dfs(Grafo grafo) {
        // Implementamos un conjunto para ir ingresando los vertices ya visitados (Grises)
        Set<Integer> visitados = new HashSet<>();
        for (Integer vertice : grafo.obtenerVertices()) {
            if (!visitados.contains(vertice)) {
                dfsRecursivo(vertice, visitados, grafo);
            }
        }
    }

    private static void dfsRecursivo(Integer verticeActual, Set<Integer> visitados, Grafo grafo) {
        visitados.add(verticeActual);
        System.out.print(verticeActual + " ");

        List<Arista<Integer>> aristas = grafo.obtenerAristas(verticeActual);
        for (Arista<Integer> arista : aristas) {
            Integer destino = arista.getDestino();
            if (!visitados.contains(destino)) {
                dfsRecursivo(destino, visitados, grafo);
            }
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);

        grafo.agregarAristaConRotulo(1, 2, 10);
        grafo.agregarAristaConRotulo(2, 4, 20);
        grafo.agregarAristaConRotulo(1, 3, 30);
        grafo.agregarAristaConRotulo(3, 2, 30);
        grafo.agregarAristaConRotulo(4, 3, 30);
        grafo.agregarAristaConRotulo(5, 4, 30);
        grafo.agregarAristaConRotulo(5, 6, 30);
        grafo.agregarAristaConRotulo(6, 6, 30);


        dfs(grafo);
    }
}
