package APS_1;

import java.util.Scanner;

public class FilaEncadeada {

    class No {
        int dado;
        No proximo;

        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No inicio = null;
    No fim = null;

    public void insere(int elemento) {
        No novo = new No(elemento);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        System.out.println("Elemento inserido na fila: " + elemento);
    }

    public void remove() {
        if (inicio == null) {
            System.out.println("Fila vazia. Nada para remover.");
        } else {
            int removido = inicio.dado;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            System.out.println("Elemento removido da fila: " + removido);
        }
    }

    public void imprime() {
        if (inicio == null) {
            System.out.println("Fila vazia.");
        } else {
            No atual = inicio;
            System.out.print("Fila: ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;

        do {
            System.out.println("\n1 - Inserir\n2 - Remover\n3 - Imprimir\n0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a inserir: ");
                    valor = scanner.nextInt();
                    fila.insere(valor);
                    break;
                case 2:
                    fila.remove();
                    break;
                case 3:
                    fila.imprime();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
