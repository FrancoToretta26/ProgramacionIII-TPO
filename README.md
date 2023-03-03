# ProgramacionIII-TPO

En este TP se implementan 3 algoritmos conocidos de grafos.

Dos de ellos cuyo objetivo es el de descubrir la totalidad de un grafo. 

### -    BFS (Breadth First Search)
Algoritmo de recorrido en anchura que explora los vértices de un grafo parámetro a partir de un origen parámetro.
De esta manera logra descubrir la totalidad del grafo a partir de la búsqueda de vértices adyacentes desde de origen y con la estrategia de marcarlos en blanco (0), gris(1) o negro (2) dependiendo de si los mismos fueron, no visitados, descubiertos o visitados los cuales son almacenados temporalmente en una cola.
También se utilizan 3 arrays para llevar un registro de cada vértice:

- Marca[] Indica el estado
- D[] Indica la distancia 
- P[] Indica el padre

Finalmente se genera un output indicando el recorrido realizado por el algoritmo.

La implementación entregada del algoritmo BFS incluye un caso de prueba para su rápido testeo con el grafo dado a continuación:
![image](https://user-images.githubusercontent.com/68798898/222609812-f5aae68f-072a-4780-b7e0-aab2201fb1f2.png)

### Output
`` 1,2,3,4,5,7,8,6``

### -    DFS (Depth First Search)

Segundo algoritmo implemetando de recorrida de grafos el cual se basa en recorrer la estructura en profundidad, para esto se utiliza una técnica recursiva implementada en la función dfsRecursivo() la cual recibe como parámetros:
 - Integer verticeActual
 - Set<Integer> visitados
 - Grafo grafo

  La función recorre a los vértices adyacentes, al vertice actual y por cada recursión imprime en consola el vértice visitado de forma secuencial.

La implementación entregada del algoritmo DFS incluye un caso de prueba para su rápido testeo con el grafo dado a continuación:
![image](https://user-images.githubusercontent.com/68798898/222610725-89043b21-f9a6-42f8-86f8-17f6d5e2f6f5.png)

### Output
`` 1,2,4,3,5,6``
