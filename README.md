# Análise de Desempenho de Estruturas de Dados em Java

## Objetivo

Este projeto tem como objetivo comparar o desempenho de diferentes estruturas de dados (vetores, árvores binárias e árvores AVL) em operações de inserção e busca, utilizando diferentes ordens de inserção e tamanhos de conjuntos de dados.

## Linguagens utilizadas

1. Java

## Estruturas de Dados Utilizadas

1. Vetor
2. Árvore Binária
3. Árvore AVL

## Tamanhos dos Conjuntos de Dados

- 100 elementos
- 1.000 elementos
- 10.000 elementos

## Ordens de Inserção

- Ordenada
- Inversamente Ordenada
- Aleatória

## Operações Medidas

### Inserção

- Tempo de inserção para cada estrutura e ordem.

### Busca

- Tempo de busca para cada estrutura, utilizando:
  - Busca do primeiro elemento
  - Busca do último elemento
  - Busca do elemento do meio
  - Busca por valores aleatórios
  - Busca por um valor inexistente

### Métodos de Busca em Vetores

- Busca Sequencial
- Busca Binária (em vetores ordenados)

### Ordenação de Vetores

- Bubble Sort
- Merge Sort
- Medir o tempo de ordenação para cada técnica.

## Estrutura do Projeto

### Diretórios e Arquivos

```plaintext
src/
│
├── Main.java
├── Vetor.java
├── ArvoreBinaria.java
├── ArvoreAVL.java
├── InsercaoVetor.java
├── InsercaoArvoreBinaria.java
├── InsercaoArvoreAVL.java
├── BuscaVetor.java
├── BuscaArvoreBinaria.java
├── BuscaArvoreAVL.java
└── OrdenacaoVetor.java
```

## Descrição dos Arquivos

- **Principal.java**: Classe principal que executa as operações de inserção e busca nas estruturas de dados para diferentes tamanhos e ordens de inserção.
- **Vetor.java**: Implementa a estrutura de dados Vetor com métodos de inserção e busca.
- **ArvoreBinaria.java**: Implementa a estrutura de dados Árvore Binária com métodos de inserção e busca.
- **ArvoreAVL.java**: Implementa a estrutura de dados Árvore AVL com métodos de inserção e busca.
- **InsercaoVetor.java**: Contém métodos de inserção em Vetor para diferentes ordens de dados.
- **InsercaoArvoreBinaria.java**: Contém métodos de inserção em Árvore Binária para diferentes ordens de dados.
- **InsercaoArvoreAVL.java**: Contém métodos de inserção em Árvore AVL para diferentes ordens de dados.
- **BuscaVetor.java**: Contém métodos de busca em Vetor, incluindo medição de tempo.
- **BuscaArvoreBinaria.java**: Contém métodos de busca em Árvore Binária, incluindo medição de tempo.
- **BuscaArvoreAVL.java**: Contém métodos de busca em Árvore AVL, incluindo medição de tempo.
- **Ordenacao.java**: Implementa métodos de ordenação (Bubble Sort e Merge Sort) e mede o tempo de execução.

## Executando o Projeto

### Pré-requisitos

Antes de executar o projeto, certifique-se de ter o seguinte instalado em seu sistema:

- Java Development Kit (JDK)
- IDE Java ou editor de texto de sua escolha

### Compilação e Execução

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/seuusuario/seurepositorio.git
   cd seurepositorio
2. **Compile os arquivos em Java**
    
    ```sh
    javac src/*.java

3. **Execute a classe principal**
    
    ```
    java -cp src Main

Este processo compilará os arquivos Java e executará a classe Main do projeto, que realizará as operações de inserção e busca nas estruturas de dados especificadas. Certifique-se de ajustar os comandos de acordo com a estrutura do seu projeto.

### Resultados

Os resultados serão impressos no console, incluindo o tempo de inserção e busca para cada estrutura de dados, tamanho do conjunto de dados e ordem de inserção.

### Exemplo de Saída

```plaintext
--------------------------------------------------------------------------------

Tamanho do conjunto de dados: 100

>>> Vetor <<<
Vetor - Insercao aleatoria: 0ms
Vetor - Insercao ordenada: 0ms
Vetor - Insercao inversamente ordenada: 0ms
Vetor - Busca do primeiro elemento: 0ms
Vetor - Busca do ultimo elemento: 0ms
Vetor - Busca do elemento do meio: 0ms
Vetor - Busca por valor aleatorio: 0ms
Vetor - Busca por valor inexistente: 0ms
Vetor - Busca Binaria por valor aleatorio: 0ms
Vetor - Tempo de ordenacao Bubble Sort: 0ms
Vetor - Tempo de ordenacao Merge Sort: 0ms
 
>>> Arvore Binaria <<<
Arvore Binaria - Insercao aleatoria: 1ms
Arvore Binaria - Insercao ordenada: 0ms
Arvore Binaria - Insercao inversamente ordenada: 0ms
Arvore Binaria - Busca do primeiro elemento: 0ms
Arvore Binaria - Busca do ultimo elemento: 0ms
Arvore Binaria - Busca do elemento do meio: 0ms
Arvore Binaria - Busca por valor aleatorio: 0ms
Arvore Binaria - Busca por valor inexistente: 0ms
 
>>> Arvore AVL <<<
Arvore AVL - Insercao aleatoria: 0ms
Arvore AVL - Insercao ordenada: 0ms
Arvore AVL - Insercao inversamente ordenada: 0ms
Arvore AVL - Busca do primeiro elemento: 0ms
Arvore AVL - Busca do ultimo elemento: 0ms
Arvore AVL - Busca do elemento do meio: 0ms
Arvore AVL - Busca por valor aleatorio: 0ms
Arvore AVL - Busca por valor inexistente: 0ms
--------------------------------------------------------------------------------

Tamanho do conjunto de dados: 1000

>>> Vetor <<<
Vetor - Insercao aleatoria: 0ms
Vetor - Insercao ordenada: 0ms
Vetor - Insercao inversamente ordenada: 0ms
Vetor - Busca do primeiro elemento: 0ms
Vetor - Busca do ultimo elemento: 0ms
Vetor - Busca do elemento do meio: 0ms
Vetor - Busca por valor aleatorio: 0ms
Vetor - Busca por valor inexistente: 0ms
Vetor - Busca Binaria por valor aleatorio: 0ms
Vetor - Tempo de ordenacao Bubble Sort: 4ms
Vetor - Tempo de ordenacao Merge Sort: 1ms
 
>>> Arvore Binaria <<<
Arvore Binaria - Insercao aleatoria: 0ms
Arvore Binaria - Insercao ordenada: 2ms
Arvore Binaria - Insercao inversamente ordenada: 1ms
Arvore Binaria - Busca do primeiro elemento: 0ms
Arvore Binaria - Busca do ultimo elemento: 0ms
Arvore Binaria - Busca do elemento do meio: 0ms
Arvore Binaria - Busca por valor aleatorio: 0ms
Arvore Binaria - Busca por valor inexistente: 0ms
 
>>> Arvore AVL <<<
Arvore AVL - Insercao aleatoria: 0ms
Arvore AVL - Insercao ordenada: 0ms
Arvore AVL - Insercao inversamente ordenada: 1ms
Arvore AVL - Busca do primeiro elemento: 0ms
Arvore AVL - Busca do ultimo elemento: 0ms
Arvore AVL - Busca do elemento do meio: 0ms
Arvore AVL - Busca por valor aleatorio: 0ms
Arvore AVL - Busca por valor inexistente: 0ms
--------------------------------------------------------------------------------

Tamanho do conjunto de dados: 10000

>>> Vetor <<<
Vetor - Insercao aleatoria: 0ms
Vetor - Insercao ordenada: 0ms
Vetor - Insercao inversamente ordenada: 0ms
Vetor - Busca do primeiro elemento: 0ms
Vetor - Busca do ultimo elemento: 1ms
Vetor - Busca do elemento do meio: 0ms
Vetor - Busca por valor aleatorio: 0ms
Vetor - Busca por valor inexistente: 0ms
Vetor - Busca Binaria por valor aleatorio: 0ms
Vetor - Tempo de ordenacao Bubble Sort: 127ms
Vetor - Tempo de ordenacao Merge Sort: 1ms
 
>>> Arvore Binaria <<<
Arvore Binaria - Insercao aleatoria: 1ms
Arvore Binaria - Insercao ordenada: 118ms
Arvore Binaria - Insercao inversamente ordenada: 115ms
Arvore Binaria - Busca do primeiro elemento: 0ms
Arvore Binaria - Busca do ultimo elemento: 0ms
Arvore Binaria - Busca do elemento do meio: 0ms
Arvore Binaria - Busca por valor aleatorio: 0ms
Arvore Binaria - Busca por valor inexistente: 0ms
 
>>> Arvore AVL <<<
Arvore AVL - Insercao aleatoria: 2ms
Arvore AVL - Insercao ordenada: 1ms
Arvore AVL - Insercao inversamente ordenada: 1ms
Arvore AVL - Busca do primeiro elemento: 0ms
Arvore AVL - Busca do ultimo elemento: 0ms
Arvore AVL - Busca do elemento do meio: 0ms
Arvore AVL - Busca por valor aleatorio: 0ms
Arvore AVL - Busca por valor inexistente: 0ms
--------------------------------------------------------------------------------
```
