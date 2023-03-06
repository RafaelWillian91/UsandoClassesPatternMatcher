package Exercises02;

public class RemoveStrings {

    public static void main(String[] args) {

        String text = "hbh4b3hb4h3b4hb3h4b3bhb";

        String r = text.replaceAll("[^\\d]", "");//Negacao da expressao regular
        System.out.println(r);

        //Forma do Professor
        System.out.println(text.replaceAll("\\D", ""));// Com D ele nega a expressao \\d tambem. Ou seja tudo que não é digito é trocado na String
        System.out.println(text.replaceAll("[^0-9]", "")); // Outra forma de dizer que vai trocar tudo que não é numero.

    }


}
