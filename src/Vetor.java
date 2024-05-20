import java.util.ArrayList;
import java.util.Collections;

public class Vetor {
    private ArrayList<Integer> vetor;

    public Vetor() {
        vetor = new ArrayList<>();
    }

    // Inserção
    public void inserir(int valor) {
        vetor.add(valor);
    }

    // Busca Sequencial
    public int buscaSequencial(int chave) {
        for (int i = 0; i < vetor.size(); i++) {
            if (vetor.get(i) == chave) {
                return i;
            }
        }
        return -1;
    }

    // Busca Binária
    public int buscaBinaria(int chave) {
        return Collections.binarySearch(vetor, chave);
    }

    // Limpar o vetor
    public void limpar() {
        vetor.clear();
    }

    public ArrayList<Integer> getVetor() {
        return vetor;
    }

    public int get(int index) {
        return vetor.get(index);
    }

    public int size() {
        return vetor.size();
    }
}
