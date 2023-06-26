package Cap_6;

class FailSoftArray {

    private int a[]; // referência ao array
    private int errval; // valor a ser retornado se get() falhar
    public int length; // length é público

    /*
     * Constroi o array dado o seu tamanho e o valor a ser retornado se get() falhar
     */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Retorna o valor do índice especificado
    public int get(int index) {
        if (indexOk(index))
            return a[index];
        return errval;
    }

    // Insere um valor em um índice. Retorna falso em caso de falha
    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Verifica se o índice é válido
    private boolean indexOk(int index) {
        if (index >= 0 && index < length)
            return true;
        return false;
    }
}

// Demonstra o array resistente a falhas
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Exibe falhas silenciosas
        System.out.println("Fail quietly.");

        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
        }

        // Agora trata as falhas
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }
    }
}
