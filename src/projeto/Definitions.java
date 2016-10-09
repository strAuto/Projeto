package tpsistemastemporeal;

import java.util.Arrays;

/*armazena as definicoes de cada ponto q se pode seguir no mapa
1 - Esquerda
2 - Direita
3 - Baixo
4 - Cima
5 - Placa de Pare
6 - Sinal Vermelho
7 - Sinal Verde
0 - Cruzamento
*/
public class Definitions {

    int[] definition_0 = {0,1,2,3,4,5,6,7};
    int[] definition_1 = {0,1,3,4,5,6,7};
    int[] definition_2 = {0,2,3,4,5,6,7};
    int[] definition_3 = {0,1,2,3,5,6,7};
    int[] definition_4 = {0,1,2,4,5,6,7};
    int[] definition_5 = {0,1,2,3,4,5,6,7};
    int[] definition_6 = {0,1,2,3,4,5,6,7};
    int[] definition_7 = {0,1,2,3,4,5,6,7};
    int[] definition_stop = {5,6,0};
    
    public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
    }
    
    public boolean stop(int label){
        if (contains(this.definition_stop,label))
            return true;
        else
            return false;
    }
    
    public boolean inDefinition(int label, int label_comparision){
        if ((label == 0) && (contains(this.definition_0,label_comparision)))
            return true;
        else if ((label == 1) && (contains(this.definition_1,label_comparision)))
            return true;
        else if((label == 2) && (contains(this.definition_2,label_comparision)))
            return true;
        else if((label == 3) && (contains(this.definition_3,label_comparision)))
            return true;
        else if((label == 4) && (contains(this.definition_4,label_comparision)))
            return true;
        else if((label == 5) && (contains(this.definition_5,label_comparision)))
            return true;
        else if((label == 6) && (contains(this.definition_6,label_comparision)))
            return true;
        else if((label == 7) && (contains(this.definition_7,label_comparision)))
            return true;
        else
            return false;
           
    }
}
