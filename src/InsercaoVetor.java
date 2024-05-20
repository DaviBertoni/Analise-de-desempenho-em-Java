import java.util.Arrays;
  
public class InsercaoVetor {
    
    //Inserção aleatória do vetor 
    public static void inserirAleatorio(Vetor vetor, int[] dados) {
        vetor.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            vetor.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Vetor - Insercao aleatoria: " + (fim - inicio) + "ms");
    }
      
    //Inserção ordenada do vetor   
    public static void inserirOrdenado(Vetor vetor, int[] dados) {
        vetor.limpar();
        Arrays.sort(dados);
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            vetor.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Vetor - Insercao ordenada: " + (fim - inicio) + "ms");
    }

    //Inserção inversamente ordenada do vetor 
    public static void inserirInversamenteOrdenado(Vetor vetor, int[] dados) {
        vetor.limpar();
        Arrays.sort(dados);
        long inicio = System.currentTimeMillis();
        for (int i = dados.length - 1; i >= 0; i--) {
            vetor.inserir(dados[i]);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Vetor - Insercao inversamente ordenada: " + (fim - inicio) + "ms");
    }
}
