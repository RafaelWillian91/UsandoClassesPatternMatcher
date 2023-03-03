package Regex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp4 {

    public static void main(String[] args) {

        String text = "a3b5hj4j20f29p";
        String regex = "\\d";
        String replecement = "*";

        //Trocar tudo que fo encontrado por Aterisco

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        StringBuilder sb = new StringBuilder();
        while (m.find()){
            //Existe a possibilidade de fazer a troca usando o .appenReplacement
            //Ele passa para um objeto do tipo StringBuilder e monta com o append
            m.appendReplacement(sb, replecement);
            //pode ser que um pedaco do texto ainda nao teve substituicao
        }
        //aqui ele emenda o restante da String se ouver.
        m.appendTail(sb);

        System.out.println(sb);

        //----------------------------------------------
        //Com abordagem mais direta
        //O método replaceAll e replaceFirst trabalham com regex. Diferente do replace.
        String s1 = text.replaceAll(regex, replecement);
        System.out.println("Mais direto -> " + s1);
        String s2 = text.replaceFirst(regex, replecement);
        System.out.println("Mais direto -> " + s2);
    }

}
