package RegexApp3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Um dos usos mais frequentes da Regex é na validação de dados.
//Para ver se uma informacao foi preenchida com um padrao especifico
public class RegexApp3 {

    public static void main(String[] args) {

        //Pattern p = Pattern.compile("\\s");//Procura espacos em Branco
        //Para encontrar um espaco em branco no meio de caracteres tenho que passar isso
        Pattern p = Pattern.compile("\\w*\\s\\w*");// \\w* é um ou mais caracteres, espaco e um ou mais caracters
        Matcher m = p.matcher("abc def");

        m.matches();//O metodo matches retorno um booleano para mostrar se encontrou um espaco em Branco e a String segue o poadrao
        System.out.println(m.matches());

        System.out.println("123h4".matches("\\d+"));// Outro modo de verificar uma String é composta de um ou mais digitos e só digitos
        //a propria classe String tem o método .matches e a vantagem é que voce nao precisa criar o Pattern.

    }
}
