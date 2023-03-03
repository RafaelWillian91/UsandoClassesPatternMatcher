package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {

        String text = "abcabc";
        String regex = "b";

        //Para encontrar o "b" existem 2 classes que trabalhamos. A classe Pattern


        Pattern p = Pattern.compile(regex);
        //Voce ganha uma estancia da classe atraves do metodo estático .compile(padrãoParaEncontrar).
        //Esse método prepara a expressão regular para que ela possa encontrar padroes.

        Matcher m = p.matcher(text);
        //Com base no Pattern voce chama o metodo .matcher e retorna para uma instancia de Matcher
        //Um prepara e o outro execulta na String passada.


        //Pode ser que mais de uma seja encontrada, por isso existe o boolean
        while (m.find()){
            System.out.format("%d -> '%s'\n", m.start(), m.group());
            System.out.println("Sem String.format -> " + m.start() + " - " + m.group());
        }










    }

}
