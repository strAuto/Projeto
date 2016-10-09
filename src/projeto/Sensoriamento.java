package tpsistemastemporeal;
import java.util.ArrayList;

public class Sensoriamento {
    
    public boolean podeProsseguir(ArrayList<Node> path, int indexlist){
        Definitions definitions = new Definitions();
        if(definitions.stop(path.get(indexlist+1).label)){
            System.out.println("Pare");
            return false;
        }            
        else{
            System.out.println("Pode prosseguir");
            return true;
        }
    }
}
