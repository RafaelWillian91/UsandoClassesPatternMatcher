package Exercises01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCPF {

    public static void main(String[] args) {

        System.out.println(validate("39099686862"));

        System.out.println();

    }

    public static boolean validate(String cpf){
        boolean validator = false;
        Pattern p = Pattern.compile("^\\d\\d\\d\\s\\d\\d\\d\\s\\d\\d\\d\\s\\d\\d$");
        Pattern p1 = Pattern.compile("[^0-9]");// Busca um carqacter que não seja numero
        Pattern p2 = Pattern.compile("^\\d\\d\\d[.]\\d\\d\\d[.]\\d\\d\\d[-]\\d\\d$");

        Matcher m = p.matcher(cpf);

        Matcher m1 = p1.matcher(cpf);

        Matcher m2 = p2.matcher(cpf);


        if(m.find() || !m1.find() || m2.find()){//m1.find() foi invertido a logica
           System.out.println("CPF VALIDADO!");
            validator = true;
        }else {
            System.out.println("Formato de CPF inválido!");
        }

        return validator;



    }


}
