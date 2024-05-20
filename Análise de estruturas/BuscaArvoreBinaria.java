import java.util.Random;

public class BuscaArvoreBinaria {
    public static void buscar(ArvoreBinaria arvore, int[] dados) {
        long inicio, fim;

        // Buscas
        // Busca do primeiro elemento
        inicio = System.currentTimeMillis();
        arvore.buscar(dados[0]);
        fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Busca do primeiro elemento: " + (fim - inicio) + "ms");
        
        // Busca do último elemento
        inicio = System.currentTimeMillis();
        arvore.buscar(dados[dados.length - 1]);
        fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Busca do ultimo elemento: " + (fim - inicio) + "ms");

        // Busca por elemento do meio 
        inicio = System.currentTimeMillis();
        arvore.buscar(dados[dados.length / 2]); 
        fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Busca do elemento do meio: " + (fim - inicio) + "ms");

        // Busca por elemento aleatório
        Random random = new Random();
        int valorAleatorio = dados[random.nextInt(dados.length)]; 
        inicio = System.currentTimeMillis();
        arvore.buscar(valorAleatorio);
        fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Busca por valor aleatorio: " + (fim - inicio) + "ms");

        // Busca por elemento  inexistente
        inicio = System.currentTimeMillis();
        arvore.buscar(100000);
        fim = System.currentTimeMillis();
        System.out.println("Arvore Binaria - Busca por valor inexistente: " + (fim - inicio) + "ms");
    }
}
