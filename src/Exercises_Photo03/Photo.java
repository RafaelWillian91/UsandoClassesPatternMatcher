package Exercises_Photo03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Photo {

    private int numberPhoto;
    private int year;
    private String country;


    public Photo(int numberPhoto, int year, String country) {
        this.numberPhoto = numberPhoto;
        this.year = year;
        this.country = country;
    }


    public int getNumberPhoto() {
        return numberPhoto;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public static Photo create(String name){
        //"IMG_00013-188-Sao_Paulo.jpg"
        Scanner sc = new Scanner(name);
        sc.useDelimiter("[-.]");
        int a = Integer.parseInt(sc.next().replaceAll("\\D", ""));
       //System.out.println(a);
        int b = Integer.parseInt(sc.next().replaceAll("\\D", ""));

        String s1 = sc.next().replaceAll("_" , " ");

        return new Photo(a, b, s1);

    }

    @Override
    public String toString() {
        return "Photo{" +
                "numberPhoto=" + numberPhoto +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }



}
