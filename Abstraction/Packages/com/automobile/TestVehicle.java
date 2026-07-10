package Abstraction.Packages.com.automobile;

import Abstraction.Packages.com.automobile.twowheeler.Hero;
import Abstraction.Packages.com.automobile.twowheeler.Honda;
import Abstraction.Packages.com.automobile.fourwheeler.Logan;
import Abstraction.Packages.com.automobile.fourwheeler.Ford;

public class TestVehicle{

    public static void main(String[]args){

        Hero h=new Hero();
        System.out.println("Hero");
        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        h.radio();

        System.out.println();

        Honda hd=new Honda();
        System.out.println("Honda");
        System.out.println(hd.getModelName());
        System.out.println(hd.getRegistrationNumber());
        System.out.println(hd.getOwnerName());
        System.out.println(hd.getSpeed());
        hd.cdplayer();

        System.out.println();

        Logan l=new Logan();
        System.out.println("Logan");
        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println(l.speed());
        System.out.println("GPS : "+l.gps());

        System.out.println();

        Ford f=new Ford();
        System.out.println("Ford");
        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println(f.speed());
        System.out.println("Temperature : "+f.tempControl());
    }
}