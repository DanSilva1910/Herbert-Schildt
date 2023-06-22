package Cap_5;

import javax.lang.model.util.ElementScanner14;

class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerfull.";

        int result, idx, i;
        char ch;

        // exibe a quantidade de caracteres da string
        System.out.println("Length of str1: " + str1.length());

        // exibe um caractere de cada vez de str1
        for (i = 0; i < str1.length(); i++) {

        System.out.print(str1.charAt(i));
        }

        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 equals srt2");
        else
            System.out.println("str1 does not equal str2");

        if (str1.equals(str3))
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 and stre are equal");
        else if (result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("srt1 is greater str3");

        // atribui um novo string a str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Index of first occurrence of One: " + idx);

        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurrence of One: " + idx);

    }

}
