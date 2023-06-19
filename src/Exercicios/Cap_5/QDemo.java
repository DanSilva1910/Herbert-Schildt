package Cap_5;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Queue {
    char q[]; // esse array contém a fila
    int putloc, getloc; // indices put e get

    Queue(int size) {
        q = new char[size]; //aloca memoria para a fila
        putloc = getloc = 0;

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
// Demostra a classe Quene
public class QDemo {

    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        System.out.println("Using bigQ to store alphabet.");
        // Insere alguns caracteres em bigQ
        for(i = 0; i < 26; i++ ){
            bigQ.put ((char)('A' + i));
        }    
        // recupera caracteres do elemento bigQ
        System.out.println(" Contents of bigQ: ");
        for(i = 0; i < 26; i++ ){
            ch = bigQ.get();
            if(ch != (char) 0) {
                 System.out.print(ch);
            }     
        }

    
    System.out.println("\n");

    System.out.println("Using smallQ to generate errors ");
    // usa o smallQ para gerar alguns erros
    for( i = 0; i < 5; i++){
        System.out.print("Attempting to store " + (char) ('z' - i));

        smallQ.put ((char)('z' - i));

        System.out.println();
    }

    System.out.println();

    // mais erros em smallQ
    System.out.println("Contentes of smallQ: ");
    for(i = 0; i < 5; i++ ) {
         ch = smallQ.get();

         if (ch != (char) 0) {
            System.out.print(ch);
         }

    }
       
}

}
