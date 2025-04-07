package APS_1;

public class Merge {

    static class No {
        int dado;
        No proximo;

        No(int valor) {
            this.dado = valor;
            this.proximo = null;
        }
    }

    static class Fila {
        No inicio, fim;

        void insere(int valor) {
            No novo = new No(valor);
            if (fim == null) {
                inicio = fim = novo;
            } else {
                fim.proximo = novo;
                fim = novo;
            }
        }

        int remove() {
            if (inicio == null) return -1;
            int valor = inicio.dado;
            inicio = inicio.proximo;
            if (inicio == null) fim = null;
            return valor;
        }

        boolean estaVazia() {
            return inicio == null;
        }

        void imprime() {
            No atual = inicio;
            System.out.print("← ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println("←");
        }
    }

    public static Fila mergeFilas(Fila a, Fila b) {
        Fila c = new Fila();

        while (!a.estaVazia() && !b.estaVazia()) {
            if (a.inicio.dado < b.inicio.dado) {
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
        Fila filaA = new Fila();
        Fila filaB = new Fila();

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

        Fila filaC = mergeFilas(filaA, filaB);

        System.out.print("Fila C (Merge): ");
        filaC.imprime();
    }
}
