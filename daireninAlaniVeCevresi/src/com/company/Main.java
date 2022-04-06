package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("dairenin yarıçapını giriniz:");
        System.out.println("dairenin merkez açısının ölçüsünü giriniz:");
        Scanner input = new Scanner(System.in);

        int r= input.nextInt();
        int a= input.nextInt();

        double pi = 3.14;
        double alan= pi*r*r;

        double cevre= 2*pi*r;
        double dilimAlan= pi*(r*r*a)/360;

        System.out.println("dairenin alanı: "+alan+"\n"+"dairenin çevresi: "+cevre+"\n"+"merkez açısının ölçüsü "+a+" olan dairenin dilim alanı ölçüsü:"+dilimAlan);
    }
}
