package org.example;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    private int V;
    private LinkedList<Integer> adj[];

    App(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }
    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(v+" ");
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }
    void DFS(int v){
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);

    }
    public static void main(String[] str){
        App app = new App(4);
        app.addEdge(0,1);
        app.addEdge(0,2);
        app.addEdge(1,2);
        app.addEdge(2,0);
        app.addEdge(2,3);
        app.addEdge(3,3);
        app.DFS(2);
        System.out.println("Hello World");
    }
}
