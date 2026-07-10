package Abstraction.Interfaces.live;

import Abstraction.Interfaces.music.Playable;
import Abstraction.Interfaces.music.string.Veena;
import Abstraction.Interfaces.music.wind.Saxophone;

public class Test{

    public static void main(String[]args){

        Veena v=new Veena();
        v.play();

        Saxophone s=new Saxophone();
        s.play();

        Playable p;

        p=v;
        p.play();

        p=s;
        p.play();
    }
}