public class InsercaoArvoreAVL {

    //Inserção aleatória da Árvore AVL
    public static void inserirAleatorio(ArvoreAVL arvore, int[] dados) {
        arvore.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Arvore AVL - Insercao aleatoria: " + (fim - inicio) + "ms");
    }

    //Inserção ordenada da Árvore AVL
    public static void inserirOrdenado(ArvoreAVL arvore, int[] dados) {
        arvore.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Arvore AVL - Insercao ordenada: " + (fim - inicio) + "ms");
    }

    //Inserção inversamente ordenada da Árvore AVL
    public static void inserirInversamenteOrdenado(ArvoreAVL arvore, int[] dados) {
        arvore.limpar();
        long inicio = System.currentTimeMillis();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Arvore AVL - Insercao inversamente ordenada: " + (fim - inicio) + "ms");
    }
}
