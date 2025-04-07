
# APS 1 - Estruturas de Dados (PUCPR)

Este repositório contém a resolução da **APS 1**
O objetivo é implementar as estruturas de **Pilha** e **Fila** usando **listas encadeadas**, além de realizar o **merge de duas filas ordenadas**, utilizando tanto listas quanto vetores.

---

## Estrutura do Projeto

```
src/
└── APS_1/
    ├── PilhaEncadeada.java     # Implementação da pilha com lista encadeada
    ├── FilaEncadeada.java      # Implementação da fila com lista encadeada
    ├── Merge.java              # Merge de duas filas encadeadas ordenadas
    └── MergeVetor.java         # Merge de dois vetores ordenados
```

---

##  Como Executar

1. Abra o projeto.
2. Navegue até o arquivo que deseja executar.
3. Rode o método `main` da classe.
4. Siga as instruções no console para testar.

---

## Exemplos de Execução

### Pilha Encadeada

```text
Empilhando: 10
Empilhando: 20
Empilhando: 30

Pilha atual (do topo para a base):
30 20 10

Desempilhando...
Elemento removido: 30
```

---

### Fila Encadeada

```text
Enfileirando: 5
Enfileirando: 10
Enfileirando: 15

Fila atual (da frente para o fim):
5 10 15

Desenfileirando...
Elemento removido: 5
```

---

### Merge (com listas encadeadas)

```text
Fila A: 12 → 35 → 52 → 64
Fila B: 05 → 15 → 23 → 55 → 75

Resultado da Fila C:
05 → 12 → 15 → 23 → 35 → 52 → 55 → 64 → 75
```

---

### Merge (com vetores)

```text
Vetor A: [1, 4, 6]
Vetor B: [2, 3, 5]

Vetor C (resultado): [1, 2, 3, 4, 5, 6]
```

---


**Gino Piacenza**   
Disciplina: Resolução de Problemas Estruturados em Computação

---
