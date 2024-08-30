package GRAPH;

public class GraphRepresentationINMatrix {
    public static void main(String[] args) {

        // matrix representation
        int[][] graph = {
                {0,1,0,0,1},
                {1,0,1,0,1},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {1,1,0,1,0},
        };

GraphRepresentationInAdjancencyList g = new GraphRepresentationInAdjancencyList(5);

        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);


        g.printAdjList();
    }

}
