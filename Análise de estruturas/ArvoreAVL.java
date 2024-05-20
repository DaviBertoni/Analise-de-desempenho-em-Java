public class ArvoreAVL {
    class No {
        int chave, altura;
        No esquerda, direita;

        No(int d) {
            chave = d;
            altura = 1;
        }
    }

    No raiz;

    // Obter a altura do nó
    private int altura(No N) {
        if (N == null) return 0;
        return N.altura;
    }

    // Rotação à direita
    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    // Rotação à esquerda
    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    // Obter o fator de balanceamento do nó
    private int getBalance(No N) {
        if (N == null) return 0;
        return altura(N.esquerda) - altura(N.direita);
    }

    // Inserção
    
    public void inserir(int chave) {
        raiz = inserir(raiz, chave);
    }
    private No inserir(No no, int chave) {
        if (no == null) return new No(chave);

        if (chave < no.chave) no.esquerda = inserir(no.esquerda, chave);
        else if (chave > no.chave) no.direita = inserir(no.direita, chave);
        else return no;

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int balance = getBalance(no);

        // Rotação simples ou dupla
        if (balance > 1 && chave < no.esquerda.chave) return rotacaoDireita(no);
        if (balance < -1 && chave > no.direita.chave) return rotacaoEsquerda(no);
        if (balance > 1 && chave > no.esquerda.chave) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }
        if (balance < -1 && chave < no.direita.chave) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }
    
    // Buscas
    public boolean buscar(int chave) {
        return buscar(raiz, chave);
    }

    private boolean buscar(No raiz, int chave) {
        if (raiz == null) return false;
        if (raiz.chave == chave) return true;
        return chave < raiz.chave ? buscar(raiz.esquerda, chave) : buscar(raiz.direita, chave);
    }

    // Limpar a árvore
    public void limpar() {
        raiz = null;
    }
}
