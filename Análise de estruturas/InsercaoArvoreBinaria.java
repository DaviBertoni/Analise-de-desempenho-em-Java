public class InsercaoArvoreBinaria {

    //Inserção aleatória da Árvore binária 
    public static void inserirAleatorio(ArvoreBinaria arvore, int[] dados) {
        arvore.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Insercao aleatoria: " + (fim - inicio) + "ms");
    }

    //Inserção ordenada da Árvore binária 
    public static void inserirOrdenado(ArvoreBinaria arvore, int[] dados) {
        arvore.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Insercao ordenada: " + (fim - inicio) + "ms");
    }

    //Inserção inversamente ordenada da Árvore binária
    public static void inserirInversamenteOrdenado(ArvoreBinaria arvore, int[] dados) {
        arvore.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Insercao inversamente ordenada: " + (fim - inicio) + "ms");
    }
}
