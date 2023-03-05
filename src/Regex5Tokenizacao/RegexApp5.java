package Regex5Tokenizacao;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp5 {

    public static void main(String[] args) {

        String text = "a - b - c - d - e - f - 9 - 10";

        String [] text1 = text.split("[-]");
        String [] ftext2 = text.split("\\d");

        System.out.println(Arrays.toString(text1));
        System.out.println(Arrays.toString(ftext2));

        System.out.println("---------------------------------------------");
        //Usando o Scanner tem-se mais controle
        Scanner sc = new Scanner(text);

        sc.useDelimiter("[\\w]");
        //sc.useDelimiter("[-]");
        while (sc.hasNext()){
            System.out.print(sc.next());
        }

        System.out.println("\n_______________________________________________");
        //A classe Scanner tambem faz a conversão de modo automático. Retirando só aquilo que for preciso da String.
        Scanner sc2 = new Scanner("1-2-3-4-o-p-W");
        sc2.useDelimiter("-");

        while (sc2.hasNextInt()){
            int e = sc2.nextInt();
            System.out.println(e);
        }



    }

}
