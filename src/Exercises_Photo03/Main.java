package Exercises_Photo03;

public class Main {

    public static void main(String[] args) {

        Photo p1 = Photo.create("IMG_00013-1988-Sao_Paulo.jpg");
        Photo p2 = Photo.create("IMG_00013-1988-Florianopolis.jpg");
        Photo p3 = Photo.create("IMG_234-2015-Rio_De_Janeiro.jpg");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }


}
