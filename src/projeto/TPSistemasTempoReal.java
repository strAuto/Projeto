package tpsistemastemporeal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TPSistemasTempoReal {

    public static void main(String[] args) {
        try{
            ArrayList<Node> path = new ArrayList<Node>();
            int rows = 0, columns = 0;
            int[] start_finish_nodes = new int[4];
            //carregando o mapa, primeiros numeros sao o tamanho da matriz e os pontos de origem e destino
            Scanner input = new Scanner (new File("C:\\caminho_entrada.txt"));
            rows = input.nextInt();
            columns = input.nextInt();
            Node a[][] = new a[rows][columns];
            Node teste = new Node();
            teste.cost = 9;
            for(int k= 0; k< 4; k++)
                start_finish_nodes[k] = input.nextInt();
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){                    
                    a[i][j].label = input.nextInt();
                    a[i][j].cost = input.nextInt();
                }
            }
            Node start = new Node();
            Node finish = new Node();

            start = a[start_finish_nodes[0]][start_finish_nodes[1]];
            start.position[0] = start_finish_nodes[0];
            start.position[1] = start_finish_nodes[1];
            
            finish = a[start_finish_nodes[2]][start_finish_nodes[3]];
            finish.position[0] = start_finish_nodes[2];
            finish.position[1] = start_finish_nodes[3];
            input.close();
            
            path.add(start);
            int indice_path = 0;
            while (!(path.contains(finish))){
              //  path.get(0).findneig
            }                       
        }    
        catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }       
    }
}
