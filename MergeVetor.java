package APS_1;

public class MergeVetor {

    static class Fila {
        int[] dados;
        int inicio;
        int fim;
        int tamanho;

        Fila(int capacidade) {
            dados = new int[capacidade];
            inicio = 0;
            fim = 0;
            tamanho = 0;
        }

        void insere(int valor) {
            if (tamanho < dados.length) {
                dados[fim] = valor;
                fim++;
                tamanho++;
            } else {
                System.out.println("Fila cheia!");
            }
        }

        int remove() {
            if (tamanho == 0) {
                return -1;
            }
            int valor = dados[inicio];
            inicio++;
            tamanho--;
            return valor;
        }

        int primeiro() {
            if (tamanho == 0) return Integer.MAX_VALUE;
            return dados[inicio];
        }

        boolean estaVazia() {
            return tamanho == 0;
        }

        void imprime() {
            System.out.print("← ");
            for (int i = inicio; i < fim; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println("←");
        }
    }

    public static Fila mergeVetores(Fila a, Fila b) {
        Fila c = new Fila(a.tamanho + b.tamanho);

        while (!a.estaVazia() && !b.estaVazia()) {
            if (a.primeiro() < b.primeiro()) {
                c.insere(a.remove());
            } else {
                c.insere(b.remove());
            }
        }

        while (!a.estaVazia()) {
            c.insere(a.remove());
        }

        while (!b.estaVazia()) {
            c.insere(b.remove());
        }

        return c;
    }

    public static void main(String[] args) {
        Fila filaA = new Fila(10);
        Fila filaB = new Fila(10);

        // Fila A: 12 35 52 64
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);

        // Fila B: 05 15 23 55 75
        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(75);

        System.out.print("Fila A: ");
        filaA.imprime();
        System.out.print("Fila B: ");
        filaB.imprime();

        Fila filaC = mergeVetores(filaA, filaB);

        System.out.print("Fila C (Merge): ");
        filaC.imprime();
    }
}
