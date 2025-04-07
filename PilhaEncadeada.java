package APS_1;

import java.util.Scanner;

public class PilhaEncadeada {

    class No {
        int dado;
        No proximo;

        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No topo = null;

    public void insere(int elemento) {
        No novo = new No(elemento);
        novo.proximo = topo;
        topo = novo;
        System.out.println("Elemento inserido na pilha: " + elemento);
    }

    public void remove() {
        if (topo == null) {
            System.out.println("Pilha vazia. Nada para remover.");
        } else {
            int removido = topo.dado;
            topo = topo.proximo;
            System.out.println("Elemento removido da pilha: " + removido);
        }
    }

    public void imprime() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
        } else {
            No atual = topo;
            System.out.print("Pilha: ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;

        do {
            System.out.println("\n1 - Inserir\n2 - Remover\n3 - Imprimir\n0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a inserir: ");
                    valor = scanner.nextInt();
                    pilha.insere(valor);
                    break;
                case 2:
                    pilha.remove();
                    break;
                case 3:
                    pilha.imprime();
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
