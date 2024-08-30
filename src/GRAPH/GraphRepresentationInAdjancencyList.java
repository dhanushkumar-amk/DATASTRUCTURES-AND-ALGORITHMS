package GRAPH;

import java.util.ArrayList;

public class GraphRepresentationInAdjancencyList{
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

        GraphRepresentationInAdjancencyList(int v){
            for (int i = 0; i < v; i++) {
                adjlist.add(new ArrayList<Integer>());

            }
        }
        public  void addEdge(int u, int v){
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }

        public  void printAdjList(){
            for (int i = 0; i <adjlist.size() ; i++) {
                System.out.print("Adj of list " + i );
                for (int j = 0; j <adjlist.get(i).size() ; j++) {
                    System.out.print(" " + adjlist.get(i).get(j));
                }
            }
        }
    }

