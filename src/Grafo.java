import java.util.*;

public class Grafo{

    public static Map<Integer, List<Arista<Integer>>> adyacencia;

    public Grafo() {
        adyacencia = new HashMap<>();
    }

    public void agregarVertice(Integer vertice) {
        adyacencia.put(vertice, new ArrayList<>());
    }

    public List<Integer> obtenerVertices() {
        List<Integer> vertices = new ArrayList<>();
        for (Integer vertice : adyacencia.keySet()) {
            vertices.add(vertice);
        }
        return vertices;
    }

    public void agregarAristaConRotulo(Integer origen, Integer destino, Integer rotulo) {
        Arista<Integer> arista = new Arista<>(origen, destino, rotulo);
        adyacencia.get(origen).add(arista);
    }

    public static List<Arista<Integer>> obtenerAristas(Integer vertice) {
        return adyacencia.get(vertice);
    }



}
