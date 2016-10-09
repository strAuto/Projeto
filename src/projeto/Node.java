package tpsistemastemporeal;
import java.util.*;
import tpsistemastemporeal.Definitions;
public class Node {
 
    int label = 0;
    int cost = 0;
    int[] position = new int[2];
    
    public void find_neighborhood(Node[][] a, int rows, int cols,ArrayList<Node> path){
       int[] position_better_cost = new int[2];
       int cost = 9999;
       Definitions definitions = new Definitions();
       if(this.position[0] - 1 >= 0){           
           if ((!path.contains(a[this.position[0] - 1][this.position[1]])) 
                   && (definitions.inDefinition(this.label, a[this.position[0] - 1][this.position[1]].label))) {
                if(a[this.position[0] - 1][this.position[1]].cost < cost){
                    cost = a[this.position[0] - 1][this.position[1]].cost;
                    position_better_cost[0] = this.position[0] - 1;
                    position_better_cost[1] = this.position[1];
                }
           }
       } 
       if(this.position[0] + 1 < rows){
           if ((!path.contains(a[this.position[0] + 1][this.position[1]]))
                   && (definitions.inDefinition(this.label, a[this.position[0] + 1][this.position[1]].label))){
                if(a[this.position[0] + 1][this.position[1]].cost < cost){
                    cost = a[this.position[0] + 1][this.position[1]].cost;
                    position_better_cost[0] = this.position[0] + 1;
                    position_better_cost[1] = this.position[1];
                }
            }
       }
       if(this.position[1] - 1 >= 0){
           if ((!path.contains(a[this.position[0]][this.position[1] - 1]))
                   && (definitions.inDefinition(this.label, a[this.position[0]][this.position[1] - 1].label))){       
                if(a[this.position[0]][this.position[1] - 1].cost < cost){
                    cost = a[this.position[0]][this.position[1] - 1].cost;
                    position_better_cost[0] = this.position[0];
                    position_better_cost[1] = this.position[1] - 1;
                }
           }
       }
       if(this.position[1] + 1 < cols){
           if ((!path.contains(a[this.position[0]][this.position[1] +1]))
                   && (definitions.inDefinition(this.label, a[this.position[0]][this.position[1] + 1].label))){  
                if(a[this.position[0]][this.position[1] +1].cost < cost){
                    cost = a[this.position[0]][this.position[1] +1].cost;
                    position_better_cost[0] = this.position[0];
                    position_better_cost[1] = this.position[1] + 1;
                }
           }
       }
       path.add(a[position_better_cost[0]][position_better_cost[1]]);
       System.out.println("Proximo Passo " + position_better_cost[0] + "," + position_better_cost[1]);
    }
}
