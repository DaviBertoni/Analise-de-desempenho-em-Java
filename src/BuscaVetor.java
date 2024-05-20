import java.util.Random;

public class BuscaVetor {
    public static void buscar(Vetor vetor, int[] dados) {
        long inicio, fim;

        // Busca Sequencial
        // Busca do primeiro elemento
        inicio = System.currentTimeMillis();
        vetor.buscaSequencial(dados[0]); 
        fim = System.currentTimeMillis();
        System.out.println("Vetor - Busca do primeiro elemento: " + (fim - inicio) + "ms");

        // Busca do último elemento
        inicio = System.currentTimeMillis();
        vetor.buscaSequencial(dados[dados.length - 1]); 
        fim = System.currentTimeMillis();
        System.out.println("Vetor - Busca do ultimo elemento: " + (fim - inicio) + "ms");

        // Busca por elemento do meio 
        inicio = System.currentTimeMillis();
        vetor.buscaSequencial(dados[dados.length / 2]); 
        fim = System.currentTimeMillis();
        System.out.println("Vetor - Busca do elemento do meio: " + (fim - inicio) + "ms");

        // Busca por elemento aleatório
        Random random = new Random();
        int valorAleatorio = dados[random.nextInt(dados.length)];
        inicio = System.currentTimeMillis();
        vetor.buscaSequencial(valorAleatorio);
        fim = System.currentTimeMillis();
        System.out.println("Vetor - Busca por valor aleatorio: " + (fim - inicio) + "ms");
        
        // Busca por elemento inexistente
        inicio = System.currentTimeMillis();
        vetor.buscaSequencial(100000); 
        fim = System.currentTimeMillis();
        System.out.println("Vetor - Busca por valor inexistente: " + (fim - inicio) + "ms");     

        // Busca Binária
        // Busca por elemento aleatório
        inicio = System.currentTimeMillis();
        vetor.buscaBinaria(valorAleatorio);
        fim = System.currentTimeMillis();
        System.out.println("Vetor - Busca Binaria por valor aleatorio: " + (fim - inicio) + "ms");
        

    }
}
