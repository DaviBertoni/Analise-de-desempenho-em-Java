import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000};
        Random random = new Random();

        for (int tamanho : tamanhos) {
            int[] dadosAleatorios = random.ints(tamanho, 0, 10000).toArray();
            int[] dadosOrdenados = Arrays.copyOf(dadosAleatorios, dadosAleatorios.length);
            Arrays.sort(dadosOrdenados);
            int[] dadosInversamenteOrdenados = Arrays.copyOf(dadosOrdenados, dadosOrdenados.length);
            for (int i = 0; i < dadosOrdenados.length / 2; i++) {
                int temp = dadosInversamenteOrdenados[i];
                dadosInversamenteOrdenados[i] = dadosInversamenteOrdenados[dadosOrdenados.length - i - 1];
                dadosInversamenteOrdenados[dadosOrdenados.length - i - 1] = temp;
            }
            
            System.out.println("--------------------------------------------------------------------------------");            
            System.out.println("\nTamanho do conjunto de dados: " + tamanho + "\n");
            
            // Testar Vetor
            System.out.println(">>> Vetor <<<");
            Vetor vetor = new Vetor();
            InsercaoVetor.inserirAleatorio(vetor, dadosAleatorios);
            InsercaoVetor.inserirOrdenado(vetor, dadosOrdenados);
            InsercaoVetor.inserirInversamenteOrdenado(vetor, dadosInversamenteOrdenados);
            BuscaVetor.buscar(vetor, dadosAleatorios);
            int[] copiaVetor = Arrays.copyOf(dadosAleatorios, dadosAleatorios.length);
            OrdenacaoVetor.ordenarBubbleSort(copiaVetor);
            copiaVetor = Arrays.copyOf(dadosAleatorios, dadosAleatorios.length);
            OrdenacaoVetor.ordenarMergeSort(copiaVetor);
            
            System.out.println(" ");
            // Testar Árvore Binária
            System.out.println(">>> Arvore Binaria <<<");
            ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
            InsercaoArvoreBinaria.inserirAleatorio(arvoreBinaria, dadosAleatorios);
            InsercaoArvoreBinaria.inserirOrdenado(arvoreBinaria, dadosOrdenados);
            InsercaoArvoreBinaria.inserirInversamenteOrdenado(arvoreBinaria, dadosInversamenteOrdenados);
            BuscaArvoreBinaria.buscar(arvoreBinaria, dadosAleatorios);
            
            System.out.println(" ");
            // Testar Árvore AVL
            System.out.println(">>> Arvore AVL <<<");
            ArvoreAVL arvoreAVL = new ArvoreAVL();
            InsercaoArvoreAVL.inserirAleatorio(arvoreAVL, dadosAleatorios);
            InsercaoArvoreAVL.inserirOrdenado(arvoreAVL, dadosOrdenados);
            InsercaoArvoreAVL.inserirInversamenteOrdenado(arvoreAVL, dadosInversamenteOrdenados);
            BuscaArvoreAVL.buscar(arvoreAVL, dadosAleatorios);
        }
      System.out.println("--------------------------------------------------------------------------------");
    }
}
