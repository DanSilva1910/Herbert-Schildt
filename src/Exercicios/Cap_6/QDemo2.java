package Cap_6;

class Queue {
    private char q[]; // esse array contém a fila
    private int putloc, getloc; // indices put e get

    Queue(int size) {
        q = new char[size]; // aloca memoria para a fila
        putloc = getloc = 0;
    }

    // Constroi uma fila a partir de outra
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copia elementos
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Constroi a fila com valores iniciais
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++)
            put(a[i]);
    }

    // insere um caractere na fila
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full. ");
            return;
        }

        q[putloc++] = ch;
    }

    // obtem um caractere da fila
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty. ");
            return (char) 0;
        }
        return q[getloc++];
    }
}

// Demostra a classe Queue
public class QDemo2 {

    public static void main(String[] args) {
        // Constroi uma fila vazia com 10 elementos
        Queue q1 = new Queue(10);

        char name[] = { 'D', 'a', 'n', 'i', 'l', 'o' };
        // Constroi uma fila a partir do array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Insere caracteres em q1
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Constroi uma fila a partir de outra
        Queue q3 = new Queue(q1);

        System.out.println("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Contents of q2: ");
        for (i = 0; i < 6; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
