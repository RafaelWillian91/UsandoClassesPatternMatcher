package Exercises01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCPFProfessor {

    public static void main(String[] args) {

        System.out.println(validate("390.996.868-62"));
        System.out.println(validate("39099686862"));
        System.out.println(validate("390 996 868 62"));
        System.out.println(validate("390.996.868.62"));
        System.out.println(validate("390.996.868-62"));

        System.out.println();

    }

    public static boolean validate(String cpf){

        return cpf.matches("\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}[-\\s]?\\d{2}$");
        //\d{3} Ao invés de colocar \\d\\d\\d para informar que são 3 numeros eu posso colocar com o 3 entre chaves
        // Proximo caracter é o ou então colocc entre parenteses [.\s]? ou ponto ou metacaracter para espaço em branco ou ? nada.

    }


}
