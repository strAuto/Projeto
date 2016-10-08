package tpsistemastemporeal;
import java.util.*;

public class Node {
 
    int label = 0;
    ArrayList<Node> neighborhood = new ArrayList<Node>();
    int cost = 0;
    int[] position = new int[2];
    int goalDist;
    
    public void find_neighborhood(int[][] a, Node node){
        for(int i=node.position[0];i<a.length;i++){
            for(int j=node.position[1]; j<a[i].length; j++){
            }
        }
    }
}
