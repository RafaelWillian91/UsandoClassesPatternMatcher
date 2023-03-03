package Regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {
            //printMatches("ahsuh3udhsdnwu4dnaassu5asncbuq6", "\\d");//\\d procura um decimal na regeex
        //printMatches("ahsuh3udhsdnwu4dnaassu532asncbuq6", "\\d\\d\\d");// mais de um decimal
        //printMatches("ahsuh3udhsdnwu4dnaassu5asncbuq6", "([a-z])+");//Colchetes da opcao de busca. Se tem o '+' ele retorna o grupo ex: 0 - 'ahsuh'
        printMatches("ahsuh3udhsdnwu4dnaassu5asncbuq6", "\\d([a-z]+)");//Seguido por um dígito ex: 5 - '3udhsdnwu'

    }

    private static void printMatches(String text, String regex){

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.printf("%d - '%s'\n", m.start(), m.group());
        }
    }


}
