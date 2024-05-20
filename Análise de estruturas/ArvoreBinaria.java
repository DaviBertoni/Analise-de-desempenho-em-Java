public class ArvoreBinaria {
    class No {
        int chave;
        No esquerda, direita;

        public No(int item) {
            chave = item;
            esquerda = direita = null;
        }
    }

    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    // Inserção
    public void inserir(int chave) {
        raiz = inserirRecursivo(raiz, chave);
    }

    private No inserirRecursivo(No raiz, int chave) {
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }
        if (chave < raiz.chave) raiz.esquerda = inserirRecursivo(raiz.esquerda, chave);
        else if (chave > raiz.chave) raiz.direita = inserirRecursivo(raiz.direita, chave);
        return raiz;
    }

    // Buscas
    public boolean buscar(int chave) {
        return buscarRecursivo(raiz, chave);
    }

    private boolean buscarRecursivo(No raiz, int chave) {
        if (raiz == null) return false;
        if (raiz.chave == chave) return true;
        return chave < raiz.chave ? buscarRecursivo(raiz.esquerda, chave) : buscarRecursivo(raiz.direita, chave);
    }

    // Limpar a árvore
    public void limpar() {
        raiz = null;
    }
}
