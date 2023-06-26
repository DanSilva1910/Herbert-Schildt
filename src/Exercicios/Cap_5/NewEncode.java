package Cap_5;

public class NewEncode {

   

// Usa XOR para codificar e decodificar uma mensagem.

    public static void main(String[] args) {

        String msg = "This is a test";

        String encmsg = "";
        String decmsg = "";
        String key = "Decode25"; // Chave de 8 caracteres

        System.out.println("Original message: ");
        System.out.println(msg);

        // Codifica a mensagem
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(i % key.length()));
        }

        System.out.println("Encoded message: ");
        System.out.println(encmsg);

        // Decodifica a mensagem
        for (int i = 0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(i % key.length()));
        }

        System.out.println("Decoded message: ");
        System.out.println(decmsg);
    }
}

    
