/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SimPlog
 */
public class Model {
    Graph labyrinth;
    
    public Model()
    {
        labyrinth = new Graph();
    }
    
    public void erstelleLabyrinth()
    {
        Vertex m = new Vertex("m");
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");
        Vertex i = new Vertex("i");
        Vertex k = new Vertex("k");
        labyrinth.addVertex(m);
        labyrinth.addVertex(a);
        labyrinth.addVertex(b);
        labyrinth.addVertex(c);
        labyrinth.addVertex(d);
        labyrinth.addVertex(e);
        labyrinth.addVertex(f);
        labyrinth.addVertex(g);
        labyrinth.addVertex(h);
        labyrinth.addVertex(i);
        labyrinth.addVertex(k);
        labyrinth.addEdge(new Edge(m,a,1));
        labyrinth.addEdge(new Edge(a,b,1));
        labyrinth.addEdge(new Edge(a,e,1));
        labyrinth.addEdge(new Edge(b,c,1));
        labyrinth.addEdge(new Edge(c,d,1));
        labyrinth.addEdge(new Edge(c,e,1));
        labyrinth.addEdge(new Edge(c,h,1));
        labyrinth.addEdge(new Edge(1));
    }
        
    public void Tiefensuche()
    {
        
    }
    
    public void Breitensuche()
    {
        
    }
}
